package Tests1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _11SoftAsertVHardAssert {

    /**
     * Hard assert --> fail olduğu anda çalışmayı bırakır.
     * Soft assert --> soft assert ise devam eder.
     */

    @Test
    public void hardAssert(){

        String s1 = "Merhaba";
        System.out.println("hard assert öncesi");
        Assert.assertEquals("Merhaba123",s1); //fail oldu
        System.out.println("kod bitti");
    }
    @Test
    public void softAssert(){

        String str1 = "merhaba dünya";
        String str2 = "şampiyon galatasaray";
        String str3 = "hukukun üstünlüğü";


        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("merhaba dünya",str1);
        System.out.println("assert1");

        softAssert.assertEquals("şampiyon fener",str2);
        System.out.println("assert2");

        softAssert.assertEquals("hukukun üstünlüğü", str3);
        System.out.println("assert3");

        softAssert.assertAll(); //tüm assertleri aktif ediyor.
        System.out.println("kod bitişi");

    }
}
