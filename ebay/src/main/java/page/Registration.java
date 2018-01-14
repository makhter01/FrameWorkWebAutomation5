package page;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class Registration extends CommonAPI {
    @FindBy( linkText = "register")
    public static WebElement regLink;
    @FindBy( xpath="//*[@id=\'gh-ug-flex\']/a")
    public static WebElement regHomeTab;
    @FindBy( name="firstname")
    public static WebElement enterFrsName;
    @FindBy( name="lastname")
    public static WebElement enterlastName;
    @FindBy( name="email")
    public static WebElement enterEmail;
    @FindBy( id="PASSWORD")
    public static WebElement enterPassword;
    @FindBy( xpath="//*[@id=\"showPASSWORD\"]//span[1]")
    public static WebElement showPassword;
    @FindBy( id="ppaFormSbtBtn")
    public static WebElement FormSbtBtn;
    @FindBy( id="gh-ug")
    public static WebElement hiuserName;

    public void clickRegistrationLink(){
        regLink.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        enterFrsName.sendKeys("Salnam");
        enterlastName.sendKeys("khan");
        enterEmail.sendKeys("salman27271965@gmail.com");
        enterPassword.sendKeys("2727salman");
        showPassword.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        FormSbtBtn.click();
    }
}
