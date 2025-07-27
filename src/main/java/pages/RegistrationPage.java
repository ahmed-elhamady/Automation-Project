package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.Utility;

import java.rmi.server.UID;

public class RegistrationPage {

    private WebDriver driver;

    public RegistrationPage(WebDriver driver){
        this.driver = driver;
    }

    //Locators;
    By successMessage = By.xpath("//div/div[@class = 'result']");


    // Method to Find locators;
    private By findLocatorById(String id){
        return By.id(id);
    }

    // Actions;
    public RegistrationPage selectGenderType(String gender){
        Utility.clickingOnElement(driver, findLocatorById("gender-"+gender.toLowerCase()));
        return this;
    }
    public RegistrationPage enterFirstName(String firstName){
        Utility.sendKeys(driver, findLocatorById("FirstName"), firstName);
        return this;
    }
    public RegistrationPage enterLastName(String lastName){
        Utility.sendKeys(driver, findLocatorById("LastName"), lastName);
        return this;
    }
    public RegistrationPage enterEmail(String email){
        Utility.sendKeys(driver, findLocatorById("Email"), email);
        return this;
    }
    public RegistrationPage enterPassword(String password){
        Utility.sendKeys(driver, findLocatorById("Password"), password);
        return this;    }
    public RegistrationPage enterConfirmPassword(String confirmPassword){
        Utility.sendKeys(driver, findLocatorById("ConfirmPassword"), confirmPassword);
        return this;
    }
    public void clickOnRegisterBtn(){
        Utility.clickingOnElement(driver, findLocatorById("register-button"));
    }


    // Assertions;

    public boolean isMessageDisplayed(){
        return Utility.isDisplayed(driver, successMessage);
    }
    public String getMessageText(){
        return Utility.getText(driver, successMessage);
    }
    public String getMessageColor(){
        return Utility.findWebElement(driver, successMessage).getCssValue("color");
    }

}
