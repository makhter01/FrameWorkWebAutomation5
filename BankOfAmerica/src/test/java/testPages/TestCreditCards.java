package testPages;

import mainPages.CreditCards;
import mainPages.Home;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCreditCards extends CreditCards{
    Home homeobj;
    CreditCards creditCardsobj;


    @BeforeMethod
    public void initialize(){
        homeobj= PageFactory.initElements(driver,Home.class);
        creditCardsobj=PageFactory.initElements(driver,CreditCards.class);
    }
    @Test(enabled = true)
     public void applyCreditCards() throws InterruptedException{
        homeobj.creditCardApply();
        creditCardsobj.personalCreditCards();
    }



}
