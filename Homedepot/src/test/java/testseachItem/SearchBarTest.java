package testseachItem;

import Homedepot_pages.Home;
import org.testng.annotations.Test;


public class SearchBarTest extends Home {
    @Test
    public void testHome() throws InterruptedException{
        searchBox();
        sleepFor(30);
    }
}
