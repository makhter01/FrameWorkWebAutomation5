package enrollment;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SignInPage extends CommonAPI{
    @FindBy( xpath = "/html/body/div[2]/div[5]/header/div[4]/div[3]/ul/li[3]/a")
    public static WebElement SignInLink;
    @FindBy( id="userId-input-field")
    public static WebElement userId;
    @FindBy( id="password-input-field")
    public static WebElement userPassword;
    @FindBy( xpath="//*[@id=\"signin-button\"]")
    public static WebElement signInbutton;

    public static void ClickSignIn(){
        SignInLink.click();
    }
    public void EnterUserName() {
        userId.sendKeys("SyedaReza");
        userPassword.sendKeys("SReza1234");
        signInbutton.click();

    }
}

