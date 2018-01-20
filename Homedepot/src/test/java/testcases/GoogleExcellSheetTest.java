package testcases;

import Homedepot_pages.GoogleExcelSheetPages;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class GoogleExcellSheetTest extends GoogleExcelSheetPages {
    @Test
    public void verifygoggleExcelraeder() throws IOException, InterruptedException {
        int i = 0;
        String spreadsheetId = "1V4QjFNgr21KHvYPTbfscX0t9LDnE8lUrK07KttwLmUI";
        String range = "Sheet1!A2:C";
        List<String> actualItems = searchItemByName(spreadsheetId, range);
        //System.out.println("actual: " + actualItems.get(i));
        List<List<Object>> expectedItems = getSpreadSheetRecords(spreadsheetId, range);
        //System.out.println("expected: " + expectedItems.get(i));
        for (List row : expectedItems) {
            System.out.println("actual: " + actualItems.get(i));
            System.out.println("expected: " + expectedItems.get(i));

            Assert.assertTrue(actualItems.get(i).contains(row.get(2).toString()));

            System.out.println(expectedItems.get(i) + ": Search - Passed");
            i++;
        }
        System.out.println("Google Excel sheet test Passed");
    }

}
