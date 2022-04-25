package Tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import utils.ParentClass;

import java.util.Locale;

import static Locators.LocatorsClass.*;

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
