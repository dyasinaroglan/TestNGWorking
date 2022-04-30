package Tests2;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.ParentClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static Locators.LocatorsOpenCart.*;

public class _12HomeWork_OpenCart extends ParentClass {

    List<String> AddToCartAdlarıSepet=new ArrayList<>();

    @BeforeTest
    public void beforeTest(){
        gotoSite(url);
    }
    @Test
    public void test1() throws InterruptedException {
        clickTo(lPhonesPDA);
        List<WebElement> list = driver.findElements(lAddToCart);
        for (WebElement i : list) {
            i.click();
            sleepTo(1000);
        }
        clickTo(litemsClick);

        List<WebElement> productNames = driver.findElements(lproductName);
        for (WebElement productName : productNames) {
            AddToCartAdlarıSepet.add(productName.getText());
        }
        System.out.println(AddToCartAdlarıSepet.get(0));
        System.out.println(AddToCartAdlarıSepet.get(1));
        System.out.println(AddToCartAdlarıSepet.get(2));
    }
    @AfterTest
    public void afterTest() throws InterruptedException {
        quitDriver();
    }
}
