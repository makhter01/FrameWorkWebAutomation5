package Homedepot_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Lighting  {
    @FindBy (xpath = "//*[@id=\"container\"]/div[2]/div[1]/div/h1")
    public static WebElement lightingHeader;



    public String getlightingHeader(){
       String text= lightingHeader.getText();
       return text;
       }
}
