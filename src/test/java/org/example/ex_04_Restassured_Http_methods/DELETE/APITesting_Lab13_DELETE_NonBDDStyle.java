package org.example.ex_04_Restassured_Http_methods.DELETE;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab13_DELETE_NonBDDStyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    //Delete
    //booing id
    //cookie

    String booking_id;
    String token;


    @Test
    public void test_DELETE_NonBDD_Positive()
    {
        booking_id = "2210";
        token = "a1218fa4b7d6795";

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/"+booking_id);
        r.contentType(ContentType.JSON);
        r.cookie("token",token);


        response = r.when().log().all().patch();
        System.out.println(response);

        vr = response.then().log().all().statusCode(200);






    }
}
