
Feature: Employee Rest Api requests


  Scenario: Post an Employee method test

    Given Content type and Accept type is Json
    When I post a new Employee with "random" id
    Then Status code is 201
    And response Json should contain Employee info
    When I send a Get request with "random" id
    Then Status code is 200
    And employee Json Response Data should match the posted Json data

  @ApiPost
   Scenario: Post an Employee and Verify in UI

     Given Content type and Accept type is Json
     When I post a new Employee with "random" id
     Then Status code is 201
     And response Json should contain Employee info
     And I am on DeptEmpPage
     And I search for Employee with "random" id
     Then UI search results must match API post employee data
