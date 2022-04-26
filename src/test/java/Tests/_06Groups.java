package Tests;

import org.testng.annotations.Test;

public class _06Groups {

    @Test(groups = "Regression")
    public void test1(){
        System.out.println("test 1 reression");
    }
    @Test(groups = "Regression")
    public void test2(){
        System.out.println("test 2 regression");
    }
    @Test(groups = "Regression")
    public void test7(){
        System.out.println("test 7 regression");
    }
    @Test(groups = "Regression")
    public void test5(){
        System.out.println("test 5 regression");
    }
    @Test(groups = "SmokeTest")
    public void test3(){
        System.out.println("test 3 smokeTest");
    }
    @Test(groups = "SmokeTest")
    public void test4(){
        System.out.println("test 4 smokeTest");
    }
    @Test
    public void test6(){
        System.out.println("test 6 smokeTest");
    }
    //grup olarak çalıştırıldığında herhangi bir grubu olmayanlar çalışmazlar

}
