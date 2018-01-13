package enrollTestPage;

import enrollment.SignInPage;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.util.List;


public class TestSignInPage extends SignInPage {
    @Test
    public void TestSignInPage() throws InterruptedException{
        SignInPage signin = PageFactory.initElements(driver, SignInPage.class);
        signin.ClickSignIn();
        Thread.sleep(50);
        signin.EnterUserName();
    }
}


