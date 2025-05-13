package org.example.ex_05_TestNG_examples;

import org.testng.annotations.*;

public class APITesting023_TestNG_Annotations {

    @BeforeSuite
    public void demo1()
    {
        System.out.println("Before suite");
    }

    @BeforeTest
    public void demo2()
    {
        System.out.println("Before Test");
    }

    @BeforeClass
    public void demo3()
    {
        System.out.println("Before class");
    }

    @BeforeMethod
    public void demo4()
    {
        System.out.println("Before method");
    }

    @Test
    public void test()
    {
        System.out.println("Actual test method");
    }

    @AfterMethod
    public void demo5()
    {
        System.out.println("After method");
    }

    @AfterClass
    public void demo6()
    {
        System.out.println("After class");
    }

    @AfterTest
    public void demo7()
    {
        System.out.println("After Test");
    }

    @AfterSuite
    public void demo8()
    {
        System.out.println("After Suite");
    }
}
