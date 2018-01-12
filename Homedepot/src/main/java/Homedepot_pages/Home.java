package Homedepot_pages;

import base.CommonAPI;

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
