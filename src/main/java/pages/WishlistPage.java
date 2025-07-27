package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Utility;

import java.time.Duration;

public class WishlistPage {
    WebDriver driver;
    public WishlistPage(WebDriver driver){
        this.driver = driver;
    }

    // Locators;

    private By addToWishlistBtn = By.id("add-to-wishlist-button-18");
    private By successMsg = By.xpath("//div[contains(@class, 'bar-notification success')]");
    private By successMsgContent = By.xpath("//div[contains(@class, 'bar-notification')]/p[@class='content']");
    private By wishlist = By.linkText("Wishlist");
    private By quantityOfItems = By.xpath("//input[contains(@class, 'qty-input')]");




    // Actions;

    public WishlistPage addHTCToWishlist(){
        Utility.clickingOnElement(driver, addToWishlistBtn);
        waiSuccessMsg();
        return this;
    }
    private void waiSuccessMsg(){
        new WebDriverWait(driver, Duration.ofSeconds(7))
                .until(ExpectedConditions.visibilityOfElementLocated(successMsg));
    }
    public void clickOnWishlist(){
        waiSuccessMsg();
        Utility.clickingOnElement(driver, wishlist);
    }
    public int getQtyValue(){
        String qtyValueStr= Utility.findWebElement(driver, quantityOfItems).getAttribute("value");
        return Integer.parseInt(qtyValueStr.trim());
    }



    // Assertions;
    public boolean isSuccessMessageDisplayed(){
        return Utility.isDisplayed(driver, successMsg);
    }
    public String getMessageBackgroundColor(){
        return Color.fromString(Utility.findWebElement(driver, successMsg).getCssValue("color")).asHex();
    }
    public String getMessageContent(){
        return Utility.getText(driver, successMsgContent);
    }






}
