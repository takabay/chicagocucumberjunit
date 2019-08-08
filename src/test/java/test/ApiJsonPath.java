package test;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;
import utilities.Config;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;

//import static org.hamcrest.*;
public class ApiJsonPath {
    /*
    Given Accept type is Json
    When I send a Get request to Rest url
    http://34.223.219.142:1212/ords/hr/regions
    Then status code is 200
    And Response content should be json
    and for regions should be returned
    And America is one of the region names
   */

    @Test
    public void testItemCountResponseBody(){
        given().accept(ContentType.JSON)
                .when().get(Config.getProperty("hrapp.baseresulturl")+"/regions")
                .then().statusCode(200)
                .and().assertThat().body("items.region_id",hasSize(4))
                .and().assertThat().body("items.region_name", hasItem("Americas"))
                .and().assertThat().body("items.region_name", hasItems("Americas","Asia"));
    }
    /*
    Given Accept type is Json
    And Params are limit 100
    http://34.223.219.142:1212/ords/hr/regions
    Then status code is 200
    And Response content should be json
    And 100 employees data should be in json response body
     */

    @Test
    public void testWithQueryParameterLimit(){
        given().accept(ContentType.JSON)
                .and().params("limit", 100)
                .when().get(Config.getProperty("hrapp.baseresulturl")+"/employees")
                .then().statusCode(200)
                .and().contentType(ContentType.JSON)
                .and().assertThat().body("items.employee_id", hasSize(100));
    }

    /*
    Given Accept type is Json
    And Params are limit=100
    And path param is 110
    When I send get request to
    http://34.223.219.142:1212/ords/hr/empolyees
    Then status code is 200
    And Response content should be json
    And following data should be returned
    "employee_id" : 110,
    "first_name" : "John",
    "last_name" : "Chen",
    "email" : "jChen",

     */

    @Test
    public void testWithPathParameters(){
        given().accept(ContentType.JSON)
                .and().params("limit", 100)
                .and().pathParams("employee_id",110)
                 .when().get(Config.getProperty("hrapp.baseresulturl")+"/employees/{employee_id}")
                 .then().statusCode(200)
                 .and().contentType(ContentType.JSON)
                 .and().assertThat().body("employee_id",equalTo(100),
                                          "first_name",equalTo("john"),
                                           "last_name", equalTo("Chen"));

    }

    /*
    Given Accept type is json
    And Params are limit= 100
    And path param is 110
    when I send get request to
    http://34.223.219.142:1212/ords/hr/empolyees
    Then status code is 200
    And Response content should be json
    all employee ids should be returned

     */
    @Test
    public void testWithJsonPath(){
        Map<String , Integer> rParamMap = new HashMap<>();
        rParamMap.put("limit", 100);

        Response response =
                            given().accept(ContentType.JSON)
                            .and().params(rParamMap)
                            .and().pathParams("employee_id",177)
                    .when().get(Config.getProperty("hrapp.baseresulturl")+"/employees{employee_id}");
        JsonPath json = response.jsonPath();

        System.out.println(json.getInt("employee_id"));
        System.out.println(json.getString("first_name"));
        System.out.println(json.getString("links[0].href"));//get specific element from array
        //assign all hrefs into a list of strings
        List<String> hrefs = json.getList("links.href");

    }

    /*
    Given Accept type is json
    And Params are limit= 100
    when I send get request to
    http://34.223.219.142:1212/ords/hr/empolyees
    Then status code is 200
    And Response content should be json
    all employee ids should be returned

     */
    @Test
   public void testJsonPathWithLists(){

        Map<String , Integer> rParamMap = new HashMap<>();
        rParamMap.put("limit", 100);

        Response response =
                         given().accept(ContentType.JSON)
                        .and().params(rParamMap)
                        .when().get(Config.getProperty("hrapp.baseresulturl")+"/employees");
        assertEquals(response.statusCode(),200);

        JsonPath json = response.jsonPath();
       // JsonPath json = new JsonPath(new File(FilePath.json));
        //JsonPath json = new JsonPath(response.asString());

          //get all employees ids into an arraylist
       List<Integer> employeesIDs = json.getList("items.employee_id");
       //make sure size is correct
       assertEquals(employeesIDs.size(),100);

       //get all employee ids that are greater than 150
        List<String> empIDList = json.getList("items.findAll{it.employee_id>150}.employee_id");

        //get all employees lastname, whose salary is more than 7000

        List<String> empLastName = json.getList("items.findAll{it.salary > 7000}.last_name");


   }






}
