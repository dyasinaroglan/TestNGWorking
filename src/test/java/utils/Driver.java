package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Driver {

    public static ThreadLocal<WebDriver> drivers = new ThreadLocal<>();
    public static ThreadLocal<Browsers> browserNames = new ThreadLocal<>();



    public static WebDriver beforeClass(){
        return Driver.beforeClass(Browsers.CHROME);
    }


    @BeforeClass
    @Parameters("browsers")
    public static WebDriver beforeClass(Browsers browsers){

        if(drivers.get()== null){
            browserNames.set(browsers);
        }

        if(drivers.get() == null){
            switch (browsers){
                case FIREFOX:
                    WebDriverManager.firefoxdriver().setup();
                    drivers.set(new FirefoxDriver());
                    break;
                case EDGE:
                    WebDriverManager.edgedriver().setup();
                    drivers.set(new EdgeDriver());
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    drivers.set(new ChromeDriver());
            }
        }
        return drivers.get();
    }
    @AfterClass
    public static void afterClass() throws InterruptedException {
        Thread.sleep(1000);
        if(drivers.get() != null){
            drivers.get().quit();
            drivers.set(null);
        }
    }

}
