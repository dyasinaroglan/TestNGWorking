package Locators;

import org.openqa.selenium.By;

public interface LocatorsDemoAutomation {

    String url = "http://demo.automationtesting.in/Alerts.html";
    By lAlertWithOK = By.xpath("(//a[@class='analystic'])[1]");
    By lAlertBox = By.xpath("(//button[@onclick='alertbox()'])");
    By  lAlertWithOKCancel= By.xpath("//*[text()='Alert with OK & Cancel ']");
    By lAlertWithOKCancelButton = By.cssSelector("button[class='btn btn-primary']");
    By lTextBox = By.xpath("(//*[text()='Alert with Textbox '])");
    By lPromtBox = By.cssSelector("button[class='btn btn-info']");
}
