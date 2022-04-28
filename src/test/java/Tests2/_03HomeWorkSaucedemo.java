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
        List<String> priceString = new ArrayList<>();

        for (WebElement s : priceList) {
            priceString.add(s.getText()); //sonra bunları String bir ArrayList'e attık 122.59$ şeklinde
        }
        List<Double> priceDouble = new ArrayList<>();

        for (int i = 0; i < priceString.size(); i++) {
            priceDouble.add(Double.parseDouble(priceString.get(i).replace("$","")));
            //sonra bunları $ dan kurtarıcaz ve Double bir ArrayList'in içine atacağız
        }
        for (int i = 1; i < priceDouble.size() ; i++) {
            if(priceDouble.get(i-1)<=priceDouble.get(i)){
                System.out.println("Test Pass");
            }else {
                System.out.println("Test Failed");
            }
        }

    }
}

