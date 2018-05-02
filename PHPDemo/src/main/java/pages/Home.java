package pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home extends CommonAPI{
    @FindBy(css="select#ctl00_mainContent_ddl_Adult")
    public static WebElement adultDropdown;

    @FindBy(xpath="//a[@value='CCU']")
    public static WebElement departmentFromCity;

    @FindBy(xpath="(//a[@value='GOI'])[2]")
    public static WebElement departmentDesCity;

    @FindBy(css="input#ctl00_mainContent_ddl_originStation1_CTXT")
    public static WebElement dropdownCity;

    public void dropdownSelect()throws InterruptedException{
        Select select=new Select(adultDropdown);
        select.selectByValue("5");

        }

      public void departmentcityDropdown(WebDriver driver)throws InterruptedException{
          Dimension d=new Dimension(460,610);
          driver.manage().window().setSize(d);

        dropdownCity.click();
        sleepFor(3);
        departmentFromCity.click();
        departmentDesCity.click();
        sleepFor(2);

      }


    WebDriverWait d;

    {
        d = new WebDriverWait(driver, 20);
        d.until(ExpectedConditions.visibilityOfElementLocated((By) driver.findElement(By.xpath("//a[@value='CCU']"))));
    }


}
