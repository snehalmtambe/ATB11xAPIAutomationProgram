package org.example.ex_05_TestNG_examples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class APITesting015_before_test {

    @BeforeTest
    public void getToken()
    {
        System.out.println("Before booking get token");

    }

    @BeforeTest
    public void getBookingID()
    {
        System.out.println("before booking we need to get booking ID");

    }

    @Test
    public void test_PUT()
    {
        System.out.println("Put method");

    }

    @AfterTest
    public void closeAllThing()
    {
        System.out.println("Close all connection");


    }




}
