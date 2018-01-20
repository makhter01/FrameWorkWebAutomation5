package page;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Home_Page extends CommonAPI {

    @FindBy(id = "gh-btn")
    public static WebElement SearchButton;
    @FindBy(id = "gh-logo")
    public static WebElement logoimage;
    @FindBy(linkText = "Electronics")
    public static WebElement electronicsTab;
    @FindBy(linkText = "Fashion")
    public static WebElement FashionButton;
    @FindBy(xpath = "//*[@id='s0-container']/li[3]/a")
    public static WebElement MotorsButton;
    @FindBy(xpath = "//*[@id='s0-container']/li[2]/a")
    public static WebElement saved;
    @FindBy(xpath = "//*[@id=\"s0-container\"]/li[6]/a")
    public static WebElement CollectiblesArt;
    @FindBy(xpath = "//*[@id=\"s0-container\"]/li[7]/a")
    public static WebElement HomeGarden;
    @FindBy(xpath = "//*[@id=\"s0-container\"]/li[8]/a")
    public static WebElement sports;
    @FindBy(xpath = "//*[@id=\"s0-container\"]/li[9]/a")
    public static WebElement toys;
    @FindBy(xpath = "//*[@id=\"s0-container\"]/li[10]/a")
    public static WebElement business;
    @FindBy(xpath = "//*[@id=\"s0-container\"]/li[11]/a")
    public static WebElement music;
    @FindBy(xpath = "//*[@id=\"s0-container\"]/li[12]/a")
    public static WebElement deals;
    @FindBy(xpath = "//*[@id=\"s5\"]/div[2]/ul/li[1]/button")
    public static WebElement AllCategoryDropDown;
    @FindBy(xpath = "//*[@id=\'s6-body\']//li[2]/a/div[1]/div/div")
    public static WebElement crossTrainImage;
    @FindBy(id = "gh-ac")
    public static WebElement searchBar;
    @FindBy(xpath = "//*[@id=\"gf-BIG\"]//td[1]/ul/li[1]/h3/a")
    public static WebElement buyLink;
    @FindBy(linkText = "register")
    public static WebElement regLink;

    public String isCurrentUrlCorrect() {
        String actualUrl = getCurrentPageUrl();
        return actualUrl;
    }

    public String pageTitle() throws InterruptedException {
        sleepFor(2);
        String title = driver.getTitle();
        return title;
    }

    public static boolean isebayLogoDislayed() {
        boolean logo = logoimage.isDisplayed();
        return logo;
    }

    public static boolean isSearchButtonDislayed() {
        boolean searchbutton = SearchButton.isDisplayed();
        return searchbutton;
    }

    public static boolean isRegLinkDispayed() {
        boolean regLink1 = regLink.isDisplayed();
        return regLink1;
    }

    public static boolean isElectronicsLinkDisplayed() {
        boolean electronics = electronicsTab.isDisplayed();
        return electronics;
    }

    public static boolean isFashionLinkDisplayed() {
        boolean fashion = FashionButton.isDisplayed();
        return fashion;
    }

    public static boolean isMotorLinkDisplayed() {
        boolean motors = MotorsButton.isDisplayed();
        return motors;
    }

    public static boolean isCollectiblesArtLinkEnabled() {
        boolean collcibles = CollectiblesArt.isEnabled();
        return collcibles;
    }

    public static boolean isHomeGardenEnabled() {
        boolean homegarden = HomeGarden.isEnabled();
        return homegarden;
    }

    public static boolean isSportingGoodEnabled() {
        boolean sporting = sports.isEnabled();
        return sporting;
    }

    public static boolean isToysEnabled() {
        boolean toy = toys.isEnabled();
        return toy;
    }

    public static boolean isSavedEnabled() {
        boolean save = saved.isEnabled();
        return save;
    }

    public static boolean isBusineesIndustryEnabled() {
        boolean busInd = business.isEnabled();
        return busInd;
    }

    public static boolean isMusicEnabled() {
        boolean mussic = music.isEnabled();
        return mussic;
    }

    public static boolean isDealsEnabled() {
        boolean dealls = deals.isEnabled();
        return dealls;
    }

       // Footer Link
    public static boolean isBuyLinkDisplayed() {
        boolean buylink = buyLink.isDisplayed();
        return buylink;
    }

    public void AllCateDropDown() {
        Select dropDown = new Select(AllCategoryDropDown);
        dropDown.selectByIndex(3);
        List<WebElement> elements = dropDown.getOptions();
        System.out.println(elements.size());
    }

    public String ClickMotorLink() throws InterruptedException {
        MotorsButton.click();
        sleepFor(2);
        String title = driver.getTitle();
        return title;
   }
    public void ClickFashionbutton(){
        Actions fashion = new Actions(driver);
        fashion.moveToElement(FashionButton).build().perform();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("The title of Luxury hand Bags is :" + driver.getTitle());
    }
    public void ClickCrossTrainImage() throws InterruptedException {
        crossTrainImage.click();
        sleepFor(2);
        System.out.println("The title of crossTrain image is :" + driver.getTitle());
        driver.navigate().back();
    }

    public void searchItem() {
        searchBar.sendKeys("tablet samsung", Keys.ENTER);
    }
}
