package Locators;

import org.openqa.selenium.By;

public interface LocatorsUniversity {

    String url = "http://webdriveruniversity.com/Actions/";
    By lHoverOverFirst = By.cssSelector("div[class='dropdown hover']");
    By lLink = By.xpath("(//a[@class='list-alert'])[1]");
    By lClickAndCold = By.id("click-box");
    By lDoubleClickMe = By.cssSelector("div[id='double-click']");
}
