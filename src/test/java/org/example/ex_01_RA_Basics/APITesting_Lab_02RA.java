package org.example.ex_01_RA_Basics;

import io.restassured.RestAssured;

import java.util.Scanner;

public class APITesting_Lab_02RA {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter zipcode");
        String zp = sc.next();

        RestAssured
                .given()
                   .baseUri("https://api.zippopotam.us")
                   .basePath("/in/"+zp)
                .when()
                    .get()
                .then()
                    .log().all().statusCode(200);



    }
}
