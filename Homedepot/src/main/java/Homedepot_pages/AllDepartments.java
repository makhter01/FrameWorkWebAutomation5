package Homedepot_pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class AllDepartments extends CommonAPI {

    public List<String> getDepartments(){
        List<String> items = new ArrayList<String>();
        items = getTextFromWebElements("#container div.grid.flush.hide.show--sm > div > ul >li:nth-child(1) > a");
        return items;
    }
    public void MousehoverActions(WebDriver driver) throws InterruptedException{
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("All Departments"))).build().perform();
        sleepFor(2);
        driver.findElement(By.linkText("Building Materials")).click();
    }
}
