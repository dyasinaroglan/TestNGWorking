package Locators;

import org.openqa.selenium.By;

public interface LocatorsUniversityİframe {

    String url = "http://webdriveruniversity.com/IFrame/index.html";
    By lOurProducts = By.xpath("(//ul[@class='nav navbar-nav'])/li[2]");
    By lCameras = By.xpath("(//div[@class='section-title'])[2]/p");
    By lProceed = By.xpath("(//div[@class='modal-footer'])/button[@type='button'][1]");
}
