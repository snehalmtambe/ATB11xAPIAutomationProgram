package org.example.ex_05_TestNG_examples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APITesting019_TestNG_Parameter {

    @Parameters("browser")
    @Test
    public void demo(String browser){
        System.out.println("This is demo function");
        System.out.println("You are running on browser:"+browser);

    }
}
