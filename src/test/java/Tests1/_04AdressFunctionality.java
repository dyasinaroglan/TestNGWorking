package Tests1;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.ParentClass;

import java.util.List;

import static Locators.LocatorsClass1.*;

public class _04AdressFunctionality extends ParentClass {

    @BeforeTest
    public void beforeTest(){
        gotoSite(url);
        login();
    }
    @Test
    public void test1(){
        clickTo(lMyAccount);
        clickTo(lAdressBook);
    }
    @Test
    public void test2(){
        List<WebElement> deleteList = driver.findElements(lDeleteList);
        deleteList.get(deleteList.size()-2).click();
    }
}
