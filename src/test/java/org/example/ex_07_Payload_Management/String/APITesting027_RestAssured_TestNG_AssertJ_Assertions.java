package org.example.ex_07_Payload_Management.String;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class APITesting027_RestAssured_TestNG_AssertJ_Assertions {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    String token;
    String payload;
    Integer booking_id;


    // https://restful-booker.herokuapp.com/booking
    //

    @Owner("Snehal")
    @Description("TC#1 - Verify whether booking created successfully or not")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void test_booking()
    {


        payload = "{\n" +
                "    \"firstname\" : \"Jim\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
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
        r.basePath("/booking");
        r.contentType(ContentType.JSON);
        r.body(payload).log().all();

        response = r.when().log().all().post();

        vr = response.then().log().all().statusCode(200);

        vr.body("bookingid", Matchers.notNullValue());
        vr.body("booking.firstname", Matchers.equalTo("Jim"));
        vr.body("booking.lastname", Matchers.equalTo("Brown"));

        //TestNG extract the details of firstname, lastname and booking id

       // booking_id = response.then().extract().path("booking");
        booking_id = response.jsonPath().get("booking");
        String firstname = response.then().extract().path("booking.firstname");
        String lastname = response.then().extract().path("booking.lastname");

        Assert.assertEquals(firstname, "Jim");
        Assert.assertEquals(lastname, "Brown");
        Assert.assertNotNull(booking_id);

        //AssertJ
        assertThat(booking_id).isNotNull().isNotZero().isPositive();
        assertThat(firstname).isEqualTo("Jim").isNotBlank().isNotEmpty();
        assertThat(lastname).isEqualTo("Bbrown").isNotBlank().isNotEmpty();


    }

}
