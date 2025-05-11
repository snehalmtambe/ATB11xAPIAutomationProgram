package org.example.ex_04_Restassured_Http_methods.GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_Lab07_BDDStyle {


    @Test
    public void test_GET_POSITIVE()
    {
        String zipcode = "400081";

        RestAssured
                .given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/in/"+zipcode)
                .when()
                    .log()
                    .all()
                    .get()
                .then()
                    .log().all().statusCode(200);
    }
    
}
