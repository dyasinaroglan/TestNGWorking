package Locators;

import org.openqa.selenium.By;

public interface LocatorsClass1 {

    String url = "http://opencart.abstracta.us/index.php?route=common/home";

    By lmenu = By.cssSelector("//ul[@class='nav navbar-nav']/li");
    By lnewsLetter = By.xpath("(//div[@class='col-sm-3'])[5]//li[4]");
    By newsLetterClick = By.xpath("//div[@class='list-group']/a[text()='Newsletter']");
    By lsubscribe = By.linkText("unsubscribe");

    By lradioButtonYes = By.cssSelector("input[value='1']");
    By lContinue = By.cssSelector("input[value='Continue']");
    By lTitle = By.cssSelector("a[title='My Account']");
    By lEditAccount = By.xpath("(//div[@class='list-group'])[1]/a[text()='Edit Account']");
    By lfirstName = By.id("input-firstname");
    By lLastName = By.id("input-lastname");

    By lContinueButton = By.cssSelector("input[value='Continue']");
    By lmessage = By.cssSelector("div[class='alert alert-success alert-dismissible']");

    By lMyAccount = By.xpath("(//div[@class='list-group'])[1]/a[text()='My Account']");
    By lAdressBook = By.xpath("(//div[@class='list-group'])[1]/a[text()='Address Book']");
    By lDeleteList = By.xpath("//td[@class='text-right']/a[text()='Delete']");
    //By lContactUs = By.xpath("(//div[@class='row'])[3]/div[@class='col-sm-3'][2]//li[1]");
    By lContactUs = By.linkText("Contact Us");
    By lenquiry = By.id("input-enquiry");
    By lSubmit = By.cssSelector("input[type='submit']");
    By contacUsMessage = By.cssSelector("#content>h1");

    By lSpecials = By.linkText("Specials");
    By lprice = By.xpath("//span[@class='price-old']");
    By lproducts = By.cssSelector("div.product-thumb");

    By lSearch = By.cssSelector("input[name='search']");
    By lMacProducts = By.cssSelector("div[class='caption']");
    By lsearchButton = By.cssSelector("span[class='input-group-btn']");

    By lemail = By.id("input-email");
    By lpassword = By.id("input-password");
    By lLoginButton = By.cssSelector("input[class='btn btn-primary']");

    By lShopingCart = By.xpath("//span[text()='Shopping Cart']");
    By lAddToCart = By.xpath("(//div[@class='button-group'])/button//span[text()='Add to Cart']");
    By lCheckOut = By.cssSelector("div[class='pull-right']");
    By lContinueButtonCheckOut = By.id("button-payment-address");
    By lContinueButtonCheckOut1 = By.id("button-shipping-address");
    By lContinueButtonCheckOut2 = By.id("button-shipping-method");
    By lcheckBox = By.cssSelector("input[type='checkbox']");
    By lContinueButtonCheckOut3 = By.id("button-payment-method");
    By lConfirmOrder = By.id("button-confirm");
    By lMessageOrder = By.xpath("//div[@id='content']/h1");

    By lipodProducts = By.cssSelector("div[class='caption'] h4");
    By lAddToWish = By.cssSelector("button[data-original-title='Add to Wish List']");
    By lAddwishListButton = By.cssSelector("a[title='Wish List (1)']");
    By lTableNames = By.xpath("td[class='text-left']");


}
