package tests;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class alert{

    public static WebDriver driver=null;
    @BeforeMethod
    public void setUP(){
        System.getProperty("driver.chromedriver","/Users/mehzabinakhter/IdeaProjects/BootcampFramework/FrameWorkWebAutomation5/Generic/driver/chromedriver");
         driver=new ChromeDriver();
        driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");
        }

        @Test
    public void test() throws Exception{
        driver.findElement(By.cssSelector("span#button1>p")).click();
            String text = driver.switchTo().alert().getText();
            Thread.sleep(100);
            System.out.println(text);
        driver.switchTo().alert().accept();

    }

    @Test

    public void test2()throws Exception{
        driver.findElement(By.cssSelector("span#button2>p")).click();
        String parentwindow=driver.getWindowHandle();
        Thread.sleep(200);
         for(String handle:driver.getWindowHandles()){
             driver.switchTo().window(handle);

         }
        // driver.switchTo().window(t)
    }

    @AfterMethod
    public void clean(){
        driver.close();
    }

}
