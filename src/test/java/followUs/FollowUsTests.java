package followUs;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FollowUsTests extends BaseTests {
    @Test
    public void verifyFacebookLink_TC(){
       var followUs = homePage.clickOnFollowUsLink("Facebook");
        assertEquals(followUs.asserURLs(), "https://www.facebook.com/nopCommerce", "Invalid Facebook URL");
    }
    @Test
    public void verifyTwitterLink_TC(){
        var followUs = homePage.clickOnFollowUsLink("Twitter");
        assertEquals(followUs.asserURLs(), "https://x.com/nopCommerce", "Invalid X URL");
    }
    @Test
    public void verifyRSSLink_TC(){
        var followUs = homePage.clickOnFollowUsLink("RSS");
        assertEquals(followUs.asserURLs(), "https://demo.nopcommerce.com/new-online-store-is-open", "Invalid RSS URL");
    }
    @Test
    public void verifyYouTubeLink_TC(){
        var followUs = homePage.clickOnFollowUsLink("YouTube");
        assertEquals(followUs.asserURLs(), "https://www.youtube.com/user/nopCommerce", "Invalid youtube URL");
    }
    @Test
    public void verifyInstagramLink_TC(){
        var followUs = homePage.clickOnFollowUsLink("Instagram");
        assertEquals(followUs.asserURLs(), "https://www.instagram.com/nopcommerce_official/#", "Invalid instagram URL");
    }

}
