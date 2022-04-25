package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ParentClass {

    protected WebDriver driver;
    protected WebDriverWait wait;


    public ParentClass(){
        driver = Driver.beforeClass();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

    }

    public void gotoSite(String url){
        driver.get(url);
    }
    public void clickTo(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }
    public void clickTo(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
    public void sendKeysTo(By locator, String str){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(str);
    }
    public void sendKeysTo(WebElement element, String str){
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(str);
    }
    public void scrollIntoView(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",element);
    }
    public void sleepTo(long milis) throws InterruptedException {
        Thread.sleep(milis);
    }
    public void login(){
        By lmyAccount = By.cssSelector("li[class='dropdown'] a[title='My Account']");
        By lLogin = By.linkText("Login");
        By lemail = By.id("input-email");
        By lpassword = By.id("input-password");
        By lLoginButton = By.cssSelector("input[class='btn btn-primary']");

        wait.until(ExpectedConditions.elementToBeClickable(lmyAccount)).click();
        wait.until(ExpectedConditions.elementToBeClickable(lLogin)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(lemail)).sendKeys("testngkurs@gmail.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(lpassword)).sendKeys("testngkurs");
        clickTo(lLoginButton);
    }
    public void quitDriver() throws InterruptedException {
        sleepTo(1000);
        driver.quit();
    }
}
