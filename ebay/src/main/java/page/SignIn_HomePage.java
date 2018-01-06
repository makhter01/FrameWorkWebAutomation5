package page;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn_HomePage extends CommonAPI{
    @FindBy( xpath = "//a[text()='Sign in']")
    public static WebElement SignInLink;
    @FindBy( id="userid")
    public static WebElement userId;
    @FindBy( id="pass")
    public static WebElement userPassword;
    @FindBy( xpath="//input[@id=\'sgnBt\']")
    public static WebElement signInbutton;

    public static void ClickSignIn(){
        SignInLink.click();
    }
    public void EnterUserName() {
        userId.sendKeys("salman27");
        userPassword.sendKeys("sal2727");
        signInbutton.click();
    }
}
