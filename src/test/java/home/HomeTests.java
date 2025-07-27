package home;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HomeTests extends BaseTests {
    @Test
    public void testTheHomePage(){
        assertTrue(homePage.isLogoDisplayed(), "the logo image is NOT displayed");
        assertTrue(homePage.isProductsDisplayed(), "the Products are NOT displayed");
    }

}
