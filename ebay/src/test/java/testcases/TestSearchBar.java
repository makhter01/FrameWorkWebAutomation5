package testcases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.Home_Page;
import page.SearchItemPage;

public class TestSearchBar extends CommonAPI {
    @Test
    public void testProductSearch() throws InterruptedException {
        Home_Page search = PageFactory.initElements(driver, Home_Page.class);
        //Search button is displayed
        System.out.println("Search button is present or not : "+ search.isSearchButtonDislayed());
        // Check drop down of AllCategory box
       search.AllCateDropDown();
        //check MotorLink on Motors page
       search.ClickMotorLink();
        //check fashion button and luxury hand bags
        search. ClickFashionbutton();
        //check ckick on crosstrain image
        search.ClickCrossTrainImage();
        //check radio button selected or not
        search.isRadioButtonSelected();
        System.out.println("Radio button is selected or not : "+ search.isRadioButtonSelected());
        // search item after filling into search box
        search.searchItem();
    }
}
