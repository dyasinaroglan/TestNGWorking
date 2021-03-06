package Tests1;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import utils.ParentClass;

import static Locators.LocatorsTests1.*;

public class _02Subscribe extends ParentClass {

    @Test
    public void test1(){
        gotoSite(url);
        login();
    }
    @Test(priority = 1)
    public void test2(){
        WebElement element = driver.findElement(lnewsLetter);
        scrollIntoView(element);
        clickTo(newsLetterClick);
    }
    @Test(priority = 2)
    public void test3(){

        clickTo(lradioButtonYes);
        clickTo(lContinue);
    }
    @Test(priority = 3)
    public void test4(){
        String expected = "My Account";
        Assert.assertTrue(driver.findElement(lTitle).getText().equalsIgnoreCase(expected));

    }
    @AfterTest
    public void afterTest() throws InterruptedException {
        quitDriver();
    }
}
