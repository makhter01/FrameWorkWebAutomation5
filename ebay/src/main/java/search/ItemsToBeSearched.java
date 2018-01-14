package search;

import utility.DataReader;

import java.io.IOException;

public class ItemsToBeSearched {
    DataReader dr = new DataReader();
    public String[] getDataFromExcelFile() throws IOException {
        String path = System.getProperty("user.dir")+"data/file1.xls";
        String [] data = dr.fileReader(path);
        return data;
    }

    public String[] getDataFromExcelFileForFeaturesChoice() throws IOException{
        String path = System.getProperty("user.dir")+"data/file1.xls";
        String [] data = dr.fileReader(path);
        return data;
    }
}
