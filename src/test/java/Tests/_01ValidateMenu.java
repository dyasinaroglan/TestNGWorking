package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.ParentClass;

import java.util.ArrayList;
import java.util.List;

import static Locators.LocatorsClass.*;

public class _01ValidateMenu extends ParentClass {

    @Test
    public void beforeTest() throws InterruptedException {
        gotoSite(url);
        sleepTo(2000);
        login();
    }
    @Test(priority = 1)
    public void test1(){
        List<String> menuList = new ArrayList<>();
        menuList.add("Desktops");
        menuList.add("Laptops & Notebooks");
        menuList.add("Components");
        menuList.add("Tablets");
        menuList.add("Software");
        menuList.add("Phones & PDAs");
        menuList.add("Cameras");
        menuList.add("MP3 Players");

        List<WebElement> actualMenuList = driver.findElements(lmenu);

        Assert.assertTrue(actualMenuList.contains(menuList));
    }
}
