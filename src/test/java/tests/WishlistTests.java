package tests;

import base.BaseTests;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertTrue;


public class WishlistTests extends BaseTests {
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void  addItemToWishlistTC(){
        var wishlistPage = homePage.clickOnHTCProduct();
        wishlistPage.addHTCToWishlist();
        softAssert.assertTrue(wishlistPage.isSuccessMessageDisplayed(), "The Success Message is NOT Displayed");
        softAssert.assertTrue(wishlistPage.getMessageContent().contains("The product has been added to your wishlist"));
        softAssert.assertEquals(wishlistPage.getMessageBackgroundColor(), "#ffffff", "Invalid Color");
        softAssert.assertAll("Error in Assertions");

    }

    @Test
    public void validateItemAppearsInTheWishlistTC(){
        var wishlistPage = homePage.clickOnHTCProduct();
        wishlistPage.addHTCToWishlist()
                        .addHTCToWishlist()
                               .clickOnWishlist();
        assertTrue(wishlistPage.getQtyValue() > 0, "The Wishlist is Empty");
    }


}
