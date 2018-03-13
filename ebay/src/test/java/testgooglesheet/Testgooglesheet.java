package testgooglesheet;

import googlesheet.GoogleSheet;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class Testgooglesheet extends GoogleSheet{

   // Search multiple items by name from a google sheets file
        @Test(enabled =true)
        public void verifyGoogleSheet() throws IOException, InterruptedException {
            int i = 0;
            String spreadsheetId = "1mPYFCCIuG4ZW2BLL6uyQW44Ril8yg8Pp69ErRKhd1aw";
            String range = "Sheet1!A2:C";
            List<String> actualItems = searchItemByName(spreadsheetId, range);
            List<List<Object>> expectedItems = getSpreadSheetRecords(spreadsheetId, range);
            for (List row : expectedItems) {
                Assert.assertTrue(actualItems.get(i).contains(row.get(2).toString()));
                System.out.println(expectedItems.get(i) + ": Search - Passed");
                i++;
            }
            System.out.println("Google Sheet test Passed");
        }
}
