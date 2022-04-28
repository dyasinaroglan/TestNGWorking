package Tests2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.ParentClass;
import static Locators.LocatorsUniversity.*;

public class _06HomeWorkUniversity extends ParentClass {

    @BeforeTest
    public void beforeTest(){
        gotoSite(url);
    }
    @Test
    public void test1(){
        Actions builder = new Actions(driver);
        WebElement hoverOverFirst = driver.findElement(lHoverOverFirst);
        builder.moveToElement(hoverOverFirst).perform();
    }
}
