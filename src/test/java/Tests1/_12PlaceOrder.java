package Tests1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.ParentClass;

import java.util.List;

import static Locators.LocatorsClass.*;

public class _12PlaceOrder extends ParentClass {

    @BeforeTest
    public void beforeTest(){
        gotoSite(url);
        login();
    }
    @Test
    @Parameters("productName")
    public void test1(String product){
        sendKeysTo(lSearch,product + Keys.ENTER);

        List<WebElement> urunList = driver.findElements(lMacProducts);
        urunList.get(0).click();

        clickTo(lAddToCart);
        clickTo(lShopingCart);
        clickTo(lCheckOut);
        clickTo(lContinueButtonCheckOut);
        clickTo(lContinueButtonCheckOut1);
        clickTo(lContinueButtonCheckOut2);
        clickTo(lcheckBox);
        clickTo(lContinueButtonCheckOut3);
        clickTo(lConfirmOrder);
        }
    @Test(priority = 1)
    public void test2() {
        WebElement element = driver.findElement(lMessageOrder);
        String actualMessage = element.getText();
        String expectedMessage = "Your order has been placed!";
        Assert.assertEquals(actualMessage,expectedMessage);
    }

}
