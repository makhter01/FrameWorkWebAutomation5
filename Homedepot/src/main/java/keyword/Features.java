package keyword;

import Homedepot_pages.Home;
import Homedepot_pages.IteamsToBeSearch;
import Homedepot_pages.SearchPage;
import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Features extends CommonAPI{
    public void signIn(){
        typeByCss("", "userName");
        typeByCss("", "password");
        clickByCss("");
    }
    public void registration(){
        typeByCss("", "email");
        typeByCss("", "password");
        clickByCss("");
    }

    public void search() throws IOException {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.searchItemsAndSubmitButton();
    }

    public void select(String featureName)throws IOException{
        switch(featureName){
            case "signIn":
                signIn();
                break;
            case "registration":
                registration();
                break;
            case "search":
                search();
                break;
            default:
                throw new InvalidArgumentException("Invalid features choice");
        }
    }

    public void selectFeatures()throws IOException{
        IteamsToBeSearch itemsToBeSearched = new IteamsToBeSearch();
        String [] testSteps = itemsToBeSearched.getDataFromExcelFileForFeaturesChoice();
        for(int i=0; i<testSteps.length; i++) {
            select(testSteps[i]);
        }
    }
}
