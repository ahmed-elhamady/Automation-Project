package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;
import utilities.Utility;

public class LoginPage {
    private WebDriver driver;
    public LoginPage (WebDriver driver){
        this.driver = driver;
    }


    // Locators;
    private By emailField = By.id("Email");
    private By passwordField = By.id("Password");
    private By loginBtn = By.xpath("//div[@class= 'buttons']/button[@type='submit']");
    private By accountTap = By.linkText("My account");
    private By errorMessage = By.xpath("//div[contains(@class, 'message-error validation')]");


    //Actions;
    public LoginPage enterEmail(String email){
        Utility.sendKeys(driver, emailField, email);
        return this;
    }

    public LoginPage enterPassword(String password){
        Utility.sendKeys(driver, passwordField, password);
        return this;
    }

    public void clickOnLoginBtn(){
        Utility.clickingOnElement(driver, loginBtn);
    }


    // Assertions;
    public String assertURL(){
        return driver.getCurrentUrl();
    }

    public boolean isMyAccountTabDisplayed(){
        return Utility.isDisplayed(driver, accountTap);
    }

    public String assertErrorMessage(){
       return Utility.getText(driver, errorMessage);
    }

    public String assertErrorMessageColor(){
        String color = Utility.findWebElement(driver, errorMessage).getCssValue("color");
        return Color.fromString(color).asHex();
    }


}
