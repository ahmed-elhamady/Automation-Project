package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class CurrenciesPage {
    WebDriver driver;
    public CurrenciesPage(WebDriver driver){
        this.driver = driver;
    }

    // Locators;
   private By productPrice = By.xpath("//span[contains(@class, 'actual-price')]");


    public String assertEuroSymbol() {
        List<WebElement> productPrices = driver.findElements(productPrice);
        String prices = "";
        for (WebElement price : productPrices) {
            prices = price.getText();
        }
        return prices;
    }



}
