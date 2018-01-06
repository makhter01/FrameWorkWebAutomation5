package testcases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.Home_Page;
import page.SignIn_HomePage;

public class TestSignIn extends CommonAPI {
    @Test
    public void testSignIn() throws InterruptedException {
        SignIn_HomePage signin = PageFactory.initElements(driver, SignIn_HomePage.class);
        signin.ClickSignIn();
        Thread.sleep(50);
        signin.EnterUserName();
    }
  }
