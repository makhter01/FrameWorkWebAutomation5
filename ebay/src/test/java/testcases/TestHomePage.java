package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.Home_Page;
import page.SamsungTablet;

public class TestHomePage extends Home_Page {
    Home_Page search;
    SamsungTablet tablet;

    @BeforeMethod
    public void initialization() {
        search = PageFactory.initElements(driver, Home_Page.class);
        tablet = PageFactory.initElements(driver, SamsungTablet.class);
    }

    // ebay_TC_001  ebay url is correct
    @Test(priority =1,enabled = true)
    public void verifyCurrentUrl() {
        String expectedUrl = "ebay.com";
        Assert.assertTrue(isCurrentUrlCorrect().contains(expectedUrl));
        System.out.println("Current url is Passed");
    }
    //  ebay_TC_002  Verify PageTitle
    @Test(priority = 2, enabled = true)
    public void veifyTitle() throws InterruptedException {
        String actualTitle = search.pageTitle();
        String expectedTitle = "eBay";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        System.out.println("The title of ebay is verified");
    }

    //  ebay_TC_003 verify existance of logo on main page
    @Test(priority = 3, enabled = true)
    public void testlogoisDisplayed() {
        boolean logoImage = search.isebayLogoDislayed();
        Assert.assertEquals(logoImage, true);
        System.out.println("Verify Search Link : " + logoImage);
    }

    //  ebay_TC_004 verify existance of search button on main page
    @Test(priority = 4, enabled = true)
    public void testSearchLinkisDisplayed() {
        boolean actualSearch = search.isSearchButtonDislayed();
        Assert.assertEquals(actualSearch, true);
        System.out.println("Verify Search Link : " + actualSearch);
    }

    //  ebay_TC_005 verify existance of registration button on main page
    @Test(priority = 5, enabled = true)
    public void testRegLinkisDisplayed() {
        boolean actualRegLink = search.isRegLinkDispayed();
        Assert.assertEquals(actualRegLink, true);
        System.out.println("Verify Reg Link : " + actualRegLink);
    }

    //  ebay_TC_006 verify existance of electronics link on main page
    @Test(priority = 6, enabled = true)
    public void testElectronincsLinkisDisplayed() {
        boolean actualElectronics = search.isElectronicsLinkDisplayed();
        Assert.assertEquals(actualElectronics, true);
        System.out.println("Verify Electronics Link : " + actualElectronics);
    }

    //  ebay_TC_007 verify existance of Fashion Link on main page
    @Test(priority = 7, enabled = true)
    public void testFashionLinkisDislayed() {
        boolean actualFashion = search.isFashionLinkDisplayed();
        Assert.assertEquals(actualFashion, true);
        System.out.println("Verify Fashion Link : " + actualFashion);
    }

    //  ebay_TC_008 verify existance of Motor Link on main page
    @Test(priority = 8, enabled = true)
    public void testMotorsLinkisDislayed() {
        boolean actualMotors = search.isMotorLinkDisplayed();
        Assert.assertEquals(actualMotors, true);
        System.out.println("Verify Motors Link : " + actualMotors);
    }

    //  ebay_TC_009 verify existance of Collectibles & ArtLink on main page
    @Test(priority = 9, enabled = true)
    public void testCollectblesArtisEnabled() {
        boolean actualCollArt = search.isCollectiblesArtLinkEnabled();
        Assert.assertEquals(actualCollArt, true);
        System.out.println("Verify Collectible Art Link : " + actualCollArt);
    }

    //  ebay_TC_010 verify existance of Home & Garden on main page
    @Test(priority = 10, enabled = true)
    public void testHomeGardenisEnabled() {
        boolean actualHomeGard = search.isHomeGardenEnabled();
        Assert.assertEquals(actualHomeGard, true);
        System.out.println("Verify Home & Garden Link : " + actualHomeGard);
    }

    //  ebay_TC_011 verify existance of Sporting Goods on main page
    @Test(priority = 11, enabled = true)
    public void testSportingGoodsisEnabled() {
        boolean actualSporting = search.isSportingGoodEnabled();
        Assert.assertEquals(actualSporting, true);
        System.out.println("Verify Sporting Goods Link : " + actualSporting);
    }

    //  ebay_TC_012 verify existance of Toys on main page
    @Test(priority = 12, enabled = true)
    public void testToysisEnabled() {
        boolean actualToys = search.isToysEnabled();
        Assert.assertEquals(actualToys, true);
        System.out.println("Verify Toys Link : " + actualToys);
    }

    //  ebay_TC_013 verify existance of saved on main page
    @Test(priority = 13, enabled = true)
    public void testSavedisEnabled() {
        boolean actualsaved = search.isSavedEnabled();
        Assert.assertEquals(actualsaved, true);
        System.out.println("Verify Saved Link : " + actualsaved);
    }

    //  ebay_TC_014 verify existance of business & industry on main page
    @Test(priority = 14, enabled = true)
    public void testisBusineesIndustryEnabled() {
        boolean actualbussiness = search.isBusineesIndustryEnabled();
        Assert.assertEquals(actualbussiness, true);
        System.out.println("Verify Business & Industrial Link : " + actualbussiness);
    }

    //  ebay_TC_015 verify existance of music on main page
    @Test(priority = 15, enabled = true)
    public void testisMusicEnabled() {
        boolean actualMusic = search.isMusicEnabled();
        Assert.assertEquals(actualMusic, true);
        System.out.println("Verify Music Link : " + actualMusic);
    }

    //  ebay_TC_016 verify existance of deals on main page
    @Test(priority = 16, enabled = true)
    public void testisDealsEnabled() {
        boolean actualDeal = search.isDealsEnabled();
        Assert.assertEquals(actualDeal, true);
        System.out.println("Verify Deal Link : " + actualDeal);
    }

    //  ebay_TC_018 all category drop down count and select item with index3
    @Test(priority = 17, enabled = true)
    public void testAllCateDropDown() {
        search.AllCateDropDown();
    }

    //  ebay_TC_019 all category drop down count and select item with index3
    @Test(priority = 18, enabled = true)
    public void testCrossTrainImageisDisplayed() throws InterruptedException {
        search.ClickCrossTrainImage();
    }

    // ebay_TC_020 Footer Elements verification
    @Test(priority = 19, enabled = true)
    public void testbuyLinkisDispalyed() {
        boolean buy = search.isBuyLinkDisplayed();
        Assert.assertEquals(buy, true);
        System.out.println(" Verify buy Link is displayed: " + buy);
    }

    //  ebay_TC_021 all category drop down count and select item with index3
    @Test(priority = 20, enabled = true)
    public void testsearchitemBoxisEntered() {
        search.searchItem();
        tablet.getSamsungTabletHeader();
        String actualText = tablet.getSamsungTabletHeader();
        String expectedText = "Find deals and best selling products for Samsung Tablets";
        Assert.assertTrue(actualText.contains(expectedText));
        System.out.println("Get Product Search Page Title:");
    }

    // ebay_TC_022  Verify clicking of Motor Link on main Page
    @Test(priority = 21, enabled = true)
    public void testClickMotorsLink() throws InterruptedException {
        String actualTitle = search.ClickMotorLink();
        String expectedTitle = "Tires & Wheels";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        System.out.println("Get title of Motors Link" + driver.getTitle());
    }
}

