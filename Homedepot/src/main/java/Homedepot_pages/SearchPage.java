package Homedepot_pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import java.io.IOException;

public class SearchPage extends CommonAPI {
    @FindBy(css = "#headerSearch")
    public static WebElement searchInputWebElement;

    @FindBy(css = "#headerSearchButton ")
    public static WebElement submitButtonWebElement;

    public static WebElement getSearchInputWebElement() {
        return searchInputWebElement;
    }

    public static WebElement getSubmitButtonWebElement() {
        return submitButtonWebElement;
    }

    public void searchFor(String value) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()) + " " + value);
        getSearchInputWebElement().sendKeys(value);
    }

    public void submitSearchButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getSubmitButtonWebElement().click();
    }

    public void clearInput() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getSearchInputWebElement().clear();
    }

   /* public void searchItemsAndSubmitButton() throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + (new Object() {
        }.getClass().getEnclosingMethod().getName()));
        IteamsToBeSearch searchByIteam = new IteamsToBeSearch();
        String[] value = searchByIteam.getDataFromExcelFile();
        for (int i = 0; i < value.length; i++) {
            searchFor(value[i]);
            submitSearchButton();
            clearInput();
        }
    }*/

}
