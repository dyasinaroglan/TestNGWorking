package Tests2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.ParentClass;
import static Locators.LocatorsUniversityİframe.*;

public class _09HomeWork_University_iframe extends ParentClass {

    @BeforeTest
    public void beforeTest(){
        gotoSite(url);
    }
    @Test
    public void test1(){
        driver.switchTo().frame(0);
        clickTo(lOurProducts);
        clickTo(lCameras);
        clickTo(lProceed);

        clickTo(lCameras);

    }
    @AfterTest
    public void afterTest() throws InterruptedException {
        quitDriver();
    }
}
