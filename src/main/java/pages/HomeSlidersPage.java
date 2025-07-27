package pages;

import org.openqa.selenium.WebDriver;

public class HomeSlidersPage {
    WebDriver driver;

    public HomeSlidersPage(WebDriver driver){
        this.driver = driver;
    }

    public String getSliderURLs(){
        return driver.getCurrentUrl();
    }

}
