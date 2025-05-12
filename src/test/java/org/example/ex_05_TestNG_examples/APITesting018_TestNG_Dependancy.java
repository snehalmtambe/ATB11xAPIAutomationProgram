package org.example.ex_05_TestNG_examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting018_TestNG_Dependancy {

    @Test
    public void serverStartedOk()
    {
        System.out.println("I will start the server first");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "serverStartedOk")
    public void t1()
    {
        System.out.println("method 1");
        Assert.assertTrue(true);
    }

    @Test(dependsOnMethods = "serverStartedOk")
    public void t2()
    {
        System.out.println("method 2");
        Assert.assertTrue(true);
    }


}
