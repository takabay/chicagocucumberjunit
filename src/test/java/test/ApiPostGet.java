package test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class ApiPostGet {
    /*
    Given Content type and Accept type is Json
    When I post a new Employee with "122" id
    Then Status code is 201
    And response Json should contain Employee info
    When I send a Get request with "122" id
    Then status code is 200
    And employee Json Response Data should match the posted Json data
     */

    @Test
            public void PostGetVerify() {
        int randomID = new Random().nextInt(999999);
        Map map = new HashMap<>();
        map.put("employee_id", randomID);
        map.put("first_name","lee");
        map.put("last_name","smith");
        map.put("email","EM"+randomID);
        map.put("phone_number","202.123.4567");
        map.put("salary", 24000);
        String url = "http://34.223.219.142:1212/ords/hr/employees/";
    Response response = given().accept(ContentType.JSON)
                .and().contentType(ContentType.JSON)
                .and().body(map)
                .when().post(url);
     assertEquals(response.statusCode(), 201);

     Map responseBody = response.body().as(Map.class);
     for (Object key : map.keySet()) {
         assertEquals(map.get(key), responseBody.get(key));
     }
         //now we have to send get request and validate the response
         response = given().accept(ContentType.JSON)
                 .when().get(url + randomID);

         assertEquals(response.statusCode(), 200);

         Map getResMap = response.body().as(Map.class);

         for (Object key : map.keySet()) {
             assertEquals(getResMap.get(key), map.get(key));


         }
     }
    }

