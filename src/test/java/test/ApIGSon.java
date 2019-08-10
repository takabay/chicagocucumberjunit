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

    @Test
    public void warmUp(){
      Response response =  given().accept(ContentType.JSON)
         .and().params("limit", 10)
         .when().get("http://34.223.219.142:1212/ords/hr/regions");
      assertEquals(response.getStatusCode(),200);
   //   JsonPath json = response.jsonPath();
    //  assertEquals(json.getInt("items[0].region_id"),1);
    //  assertEquals(json.getString("item[0].region_name"),"Europe");
    //  assertEquals(json.getInt("items[1].region_id"),2);
    //  assertEquals(json.getString("items[1].region_name"),"Americas");
 //same thing differently=======================================================
        JsonPath json = response.jsonPath();
      //  deserialize json to List <Map>
         List<Map> regions = json.getList("items",Map.class) ;

         Map<Integer,String> expectedRegions = new HashMap<>();
         expectedRegions.put(1,"Europe");
         expectedRegions.put(2,"Americas");
         expectedRegions.put(3,"Asia");
         expectedRegions.put(4,"Middle East and Africa");

        for (Integer regionId: expectedRegions.keySet()){
            for(Map map : regions){
                if (map.get("region_id")==regionId){
                    assertEquals(map.get("region_name"),expectedRegions.get(regionId));
          //same thing differently
          for (int i =0; i< regions.size();i++){
             assertEquals(regions.get(i).get("region_id"), i+1);
             assertEquals(regions.get(i).get("region_name"), expectedRegions.get(i+1));
          }
                }
        }
        }








    }

}
