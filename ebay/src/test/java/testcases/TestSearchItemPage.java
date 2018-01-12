package testcases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.Home_Page;
import page.SearchItemPage;

import static base.CommonAPI.driver;

public class TestSearchItemPage extends SearchItemPage {
    SearchItemPage itemsearch;

    @BeforeMethod
    public void initialization() {
        itemsearch = PageFactory.initElements(driver, SearchItemPage.class);
    }

    // ebay_TC_027 Verification point for SignIn Link
    @Test(enabled = true)
    public void testProductSearchbyCapLetter() {
        itemsearch.searchbyCapLetter();
    }

    // ebay_TC_028
    @Test(enabled = true)
    public void testProductSearch() {
        itemsearch.searchItem();
    }
}
