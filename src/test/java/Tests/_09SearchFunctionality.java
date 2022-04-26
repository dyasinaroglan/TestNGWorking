package Tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.ParentClass;

import java.util.List;
import java.util.Locale;

import static Locators.LocatorsClass.*;

public class _09SearchFunctionality extends ParentClass {

    @BeforeTest
    public void beforeTest(){
        gotoSite(url);
        login();
    }
    @Test
    @Parameters("productName")
    public void test1(String str){
        sendKeysTo(lSearch,str + Keys.ENTER);

        List<WebElement> list = driver.findElements(lMacProducts);

        for (WebElement element : list) {
            System.out.println(element.getText());
            element.getText().toLowerCase(Locale.ROOT).contains(str);

        }

    }
}
