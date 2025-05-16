package org.example.ex_07_Payload_Management.Hashmap;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;


public class APITesting028_Payloadusing_Hashmap {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    String paylod;
    Integer Bookingid;

//    {
//        "firstname" : "Jim",
//            "lastname" : "Brown",
//            "totalprice" : 111,
//            "depositpaid" : true,
//            "bookingdates" : {
//        "checkin" : "2018-01-01",
//                "checkout" : "2019-01-01"
//    },
//        "additionalneeds" : "Breakfast"
//    }

    //Hashmap -> Key and value
    @Test
    public void test_Post()
    {

        Map<String,Object> jsonBodyUsingMap = new LinkedHashMap<>();
        jsonBodyUsingMap.put("firstname","Scott");
        jsonBodyUsingMap.put("lastname","Brown");
        jsonBodyUsingMap.put("totalprice",100);
        jsonBodyUsingMap.put("depositpaid", true);

        Map<String,Object> bookingDateMap = new LinkedHashMap<>();
        bookingDateMap.put("checkin","2018-01-01");
        bookingDateMap.put("checkout","2019-01-01");

        jsonBodyUsingMap.put("bookingdates",bookingDateMap);
        jsonBodyUsingMap.put("additionalneeds","breakfast");

        System.out.println(jsonBodyUsingMap);

        // Hashmap to Json
        // 1. gson
        // 2. jackson

        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking");
        r.contentType(ContentType.JSON);
        r.body(jsonBodyUsingMap);

        response = r.log().all().when().post();

        vr = response.then().log().all().statusCode(200);

        System.out.println(vr);









}
}
