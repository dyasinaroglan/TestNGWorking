package Tests2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.ParentClass;
import static Locators.LocatorsGuru.*;

public class _04HomeWorkGuru99_iframe extends ParentClass {

    @BeforeTest
    public void beforeTest(){
        gotoSite(url);
    }
    @AfterTest
    public void afterTest() throws InterruptedException {
        quitDriver();
    }
    @Test
    public void test1() throws InterruptedException {
        int size = driver.findElements(liframe).size();
        System.out.println("sayfadaki iframe sayısı : " + size);

        driver.switchTo().frame(0);
        WebElement element = driver.findElement(lyoutubeLink);
        element.click();
        sleepTo(2000);

        driver.switchTo().defaultContent(); //iframe den çıkıp ana sayfaya dönüyoruz.
        // ya da
        driver.switchTo().parentFrame(); // ile ana sayfaya döneriz
    }
}
