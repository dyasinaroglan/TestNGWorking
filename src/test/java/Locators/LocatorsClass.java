package Locators;

import org.openqa.selenium.By;

public interface LocatorsClass {

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


}
