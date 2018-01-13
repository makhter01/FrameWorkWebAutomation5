package testseachItem;

import Homedepot_pages.Home;
import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class SearchBarTest extends Home {
    @Test
    public void testHome() throws InterruptedException{
        searchBox();
        sleepFor(30);
    }
}
