package org.example.ex_01_RA_Basics;

import io.restassured.RestAssured;

import java.util.Scanner;

public class APITesting_Lab_01RA_Zipcode {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("PLease enter Zipcode");
        String zipcode = sc.next();

        RestAssured.given()
                        .baseUri("https://api.zippopotam.us")
                        .basePath("/in/"+zipcode)
                    .when()
                        .get()
                    .then()
                        .log().all().statusCode(200);

    }
}
