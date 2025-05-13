package org.example.ex_06_TestAssertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.sql.SQLOutput;

public class APITesting026_TestNGAssertions {

    @Test(enabled = false)
    public void hardAssertion()
    {
        System.out.println("start of the program");
        Boolean is_neeru_male = false;
        Assert.assertEquals("snehal", "Snehal");
        System.out.println("End of the program");

    }

    @Test
    public void softAssert()
    {
        SoftAssert sa = new SoftAssert();
        System.out.println("Start of the program");
        sa.assertEquals("snehal", "Snehal");
        System.out.println("End of the program");
        sa.assertAll();

    }


}
