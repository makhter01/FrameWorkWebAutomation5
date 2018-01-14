package googlesheet;

import base.CommonAPI;
import com.google.api.services.sheets.v4.Sheets;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.time.temporal.ValueRange;
import java.util.ArrayList;
import java.util.List;

import static googlesheetapi.GoogleExcelReader.getSheetsService;
import static org.openqa.selenium.support.How.ID;
import static org.openqa.selenium.support.How.XPATH;

public class GoogleSheet extends CommonAPI {
    public List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {

        // Build a new authorized API client service.
        Sheets service = getSheetsService();
        com.google.api.services.sheets.v4.model.ValueRange response = service.spreadsheets().values()
                .get(spreadsheetId, range)
                .execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0) {
            return null;
        } else {
            return values;
        }
    }
    //  Search multiple items by name from a google sheets file
    public List<String> searchItemByName(String spreadsheetId, String range) throws IOException, InterruptedException {
        List<List<Object>> values = getSpreadSheetRecords(spreadsheetId, range);
        List<String> actual = new ArrayList<>();
        for (List row : values) {
            sleepFor(1);
            typeByCssNEnter("#gh-ac", row.get(1).toString());
            sleepFor(1);
            actual.add(getCurrentPageTitle());
            clearInputField("#gh-ac");
            sleepFor(1);
        }
        return actual;
    }
}


