package Tests1;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.ParentClass;

import java.util.List;

import static Locators.LocatorsClass.*;

public class _08Specials extends ParentClass {

    @BeforeTest
    public void beforeTest(){
        gotoSite(url);
        login();
    }
    @Test(priority = 1)
    public void test2(){
        WebElement element = driver.findElement(lSpecials);
        scrollIntoView(element);
        clickTo(lSpecials);
    }
    @Test(priority = 2)
    public void test3(){
        List<WebElement> discountPrice = driver.findElements(lprice); // indirimli fiyatların listesini aldık
        List<WebElement> productsList = driver.findElements(lproducts);  // toplam kaç tane ürün varsa onun listesini aldık
        Assert.assertTrue(discountPrice.size() == productsList.size()); //ve bu iki listenin size'ları eşit mi değil mi buna baktık.

    }
    @AfterTest
    public void afterTest() throws InterruptedException {
        quitDriver();
    }
}
