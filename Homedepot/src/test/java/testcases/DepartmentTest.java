package testcases;

import Homedepot_pages.AllDepartments;
import Homedepot_pages.Home;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DepartmentTest extends AllDepartments {
      AllDepartments objDepart;
        Home objHome;
        @BeforeMethod
      public void initials(){
          objDepart= PageFactory.initElements(driver,AllDepartments.class);
          }

          @Test(enabled = true)
          public void departmentTest()throws InterruptedException{
            objDepart.MousehoverActions(driver);
       }


}
