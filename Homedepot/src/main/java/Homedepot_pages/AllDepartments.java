package Homedepot_pages;

import base.CommonAPI;

import java.util.ArrayList;
import java.util.List;


public class AllDepartments extends CommonAPI {
    public List<String> getDepartments(){
        List<String> items = new ArrayList<String>();
        items = getTextFromWebElements("#container div.grid.flush.hide.show--sm > div > ul >li:nth-child(1) > a");
        return items;
    }

}
