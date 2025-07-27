package registration;

import base.BaseTests;
import dataProvider.RegistrationDP;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RegistrationTests extends BaseTests {

    @Test( dataProviderClass = RegistrationDP.class, dataProvider = "RegistrationData")
    public void testValidRegister(String gender, String fName, String lName, String email, String password, String confirmPassword){
        var registrationPage = homePage.clickOnRegisterLink();
        registrationPage.selectGenderType(gender)
                .enterFirstName(fName)
                      .enterLastName(lName)
                            .enterEmail(email)
                                  .enterPassword(password)
                                        .enterConfirmPassword(confirmPassword)
                                               .clickOnRegisterBtn();
        assertTrue(registrationPage.isMessageDisplayed(), "the message is NOt displayed");
        assertEquals(registrationPage.getMessageText(), "Your registration completed",
                "Error in Registration");
        assertEquals(registrationPage.getMessageColor(), "rgba(76, 177, 124, 1)", "invalid color");
    }
}
