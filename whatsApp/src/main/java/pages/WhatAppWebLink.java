package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WhatAppWebLink extends CommonAPI{
    @FindBy(xpath = "//*[@id=\'app\']//img")
    public static WebElement imageBlock;
    @FindBy(xpath = "*//input[@type=\'checkbox\']")
    public static WebElement checkbox;
    @FindBy(xpath = "//*[@id=\'app\']//span/div")
    public static WebElement uncheckBoxMessage;
    @FindBy(xpath ="//*[@title=\'Android\']")
    public static WebElement androidImage;

    public boolean imageDisplay(){
        boolean image = imageBlock.isDisplayed();
        return image;
    }
    public String checkBoxUnselected(){
        checkbox.isSelected();
        checkbox.click();
        String textmessage = uncheckBoxMessage.getText();
        return textmessage;
    }
    public boolean androidImageDisplay(){
        boolean image = androidImage.isDisplayed();
        return image;
    }

}
