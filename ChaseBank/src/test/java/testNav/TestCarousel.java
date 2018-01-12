package testNav;

import navigation.CarouselPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCarousel extends CarouselPage {
    @Test
    public void TestCarousel() throws InterruptedException {

        CarouselPage signin = PageFactory.initElements(driver, CarouselPage.class);
        slideToFindElement();
        Thread.sleep(50);
        slideToFindElement();
}

}
