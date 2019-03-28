package Android.testNGdemo;

import org.testng.annotations.*;

public class app1 {
    @BeforeSuite
    public void beforesuite(){

        System.out.println("beforesuite");
    }

    @BeforeClass
    public void beforeClass(){

        System.out.println("beforeClass");


    }
    @BeforeGroups
    public void beforeGroups(){

        System.out.println("beforeGroups");

    }
    @BeforeMethod
    public void beforeMethod(){

        System.out.println("beforeMethod");

    }
    @BeforeTest
    public void beforeTest(){

        System.out.println("beforeTest");

    }
    @Test
    public void TestApp(){

        System.out.println("TestApp1");

    }


}
