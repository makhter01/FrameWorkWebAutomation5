package testcases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.Registration;
import page.SignIn_HomePage;

import java.util.concurrent.TimeUnit;

public class TestRegistration extends Registration{

    Registration registration;
    @BeforeMethod
    public void initialization() {
        registration = PageFactory.initElements(driver, Registration.class);

    }
    //  ebay_TC_022 Click registration on main page
    @Test(priority = 1,enabled=true)
    public void testclickRegLink(){
        registration.clickRegistrationLink();

    }
}
