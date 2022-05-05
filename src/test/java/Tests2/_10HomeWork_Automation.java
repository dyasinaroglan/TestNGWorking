package Tests2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.ParentClass;

import java.util.ArrayList;
import java.util.List;

import static Locators.LocatorsAutomation.*;

public class _10HomeWork_Automation extends ParentClass {

    @BeforeTest
    public void beforeTest()    {
        gotoSite(url);
    }
    @Test
    public void test1() throws InterruptedException {
        WebElement element = driver.findElement(secondProduct);
        scrollIntoView(element);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).pause(1000).perform();
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
    @Test(priority = 3)
    public void test4() throws InterruptedException {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(lcart));
        scrollIntoView(element);
        sleepTo(1000);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).pause(1000).perform();

        List<WebElement> productList = driver.findElements(lCartList);

        int expected = 3;
        Assert.assertEquals(productList.size(),expected);
        if(productList.size() == 3){
            System.out.println("test başarılı olmuştur");
        }else {
            System.out.println("test başarısız olmuştur");
        }
    }
    @Test(priority = 4)
    public void test5() throws InterruptedException {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(lcart));
        Actions actions = new Actions(driver);
        sleepTo(1000);
        actions.moveToElement(element).pause(1000).perform();
        clickTo(lcheckOut);

        List<WebElement> totalPrice = driver.findElements(lTotalPrice);

        List<String> stringTotalPrice = new ArrayList<>();
        for (int i = 0; i < totalPrice.size(); i++) {
            stringTotalPrice.add(totalPrice.get(i).getText());
        }
        List<Double> doublePrice = new ArrayList<>();
        for (int i = 0; i < stringTotalPrice.size(); i++) {
            doublePrice.add(Double.parseDouble(stringTotalPrice.get(i).replace("$","")));
            Double price = 108.97;
            if(doublePrice.contains(price)){
                System.out.println("test başarılıdır");
            }else {
                System.out.println("test başarılı değildir");
            }
        }
    }
}
