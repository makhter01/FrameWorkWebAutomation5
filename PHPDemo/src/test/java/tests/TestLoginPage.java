package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Home;

public class TestLoginPage extends Home {
    Home objHome;


    @BeforeMethod
    public void intElements(){
        objHome= PageFactory.initElements(driver,Home.class);


    }

    @Test

   public void test()throws InterruptedException{
        dropdownSelect();
    }

    @Test
    public void test2() throws InterruptedException{
        departmentcityDropdown(driver);
    }

}
