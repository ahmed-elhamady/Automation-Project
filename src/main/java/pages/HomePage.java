package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Utility;

import java.time.Duration;

public class HomePage {
    private final WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
    }


    // Locators;
    private final By logo = By.xpath("//img[contains(@alt, 'nopCommerce')]");
    private final By registerLink = By.linkText("Register");
    private final By loginLink = By.linkText("Log in");
    private final By addHTCToWishlist = By.linkText("HTC smartphone");
    private final By products = By.id("main");
    private final By currencyDropdown = By.id("customerCurrency");
    private final By search = By.cssSelector("input[id = 'small-searchterms']");
    private final By firstSlider = By.xpath("//a/img[@src = 'https://demo.nopcommerce.com/images/thumbs/0000079_banner_1.webp']");
    private final By secondSlider = By.xpath("//a/img[@src ='https://demo.nopcommerce.com/images/thumbs/0000080_banner_2.webp']");


    private By getLinks(String linkText){
        return By.linkText(linkText);
    }


    // Actions;
    public RegistrationPage clickOnRegisterLink(){
        Utility.clickingOnElement(driver, registerLink);
        return new RegistrationPage(driver);
    }

    public LoginPage clickOnLoginLink(){
        Utility.clickingOnElement(driver, loginLink);
        return new LoginPage(driver);
    }

    public CurrenciesPage selectCurrency(String currency){
        Select selectCurrency = new Select(Utility.findWebElement(driver, currencyDropdown));
        selectCurrency.selectByVisibleText(currency);
        return new CurrenciesPage(driver);
    }

    public SearchPage enterProductNameInSearchBar(String product){
        Utility.sendKeys(driver, search, product);
        return new SearchPage(driver);
    }

    public WishlistPage clickOnHTCProduct(){
        Utility.clickingOnElement(driver, addHTCToWishlist);
        return new WishlistPage(driver);
    }

    public FollowUsPage clickOnFollowUsLink(String link){
        Utility.clickingOnElement(driver, getLinks(link));
        return new FollowUsPage(driver);
    }

    private void waiSliders(By locator){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public HomeSlidersPage clickOnFirstSlider(){
        waiSliders(firstSlider);
        Utility.clickingOnElement(driver, firstSlider);
        return new HomeSlidersPage(driver);
    }
    public HomeSlidersPage clickOnSecondSlider(){
        waiSliders(secondSlider);
        Utility.clickingOnElement(driver, secondSlider);
        return new HomeSlidersPage(driver);
    }



    // Assertions;
    public boolean isLogoDisplayed(){
        return Utility.isDisplayed(driver, logo);
    }
    public boolean isProductsDisplayed(){
        return Utility.isDisplayed(driver, products);
    }



}
