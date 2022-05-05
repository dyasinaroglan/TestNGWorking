package Tests2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.ParentClass;

import java.util.List;

import static Locators.LocatorsFacebook.*;

public class _14HomeWorkFacebook extends ParentClass {

    @BeforeTest
    public void beforeTest(){
        gotoSite(url);
    }
    @Test
    public void test1(){
        clickTo(lHesapOlustur);
    }
    @Test
    public void test2(){
        WebElement day = wait.until(ExpectedConditions.visibilityOfElementLocated(lday));
        WebElement month = wait.until(ExpectedConditions.visibilityOfElementLocated(lMonth));
        WebElement year = wait.until(ExpectedConditions.visibilityOfElementLocated(lyear));

        Select select = new Select(day);
        List<WebElement> gun = select.getOptions();
        System.out.println("==========Günler==========");
        for (WebElement d : gun) {
            System.out.println(d.getText());
        }
        clickTo(lMonth);
        select = new Select(month);
        List<WebElement> ay = select.getOptions();
        for (WebElement a : ay) {
            System.out.println(a.getText());
        }
        clickTo(lyear);
        select = new Select(year);
        List<WebElement> yil = select.getOptions();
        for (WebElement y : yil) {
            System.out.println(y.getText());
        }
    }
    @AfterClass
    public void afterClass() throws InterruptedException {
        quitDriver();
    }
}
