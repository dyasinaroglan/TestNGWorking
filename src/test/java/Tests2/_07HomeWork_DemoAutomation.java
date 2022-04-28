package Tests2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.ParentClass;
import static Locators.LocatorsDemoAutomation.*;

public class _07HomeWork_DemoAutomation extends ParentClass {

    @BeforeTest
    public void beforeTest(){
        gotoSite(url);
    }
    @Test
    public void test1(){
        clickTo(lAlertWithOK);
        clickTo(lAlertBox);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
    }
    @Test(priority = 1)
    public void test2() throws InterruptedException {
        clickTo(lAlertWithOKCancel);
        clickTo(lAlertWithOKCancelButton);
        sleepTo(1000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        clickTo(lAlertWithOKCancelButton);
        sleepTo(1000);
        driver.switchTo().alert().dismiss();

    }
    @Test(priority = 2)
    public void test3(){
        clickTo(lTextBox);
        clickTo(lPromtBox);
        driver.switchTo().alert().sendKeys("şampiyon galatasaray");
        driver.switchTo().alert().accept();
    }
    @AfterTest
    public void afterTest() throws InterruptedException {
        quitDriver();
    }
}
