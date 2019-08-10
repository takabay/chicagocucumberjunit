$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/API/post.employee.feature");
formatter.feature({
  "name": "Employee Rest Api requests",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Post an Employee and Verify in UI",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ApiPost"
    }
  ]
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "Content type and Accept type is Json",
  "keyword": "Given "
});
formatter.match({
  "location": "ApiPOstEmployee.content_type_and_Accept_type_is_Json()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I post a new Employee with \"random\" id",
  "keyword": "When "
});
formatter.match({
  "location": "ApiPOstEmployee.i_post_a_new_Employee_with_id(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Status code is 201",
  "keyword": "Then "
});
formatter.match({
  "location": "ApiPOstEmployee.Status_code_is(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "response Json should contain Employee info",
  "keyword": "And "
});
formatter.match({
  "location": "ApiPOstEmployee.response_Json_should_contain_Employee_info()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I am on DeptEmpPage",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I search for Employee with \"random\" id",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "UI search results must match API post employee data",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "skipped"
});
});