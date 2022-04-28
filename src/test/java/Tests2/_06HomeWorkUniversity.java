package Tests2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
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
        clickTo(lLink);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        WebElement clickAndHold = driver.findElement(lClickAndCold);
        builder.clickAndHold(clickAndHold).perform(); //clickAndHold --> basılı tutuyoruz
        //Actions class'ına ait araçlar By class'ınan locator kabul etmiyor. ille de WebElement class'ından olsun istiyor

        System.out.println(clickAndHold.getText());
    }
    @Test
    public void test2(){
        WebElement doubleClickMe = driver.findElement(lDoubleClickMe);
        Actions builder = new Actions(driver);
        builder.doubleClick(doubleClickMe).perform();
    }
    @AfterTest
    public void afterTest() throws InterruptedException {
        quitDriver();
    }
}
