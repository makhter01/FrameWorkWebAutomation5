package testPages;

import base.CommonAPI;
import mainPages.Home;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHome extends Home{
    Home homeObject;

     @BeforeMethod
    public void initialize(){
        homeObject= PageFactory.initElements(driver,Home.class);
    }

    @Test(enabled =true)
    public void verifyTitle() throws InterruptedException{
         String actualTitle=getCurrentPageTitle();
         String expectedTitle="Bank of America";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        System.out.println("Homepage Titled varified");

    }

    @Test
    public void verifyUrl() {
         String actualUrl=getCurrentPageUrl();
         String expectedUrl="https://www.bankofamerica.com/";
         Assert.assertTrue(actualUrl.contains(expectedUrl));
        System.out.println("Homepage url varified");
        throw new SkipException("this test would be skipped"); // testng skip exception use for control the flow of execution
    }
    @Test(enabled = false)
    public void verifyPersonalButton(){
        boolean result=homeObject.isPersonalTextLinkenable();
        Assert.assertEquals(result,true);
        System.out.println("Personal button isEnabled");

    }

   /* @Test(enabled = true)
    public void verifyisSmallBusinessEnabled(){
         boolean actualresult= homeObject.isPersonalTextLinkenable();
           Assert.assertEquals(actualresult,true);
    }

    @Test(enabled = true)

    public void verifyisInvestMngEnabled(){
        boolean actualresult= homeObject.isWealthManagementbtnEnabled();
        Assert.assertEquals(actualresult,true);
    }

    @Test(enabled = true)
    public void verifyisBusinessInvEnabled(){
        boolean actualresult= homeObject.isBussnessInstbtnEnabled();
        Assert.assertEquals(actualresult,true);
    }


    @Test(enabled = true)
    public void verifyisAboutUsbtnEnabled(){
        boolean actualresult= homeObject.isAboutbtnEnabled();
        Assert.assertEquals(actualresult,true);
    }

    @Test(enabled = true)
    public void verifyisChekingbtnEnabled(){
        boolean actualresult= homeObject.isCheckingHomebtnEnabled();
        Assert.assertEquals(actualresult,true);
    }

    @Test(enabled = true)
    public void verifyisSavingbtnEnabled(){
        boolean actualresult= homeObject.isPersonalTextLinkenable();
        Assert.assertEquals(actualresult,true);
    }

    @Test(enabled = true)
    public void verifyisHomeloanbtnEnabled(){
        boolean actualresult= homeObject.isSavingbtnEnabled();
        Assert.assertEquals(actualresult,true);
    }

    @Test(enabled = true)
    public void verifyisInvestbtnEnabled(){
        boolean actualresult= homeObject.isInvestbtnEnabled();
        Assert.assertEquals(actualresult,true);
    }

    @Test(enabled = true)
    public void verifyIsbetterMoneyHabit(){
        boolean actualresult= homeObject.isBettMoneyHabitsbtnEnabled();
        Assert.assertEquals(actualresult,true);

    }

    @Test(enabled = true)

    public void verifyIsSearchBarEnabld(){
        boolean actualresult= homeObject.isSearchBarEnabled();
        Assert.assertEquals(actualresult,true);

    }
  @Test (enabled = true)
    public void verifySearchBar(){
        homeObject.searchHome();
        String actualtext =homeObject.mobileApplication();
        String expectedtext = "mobile banking";
        Assert.assertTrue(actualtext.contains(expectedtext));

    }
*/

}
