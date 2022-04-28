package Tests1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.ParentClass;

import java.util.List;

import static Locators.LocatorsTests1.*;

public class _13WishList extends ParentClass {

    @BeforeTest
    @Parameters("productName")
    public void beforeTest(String productName){
        gotoSite(url);
        login();
        sendKeysTo(lSearch,productName + Keys.ENTER);
    }
    @Test(priority = 1)
    public void test1(){
        List<WebElement> productList = driver.findElements(lipodProducts);
        String randomProductName = productList.get(randomSayı(productList.size())).getText();

        List<WebElement> productWishList = driver.findElements(lAddToWish);
        productWishList.get(randomSayı(productWishList.size())).click();

        clickTo(lAddwishListButton);

        List<WebElement> tableList = driver.findElements(lTableNames);

        for (WebElement element : tableList) {
            Assert.assertEquals(randomProductName,element.getText());

        }
    }

}
