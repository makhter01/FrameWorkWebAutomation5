package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class MainPage extends CommonAPI {
    @FindBy(className = "page-header__logo")
    public static WebElement whatsappLogo;
    @FindBy(xpath = "//*[@id=\'top\']//nav/ul/li[1]/a")
    public static WebElement whatsappweblink;
    @FindBy(xpath = "//*[@id=\'top\']//nav/ul/li[3]/a")
    public static WebElement downloadlink;
    @FindBy(xpath= "*//span[@class='lng-id']")
    public static WebElement dropdown;
    @FindBy(xpath="//*[@id='top']/div[2]/div/div[2]/div")
    public static WebElement phoneImage;

    public String currentURL() {
        String url = getCurrentPageUrl();
        return url;
    }

    public String currentTitle() {
        String title = getCurrentPageTitle();
        return title;
    }

    public boolean whatsAppLogoDispayed() {
        boolean actualresult = whatsappLogo.isDisplayed();
        return actualresult;
    }
    public String clickWhatsAppWebLink(){
        whatsappweblink.click();
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String url = driver.getCurrentUrl();
         return url;
    }

    public boolean whatsAppWebLinkDisplayed() {
        boolean webLink = whatsappweblink.isDisplayed();
        return webLink;
    }

    public boolean phoneImageDispalyed(){
        boolean phoneimage = phoneImage.isEnabled();
        return phoneimage;
    }

    public String downloadLinkClickableOnMainPage() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        downloadlink.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String weblinkUrl = getCurrentPageUrl();
        driver.navigate().to("http://www.whatsapp.com");
        return weblinkUrl;
    }
    public void dropDownENmainPage() {
        Select dropDown = new Select(dropdown);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        dropdown.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        dropDown.selectByVisibleText("Polski");
        List<WebElement> elementCount = dropDown.getOptions();
        System.out.println(elementCount.size());
    }



}
