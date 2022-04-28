package Tests2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.ParentClass;

import java.util.List;
import java.util.Locale;

import static Locators.LocatorsAmazon.*;

public class _01HomeWorkAmazon extends ParentClass {

    @BeforeTest
    public void beforeTest(){
        gotoSite(url);
        clickTo(lChangeAdress);
    }
    @Test
    public void test1() {
        WebElement element = driver.findElement(lmenuSelect); //optionların olduğu locator'u elemente aldık.
        Select select = new     Select(element);  // bu elementi Select class'ının içinde kullandık

        List<WebElement> menuList = select.getOptions();

        System.out.println("kategori menüsünde " + menuList.size() + " " + "tane öge var.");
        Assert.assertEquals(28, menuList.size(),"menüde 28 option yoktur");
    }
    @Test(priority = 1)
    public void test2(){

        WebElement element = driver.findElement(lmenuSelect);
        Select select = new Select(element);
        select.selectByVisibleText("Books");

        sendKeysTo(lSearchText,"java");
        clickTo(lSearchButton);
    }
    @AfterTest
    public void afterTest() throws InterruptedException {
        quitDriver();
    }
    @Test(priority = 2)
    public void test3(){

        List<WebElement> bookList = driver.findElements(lkitapSayisi);
        System.out.println("çıkan kitap sayısı : " + bookList.size());
        Assert.assertEquals(16,bookList.size(),"kitap sayısı 16'dan farklıdır.");
        WebElement result = driver.findElement(lkitapSayisi);
        Assert.assertTrue(result.getText().toLowerCase(Locale.ROOT).contains("java"),"çıkan sonuçlar java sözcüğünü içermiyor");
    }
}
