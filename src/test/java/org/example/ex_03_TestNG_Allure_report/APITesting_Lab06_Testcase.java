package org.example.ex_03_TestNG_Allure_report;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_Lab06_Testcase {

    String pincode;

    @Test
    public void test_GET_POSITIVE_tc1()
    {
        pincode = "400081";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/in/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }

    @Test
    public void test_GET_NEGATIVE_tc2() {
        pincode = "@";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/in/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }

    @Test
    public void test_GET_NEGATIVE_tc3() {
        pincode = " ";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/in/" + pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }

}

