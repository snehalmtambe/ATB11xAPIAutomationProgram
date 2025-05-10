package org.example.ex_05_TestNG_examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting021_TestNG_AlwaysRun {

    @Test
    public void before_Reg()
    {
        
        Assert.assertTrue(true);
    }

    @Test(alwaysRun = true)
    public void Login()
    {
        
        Assert.assertTrue(true);
    }

    @Test
    public void after_reg()
    {
        Assert.assertTrue(true);

    }

}
