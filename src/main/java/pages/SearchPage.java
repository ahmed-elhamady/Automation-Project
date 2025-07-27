package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Utility;

import java.util.List;


public class SearchPage {
    WebDriver driver;
    public SearchPage(WebDriver driver){
        this.driver = driver;
    }


    // Locators;
    private By searchBtn = By.xpath("//form[@id = 'small-search-box-form']/button[@type = 'submit']");
    private By productDetails = By.xpath("//div[@class = 'details']/h2[@class='product-title']");
    private By productLink = By.xpath("//div[@class = 'details']/h2/a");
    private By SUK = By.xpath("//span[@class='value']");


    //Actions;
    public void clickOnSearchBtn(){
        Utility.clickingOnElement(driver, searchBtn);
    }

    public void clickOnProductLink(){
        Utility.clickingOnElement(driver, productLink);
    }



    // Assertions;
    public String assertSearchURL(){
        return driver.getCurrentUrl();
    }

    public int assertResultSize(){
        List<WebElement> results = driver.findElements(productDetails);
        return results.size();
    }

    public String assertTheSearchResult(){
        List<WebElement> results = driver.findElements(productDetails);
        String result = "";
        for (int i =0; i< results.size(); i++){
            result = results.get(i).getText().toLowerCase();
        }

        return result;
    }

    public String getSKU(){
        return Utility.getText(driver, SUK);
    }

}
