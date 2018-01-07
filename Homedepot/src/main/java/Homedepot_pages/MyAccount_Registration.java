package Homedepot_pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyAccount_Registration extends CommonAPI {

    public void clickAccountButton() {
        clickByCss("#headerMyAccountTitle");
    }
}
