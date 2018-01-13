package Homedepot_pages;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.text.html.CSS;

public class SignIn extends CommonAPI{

    @FindBy(xpath = "#emailholder")
    public static WebElement emailText;

    @FindBy(css="#email_id")
    public static WebElement sinInEmailBox;

    @FindBy(xpath = "//*[@id=\'userLogin\']//div[2]")
    public static WebElement passwordText;

    @FindBy(css="#password")
    public static WebElement signInPasswordBox;

    @FindBy(xpath = "//*[@id=\'userLogin\']//a")
    public static WebElement forgetPasswordlink;

    @FindBy(xpath="//*[@id=\'userLogin\']//div[5]/a[1]")
    public static WebElement termsAndconditionsLink;

    @FindBy(xpath="//*[@id=\'userLogin\']//div[5]/a[2]")
    public static WebElement privacyAndSecurityLink;

    @FindBy(css="#accountSignIn span")
    public static WebElement submitsignInButton;

    public boolean isEmailTextDisplayed(){
       boolean emailtxt= emailText.isDisplayed();
       return emailtxt;
    }

    public boolean isEmailBoxEnabled(){
        boolean emailBox=sinInEmailBox.isEnabled();
        return emailBox;
    }

    public boolean isPasswordTextDisplayed() {
        boolean passText=passwordText.isDisplayed();
        return passText;
    }

    public boolean isTermsAndConditionsLinkEnabled(){
        boolean termsAndCond=termsAndconditionsLink.isEnabled();
        return termsAndCond;
    }

    public boolean isForgetPasswordEnabled(){
        boolean forgetpass=forgetPasswordlink.isEnabled();
        return forgetpass;
    }

    public boolean isPrivacyAndSecurityEnabled(){
        boolean priAndsec=privacyAndSecurityLink.isEnabled();
        return priAndsec;
    }


    public static void  signInAccount(){

        sinInEmailBox.sendKeys("abcd@gmail.com", Keys.ENTER);
      signInPasswordBox.sendKeys("abcd",Keys.ENTER);
      submitsignInButton.click();

    }
}
