package login;

import base.BaseTests;
import dataProvider.LoginDP;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class LoginTests extends BaseTests {
    private SoftAssert softAssert = new SoftAssert();

    @Test(dataProviderClass = LoginDP.class, dataProvider = "ValidLoginData")
    public void TC_1ValidLogin(String email, String password){
       var loginPage = homePage.clickOnLoginLink();
       loginPage.enterEmail(email)
                     .enterPassword(password)
                           .clickOnLoginBtn();
       softAssert.assertEquals(loginPage.assertURL(), "https://demo.nopcommerce.com/", "URL is incorrect");
       softAssert.assertTrue(loginPage.isMyAccountTabDisplayed(), "MY Account Tap is NOT Displayed");
       softAssert.assertAll("Error in Assertions");
    }

    @Test(dataProviderClass = LoginDP.class, dataProvider = "InvalidLoginData")
    public void TC_2InvalidLogin(String email, String password){
        var loginPage = homePage.clickOnLoginLink();
        loginPage.enterEmail(email)
                       .enterPassword(password)
                             .clickOnLoginBtn();
        softAssert.assertTrue(loginPage.assertErrorMessage().contains("Login was unsuccessful."), "Invalid Login Message");
        softAssert.assertEquals(loginPage.assertErrorMessageColor(), "#e4434b", "Error Message Color Does NOT Match");
        softAssert.assertAll();
    }

}
