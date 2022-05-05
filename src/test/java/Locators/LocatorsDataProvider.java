package Locators;

import org.openqa.selenium.By;

public interface LocatorsDataProvider {

    String url = "http://the-internet.herokuapp.com/add_remove_elements/";
    By lAddToElement = By.cssSelector("button[onclick='addElement()']");
    By lDeleteToElement = By.cssSelector("button[onclick='deleteElement()']");
}
