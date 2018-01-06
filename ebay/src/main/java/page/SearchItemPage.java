package page;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static page.Home_Page.AllCategoryDropDown;

public class SearchItemPage extends CommonAPI {
    @FindBy(id = "gh-ac")
    public static WebElement searchBar;
    @FindBy(xpath="//*[@id='Center']//a/div[1]/div")
    public static WebElement samsungTablet;
    @FindBy(xpath="//*[@id=\'w6-w4-w0-atcBtn\']")
    public static WebElement addToCart;
    @FindBy(linkText="No Thanks")
    public static WebElement Nothanksbutton;
    @FindBy(id="gh-cart-n")
    public static WebElement clicktoShoppingCart;
    @FindBy(id="ptcBtnBottom")
    public static WebElement clickProceedtoCheckout;

    public void searchItem() {
        searchBar.sendKeys("tablet samsung", Keys.ENTER);
        System.out.println("Get Product Search Page Title: " + driver.getTitle());
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        samsungTablet.click();
        addToCart.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Get addTocart Page Title: " + driver.getTitle());
        clicktoShoppingCart.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Get ebay shopping cart Page Title: " + driver.getTitle());
        clickProceedtoCheckout.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("Get proceed to checkout Page Title: " + driver.getTitle());
    }
}
