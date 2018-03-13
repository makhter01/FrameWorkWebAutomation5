package testcustomerfunc;

import Homedepot_pages.Home;
import Homedepot_pages.MyAccount_Registration;
import Homedepot_pages.SignIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInTest extends Home {
    Home objHome;
    SignIn objsignIn;
      @BeforeMethod
    public void intialization(){
        objHome = PageFactory.initElements(driver, Home.class);
        //objsignIn=PageFactory.initElements(driver,SignIn.class);
        }

    @Test(enabled = true)
    public void verifySignInTest() throws InterruptedException{
       objHome.navigateTosignIn(driver);

        /*String expected="Your email and password combination didn't match our records. Please try again.";
        String actual=driver.getWindowHandle();
        Assert.assertTrue(actual.contains(expected));*/


        }

}
