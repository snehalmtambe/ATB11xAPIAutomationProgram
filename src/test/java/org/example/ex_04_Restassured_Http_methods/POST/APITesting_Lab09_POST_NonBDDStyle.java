package org.example.ex_04_Restassured_Http_methods.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_Lab09_POST_NonBDDStyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

//    https://restful-booker.herokuapp.com/auth \
//            -H 'Content-Type: application/json' \
//            -d '{
//            "username" : "admin",
//            "password" : "password123"
//}'
    String paylod;

    @Test
    public void test_POST_POSITIVE()
    {
        paylod ="{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/auth");
        r.contentType(ContentType.JSON);
        r.body(paylod);

        response = r.when().log().all().post();
        System.out.println(response);

        vr = response.then().log().all().statusCode(200);

    }


}
