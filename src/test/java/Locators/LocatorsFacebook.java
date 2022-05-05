package Locators;

import org.openqa.selenium.By;

public interface LocatorsFacebook {

    String url = "https://www.facebook.com/";
    By lHesapOlustur = By.cssSelector("a[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']");
    By lday = By.cssSelector("span[class='_5k_4'] select[name='birthday_day']");
    By lMonth = By.cssSelector("span[class='_5k_4'] select[name='birthday_month']");
    By lyear = By.cssSelector("span[class='_5k_4'] select[name='birthday_year']");
}
