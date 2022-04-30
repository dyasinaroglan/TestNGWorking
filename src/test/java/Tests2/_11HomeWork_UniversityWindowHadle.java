package Tests2;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.ParentClass;

import java.util.Set;

import static Locators.Locators_UniversityWindowHandle.*;

public class _11HomeWork_UniversityWindowHadle extends ParentClass {

    @BeforeTest
    public void beforeTest() {
        gotoSite(url);
    }
    @Test
    public void test1() {
        String firstHandle = driver.getWindowHandle();
        clickTo(lLoginPortal);

        String windowID = "";
        Set<String> parentHandle = driver.getWindowHandles();
        for (String s : parentHandle) {
            if (!s.equals(firstHandle)) {
                windowID = s;
            }
        }
        driver.switchTo().window(windowID);

        sendKeysTo(lUsername,"ahmet");
        sendKeysTo(lPassword,"2022");
        clickTo(lLogin);

        String actualMessage = driver.switchTo().alert().getText();
        String expectedMessage = "validation failed";

        Assert.assertEquals(actualMessage,expectedMessage);

        driver.switchTo().alert().accept();
        driver.switchTo().window(firstHandle);

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "http://webdriveruniversity.com/";

        Assert.assertEquals(actualUrl,expectedUrl);
    }

}
