package chaseBankpage;

import base.CommonAPI;

public class ChaseHome extends CommonAPI{
    public void searchbtn(){

     typeByXpath("/html/body/div[2]/div[5]/header/div[5]/div/div/form/label/input","credit card");
     clickByXpath("/html/body/div[2]/div[5]/header/div[5]/div/div/form/label/input");
     clearInput("/html/body/div[2]/div[5]/header/div[5]/div/div/form/label/input");

     typeByXpath("/html/body/div[2]/div[5]/header/div[5]/div/div/form/label/input","career and job");
     clickByXpath("/html/body/div[2]/div[5]/header/div[5]/div/div/form/label/input");
     clearInput("/html/body/div[2]/div[5]/header/div[5]/div/div/form/label/input");

     typeByXpath("/html/body/div[2]/div[5]/header/div[5]/div/div/form/label/input","529 college plan");
     clickByXpath("/html/body/div[2]/div[5]/header/div[5]/div/div/form/label/input");
     clearInput("/html/body/div[2]/div[5]/header/div[5]/div/div/form/label/input");

        System.out.println(driver.getCurrentUrl());
    }

}
