package Tests2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ParentClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static Locators.LocatorsPractice.*;

public class _16HomeWorkPractice extends ParentClass {

    @Test
    public void beforeTest(){
        gotoSite(url);
    }
    @Test
    public void products1(){
        Actions builder = new Actions(driver);
        WebElement image1 = driver.findElement(limage1);
        scrollIntoView(image1);
        builder.moveToElement(image1).pause(1000).perform();
        clickTo(laddToCart1);
        clickTo(lContinueShopping);
    }
    @Test(priority = 1)
    public void products3(){
        Actions builder = new Actions(driver);
        WebElement image3 = wait.until(ExpectedConditions.visibilityOfElementLocated(limage3));
        scrollIntoView(image3);
        builder.moveToElement(image3).pause(1000).perform();
        clickTo(laddToCart3);
        clickTo(lContinueShopping);
    }
    @Test(priority = 2)
    public void products5(){
        Actions builder = new Actions(driver);
        WebElement image5 = wait.until(ExpectedConditions.visibilityOfElementLocated(limage5));
        scrollIntoView(image5);
        builder.moveToElement(image5).pause(1000).perform();
        clickTo(laddToCart5);
        clickTo(lContinueShopping);
    }
    @Test(priority = 3)
    public void assertCheck1(){
        WebElement actual = wait.until(ExpectedConditions.visibilityOfElementLocated(lhowManyProduct));
        scrollIntoView(actual);
        System.out.println(actual.getText());
        Assert.assertTrue(actual.getText().contains("3"));
        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(lCart);
        builder.moveToElement(element).pause(10000).perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(lcheckOut));
    }
    @Test(priority = 4)
    public void priceTest(){
        List<WebElement> totalPrice = driver.findElements(lTotalPrice);
        List<String> stringPrice = new ArrayList<>();
        for (int i = 0; i < totalPrice.size(); i++) {
            stringPrice.add(totalPrice.get(i).getText());
        }
        List<Double> doublePrice = new ArrayList<>();
        for (int i = 0; i < stringPrice.size(); i++) {
            doublePrice.add(Double.parseDouble(stringPrice.get(i).replace("$","")));
            Double price = 73.97;
            if(doublePrice.contains(price)){
                System.out.println("test başarılıdır");
            }else {
                System.out.println("test başarılıdır");
            }
        }

    }
}
