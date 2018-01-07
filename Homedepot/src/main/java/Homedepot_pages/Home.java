package Homedepot_pages;

import base.CommonAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Home extends CommonAPI {
    public void searchBar() {
        System.out.println(driver.getTitle());
        typeByCss("#headerSearch", "lights");
        clickByCss("#headerSearchButton svg");
        clearInput("#headerSearch");
        typeByCss("#headerSearch", "decoration");
        clickByCss("#headerSearchButton svg");
        clearInput("#headerSearch");
        System.out.println(driver.getCurrentUrl());

    }

    public void clickAccount() {
        String textlink = getTextByCss("#headerMyAccountTitle ");
        System.out.println(textlink);
        clickByCss("#headerMyAccountTitle");

    }
}
