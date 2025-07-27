package pages;

import org.openqa.selenium.WebDriver;
import utilities.Utility;

import java.util.Set;


public class FollowUsPage {
    WebDriver driver;

    public FollowUsPage(WebDriver driver){
        this.driver = driver;
    }


    // Actions;
    private WebDriver switchToWindow(){
        Utility.generalWait(driver, 7);
        String parent = driver.getWindowHandle();
        Set<String> allWindows= driver.getWindowHandles();
        WebDriver newWindow = null;
        for (String window : allWindows){
            if(!window.equalsIgnoreCase(parent)){
                newWindow = driver.switchTo().window(window);
            }
        }
        return newWindow;
    }


    // Assertions;
    public String asserURLs(){
        return switchToWindow().getCurrentUrl();
    }


}
