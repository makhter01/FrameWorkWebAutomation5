package keyword;

import base.CommonAPI;
import com.google.api.client.util.Data;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;
import page.InputExcelSheet;
import page.Registration;
import page.SearchItemPage;
import page.SignIn_HomePage;
import search.ItemsToBeSearched;
import search.SearchPage;

import java.io.IOException;

public class Features extends CommonAPI {
    SignIn_HomePage signinObj;
    Registration registrationObj;
    SearchItemPage searchItemObj;
    InputExcelSheet inputExcelSheetObj;


    public void signIn(){
        signinObj = PageFactory.initElements(driver,   SignIn_HomePage.class);
        signinObj.EnterInvalidUserName();
        System.out.println("Test for signIn is passed");
    }

    public void registration() throws InterruptedException {
        driver.navigate().to("https://www.ebay.com/");
        registrationObj = PageFactory.initElements(driver,   Registration.class);
        registrationObj.clickRegistrationLink();
        System.out.println("Test for Registration is passed");
    }

    public void searchitem() throws IOException{
        driver.navigate().to("https://www.ebay.com/");
        searchItemObj = PageFactory.initElements(driver,  SearchItemPage.class);
        searchItemObj.searchItem();
        System.out.println("Test for Search Item is passed");
    }
    public String[] inputExcelDataItems(String fileName) throws IOException, InterruptedException {
        inputExcelSheetObj = PageFactory.initElements(driver,  InputExcelSheet.class);
        String[] output =inputExcelSheetObj.ebaySearchItem1(fileName);
        System.out.println("Test for Excel sheet is passed");
        return output;
    }
    public void select(String featureName) throws IOException, InterruptedException {
        switch(featureName){
            case "signIn":
                signIn();
                break;
            case "registration":
                registration();
                break;
            case "searchitem":
                searchitem();
                break;
            case "inputExcelDataItems":
                inputExcelDataItems("ebaySearchItem.xls");
                break;
            default:
                throw new InvalidArgumentException("Invalid features choice");
        }
    }

    public void selectFeatures() throws IOException, InterruptedException {
        inputExcelSheetObj = PageFactory.initElements(driver,  InputExcelSheet.class);
        String [] testSteps = inputExcelSheetObj.searchExcelData("Features.xls");
        for(int i=0; i<testSteps.length; i++) {
            select(testSteps[i]);
            sleepFor(1);
        }
    }
}
