package Homedepot_pages;

import base.CommonAPI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Home extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"container\"]/div[1]/div[2]/div/div[2]/div[1]/div/div[1]/a")
    public static WebElement homedepLogo;

    @FindBy(css = "a[class='TaskLinks__link']")
    public static WebElement findMystore;

    @FindBy(css = "#headerSearch")
    public static WebElement searchInputBox;

    @FindBy(xpath = "//*[@id='headerSearchButton']")
    public static WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"headerCart\"]/div[1]/span[1]")
    public static WebElement cart;

    @FindBy(xpath = "//*[@id=\"container\"]//div/ul/li[2]/a")
    public static WebElement trackNToolRental;

    @FindBy(css = " a[class='TaskLinks__link']")
    public static WebElement giftCards;

    @FindBy(xpath = "//*[@id=\"container\"]//div[1]/div/ul/li[8]/a")
    public static WebElement helpLink;

    @FindBy(xpath = "//*[@id=\"container\"]//div/ul/li[3]/a")
    public static WebElement forThePro;

    @FindBy(css = "#container > div ul > li:nth-child(4) > a")
    public static WebElement creditServices;

    @FindBy(xpath = "//*[@id=\"container\"]//div/ul/li[6]/a")
    public static WebElement myList;

    @FindBy(css = "#headerOrderStatus")
    public static WebElement trackOrder;

    @FindBy(css = "#myStore span.MyStore__label > div")
    public static WebElement chooseStore;

    @FindBy(css = "#headerMyAccountTitle > div")
    public static WebElement accountButton;

    @FindBy(css="#authSignIn span")
    public static WebElement signInButton;

    @FindBy(css = "#authRegister > a > span")
    public static WebElement registerButton;


    @FindBy(xpath = "//*[@id=\"container\"]//div[4]/div/ul/li[1]")
    public static WebElement departments;


    public String pageTitle() throws InterruptedException {
        String title = driver.getTitle();
        return title;

    }

    public String isLogoVisible(){
        String logo=homedepLogo.getText();
        return logo;
    }

    public boolean verifyHelpLinkStatus() {
        boolean helpBoolean = helpLink.isEnabled();
        return helpBoolean;

    }

    public boolean verifyStoreFinder() {
        boolean findstore = helpLink.isEnabled();
        return findstore;

    }

    public boolean verifyForThePro() {
        boolean findstore = forThePro.isEnabled();
        return findstore;
    }

    public boolean verifyGiftCards() {
        boolean giftcard = giftCards.isEnabled();
        return giftcard;
    }

    public boolean verifyCreditCard() {
        boolean creditCard = creditServices.isEnabled();
        return creditCard;
    }

    public boolean verifyMylist() {
        boolean mylist = creditServices.isEnabled();
        return mylist;
    }

    public boolean verifyTrackOrder() {
        boolean track = trackOrder.isEnabled();
        return track;
    }

    public boolean verifyChooseStore() {
        boolean inventStore = chooseStore.isEnabled();
        return inventStore;
    }

    public boolean verifyAccount() {
        boolean accnt = accountButton.isEnabled();
        return accnt;
    }

    public boolean verifyCart() {
        boolean cartobj = cart.isEnabled();
        return cartobj;
    }


    public boolean verifyDepartments() {
        boolean departmnt = departments.isDisplayed();
        return departmnt;
    }

    public void searchBox() {
        searchInputBox.sendKeys("lights");
        searchButton.click();
    }

    public String currentURL() throws InterruptedException {
        String url = getCurrentPageUrl();
        return url;
    }

    public static void clickAccount() {
        accountButton.click();
    }

    public  void navigateTosignIn() {
        accountButton.click();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(signInButton));
        signInButton.click();

    }

    public  void clickRegister() {
        accountButton.click();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            }
            new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(registerButton));
        registerButton.click();
    }
}