package Tests2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.ParentClass;
import static Locators.LocatorsAutomation.*;

public class _10HomeWork_Automation extends ParentClass {

    @BeforeTest
    public void beforeTest(){
        gotoSite(url);
    }
    @Test
    public void test1() throws InterruptedException {
        WebElement element = driver.findElement(secondProduct);
        scrollIntoView(element);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        sleepTo(1000);
        clickTo(lSecondAddToCartClick);
        //driver.navigate().back();
        clickTo(lContinueShopping);
    }
    @Test(priority = 1)
    public void test2() throws InterruptedException {
        WebElement element = driver.findElement(fourthProducts);
        sleepTo(1000);
        scrollIntoView(element);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        sleepTo(2000);
        clickTo(lfourthAddToCartClick);
        clickTo(lContinueShopping);

    }
    @Test(priority = 2)
    public void test3() throws InterruptedException {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(lfivethProduct));
        sleepTo(1000);
        scrollIntoView(element);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        sleepTo(1000);
        clickTo(lfivethAddToCartClick);
        clickTo(lContinueShopping);
    }
}
