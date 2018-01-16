package testcustomerfunc;

import Homedepot_pages.Home;
import Homedepot_pages.MyAccount_Registration;
import Homedepot_pages.SignIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAccountTest extends MyAccount_Registration {
    Home objHome;
    MyAccount_Registration objMyacc;

    @BeforeMethod
    public void intialization(){
        objHome = PageFactory.initElements(driver, Home.class);
        objMyacc= PageFactory.initElements(driver,MyAccount_Registration.class);
    }

    @Test(enabled = true)
    public void verifyRegistrationTest() throws InterruptedException{
        //objHome.clickAccount();
        objHome.
        sleepFor(5);
        objMyacc.newAccountRegistration();
    }


}
