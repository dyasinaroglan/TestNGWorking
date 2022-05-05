package Locators;

import org.openqa.selenium.By;

public interface LocatorsPractice {

    String url = "http://automationpractice.com/";
    By limage1 = By.cssSelector("img[title='Faded Short Sleeve T-shirts']");
    By laddToCart1 = By.cssSelector("a[data-id-product='1']");
    By lContinueShopping = By.cssSelector("span[title='Continue shopping']");

    By limage3 = By.xpath("(//img[@title='Printed Dress'])[1]");
    By laddToCart3 = By.cssSelector("a[data-id-product='3']");

    By limage5 = By.xpath("(//img[@title='Printed Summer Dress'])[1]");
    By laddToCart5 = By.cssSelector("a[data-id-product='5']");

    By lhowManyProduct = By.xpath("//span[@class='ajax_cart_quantity unvisible']");
    By lcheckOut = By.cssSelector("i[class='icon-chevron-right right']");

    By lTotalPrice = By.id("span[id='total_price']");
    By lCart = By.cssSelector("a[title='View my shopping cart']");
}
