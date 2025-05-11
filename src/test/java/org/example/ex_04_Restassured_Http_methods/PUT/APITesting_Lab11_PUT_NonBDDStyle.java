package org.example.ex_04_Restassured_Http_methods.PUT;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab11_PUT_NonBDDStyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    String paylod;
    String booking_id;
    String token;

    //PUT
    //token, booking id;
    //public void get_token()
    //public void get_booking_id()

    @Test
    public void test_PUT_NonBDD_Positive()
    {
        booking_id = "1208";
        token = "cf2dcbb9f64e65b";

        paylod ="{\n" +
                "    \"firstname\" : \"Howard\",\n" +
                "    \"lastname\" : \"Smith\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/"+booking_id);
        r.contentType(ContentType.JSON);
        r.cookie("token",token);
        r.body(paylod);

        response = r.when().log().all().put();
        System.out.println(response);

        vr = response.then().log().all().statusCode(200);






    }
}
