package navigation;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class CarouselPage extends CommonAPI{
    public void slideToFindElement() {
        WebElement slider = driver.findElement(By.xpath("//*[@id=\"custom-pager__container-b\"]/div[2]/div/div"));
        Actions move = new Actions(driver);
        Action action = (Action) move.dragAndDropBy(slider, 30, 0).build();
        System.out.println();
    }
}

