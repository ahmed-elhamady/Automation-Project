package search;

import base.BaseTests;
import dataProvider.ProductsDP;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

public class SearchTests extends BaseTests {
    private SoftAssert softAssert = new SoftAssert();

    @Test(dataProviderClass = ProductsDP.class, dataProvider = "productNames")
    public void searchUsingProductName_TC(String productName){
       var searchPage = homePage.enterProductNameInSearchBar(productName);
       searchPage.clickOnSearchBtn();
       softAssert.assertTrue(searchPage.assertSearchURL().contains("https://demo.nopcommerce.com/search?q="+productName), "Invalid URL");
       softAssert.assertTrue(searchPage.assertResultSize() > 0, "The Product list is Empty");
       softAssert.assertTrue(searchPage.assertTheSearchResult().contains(productName), "Search Results is NOT Related to Product Name");
       softAssert.assertAll("Error in Assertions");
    }

    @Test(dataProviderClass = ProductsDP.class, dataProvider = "productSKU")
    public void searchUsingProductSKU_TC(String productSku){
        var searchPage = homePage.enterProductNameInSearchBar(productSku);
        searchPage.clickOnSearchBtn();
        searchPage.clickOnProductLink();
        assertEquals(searchPage.getSKU(), productSku, "product SUK is NOT Matched");
    }
}
