package test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class HRRestApiGetRequests {
    /*
  When I send a Get request to Rest Url http:://34.223.219.142:1212/ords/hr/employees
  Then response status should be 200
  */

    @Test
    public void simpleGet(){
          when()
           .get("http:://34.223.219.142:1212/ords/hr/employees")
           .then().statusCode(200);

    }

    /*
    When I send a Get request to Rest Url http:://34.223.219.142:1212/ords/hr/countries
    Then Response status should be 200
    Then I should see JSON Response
     */
    @Test
    public void printResponse(){
        when().get("http:://34.223.219.142:1212/ords/hr/countries")
                .body().prettyPrint();

    }
    /*
    When I send a Get request to Rest Api Url
    http://34.223.219.142:1212/ords/hr/countries/US
    And Accept type is "application/json"
    Then response status code should be 200
    */
    @Test
    public void getWitheaders(){
        with().accept(ContentType.JSON)
        .when().get("http://34.223.219.142:1212/ords/hr/countries/US")
         .then().statusCode(200);
    }

      /*When I send a Get request to Rest Url;
      http://34.223.219.142:1212/ords/hr/employees/1234
      then status code is 404
      And response body error message is "Not Found"
       */
      @Test
      public void negativeScenario(){
       //   when().get("http://34.223.219.142:1212/ords/hr/employees/1234")
         //         .then().statusCode(404);
          Response response = when().get("http://34.223.219.142:1212/ords/hr/employees/1234");
          assertEquals(response.statusCode(),404);
          assertTrue(response.asString().contains("Not Found"));
          response.prettyPrint();

      }

      //When I send a Get request to Rest Url;
      //http://34.223.219.142:1212/ords/hr/employees/100
      //and Accept type is json
     // then status code is 200
     // And response content should be json
      //WITH, WHEN, GET, ASSERTTHAT, ACCEPT,CONTENTTYPE

    @Test
    public void VerifyContentTypeWithAssertThat(){
     given().accept(ContentType.JSON)
             .when().get("http://34.223.219.142:1212/ords/hr/employees/100")
             .then().assertThat().statusCode(200)
             .and().contentType(ContentType.JSON);
    }
    /*
    Given Accept type is json
    When I send a Get request to Rest Url
    http://34.223.219.142:1212/ords/hr/employees/100
    Then status code is 200
    And Response content should be json
    And first name should be "Steven"
    // And employee id is equal 100
     */
    @Test
  public void verifyFirstName(){
      given().accept(ContentType.JSON)
              .when().get("http://34.223.219.142:1212/ords/hr/employees/100")
              .then().assertThat().statusCode(200)
              .and().contentType(ContentType.JSON)
              .and().assertThat().body("first_name", Matchers.equalTo("Steven"))
              .and().assertThat().body("employee_id",Matchers.equalTo("100"));

  }


}
