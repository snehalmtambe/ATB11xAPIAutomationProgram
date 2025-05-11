package org.example.ex_04_Restassured_Http_methods.PATCH;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab12_PATCH_NonBDDStyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    String paylod;
    String booking_id;
    String token;

    //Patch
    //token, booking id;
    //public void get_token()
    //public void get_booking_id()

    @Test
    public void test_PATCH_NonBDD_Positive()
    {
        booking_id = "227";
        token = "1d98f54f4172b1c";

        paylod ="{\n" +
                "    \"firstname\" : \"James\",\n" +
                "    \"lastname\" : \"Brown\"\n" +
                "}";

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/"+booking_id);
        r.contentType(ContentType.JSON);
        r.cookie("token",token);
        r.body(paylod);

        response = r.when().log().all().patch();
        System.out.println(response);

        vr = response.then().log().all().statusCode(200);






    }
}
