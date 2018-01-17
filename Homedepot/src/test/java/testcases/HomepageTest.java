package testcases;

import Homedepot_pages.Home;
import org.testng.annotations.Test;

public class HomepageTest extends Home{
    @Test(priority=1)
    public void verifyPageTitle() throws InterruptedException {
        String title = driver.getTitle();
        if (title.contains("The Home Depot")) {
            System.out.println("1st verification passed");
        } else {
            System.out.println("1st verification failed");
        }
        sleepFor(1);
    }

    @Test(priority=2)
    public void verifyURL() throws InterruptedException {
        String url = getCurrentPageUrl();
        if (url.contains("https://www.homedepot.com/")) {
            System.out.println("second verification passed");
        } else {
            System.out.println("second verification failed");
        }
        sleepFor(1);
    }

    @Test(priority=3)
    public void checkAccountButton() {
       clickAccount();

    }
}




