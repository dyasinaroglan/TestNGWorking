package Locators;

import org.openqa.selenium.By;

public interface LocatorsOpenCart {

    String url = "http://tutorialsninja.com/demo/index.php?route=common/home";
    By lPhonesPDA = By.xpath("//ul[@class='nav navbar-nav']/li[6]");
    By lAddToCart = By.xpath("(//div[@class='button-group'])//i[@class='fa fa-shopping-cart']");
    By litemsClick = By.xpath("(//span[@id='cart-total'])");
    By lproductName = By.cssSelector("td[class='text-left']");
}
