package Tests1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.ParentClass;

import static Locators.LocatorsTests1.*;

public class _03EditAccount extends ParentClass {

    @BeforeTest
    public void beforeTest(){
        gotoSite(url);
        login();
    }
    @Test
    public void test1(){
        WebElement element = driver.findElement(lEditAccount);
        scrollIntoView(element);
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
    @Test(priority = 1)
    public void test2(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(lfirstName)).clear();
        sendKeysTo(lfirstName,"şampiyon");
        wait.until(ExpectedConditions.visibilityOfElementLocated(lLastName)).clear();
        sendKeysTo(lLastName,"galatasaray");

        clickTo(lContinueButton);
    }
}
