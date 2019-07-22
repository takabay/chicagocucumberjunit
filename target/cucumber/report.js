$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/datatableSO.feature");
formatter.feature({
  "name": "Testing datatables website",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@datatableSO"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Testing adding new emoloyee to the table",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on the datatables hompeage",
  "keyword": "Given "
});
formatter.step({
  "name": "User clicks to New Button",
  "keyword": "And "
});
formatter.step({
  "name": "User should see Create New Entry Box",
  "keyword": "Then "
});
formatter.step({
  "name": "User should enter firstName \"\u003cfirstname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should enter lastName \"\u003clastname\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User should enter position",
  "keyword": "And "
});
formatter.step({
  "name": "User should enter office",
  "keyword": "And "
});
formatter.step({
  "name": "User should enter extension",
  "keyword": "And "
});
formatter.step({
  "name": "User should enter start date",
  "keyword": "And "
});
formatter.step({
  "name": "User should enter salary",
  "keyword": "And "
});
formatter.step({
  "name": "User should click to create button",
  "keyword": "Then "
});
formatter.step({
  "name": "User enters first name \"\u003cfirstname\u003e\" to search box",
  "keyword": "And "
});
formatter.step({
  "name": "User should see first name \"\u003cfirstname\u003e\" is inserted in the table",
  "keyword": "Then "
});
formatter.examples({
  "name": "Test data for datatables",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname"
      ]
    },
    {
      "cells": [
        "joe",
        "lee"
      ]
    },
    {
      "cells": [
        "Erbol",
        "Kerimbay"
      ]
    },
    {
      "cells": [
        "sovet",
        "Abdykaiymov"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Testing adding new emoloyee to the table",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@datatableSO"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the datatables hompeage",
  "keyword": "Given "
});
formatter.match({
  "location": "DatatablesSteps.user_is_on_the_datatables_hompeage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks to New Button",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesSteps.user_clicks_to_New_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see Create New Entry Box",
  "keyword": "Then "
});
formatter.match({
  "location": "DatatablesSteps.user_should_see_Create_New_Entry_Box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter firstName \"joe\"",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesSteps.user_should_enter_firstName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter lastName \"lee\"",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesSteps.user_should_enter_lastName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter position",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesSteps.user_should_enter_position()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter office",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesSteps.user_should_enter_office()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter extension",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesSteps.user_should_enter_extension()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter start date",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesSteps.user_should_enter_start_date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter salary",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesSteps.user_should_enter_salary()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click to create button",
  "keyword": "Then "
});
formatter.match({
  "location": "DatatablesSteps.user_should_click_to_create_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters first name \"joe\" to search box",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesSteps.user_enters_first_name_to_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see first name \"joe\" is inserted in the table",
  "keyword": "Then "
});
formatter.match({
  "location": "DatatablesSteps.user_should_see_first_name_is_inserted_in_the_table(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing adding new emoloyee to the table",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@datatableSO"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the datatables hompeage",
  "keyword": "Given "
});
formatter.match({
  "location": "DatatablesSteps.user_is_on_the_datatables_hompeage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks to New Button",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesSteps.user_clicks_to_New_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see Create New Entry Box",
  "keyword": "Then "
});
formatter.match({
  "location": "DatatablesSteps.user_should_see_Create_New_Entry_Box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter firstName \"Erbol\"",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesSteps.user_should_enter_firstName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter lastName \"Kerimbay\"",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesSteps.user_should_enter_lastName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter position",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesSteps.user_should_enter_position()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter office",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesSteps.user_should_enter_office()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter extension",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesSteps.user_should_enter_extension()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter start date",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesSteps.user_should_enter_start_date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter salary",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesSteps.user_should_enter_salary()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click to create button",
  "keyword": "Then "
});
formatter.match({
  "location": "DatatablesSteps.user_should_click_to_create_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters first name \"Erbol\" to search box",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesSteps.user_enters_first_name_to_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see first name \"Erbol\" is inserted in the table",
  "keyword": "Then "
});
formatter.match({
  "location": "DatatablesSteps.user_should_see_first_name_is_inserted_in_the_table(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing adding new emoloyee to the table",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@datatableSO"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the datatables hompeage",
  "keyword": "Given "
});
formatter.match({
  "location": "DatatablesSteps.user_is_on_the_datatables_hompeage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks to New Button",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesSteps.user_clicks_to_New_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see Create New Entry Box",
  "keyword": "Then "
});
formatter.match({
  "location": "DatatablesSteps.user_should_see_Create_New_Entry_Box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter firstName \"sovet\"",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesSteps.user_should_enter_firstName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter lastName \"Abdykaiymov\"",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesSteps.user_should_enter_lastName(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter position",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesSteps.user_should_enter_position()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter office",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesSteps.user_should_enter_office()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter extension",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesSteps.user_should_enter_extension()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter start date",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesSteps.user_should_enter_start_date()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enter salary",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesSteps.user_should_enter_salary()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click to create button",
  "keyword": "Then "
});
formatter.match({
  "location": "DatatablesSteps.user_should_click_to_create_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters first name \"sovet\" to search box",
  "keyword": "And "
});
formatter.match({
  "location": "DatatablesSteps.user_enters_first_name_to_search_box(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see first name \"sovet\" is inserted in the table",
  "keyword": "Then "
});
formatter.match({
  "location": "DatatablesSteps.user_should_see_first_name_is_inserted_in_the_table(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});