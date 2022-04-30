package Locators;

import org.openqa.selenium.By;

public interface LocatorsAutomation {

    String url = "http://automationpractice.com/";
    By secondProduct = By.xpath("//img[@title='Blouse']");
    By lSecondAddToCartClick = By.xpath("//a[@data-id-product='2']");
    By lContinueShopping = By.xpath("//span[@title='Continue shopping']");

    By fourthProducts = By.xpath("(//img[@title='Printed Dress'])[2]");
    By lfourthAddToCartClick = By.cssSelector("a[data-id-product='4']");

    By lfivethProduct = By.xpath("(//img[@class='replace-2x img-responsive'])[5]");
    By lfivethAddToCartClick = By.xpath("//a[@data-id-product='5']");
}
