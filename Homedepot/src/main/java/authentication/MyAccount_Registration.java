package authentication;

import Homedepot_pages.Home;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount_Registration extends Home {
    @FindBy(css = "#authRegister span")
    public static WebElement register;

    @FindBy(xpath = "//*[@id='email_id']")
    public static WebElement email;

    @FindBy(css = "#registrationPassword")
    public static WebElement password;

    @FindBy(css = "#confirmPassword")
    public static WebElement confermPassword;

    @FindBy(css = "#zipcode")
    public static WebElement zipcode;

    @FindBy(css = "#accountRegister span")
    public static WebElement registartionclickButton;

    public boolean isEmailDisplayed() {
        boolean eml = email.isEnabled();
        return eml;
    }

    public void newAccountRegistration() {
        email.sendKeys("abcd@gmail.com");
        password.sendKeys("abcd1234");
        confermPassword.sendKeys("abcd1234");
        zipcode.sendKeys("11432");
        registartionclickButton.click();
    }
}
