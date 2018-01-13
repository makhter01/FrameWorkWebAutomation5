package chaseBankpage;

import base.CommonAPI;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.ArrayList;


public class DropDownMenu extends CommonAPI {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.chase.com/");
        Select oSelect = new Select(driver.findElement(By.name("EXPLORE PRODUCTS")));
        oSelect.selectByIndex(0);
        Thread.sleep(2000);
        oSelect.deselectByIndex(0);
        oSelect.selectByVisibleText("Mortgage");
        Thread.sleep(2000);
        oSelect.deselectByVisibleText("Mortgage");

        List<WebElement> oSize = oSelect.getOptions();
        int iListSize = oSize.size();
        for(int i =0; i < iListSize ; i++){
            String sValue = oSelect.getOptions().get(i).getText();
            System.out.println(sValue);
            oSelect.selectByIndex(i);
            Thread.sleep(2000);
        }
        oSelect.deselectAll();
        driver.close();
    }

}
