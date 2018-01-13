package testcases;

import Homedepot_pages.SearchIteamByExcel;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class SearchIteamByExcelTest extends SearchIteamByExcel{
    SearchIteamByExcel inputData;

    @BeforeMethod
    public void initialization() {
        inputData= PageFactory.initElements(driver,SearchIteamByExcel.class);
    }

    // Search multiple items by Name from a xls file
    @Test
    public void verifyDataReaderExcel() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String[] expectedItems = inputData.getExcelDataAssert("HomeDepotDataExcellSheet.xls");
        String[] actualItems = inputData.homedepotExcelSearchItem("HomeDepotDataExcellSheet.xls");
        for (int i = 0; i < actualItems.length; i++) {
            Assert.assertTrue(actualItems[i].contains(expectedItems[i]));
            System.out.println(expectedItems[i] + ": Search - Passed");
        }
        System.out.println("Data Reader search is Passed");
    }
}
