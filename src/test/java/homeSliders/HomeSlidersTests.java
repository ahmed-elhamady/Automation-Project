package homeSliders;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HomeSlidersTests extends BaseTests {
    @Test
    public void iphone16TC(){
        var homeSlidersPage = homePage.clickOnFirstSlider();
        assertEquals(homeSlidersPage.getSliderURLs(), "https://demo.nopcommerce.com/apple-iphone-16-128gb", "invalid Iphone URL");
    }

    @Test
    public void galaxy24TC(){
        var homeSlidersPage = homePage.clickOnSecondSlider();
        assertEquals(homeSlidersPage.getSliderURLs(), "https://demo.nopcommerce.com/samsung-galaxy-s24-256gb", "invalid Galaxy URL");
    }

}
