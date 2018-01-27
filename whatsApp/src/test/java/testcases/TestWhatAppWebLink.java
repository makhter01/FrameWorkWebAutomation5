package testcases;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.MainPage;

import pages.WhatAppWebLink;

public class TestWhatAppWebLink extends WhatAppWebLink{
    MainPage mainPageObj;
    WhatAppWebLink weblinkObj;

    @BeforeMethod
    public void initialization() {
        mainPageObj = PageFactory.initElements(driver, MainPage.class);
        weblinkObj = PageFactory.initElements(driver, WhatAppWebLink.class);
    }
    // WhatsApp_TC_001  Verify AppWebLink Scan Image
    @Test(enabled = false)
    public void verifydisplayImage() {
        mainPageObj.clickWhatsAppWebLink();
        boolean webimage1 = weblinkObj.imageDisplay();
        Assert.assertTrue(webimage1);
        System.out.println("Image scan verification passed");
    }
    // WhatsApp_TC_002  Verify Uncheck the checkbox and text message
    @Test(enabled = false)
    public void verifyUncheckBox() {
        mainPageObj.clickWhatsAppWebLink();
        String actualText = weblinkObj.checkBoxUnselected();
        String expectedText = "You'll be logged out after several";
        Assert.assertTrue(actualText.contains(expectedText));
        System.out.println("Check box selected passed");
    }
    @Test(enabled = true)
    public void verifyAndroidImageDisplay(){
        mainPageObj.clickWhatsAppWebLink();
        boolean image1= weblinkObj.androidImageDisplay();
        Assert.assertTrue(image1);
        System.out.println("android Image passed");
    }
}

