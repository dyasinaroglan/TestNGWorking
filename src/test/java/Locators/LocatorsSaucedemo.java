package Locators;

import org.openqa.selenium.By;

public interface LocatorsSaucedemo {

    String url = "https://www.saucedemo.com/";

    By luserName = By.id("user-name");
    By lpassword = By.id("password");
    By lLoginButton = By.id("login-button");
    By lSelect = By.cssSelector("select[class='product_sort_container']");
    By lPriceList = By.cssSelector("div[class='inventory_item_price']");
}
