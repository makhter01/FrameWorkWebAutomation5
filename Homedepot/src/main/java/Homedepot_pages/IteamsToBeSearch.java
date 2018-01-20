package Homedepot_pages;

import utility.DataReader;

import java.io.IOException;

public class IteamsToBeSearch extends DataReader {

    DataReader dr = new DataReader();

    public String[] getDataFromExcelFile() throws IOException {
        String path = System.getProperty("user.dir") + "data/HomeDepotDataExcellSheet.xls";
        String[] data = dr.fileReader(path);
        return data;
    }

    public String[] getDataFromExcelFileForFeaturesChoice() throws IOException {
        String path = System.getProperty("user.dir") + "data/HomeDepotDataExcellSheet.xls";
        String[] data = dr.fileReader(path);
        return data;
    }

}
