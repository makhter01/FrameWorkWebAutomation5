package testfeatures;

import keyword.Features;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.InputExcelSheet;

import java.io.IOException;

public class TestFeatures extends Features {
    @Test
    public void selectFeatures1() throws IOException, InterruptedException {
        Features featureObj = PageFactory.initElements(driver,  Features.class);
        featureObj.selectFeatures();

    }
}
