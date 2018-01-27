package mainPages;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class Account extends CommonAPI{
    @FindBy(css="#onlineId1")
    public static WebElement signInOnlineID;

    @FindBy(css="#passcode1")
    public static WebElement passcodeHomeButton;

    @FindBy (css ="#saveOnlineId")
    public static WebElement saveOnlineIdCheckBox;

    @FindBy(css="#signIn > span:nth-child(1)")
    public static WebElement signInbtn;

    @FindBy(css = "#forgot-pcd")
    public static WebElement forgetPasswordbtn;

    @FindBy(css = "#security")
    public static WebElement securityAHelpbtn;

    @FindBy(css = "#enroll")
    public static WebElement enroll;

    @FindBy(css = "#open")
    public static WebElement openNewAccount;

    public boolean isOnlinesignInTextboxEnabled(){
        boolean onlineID=signInOnlineID.isEnabled();
        return onlineID;
    }

    public boolean isPasscodeTextboxEnabled(){
        boolean passcode=passcodeHomeButton.isEnabled();
        return passcode;
    }

    public boolean isSaveOnlineDisplayed(){
        boolean saveONRadbtn=saveOnlineIdCheckBox.isDisplayed();
        return saveONRadbtn;
    }

    public boolean isSaveOnlineSelected(){
        boolean saveOnlinechkBox=saveOnlineIdCheckBox.isSelected();
        return  saveOnlinechkBox;
    }

    public void invalidUserLogin() throws InterruptedException{
        signInOnlineID.sendKeys("invalidUserId@gmail.com", Keys.ENTER);
        sleepFor(1);
        passcodeHomeButton.sendKeys("invalidPassword",Keys.ENTER);
       // sleepFor(5);
       // saveOnlineIdCheckBox.click();
        signInbtn.click();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }

}
