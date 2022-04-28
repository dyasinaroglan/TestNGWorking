package Tests2;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.ParentClass;
import static Locators.LocatorsGuru.*;

public class _04HomeWorkGuru99_iframe extends ParentClass {

    @BeforeTest
    public void beforeTest(){
        gotoSite(url);
    }
    @AfterTest
    public void afterTest() throws InterruptedException {
        quitDriver();
    }
    @Test
    public void test1(){
        int size = driver.findElements(liframe).size();
        System.out.println("sayfadaki iframe sayısı : " + size);
    }
}
