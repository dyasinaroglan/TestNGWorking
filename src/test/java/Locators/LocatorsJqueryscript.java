package Locators;

import org.openqa.selenium.By;

public interface LocatorsJqueryscript {

    String url = "https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/";

    By lİframe = By.xpath("(//iframe[@id='emoojis'])");
    By lEmojiSelect = By.xpath("(//span[@class='mdl-tabs__ripple-container mdl-js-ripple-effect'])[2]");
    By lemojiList = By.xpath("//div[@id='nature']/div/img");
    By lText = By.xpath("(//input[@class='mdl-textfield__input'])");
    By lSend = By.id("send");
}
