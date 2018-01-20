package testcases;

import Homedepot_pages.Home;
import Homedepot_pages.Lighting;
<<<<<<< HEAD
import Homedepot_pages.SignIn;
=======
import authentication.SignIn;
>>>>>>> mehzabin_team5
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

<<<<<<< HEAD

=======
>>>>>>> mehzabin_team5
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

<<<<<<< HEAD

    @Test(enabled = true)
=======
    @Test(enabled = false)
>>>>>>> mehzabin_team5
    public void veifyTitle() throws InterruptedException {
        String actulaTitle = objHomePage.pageTitle();
        String expectedTitle = "The Home Depot ";
        Assert.assertTrue(actulaTitle.contains(expectedTitle));

    }

    @Test(enabled = true)
    public void verifySearchBoxTest() {
<<<<<<< HEAD

=======
>>>>>>> mehzabin_team5
        objHomePage.searchBox();
        String actualtext = objlight.getlightingHeader();
        String expectedtext = "Lighting";
        Assert.assertTrue(actualtext.contains(expectedtext));

    }

<<<<<<< HEAD
    @Test(enabled = true)
    public void verifyHelpLinkStatusTest() {
        boolean actualStatus = objHomePage.verifyHelpLinkStatus();

=======
    @Test(enabled = false)
    public void verifyHelpLinkStatusTest() {
        boolean actualStatus = objHomePage.verifyHelpLinkStatus();
>>>>>>> mehzabin_team5
        Assert.assertEquals(actualStatus, true);
        System.out.println(" HelpLink is enabled");
    }

<<<<<<< HEAD
    @Test(enabled = true)
=======
    @Test(enabled = false)
>>>>>>> mehzabin_team5
    public void verifyFindStoreTest() {
        boolean actualStatus = objHomePage.verifyStoreFinder();
        Assert.assertEquals(actualStatus, true);
        System.out.println("FindStore link is enabled");
    }

<<<<<<< HEAD
    @Test(enabled = true)
=======
    @Test(enabled = false)
>>>>>>> mehzabin_team5
    public void verifyForTheProTest() {
        boolean actualStatus = objHomePage.verifyStoreFinder();
        Assert.assertEquals(actualStatus, true);
        System.out.println("For the pro  link is enabled");
    }

<<<<<<< HEAD
    @Test(enabled = true)
=======
    @Test(enabled = false)
>>>>>>> mehzabin_team5
    public void verifyGiftCardTest() {
        boolean actualStatus = objHomePage.verifyGiftCards();
        Assert.assertEquals(actualStatus, true);
        System.out.println("GiftCards link is enabled");

<<<<<<< HEAD
    }

    @Test(enabled = true)
    public void verifyCreditCardTest() {
        boolean actualStatus = objHomePage.verifyCreditCard();
        Assert.assertEquals(actualStatus, true);
        System.out.println("Credit Services link is enabled");
    }

    @Test(enabled = true)
=======
    }

    @Test(enabled = false)
    public void verifyCreditCardTest() {
        boolean actualStatus = objHomePage.verifyCreditCard();
        Assert.assertEquals(actualStatus, true);
        System.out.println("Credit Services link is enabled");
    }

    @Test(enabled = false)
>>>>>>> mehzabin_team5
    public void verifyMylistTest() {
        boolean actualStatus = objHomePage.verifyMylist();
        Assert.assertEquals(actualStatus, true);
        System.out.println("MyList link is enabled");
    }

<<<<<<< HEAD
    @Test(enabled = true)
=======
    @Test(enabled = false)
>>>>>>> mehzabin_team5
    public void verifyTrackOrderTest() {
        boolean actualStatus = objHomePage.verifyTrackOrder();
        Assert.assertEquals(actualStatus, true);
        System.out.println("TrackOrder link is enabled");
    }

<<<<<<< HEAD
    @Test(enabled = true)
=======
    @Test(enabled = false)
>>>>>>> mehzabin_team5
    public void verifyChooseStoreTest() {
        boolean actualStatus = objHomePage.verifyChooseStore();
        Assert.assertEquals(actualStatus, true);
        System.out.println("ChooseAStore link is enabled");
    }

<<<<<<< HEAD
    @Test(enabled = true)
=======
    @Test(enabled = false)
>>>>>>> mehzabin_team5
    public void verifyAccountTest() {
        boolean actualStatus = objHomePage.verifyAccount();
        Assert.assertEquals(actualStatus, true);
        System.out.println("Account link is enabled");
    }


<<<<<<< HEAD
    @Test(enabled = true)
=======
    @Test(enabled = false)
>>>>>>> mehzabin_team5
    public void verifyCartTest() {
        boolean actualStatus = objHomePage.verifyCart();
        Assert.assertEquals(actualStatus, true);
        System.out.println("Cart link is enabled");
    }

    @Test(enabled = true)
    public void verifyLogoTest() {
        String actualStatus = objHomePage.isLogoVisible();
<<<<<<< HEAD
        Assert.assertTrue(actualStatus.contains("The Home Depot Logo"));
        System.out.println("HomeDepot logo  link is enabled");
    }

    @Test(enabled = true)
=======
        Assert.assertEquals(actualStatus, true);
        System.out.println("HomeDepot logo  link is enabled");
    }


    @Test(enabled = false)
>>>>>>> mehzabin_team5
    public void verifydepartmentTest() {
        boolean actualStatus = objHomePage.verifyDepartments();
        Assert.assertEquals(actualStatus, true);
        System.out.println("Departments is displayed");
    }

<<<<<<< HEAD
    @Test(enabled = true)
=======
    @Test(enabled = false)
>>>>>>> mehzabin_team5
    public void verifyURL() throws InterruptedException {
        String actualUrl = objHomePage.currentURL();
        String expectedUrl = "https://www.homedepot.com/";
        Assert.assertEquals(actualUrl, expectedUrl);
        System.out.println("Url varification passed");
    }


<<<<<<< HEAD
    @Test(enabled = true)
    public void checkAccountButton() {
=======
    @Test(enabled = false)
    public void checkAccountButton() throws InterruptedException {
>>>>>>> mehzabin_team5
        Home account = new Home();
        account.clickAccount();
    }
}



