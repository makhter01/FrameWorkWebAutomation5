package testcases;

import base.CommonAPI;
import junit.framework.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.Home_Page;
import page.SignIn_HomePage;

public class TestSignIn extends SignIn_HomePage {
    SignIn_HomePage signin;

    @BeforeMethod
    public void initialization()
    {
        signin = PageFactory.initElements(driver, SignIn_HomePage.class);
    }

    //ebay_TC_024 Verification point for SignIn Link
    @Test(priority = 1)
    public void testSignIn() throws InterruptedException {
        signin.ClickSignIn();
        Thread.sleep(50);
    }

    //ebay_TC_02 Check if emal sign-in box exist
    @Test(priority = 2)
    public void testemailSignInBoxEnabled() {
        boolean actualsign = signin.emailSignInBoxEnabled();
        Assert.assertEquals(actualsign, true);
        System.out.println("The email box for sign in ");

    }

    // ebay_TC_025 signin with valid credentials
    @Test(priority = 3)
    public void testValidUserName() throws InterruptedException {
        signin.EnterValidUserName();
        Thread.sleep(50);
    }

    // ebay_TC_026 signin with invalid credentials
    @Test(priority = 5)
    public void testInvalidUserName() {
        signin.EnterInvalidUserName();
    }

    // ebay_TC_024 navigaet to home page after sign in with invalid credentials
    @Test(priority = 4)
    public void testnavigateBack() {
        signin.goBackToHomeWindow();
    }
}
