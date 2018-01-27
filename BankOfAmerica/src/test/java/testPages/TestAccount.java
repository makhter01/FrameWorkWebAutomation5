package testPages;

import base.CommonAPI;
import mainPages.Account;
import mainPages.Home;
import mainPages.SignIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAccount extends CommonAPI{
    Home homeobj;
    Account accountobj;
    SignIn signobj;

    @BeforeMethod
    public void initialize(){
        homeobj= PageFactory.initElements(driver,Home.class);
        accountobj=PageFactory.initElements(driver,Account.class);
        signobj=PageFactory.initElements(driver,SignIn.class);
    }

    @Test(enabled = true)
    public void verifyInvalidUserSignIn() throws InterruptedException{
        accountobj.invalidUserLogin();
        String actual=signobj.invalidSigninAttempt();
        Assert.assertTrue(actual.contains("error-message"));

    }
}
