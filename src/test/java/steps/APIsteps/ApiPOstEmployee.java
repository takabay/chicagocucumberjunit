package steps.APIsteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class ApiPOstEmployee {

    RequestSpecification request;
    int employeeId;
    Response response;
    String url = "http://34.223.219.142:1212/ords/hr/employees/";
    Map map;
    Map uiEmployeeSearchMap;

    //HRappSearchPage searchPage = new HrappSearchPage();    I don't have this pages
    //HRappDEptEmpPage deptEmpage = new HRAppDeptEmpPage();
    @Then("I am on DeptEmpPage")
    public void i_am_on_DeptEmpPage() {
      //
    }

    @Then("I search for Employee with {string} id")
    public void i_search_for_Employee_with_id(String id) {
        if (!id.equals("random")){
            employeeId = Integer.parseInt(id);
        }
        //deptEmpPage.query.click();
        //searchPage.empIdSearchField.clear();
        //searchPage.empIdSearchField.sendKeys(String.valueOf(employeeId));
        //searchPage.search.click();
    }

    @Then("UI search results must match API post employee data")
    public void ui_search_results_must_match_API_post_employee_data() {
        uiEmployeeSearchMap = new HashMap();
     //   uiEmployeeSearchMap.put("employee_id",  searchPage.employeeId.gerAttribute("value"));
     //   uiEmployeeSearchMap.put("first_name", searchPage.first_name.getAttribute("value");
        uiEmployeeSearchMap.put("last_name","smith");
           uiEmployeeSearchMap.put("email","EM"+ employeeId);
        uiEmployeeSearchMap.put("phone_number","202.123.4567");   // same thing for all of em
       uiEmployeeSearchMap.put("salary", 24000);

  //now we have to compare posted map to api with new created map from ui
        for (Object key : map.keySet()) {
            assertEquals(uiEmployeeSearchMap.get(key), map.get(key));
        }
    }


    @Given("Content type and Accept type is Json")
    public void content_type_and_Accept_type_is_Json() {
       request= given().accept(ContentType.JSON)
                .and().contentType(ContentType.JSON);
    }

    @When("I post a new Employee with {string} id")
    public void i_post_a_new_Employee_with_id(String id) {
        if(id.equals("random")){
            employeeId = new Random().nextInt(999999);
        }else {
            employeeId = Integer.parseInt(id);
        }
         map = new HashMap<>();
        map.put("employee_id",  employeeId);
        map.put("first_name","lee");
        map.put("last_name","smith");
        map.put("email","EM"+ employeeId);
        map.put("phone_number","202.123.4567");
        map.put("salary", 24000);

        response = request.body(map)
                .when().post(url);

    }

    @Then("Status code is {int}")
    public void Status_code_is(int statusCode) {
        assertEquals(response.statusCode(), statusCode);
    }

    @Then("response Json should contain Employee info")
    public void response_Json_should_contain_Employee_info() {
        Map responseBody = response.body().as(Map.class);
        for (Object key : map.keySet()) {
            assertEquals(map.get(key), responseBody.get(key));
        }
    }

    @When("I send a Get request with {string} id")
    public void i_send_a_Get_request_with_id(String id) {
        if(!id.equals("random")){
            employeeId = Integer.parseInt(id);
        }
        response = given().accept(ContentType.JSON)
                .when().get(url + employeeId);

    }

    @Then("status code is {int}")
    public void status_code_is(int statusCode) {
            assertEquals(response.statusCode(),statusCode);
    }

    @Then("employee Json Response Data should match the posted Json data")
    public void employee_Json_Response_Data_should_match_the_posted_Json_data() {
        Map getResMap = response.body().as(Map.class);

        for (Object key : map.keySet()) {
            assertEquals(getResMap.get(key), map.get(key));
        }

    }
}
