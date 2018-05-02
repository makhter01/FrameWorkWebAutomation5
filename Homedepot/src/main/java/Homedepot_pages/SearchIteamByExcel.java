package Homedepot_pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import utility.DataReader;

import java.io.IOException;

public class SearchIteamByExcel extends CommonAPI{
    DataReader dtr = new DataReader();

    public String[] getExcelData(String fileName) throws IOException {
        String path = "/Users/mehzabinakhter/IdeaProjects/BootcampFramework/FrameWorkWebAutomation5/Homedepot/data/" + fileName;
        String[] output = dtr.colReader(path, 2);
        return output;
    }

    public String[] getExcelDataAssert(String fileName) throws IOException {
        String path = "/Users/mehzabinakhter/IdeaProjects/BootcampFramework/FrameWorkWebAutomation5/Homedepot/data/" + fileName;
        String[] output = dtr.colReader(path, 3);
        return output;
    }

    public String[] homedepotExcelSearchItem(String fileName) throws IOException, InterruptedException {
        String[] items = getExcelData(fileName);
        String[] actual = new String[items.length];
        for (int i = 0; i < items.length; i++) {
            sleepFor(5);
            typeByCssNEnter("#headerSearch", items[i]);
            sleepFor(5);
            actual[i] = getCurrentPageTitle();
            clearInputField("#headerSearch");
            sleepFor(1);
        }
        return actual;
    }

    public String[] searchExcelData(String fileName) throws IOException {
        String path = "/Users/mehzabinakhter/IdeaProjects/BootcampFramework/FrameWorkWebAutomation5/Homedepot/data/" + fileName;
        String[] output = dtr.colReader(path, 2);
        return output;
    }
}

