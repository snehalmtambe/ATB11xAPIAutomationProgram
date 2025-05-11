package org.example.ex_04_Restassured_Http_methods.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab08_Non_BDDStyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;


    @Test
    public void test_GET_NonBDD_Positive()
    {
        String pin = "400081";

        //Given
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/in/"+pin);

        //When
        response = r.when().log().all().get();
        System.out.println(response.toString());

        //Then
        vr = response.then().log().all();
        vr.statusCode(200);
    }

    @Test
    public void test_GET_NonBDD_Negative()
    {
        String pin = "@";

        //Given
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/in/"+pin);

        //When
        response = r.when().log().all().get();
        System.out.println(response.toString());

        //Then
        vr = response.then().log().all();
        vr.statusCode(200);
    }

    @Test
    public void test_GET_NonBDD_Negative1()
    {
        String pin = " ";

        //Given
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/in/"+pin);

        //When
        response = r.when().log().all().get();
        System.out.println(response.toString());

        //Then
        vr = response.then().log().all();
        vr.statusCode(200);
    }

}

