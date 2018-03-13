package testcases;

import pages.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.MainPage;

public class TestMainPage extends MainPage{
    MainPage mainpageObj;

    @BeforeMethod
    public void initialization() {
        mainpageObj = PageFactory.initElements(driver, MainPage.class);
    }

    // whatsApp_TC_001  Verify URL
    @Test(priority = 1, enabled = true)
    public void verifyCurrentURL() {
        String expectedURL = "whatsapp.com";
        Assert.assertTrue(currentURL().contains(expectedURL));
        System.out.println("The actual url matches with expected url");
    }

    // whatsApp_TC_002   Verify title of page
    @Test(priority = 2, enabled = true)
    public void verifyCurrentTitle() {
        String actualtitle = mainpageObj.currentTitle();
        String expectedtitle = "WhatsApp";
        Assert.assertTrue(actualtitle.contains(expectedtitle));
        System.out.println(actualtitle);
    }

    // whatsApp_TC_003  Verify whatsApp logo on main page
    @Test(priority = 3, enabled = true)
    public void verifyWhatsAppLogoDisplayed() {
        boolean whatspplogoimage = mainpageObj.whatsAppLogoDispayed();
        Assert.assertTrue(whatspplogoimage);
        System.out.println("The whatsApp logo displayed passed");
    }

    // WhatsApp_TC_004  Verify WhatsAPP WebLink on  main page
    @Test(priority = 4, enabled = true)
    public void verifyWhatsAppWebLink() {
        boolean weblink = mainpageObj.whatsAppWebLinkDisplayed();
        Assert.assertTrue(weblink);
        System.out.println("The WhatsApp web link display passed");
    }

    // WhatApp_TC_005  Verify download link is clickable on main page
    @Test(priority = 5, enabled = true)
    public void verifydownloadLinkClickableOnMainPage() {
        String expectedUrl = "whatsapp.com/download/";
        Assert.assertTrue(downloadLinkClickableOnMainPage().contains(expectedUrl));
        System.out.print("The whatapp download link verification passed");
    }

    // WhatsApp_TC_006  Get drop down List size
/*@Test(priority =6,enabled =true)
public void verifyDropdownListSize(){
    mainpageObj.dropDownENmainPage();
    System.out.println("Size of drop down list passed");
}*/
// WhatsApp_TC_007  Verify phone image on main Page
    @Test(priority = 7, enabled = true)
    public void verifyphoneImageDispalyed() {
        boolean heroimage = mainpageObj.phoneImageDispalyed();
        Assert.assertTrue(heroimage);
        System.out.println("The phone image verification passed");
    }

// WhatsApp_TC_008 Verify WebLink click and its current url
@Test(priority = 8, enabled = true)
public void verifyClickWhatAppWebLink() {
    String actualvalue = mainpageObj.clickWhatsAppWebLink();
    String expectedvalue = "https://web.whatsapp.com/";
    Assert.assertEquals(actualvalue, expectedvalue);
    //Assert.assertTrue(actualvalue.contains(expectedvalue));
    System.out.print("The Web Link url verification passed");
}

}
