package Tests2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.ParentClass;

import java.util.ArrayList;
import java.util.List;

import static Locators.LocatorsSaucedemo.*;

public class _03HomeWorkSaucedemo extends ParentClass {

    @BeforeTest
    public void beforeTest(){
        gotoSite(url);
    }
    @AfterTest
    public void afterTest() throws InterruptedException {
        quitDriver();
    }
    @Test
    public void login(){
        sendKeysTo(luserName,"standard_user");
        sendKeysTo(lpassword,"secret_sauce" + Keys.ENTER);

    }
    //düşükten yükseğe fiyatları seçin ve bunu doğrulayın
    @Test(priority = 1)
    public void test1(){
        WebElement element = driver.findElement(lSelect);
        Select select = new Select(element);
        select.selectByVisibleText("Price (low to high)");

        List<WebElement> priceList = driver.findElements(lPriceList); //öncelikle fiyatları bir listeye attık

        List<String> stringPrice = new ArrayList<>();
        for (WebElement s : priceList) {
            stringPrice.add(s.getText());
        }
        List<Double> doublePrice = new ArrayList<>();

        for (int i = 0; i < stringPrice.size(); i++) {
            doublePrice.add(Double.parseDouble(stringPrice.get(i).replace("$","")));
        }
        for (int i = 1; i < doublePrice.size(); i++) {
            if(doublePrice.get(i-1) <= doublePrice.size()){
                System.out.println("Test Pass");
            }else {
                System.out.println("Test Fail");
            }
        }
    }
}

