package testcases;

import Homedepot_pages.Home;
import base.CommonAPI;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomepageTest extends CommonAPI {
    @Test
    public void verifyPageTitle() throws InterruptedException {
        String title = driver.getTitle();
        if (title.contains("The Home Depot")) {
            System.out.println("1st verification passed");
        } else {
            System.out.println("1st verification failed");
        }
        sleepFor(10);

    }

    @Test
    public void verifyURL() throws InterruptedException {
        String url = getCurrentPageUrl();
        if (url.contains("https://www.homedepot.com/")) {
            System.out.println("second verification passed");
        } else {
            System.out.println("second verification failed");
        }
        sleepFor(30);


    }

    @Test
    public void checkAccountButton() {
        Home account = new Home();
        account.clickAccount();

    }


}




