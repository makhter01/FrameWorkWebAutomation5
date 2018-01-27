package mainPages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreditCards extends Home{
    @FindBy(css="#carousel_apply_large_Bank_of_America_Premium_Rewards")
    public static WebElement applyNow;

    public void creditcardsShop(){
        shopAllcreditCards.click();
    }

    public void personalCreditCards() throws InterruptedException{
        creditCardApply();
        navigateForward();
        applyNow.click();
    }
}
