package Locators;

import org.openqa.selenium.By;

public interface LocatorsAmazon {

    //Amazon Locator
    String url = "https://www.amazon.com/";
    By lChangeAdress = By.xpath("(//span[@class='a-button-inner'])[1]");
    By lmenuSelect = By.cssSelector("select[id='searchDropdownBox']");
    By lSearchText = By.id("twotabsearchtextbox");
    By lSearchButton = By.cssSelector("input[type='submit']");
    By lkitapSayisi = By.cssSelector("h2[class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']");

    //*********************************************************************************************************
    //Zero Locator

    String urlZero = "http://zero.webappsecurity.com/";
    By lSignIn = By.xpath("(//button[@id='signin_button'])");
    By luserName = By.id("user_login");
    By lpassword = By.id("user_password");
    By lSignInButton = By.cssSelector("input[type='submit']");
    By lOnlineBanking = By.cssSelector("li[id='onlineBankingMenu']");
    By lPayBills = By.id("pay_bills_link");
    By  lPurchaseForeignCurrency = By.xpath("//a[text()='Purchase Foreign Currency']");
    By lCurrencySelect = By.xpath("(//div[@class='controls'])/select[@id='pc_currency']");
    By ldolarsMoneySelect = By.cssSelector("select[id='pc_currency'] option[value='CAD']");
    By lAmount = By.id("pc_amount");
    By lUsDolarBox = By.id("pc_inDollars_true");
    By lSelectedCurrencyBox = By.id("pc_inDollars_false");
    By lCalculateCosts = By.id("pc_calculate_costs");
    By lPurchaseButton = By.id("purchase_cash");
    By lForeignCurrencyMessage = By.cssSelector("div[id='alert_content']");
}
