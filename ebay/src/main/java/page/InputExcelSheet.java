package page;

import base.CommonAPI;
import utility.DataReader;
import java.io.IOException;

public class InputExcelSheet extends CommonAPI {

    DataReader dtr = new DataReader();

    public String[] getExcelData(String fileName) throws IOException {
        String path = "../ebay/data/" + fileName;
        String[] output = dtr.colReader(path, 2);
        return output;
    }

    public String[] getExcelDataAssert(String fileName) throws IOException {
        String path = "../ebay/data/" + fileName;
        String[] output = dtr.colReader(path, 3);
        return output;
    }

    public String[] ebaySearchItem1(String fileName) throws IOException, InterruptedException {
        String[] items = getExcelData(fileName);
        String[] actual = new String[items.length];
        for (int i = 0; i < items.length; i++) {
            sleepFor(1);
            typeByCssNEnter("#gh-ac", items[i]);
            sleepFor(1);
            actual[i] = getCurrentPageTitle();
            clearInputField("#gh-ac");
            sleepFor(1);
        }
        return actual;
    }
}


