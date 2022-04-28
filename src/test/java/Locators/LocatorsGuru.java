package Locators;

import org.openqa.selenium.By;

public interface LocatorsGuru {

    String url = "https://demo.guru99.com/test/guru99home/";

    By liframe = By.tagName("iframe");
    By lyoutubeLink = By.xpath("//button[@class='ytp-large-play-button ytp-button']");
}
