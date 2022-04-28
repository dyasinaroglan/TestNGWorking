package Tests2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.ParentClass;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Locators.LocatorsJqueryscript.*;

public class _05HomeWorkJqueryscript extends ParentClass {

    @BeforeTest
    public void beforeTest(){
        gotoSite(url);
    }
    @Test
    public void test1(){
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println("total iframes : " + size);
        WebElement iframe = driver.findElement(lİframe); //frame kullanırken By locator kabul etmiyor element istiyor
        driver.switchTo().frame(iframe);

        clickTo(lEmojiSelect);
    }
    @Test(priority = 1)
    public void test2(){
        List<WebElement> emojiList = driver.findElements(lemojiList);
        for (WebElement element : emojiList) {
            element.click();
        }
        driver.switchTo().defaultContent();
    }
    @Test(priority = 2)
    public void test3(){
        List<WebElement> textList = driver.findElements(lText);
        List<String> text = new ArrayList<>(Arrays.asList("hello java","merhaba","şampiyon","galatasaray","hukuk","insan hakları","Demokrasi","yasin","java dünyası"));
        for (int i = 0; i < text.size(); i++) {
            textList.get(i).sendKeys(text.get(i));
        }
        clickTo(lSend);
    }
    @AfterTest
    public void afterTest() throws InterruptedException {
        quitDriver();
    }
}
