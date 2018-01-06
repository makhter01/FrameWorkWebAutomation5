package page;
import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Home_Page extends CommonAPI {

    @FindBy(id = "gh-ac")
    public static WebElement searchBar;
    @FindBy( xpath= "//*[@id=\'gh-cat\']")
    public static WebElement AllCategoryDropDown;
    @FindBy( id= "gh-btn")
    public static WebElement SearchButton;
    @FindBy( xpath="//*[@id='s0-container']/li[3]/a")
    public static WebElement MotorsButton;
    @FindBy( linkText="Fashion")
    public static WebElement FashionButton;
    @FindBy(xpath= "//*[@id=\'tabJs_1\']")
    public static WebElement Motorcycles;
    @FindBy( xpath="//*[@id=\'s6-body\']//li[2]/a/div[1]/div/div")
    public static WebElement crossTrainImage;
    @FindBy( xpath="//*[@id=\"s5\"]/div[2]/ul/li[1]/button")
    public static WebElement radioButton;
    @FindBy( linkText="Luxury Handbags")
    public static WebElement luxuryhandbags;

    //search button is displayed
    public static boolean isSearchButtonDislayed(){
        boolean displayed = SearchButton.isDisplayed();
        return displayed;
    }
    //all category drop down count and select item with index3
    public void AllCateDropDown(){
        Select dropDown = new Select(AllCategoryDropDown);
        dropDown.selectByIndex(3);
        List<WebElement> elements = dropDown.getOptions();
        System.out.println(elements.size());
        }
    // click on the Motors link and return to Homepgae
    public static void ClickMotorLink() throws InterruptedException {
        MotorsButton.click();
       // Thread.sleep(10000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // Motorcycles.isEnabled();
        Motorcycles.click();
       // Thread.sleep(10000);
        System.out.println("The title of Motorcycles is :" + driver.getTitle());
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    // verify fashion tab and navigate back to homepage
    public static void ClickFashionbutton(){
        /*FashionButton.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        luxurthandbags.click();
        System.out.println("The title of Luxury hand Bags is :" + driver.getTitle());
        driver.navigate().back();*/
        Actions fashion = new Actions(driver);
        fashion.moveToElement(FashionButton).build().perform();
        luxuryhandbags.click();
        System.out.println("The title of Luxury hand Bags is :" + driver.getTitle());
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    // crosstrain image click and navigate back to homepage
    public static void ClickCrossTrainImage(){
        crossTrainImage.click();
        System.out.println("The title of crossTrain image is :" + driver.getTitle());
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }
    public static boolean isRadioButtonSelected(){
        boolean selected = radioButton.isSelected();
        return selected;
    }
    //search item in searchbar
    public void searchItem() {
        searchBar.sendKeys("tablet samsung", Keys.ENTER);
        System.out.println("Get Product Search Page Title: " + driver.getTitle());
    }
}
