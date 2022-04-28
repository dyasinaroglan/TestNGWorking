package Tests2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.ParentClass;

import static Locators.LocatorsAmazon.*;

public class _02HomeWorkZero extends ParentClass {

    @BeforeTest
    public void beforeTest(){
        gotoSite(urlZero);
    }
    @Test
    public void test1(){
        clickTo(lSignIn);
        sendKeysTo(luserName,"username");
        sendKeysTo(lpassword,"password");
        clickTo(lSignInButton);
        driver.navigate().back();
    }
    @Test(priority = 2)
    public void test2(){
        clickTo(lOnlineBanking);
        clickTo(lPayBills);
        clickTo(lPurchaseForeignCurrency);
        clickTo(lCurrencySelect);
        clickTo(ldolarsMoneySelect);

        sendKeysTo(lAmount,"1000");
        clickTo(lUsDolarBox);
        clickTo(lSelectedCurrencyBox);
        clickTo(lCalculateCosts);
        clickTo(lPurchaseButton);
        WebElement element = driver.findElement(lForeignCurrencyMessage);
        Assert.assertEquals(element.getText(),"Foreign currency cash was successfully purchased.");
    }
    @AfterTest
    public void afterTest() throws InterruptedException {
        quitDriver();
    }

}
