package Tests2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.ParentClass;

import java.util.Set;

import static Locators.LocatorsGuruWindowHandle.*;

public class _08HomeWork_Guru99_WindowHandle extends ParentClass {

    @BeforeTest
    public void beforeTest(){
        gotoSite(url);

    }
    @Test
    public void test1() throws InterruptedException {
        String firstWindowHandle = driver.getWindowHandle();
        System.out.println(firstWindowHandle);
        clickTo(lClickHere);
        Set<String> windowID = driver.getWindowHandles(); //yeni bir sayfa açılıyor. yani yeni bir getWindowHandles demek
        //bunları set'e aldık.
        System.out.println(windowID);

        String secondWindowHandle = "";
        for (String s : windowID) { //set'in içindeki windowHandleri for'a sokuyoruz.
            if(!s.equals(firstWindowHandle)){ //eğer set'in içindeki firstWindowHandle değilse bunu SecondWindowHandle at demiş olduk
                secondWindowHandle = s;
            }
        }
        System.out.println(secondWindowHandle);
        sleepTo(1000);
        driver.switchTo().window(secondWindowHandle); //bu şekilde de ikinci açılan sayfaya geçmiş oluyoruz.

        sendKeysTo(lemailID, "somepne@gmail.com");
        clickTo(lSubmit);


        SoftAssert softAssert = new SoftAssert();
        String expectedMessage = "This access is valid only for 20 days.";
        softAssert.assertEquals(driver.findElement(lMessage).getText(), expectedMessage);
        softAssert.assertAll();

        driver.switchTo().window(firstWindowHandle);
    }
    @AfterTest
    public void afterTest() throws InterruptedException {
        quitDriver();
    }
}
