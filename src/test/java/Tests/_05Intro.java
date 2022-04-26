package Tests;

import org.testng.Assert;
import org.testng.annotations.*;

public class _05Intro {

    @BeforeSuite
    public void bSuite(){
        System.out.println("before suit");
    }
    @BeforeTest
    public void bTest(){
        System.out.println("before test");
    }
    @BeforeGroups
    public void bGroup(){
        System.out.println("before group");
    }
    @BeforeClass
    public void bClass(){
        System.out.println("before class");
    }
    @BeforeTest
    public void bMethod(){
        System.out.println("before methot");
    }
    @Test
    public void testIntro1(){
        System.out.println("test 1");

    }
    @Test
    public void testIntro2(){
        System.out.println("test 2");
    }
    @AfterMethod
    public void aMethot(){
        System.out.println("after methot");
    }
    @AfterClass
    public void aClass(){
        System.out.println("after class");
    }
    @AfterGroups
    public void aGroups(){
        System.out.println("after groups");
    }
    @AfterTest
    public void aTest(){
        System.out.println("after test");
    }
    @AfterSuite
    public void asuite(){
        System.out.println("after suite");
    }
}
