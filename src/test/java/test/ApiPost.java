package test;

import beans.Country;
import beans.CountryResponse;
import beans.Region;
import beans.RegionResponse;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import utilities.Config;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class ApiPost {
    /*
    Post scenario
    given content type is Json
    And Accept type is Json
    When I send Post request to
    http://34.223.219.142:1212/ords/hr/regions/
    with request body:
    {
    "region_id" : 2
    "region_name" : "cook county"
     }
     Then status code should be 200
     And response body should match request body
     */
    @Test
    public void postNewRegions(){
        String url = Config.getProperty("hrapp.baseresulturl")+"/regions/";
    //    String requestBody = "{\"region_id\" : 1, \"region_name\" : \"cook county\"}";
    //better way
        Map requestBody = new HashMap();
        requestBody.put("region_id",1);
        requestBody.put("region_name", "cook county");
    Response response= given().accept(ContentType.JSON)
                     .and().contentType(ContentType.JSON)
                     .and().body(requestBody)
                     .when().post(url);
        System.out.println(response.statusLine());
        response.prettyPrint();
        assertEquals(response.statusCode(),201);

        Map responseMap = response.body().as(Map.class);
        assertEquals(responseMap.get("region_id"),requestBody.get("region_id"));
        assertEquals(responseMap.get("region_name"),requestBody.get("region_name"));
    }

    //same thing with POJO
    @Test
    public void postUsingPOJO(){
        String url = Config.getProperty("hrapp.baseresulturl")+"/regions/";
        Region region = new Region();
        region.setRegionId(new Random().nextInt(999999));
        region.setRegionName("cook county");

        Response response = given().accept(ContentType.JSON)
                            .and().contentType(ContentType.JSON)
                            .and().body(region)
                             .when().post(url);
        assertEquals(response.statusCode(),201);
        RegionResponse responseRegion = response.body().as(RegionResponse.class);
        assertEquals(responseRegion.getRegionId(),region.getRegionId());
        assertEquals(responseRegion.getRegionName(),region.getRegionName());

    }

    //similar scenario with countries table
    @Test
    public void postCountry(){
        String url = Config.getProperty("hrapp.baseresulturl")+"/regions/";
        Country reqCountry = new Country();
        reqCountry.setCountry_id(4);
        reqCountry.setCountry_name("USA");
        reqCountry.setRegion_id("Asia");

        Response response = given().accept(ContentType.JSON)
                            .and().contentType(ContentType.JSON)
                            .and().body(reqCountry) //seriliazing to json
                             .when().post(url);

        assertEquals(response.getStatusCode(),201);
        //deserilizing to java
        CountryResponse resCountry = response.body().as(CountryResponse.class);

        assertEquals(resCountry.getCountry_id(),reqCountry.getCountry_id());
        assertEquals(resCountry.getCountry_name(),reqCountry.getCountry_name());
        assertEquals(resCountry.getRegion_id(),reqCountry.getRegion_id());







    }

}
