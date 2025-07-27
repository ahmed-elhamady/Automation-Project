package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Utility {


    // TODO: Converting By to WebElement;
    public static WebElement findWebElement(WebDriver driver, By locator) {
        return driver.findElement(locator);
    }


    //TODO: Send Keys to element;
    public static void sendKeys(WebDriver driver, By locator, String text) {
        new WebDriverWait(driver, Duration.ofSeconds(7))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
        driver.findElement(locator).sendKeys(text);
    }

    //TODO: Clicking on element;
    public static void clickingOnElement(WebDriver driver, By locator) {
        new WebDriverWait(driver, Duration.ofSeconds(7))
                .until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).click();
    }

    //TODO: get text from element;
    public static String getText(WebDriver driver, By locator) {
        new WebDriverWait(driver, Duration.ofSeconds(7))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
        return driver.findElement(locator).getText();
    }

    // TODO: Ex General wait;
    public static void generalWait(WebDriver driver, int seconds) {
        new WebDriverWait(driver, Duration.ofSeconds(seconds));
    }

    // TODO: Check the element is Clickable
    public static boolean isClickable(WebDriver driver, By locator){
        new WebDriverWait(driver, Duration.ofSeconds(7))
                .until(ExpectedConditions.elementToBeClickable(locator));
        return driver.findElement(locator).isEnabled();
    }
    // TODO: Check the element is Displayed

    public static boolean isDisplayed(WebDriver driver, By locator){
        new WebDriverWait(driver, Duration.ofSeconds(7))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
        return driver.findElement(locator).isDisplayed();

    }

    // TODO: Check the element is Selected
    public static boolean isSelected(WebDriver driver, By locator){
        new WebDriverWait(driver, Duration.ofSeconds(7))
                .until(ExpectedConditions.elementToBeSelected(locator));
        return driver.findElement(locator).isSelected();
    }



}
