package Homedepot_pages;

import base.CommonAPI;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


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

    @FindBy(css = "#authSignIn > a > span")
    public static WebElement signInButton;

    @FindBy(css = "#authRegister > a > span")
    public static WebElement registerButton;


    @FindBy(xpath = "//*[@id=\"container\"]//div[4]/div/ul/li[1]")
    public static WebElement departments;

    @FindBy(xpath = "//*[@id=\'container\']/div[3]/footer/div[2]/nav[2]/ul/li[1]/a")
    public static WebElement specialOffers;


    public String pageTitle() throws InterruptedException {
        String title = driver.getTitle();
        return title;

    }

    public String isLogoVisible() {
        String logo = homedepLogo.getText();
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

    public void collectLink() {
        List<WebElement> linklst = driver.findElements(By.tagName("a"));
        int totalLink = linklst.size();
        for (int i = 0; i < totalLink; i++) {
            String linkText = linklst.get(i).getText();
            System.out.println(linkText);
        }
        System.out.println(totalLink);
    }

    // how can find broken kinks in the page
    public void brokenLinkNImage() throws IOException {
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        allLinks.addAll(driver.findElements(By.tagName("img")));
        System.out.println("Size of total links and image " + allLinks.size());

        List<WebElement> activeLinks = new ArrayList<WebElement>();
        for (int i = 0; i < allLinks.size(); i++) {
            if (allLinks.get(i).getAttribute("href") != null && (!allLinks.contains("javascript"))) {
                activeLinks.add(allLinks.get(i));
            }
        }
        System.out.println("Size of active links " + activeLinks.size());
        for (int j = 0; j < activeLinks.size(); j++) {
            try {
                HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href")).openConnection();
                connection.connect();
                String response = connection.getResponseMessage();
                connection.disconnect();
                System.out.println(activeLinks.get(j).getAttribute("href") + "----->" + response);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

    }

    public static void clickAccount() {
        accountButton.click();
    }

    public void javaScriptExecutorByClick(WebElement element, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

    public void clickAccountJvScript() {
        javaScriptExecutorByClick(accountButton, driver);
    }

    // how to highlight in selenium

    public void highlight(WebElement element, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String bgcolor = element.getCssValue("backgroundColor");
        for (int i = 0; i < 10; i++) {
            changeColor("rgb(0,200,0", element, driver);
            changeColor(bgcolor, element, driver);
        }

    }


    public void changeColor(String color, WebElement element, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.backgroundColor='" + color + "'", element);
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void flushHighlight() {
        highlight(accountButton, driver);
    }

    // how to make border.
    public void drawBorderHelper(WebElement element, WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.border='3px solid red'", element);
    }

    public void drawBorder() {
        drawBorderHelper(departments, driver);
    }

    public void navigateTosignIn(WebDriver driver) throws InterruptedException {
        accountButton.click();
        sleepFor(10);
        String MainWindow = driver.getWindowHandle();
        System.out.println(MainWindow);
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
        signInButton.click();
        String ChildWindow = null;
        while (it.hasNext()) {
            ChildWindow = it.next();


            if (MainWindow.equalsIgnoreCase(ChildWindow)) {

                // Switching to Child window
                driver.switchTo().window(ChildWindow);
                System.out.println(ChildWindow);
                driver.findElement(By.cssSelector("#email_id"))
                        .sendKeys("testuser@gmail.com");

                driver.findElement(By.cssSelector("#password")).sendKeys("abcd1234");
                driver.findElement(By.cssSelector("#accountSignIn > span")).click();
                generateAlert(driver, "this is autogenerated message");

            }
        }

    }

    // how to generate a alert

    public void generateAlert(WebDriver driver, String message) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("alert('" + message + "')");
    }

    public void clickRegister() {
        accountButton.click();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }
        new WebDriverWait(driver, 50).until(ExpectedConditions.elementToBeClickable(registerButton));
        registerButton.click();
    }


    public void scrolldownPage(WebDriver driver) {
            JavascriptExecutor js=(JavascriptExecutor)driver;
            js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }
    public void scrollIntoViewHelper(WebDriver driver,WebElement element){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true)",element);

    }

    public void scrollIntoView(){
        scrollIntoViewHelper(driver,specialOffers);

    }
}