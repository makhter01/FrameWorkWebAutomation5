package Homedepot_pages;

import base.CommonAPI;
import utility.DataReader;

import java.io.IOException;

<<<<<<< HEAD
public class SearchIteamByExcel extends CommonAPI{
=======
public class SearchIteamByExcel extends CommonAPI {
>>>>>>> mehzabin_team5
    DataReader dtr = new DataReader();

    public String[] getExcelData(String fileName) throws IOException {
        String path = "../Homedepot/data/" + fileName;
        String[] output = dtr.colReader(path, 2);
        return output;
    }

    public String[] getExcelDataAssert(String fileName) throws IOException {
        String path = "../Homedepot/data/" + fileName;
        String[] output = dtr.colReader(path, 3);
        return output;
    }

    public String[] homedepotExcelSearchItem(String fileName) throws IOException, InterruptedException {
        String[] items = getExcelData(fileName);
        String[] actual = new String[items.length];
        for (int i = 0; i < items.length; i++) {
            sleepFor(1);
            typeByCssNEnter("#headerSearch", items[i]);
            sleepFor(1);
            actual[i] = getCurrentPageTitle();
            clearInputField("#headerSearch");
            sleepFor(1);
        }
        return actual;
    }
<<<<<<< HEAD
=======

>>>>>>> mehzabin_team5
}

