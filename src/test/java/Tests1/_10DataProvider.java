package Tests1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.ParentClass;
import static Locators.LocatorsClass.*;

public class _10DataProvider extends ParentClass {

    @Test(dataProvider = "getData")
    public void loginTest(String email, String password){

        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
        driver.findElement(lemail).clear();
        sendKeysTo(lemail,email);
        driver.findElement(lpassword).clear();
        sendKeysTo(lpassword,password);
        clickTo(lLoginButton);
    }
    @DataProvider
    public Object[][] getData(){
        Object[][] data = {
                {"ahmet@sdf","abc"},
                {"ayse@sads","xyx"},
                {"mehent@vcd","bcfd"},
                {"testngkurs@gmail.com","testngkurs"}


        };
        return data;
    }


}
