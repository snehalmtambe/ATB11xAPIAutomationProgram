package org.example.ex_02_RA_Concepts;

import io.restassured.RestAssured;

public class APITesting_Lab05_Multiple_Testcase {
    public static void main(String[] args) {
        String pincode;

        pincode= "400081";
        RestAssured
                .given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/in/"+pincode)
                .when()
                    .get()
                .then()
                    .log().all().statusCode(200);

        pincode = "@";
        RestAssured
                .given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/in/"+pincode)
                .when()
                    .get()
                    .then()
                .log().all().statusCode(200);

        pincode = " ";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/in/"+pincode)
                .when()
                .get()
                .then()
                .log().all().statusCode(200);
    }
}
