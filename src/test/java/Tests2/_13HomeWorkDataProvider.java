package Tests2;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.ParentClass;

import java.util.List;

import static Locators.LocatorsDataProvider.*;

public class _13HomeWorkDataProvider extends ParentClass {

    @BeforeTest
    public void beforeTest(){
        gotoSite(url);
    }
    @Test
    public void test1(){
        addElement(64);
        deleteElement(42);

    }
    private void addElement(int addNumberOfButton){
        WebElement button = driver.findElement(lAddToElement);
        for (int i = 0; i < addNumberOfButton; i++) {
            button.click();
        }
    }
    private void deleteElement(int deleteNumberOfButton){
        List<WebElement> list = driver.findElements(lDeleteToElement);

        int count = 0;
        for (WebElement element : list) {
            count++;
            if(count>deleteNumberOfButton){
                break;
            }
            element.click();
        }
       List<WebElement> elementAfter = driver.findElements(lDeleteToElement);
       int elementAfterSize = elementAfter.size();
        if(deleteNumberOfButton == elementAfterSize){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }
    }
}
