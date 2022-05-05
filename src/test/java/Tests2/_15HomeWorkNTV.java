package Tests2;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.ParentClass;

import java.util.Set;

import static Locators.LocatorsNTV.*;

public class _15HomeWorkNTV extends ParentClass {

    @BeforeTest
    public void beforeRest() {
        gotoSite(url);
    }

    @Test
    public void test1() {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "NTV HABER - Haberler, Son Dakika Haberleri");

        String anaSayfaHandle = driver.getWindowHandle();
        clickTo(lSporClick);

        String digerSayfaHandle = "";
        Set<String> handles = driver.getWindowHandles();
        for (String i : handles) {
            if (!i.equals(anaSayfaHandle)) {
                digerSayfaHandle = i;
            }
        }
        driver.switchTo().window(digerSayfaHandle);
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.ntv.com.tr/sporskor";
        Assert.assertEquals(actualURL,expectedURL);

        driver.switchTo().window(anaSayfaHandle);
    }
    @AfterTest
    public void afterTest() throws InterruptedException {
        quitDriver();
    }
}
