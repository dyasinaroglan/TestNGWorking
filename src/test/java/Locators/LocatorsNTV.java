package Locators;

import org.openqa.selenium.By;

public interface LocatorsNTV {

    String url = "https://www.ntv.com.tr/";
    By lSporClick = By.xpath("(//ul[@class='header-category-items header-category-items-with-logo']//img[@loading='lazy'])[4]");
}
