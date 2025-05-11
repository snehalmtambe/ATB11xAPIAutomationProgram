package org.example.ex_04_Restassured_Http_methods.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class APITesting_Lab10_POST_BDDStyle {

    @Test
    public void test_Post_Auth() {
//        curl -X POST \
//        https://restful-booker.herokuapp.com/auth \
//        -H 'Content-Type: application/json' \
//        -d '{
//        "username" : "admin",
//        "password" : "password123"
//    }
        String payload = "{\n" +
                "      \"username\" : \"admin\",\n" +
                "        \"password\" : \"password123\"\n" +
                "    }";
        RestAssured
                .given()
                    .baseUri("https://restful-booker.herokuapp.com")
                    .basePath("/auth")
                    .contentType(ContentType.JSON)
                    .log()
                    .all()
                    .body(payload)
                .when()
                    .log().all()
                    .post()
                .then().log().all()
                .statusCode(200);



    }

    
}
