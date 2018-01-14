package page;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SamsungTablet extends CommonAPI {

    @FindBy( xpath = "//*[@id=\"Center\"]/div[1]/div/div[1]/div")
    public static WebElement CenterButton;
    @FindBy( linkText = "samsung tablet")
    public static WebElement samsungtablet;

    //ebay_TC_01  get title of sumsung tablet page
    public String getSamsungTabletHeader(){
        String text = CenterButton.getText();
        return text;
    }
    //ebay_TC_02 check the samsungLink tablet on tablet page
    public static boolean samsungtabletisDisplayed(){
        boolean samsungTab = samsungtablet.isDisplayed();
        return samsungTab;
        }
    }

