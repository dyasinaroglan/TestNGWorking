package Locators;

import org.openqa.selenium.By;

public interface LocatorsGuruWindowHandle {

    String url = "http://demo.guru99.com/popup.php";
    By lClickHere = By.cssSelector("a[target='_blank']");
    By lemailID = By.cssSelector("input[name='emailid']");
    By lSubmit = By.cssSelector("input[name='btnLogin']");
    By lMessage = By.cssSelector("td[align='center'] h3");
}
