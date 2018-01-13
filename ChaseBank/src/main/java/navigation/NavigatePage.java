package navigation;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigatePage extends CommonAPI{
    public void NvigatePage(){

        driver.findElement(By.xpath("/html/body/div[2]/div[4]/nav/div/div[3]/div[1]/p")).click();//Explore Product Nav
        driver.findElement(By.xpath("/html/body/div[2]/div[4]/nav/div/div[3]/div[2]/ul/li[5]/a")).click();//Car buying & Loans Nav
        driver.findElement(By.xpath("/html/body/div[2]/div[4]/nav/div/div[3]/div[2]/ul/li[6]/a")).click();//mortgage Nav
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.close();
    }
}
