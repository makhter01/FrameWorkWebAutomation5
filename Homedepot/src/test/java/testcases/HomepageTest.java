package testcases;

import Homedepot_pages.Home;
import Homedepot_pages.Lighting;
import authentication.SignIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomepageTest extends Home {
    Home objHomePage;
    SignIn objSignin;
    Lighting objlight;

    @BeforeMethod
    public void initialization() {
        objHomePage = PageFactory.initElements(driver, Home.class);
        objSignin = PageFactory.initElements(driver, SignIn.class);
        objlight = PageFactory.initElements(driver, Lighting.class);
    }


    @Test(enabled = true)
    public void veifyTitle() throws InterruptedException {
        String actulaTitle = objHomePage.pageTitle();
        String expectedTitle = "The Home Depot ";
        Assert.assertTrue(actulaTitle.contains(expectedTitle));

    }

    @Test(enabled = true)
    public void verifySearchBoxTest() {

        objHomePage.searchBox();
        String actualtext = objlight.getlightingHeader();
        String expectedtext = "Lighting";
        Assert.assertTrue(actualtext.contains(expectedtext));

    }

    @Test(enabled = true)
    public void verifyHelpLinkStatusTest() {
        boolean actualStatus = objHomePage.verifyHelpLinkStatus();

        Assert.assertEquals(actualStatus, true);
        System.out.println(" HelpLink is enabled");
    }

    @Test(enabled = true)
    public void verifyFindStoreTest() {
        boolean actualStatus = objHomePage.verifyStoreFinder();
        Assert.assertEquals(actualStatus, true);
        System.out.println("FindStore link is enabled");
    }

    @Test(enabled = true)
    public void verifyForTheProTest() {
        boolean actualStatus = objHomePage.verifyStoreFinder();
        Assert.assertEquals(actualStatus, true);
        System.out.println("For the pro  link is enabled");
    }

    @Test(enabled = true)
    public void verifyGiftCardTest() {
        boolean actualStatus = objHomePage.verifyGiftCards();
        Assert.assertEquals(actualStatus, true);
        System.out.println("GiftCards link is enabled");

    }

    @Test(enabled = true)
    public void verifyCreditCardTest() {
        boolean actualStatus = objHomePage.verifyCreditCard();
        Assert.assertEquals(actualStatus, true);
        System.out.println("Credit Services link is enabled");
    }

    @Test(enabled = true)
    public void verifyMylistTest() {
        boolean actualStatus = objHomePage.verifyMylist();
        Assert.assertEquals(actualStatus, true);
        System.out.println("MyList link is enabled");
    }

    @Test(enabled = true)
    public void verifyTrackOrderTest() {
        boolean actualStatus = objHomePage.verifyTrackOrder();
        Assert.assertEquals(actualStatus, true);
        System.out.println("TrackOrder link is enabled");
    }

    @Test(enabled = false)
    public void verifyChooseStoreTest() {
        boolean actualStatus = objHomePage.verifyChooseStore();
        Assert.assertEquals(actualStatus, true);
        System.out.println("ChooseAStore link is enabled");
    }

    @Test(enabled = false)
    public void verifyAccountTest() {
        boolean actualStatus = objHomePage.verifyAccount();
        Assert.assertEquals(actualStatus, true);
        System.out.println("Account link is enabled");
    }


    @Test(enabled = true)
    public void verifyCartTest() {
        boolean actualStatus = objHomePage.verifyCart();
        Assert.assertEquals(actualStatus, true);
        System.out.println("Cart link is enabled");
    }

    @Test(enabled = true)
    public void verifyLogoTest() {
        String actualStatus = objHomePage.isLogoVisible();
        Assert.assertTrue(actualStatus.contains("The Home Depot Logo"));
        System.out.println("HomeDepot logo  link is enabled");
    }

    @Test(enabled = true)
    public void verifydepartmentTest() {
        boolean actualStatus = objHomePage.verifyDepartments();
        Assert.assertEquals(actualStatus, true);
        System.out.println("Departments is displayed");
    }

    @Test(enabled = true)
    public void verifyURL() throws InterruptedException {
        String actualUrl = objHomePage.currentURL();
        String expectedUrl = "https://www.homedepot.com/";
        Assert.assertEquals(actualUrl, expectedUrl);
        System.out.println("Url varification passed");
    }


    @Test(enabled = false)
    public void checkAccountButton() throws InterruptedException {
        Home account = new Home();
        account.clickAccount();
    }
}




