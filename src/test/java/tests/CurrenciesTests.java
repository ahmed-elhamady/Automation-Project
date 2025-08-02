package tests;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class CurrenciesTests extends BaseTests {
    @Test
    public void  verifyEuroSymbol(){
        var currenciesPage = homePage.selectCurrency("Euro");
        assertTrue(currenciesPage.assertEuroSymbol().contains("€"), "Incorrect Symbol");

    }

}
