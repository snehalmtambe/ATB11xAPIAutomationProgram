package org.example.ex_05_TestNG_examples;

import org.testng.annotations.Test;

public class APITesting017_TestNG_Grouping  {
    @Test(groups = {"sanity","normal"}, priority = 1)
    public void sanity_test()
    {
        System.out.println("This is sanity testing");
    }
    @Test(groups = {"reg","normal"},priority = 2)
    public void reg_test()
    {
        System.out.println("This is regression testing");
    }

    @Test(groups = {"normal"}, priority = 3)
    public void test()
    {
        System.out.println("This is normal test");
    }

}
