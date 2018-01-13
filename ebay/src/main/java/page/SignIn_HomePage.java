package page;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class SignIn_HomePage extends CommonAPI {
    @FindBy(xpath = "//a[text()='Sign in']")
    public static WebElement SignInLink;
    @FindBy(css = "#userid")
    public static WebElement userId;
    @FindBy(id = "pass")
    public static WebElement userPassword;
    @FindBy(xpath = "//input[@id=\'sgnBt\']")
    public static WebElement signInbutton;
    @FindBy(id = "errf")
    public static WebElement errorMessage;

    public static void ClickSignIn() {
        SignInLink.click();
        String url = driver.getCurrentUrl();
        if (url.contains("signin.ebay.com")) {
            System.out.println("The current signin url is internal link of same application--passed:");
        } else {
            System.out.println("The current signin url is external link of other application--failed:");
        }
    }

    public static boolean emailSignInBoxEnabled() {
        SignInLink.click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        boolean signInBox = userId.isEnabled();
        return signInBox;
    }

    public void EnterInvalidUserName() {
        SignInLink.click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        userId.sendKeys("Dharam Deol");
        userPassword.sendKeys("dharam20188");
        signInbutton.click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        String errMesg = errorMessage.getText();
        System.out.println("The error message for invalid credentials is:" + errMesg);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void EnterValidUserName() {
        SignInLink.click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        userId.sendKeys("dharadeo_7");
        userPassword.sendKeys("dharam2018");
        signInbutton.click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    }
}
