package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.Home_Page;
import page.InputExcelSheet;
import page.SamsungTablet;
import reporting.TestLogger;

import java.io.IOException;

public class TestInputExcelSheet extends InputExcelSheet {
    InputExcelSheet inputsheet;

    @BeforeMethod
    public void initialization() {
        inputsheet = PageFactory.initElements(driver, InputExcelSheet.class);
    }

    // Search multiple items by Name from a xls file
    @Test(enabled = true)
    public void verifyDataReaderExcel() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String[] expectedItems = inputsheet.getExcelDataAssert("ebaySearchItem.xls");
        String[] actualItems = inputsheet.ebaySearchItem1("ebaySearchItem.xls");
        for (int i = 0; i < actualItems.length; i++) {
            Assert.assertTrue(actualItems[i].contains(expectedItems[i]));
            System.out.println(expectedItems[i] + ": Search - Passed");
        }
        System.out.println("Data Reader search is Passed");
    }
}
