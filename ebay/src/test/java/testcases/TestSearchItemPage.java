package testcases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.Home_Page;
import page.SearchItemPage;

import static base.CommonAPI.driver;

public class TestSearchItemPage extends CommonAPI {
    @Test
    public void testProductSearch() {
        SearchItemPage itemsearch = PageFactory.initElements(driver, SearchItemPage.class);
        itemsearch.searchItem();
    }
}
