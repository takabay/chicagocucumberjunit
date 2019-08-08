package test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import utilities.Config;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class ApIGSon {

    @Test
    public void testWithGson(){
        Response response = given().accept(ContentType.JSON)
        .when().accept(ContentType.JSON)
         .when().get(Config.getProperty("hrapp.baseresulturl")+"/employees/120");
         Map<String,String> map = response.as(HashMap.class);
        System.out.println(map.keySet());
        System.out.println(map.values());
        assertEquals(map.get("employee_id"),120);
    }

    @Test
    public void convertJsonToListOfMaps(){
        Response response = given().accept(ContentType.JSON)
                .when().get(Config.getProperty("hrapp.baseresulturl")+"/departments");
      //convert the response that contains deparrtment information into listoff maps

       // List<Map<String,String>> listOfMaps = response.as(ArrayList.class);
        List<Map> listOfMaps = response.jsonPath().getList("item",Map.class);
        System.out.println(listOfMaps.get(0));
        //assert that first department name is Administration
        assertEquals(listOfMaps.get(0).get("department_name"),"Administration");
    }

}
