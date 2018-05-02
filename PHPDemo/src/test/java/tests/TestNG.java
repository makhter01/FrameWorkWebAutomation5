package tests;

import org.testng.annotations.*;

public class TestNG {

       @Test
    public void test1(){
           System.out.println("this is test annotation");

    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("before class annotations"); // this will run first
    }

    @AfterClass
    public void afterclass(){
        System.out.println("after class anotations"); // this will run last
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("after method annoattions"); // this will run after each method
    }

    @BeforeMethod
    public void beforemethod(){
        System.out.println("before method annoations");
    }

    @BeforeTest
    public void beforetest(){
        System.out.println("before test annoations"); // this will run before each test
    }

    @AfterTest
    public void aftertest(){
        System.out.println("after test annoations");
    }

}
