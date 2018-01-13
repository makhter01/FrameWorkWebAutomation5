package testcustomerfunc;

import Homedepot_pages.Home;
import Homedepot_pages.MyAccount_Registration;
import Homedepot_pages.SignIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SignInTest extends SignIn {
    Home objHome;
    SignIn objsignIn;

    public void intialization(){
        objHome = PageFactory.initElements(driver, Home.class);
        objsignIn=PageFactory.initElements(driver,SignIn.class);
        }

    @Test(enabled = true)
    public void verifySignInTest() throws InterruptedException{
       objHome.navigateTosignIn();
        sleepFor(5);
        objsignIn.signInAccount();
        }

}
