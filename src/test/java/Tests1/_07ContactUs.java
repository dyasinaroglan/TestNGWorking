package Tests1;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.ParentClass;

import java.util.Locale;

import static Locators.LocatorsTests1.*;

public class _07ContactUs extends ParentClass {

    @Test
    public void beforeTest(){
        gotoSite(url);
        login();

    }
    @Test(priority = 1)
    @Parameters("enquiry") //xml de parametrenin alacağı isim buraya yazılır
    public void contactUs(String enquiry){
        //bu şekilde parametre alır hale getiriyoruz
        WebElement element = driver.findElement(lContactUs);
        scrollIntoView(element);
        clickTo(lContactUs);
        sendKeysTo(lenquiry,enquiry);
        clickTo(lSubmit);
        WebElement element1 = driver.findElement(contacUsMessage);
        Assert.assertTrue(element1.getText().toLowerCase(Locale.ROOT).equalsIgnoreCase("Contact Us"));
    }
}
