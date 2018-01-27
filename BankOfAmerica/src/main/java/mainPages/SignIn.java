package mainPages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn extends CommonAPI{
    @FindBy(xpath = "#skip-to-h1 h1")
    public static WebElement signinErrorMassage;

    public String invalidSigninAttempt(){
        String text=signinErrorMassage.getText();
        return text;
    }
}
