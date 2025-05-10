package org.example.ex_05_TestNG_examples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting022_TestNG_Invocation {

    @Test(invocationCount = 2)
    public void test1()
    {

        System.out.println("Hi");
    }

    @Test(invocationCount = 3)
    public void test2()
    {
        System.out.println("Bye");
    }

}
