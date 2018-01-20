package testcases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.Home_Page;
import page.SearchItemPage;

public class TestSearchItemPage extends SearchItemPage {
    SearchItemPage itemsearch;

    @BeforeMethod
    public void initialization() {
        itemsearch = PageFactory.initElements(driver, SearchItemPage.class);
    }

    // ebay_TC_01 Verification point for SignIn Link
    @Test(priority = 1,enabled = true)
    public void testProductSearchbyCapLetter() {
        itemsearch.searchbyCapLetter();
    }

    // ebay_TC_02 Verify search item
    @Test(priority = 2,enabled = true)
    public void testProductSearch() {
        itemsearch.searchItem();
    }
}
