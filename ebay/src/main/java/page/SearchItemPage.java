package page;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static page.Home_Page.AllCategoryDropDown;

public class SearchItemPage extends CommonAPI {
    @FindBy( id = "gh-ac")
    public static WebElement searchBar;
    @FindBy( xpath="//*[@id=\"Center\"]/div[1]/div/div[2]/div[1]/a/div[2]/div")
    public static WebElement samsungTablet;
    @FindBy( xpath="//a[text()= 'Add to cart']")
    public static WebElement addToCart;
    @FindBy( id="gh-cart-n")
    public static WebElement clicktoShoppingCart;
    @FindBy( id="ptcBtnBottom")
    public static WebElement clickProceedtoCheckout;

    public void searchbyCapLetter(){
        Actions searchcap = new Actions(driver);
        searchcap.moveToElement(searchBar).click().keyDown(Keys.SHIFT).sendKeys("samsung").build().perform();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    public void searchItem() {
        //String parentWindow = driver.getWindowHandle();
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
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.navigate().back();
    }
}
