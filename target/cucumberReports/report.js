$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/datatableSO.feature");
formatter.feature({
  "name": "Testing datatables website",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@datatableSO,"
    },
    {
      "name": "@smoke"
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
      "name": "@datatableSO,"
    },
    {
      "name": "@smoke"
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
      "name": "@datatableSO,"
    },
    {
      "name": "@smoke"
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
      "name": "@datatableSO,"
    },
    {
      "name": "@smoke"
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
formatter.uri("src/test/resources/features/wiki.feature");
formatter.feature({
  "name": "Wikipedia search feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Wikipedia search test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wiki,"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Wikipedia homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "WikiSteps.user_is_on_Wikipedia_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters steve jobs to search bar and clicks enter",
  "keyword": "When "
});
formatter.match({
  "location": "WikiSteps.user_enters_steve_jobs_to_search_bar_and_clicks_enter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see the first header is displaying steve jobs",
  "keyword": "Then "
});
formatter.match({
  "location": "WikiSteps.user_should_see_the_first_header_is_displaying_steve_jobs()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/features/youtube.feature");
formatter.feature({
  "name": "YouTube search",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@youtube,"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.background({
  "name": "User is on the homepage and is able to see searchbox and search button",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the youtube homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "YoutubeSteps.user_is_on_the_youtube_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to see the search box",
  "keyword": "And "
});
formatter.match({
  "location": "YoutubeSteps.user_is_able_to_see_the_search_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to see the search button",
  "keyword": "And "
});
formatter.match({
  "location": "YoutubeSteps.user_is_able_to_see_the_search_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.InvalidSelectorException: invalid selector: Unable to locate an element with the xpath expression //button[@id\u003dsearch-icon-legacy\u0027] because of the following error:\nSyntaxError: Failed to execute \u0027evaluate\u0027 on \u0027Document\u0027: The string \u0027//button[@id\u003dsearch-icon-legacy\u0027]\u0027 is not a valid XPath expression.\n  (Session info: chrome\u003d76.0.3809.132)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/invalid_selector_exception.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-JIDCRVM\u0027, ip: \u002710.0.0.206\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 76.0.3809.132, chrome: {chromedriverVersion: 76.0.3809.126 (d80a294506b4..., userDataDir: C:\\Users\\Sovet\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:60091}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: e27795587281ca74c91a6ceabb1cf8f7\n*** Element info: {Using\u003dxpath, value\u003d//button[@id\u003dsearch-icon-legacy\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy16.isDisplayed(Unknown Source)\r\n\tat steps.YoutubeSteps.user_is_able_to_see_the_search_button(YoutubeSteps.java:27)\r\n\tat ✽.User is able to see the search button(src/test/resources/features/youtube.feature:8)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Testing youtube search",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@youtube,"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User searches for FUNNY VAT VIDEOS",
  "keyword": "When "
});
formatter.match({
  "location": "YoutubeSteps.user_searches_for_FUNNY_VAT_VIDEOS()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should see results related to funny cat videos",
  "keyword": "Then "
});
formatter.match({
  "location": "YoutubeSteps.user_should_see_results_related_to_funny_cat_videos()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User is on the homepage and is able to see searchbox and search button",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the youtube homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "YoutubeSteps.user_is_on_the_youtube_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to see the search box",
  "keyword": "And "
});
formatter.match({
  "location": "YoutubeSteps.user_is_able_to_see_the_search_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to see the search button",
  "keyword": "And "
});
formatter.match({
  "location": "YoutubeSteps.user_is_able_to_see_the_search_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.InvalidSelectorException: invalid selector: Unable to locate an element with the xpath expression //button[@id\u003dsearch-icon-legacy\u0027] because of the following error:\nSyntaxError: Failed to execute \u0027evaluate\u0027 on \u0027Document\u0027: The string \u0027//button[@id\u003dsearch-icon-legacy\u0027]\u0027 is not a valid XPath expression.\n  (Session info: chrome\u003d76.0.3809.132)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/invalid_selector_exception.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-JIDCRVM\u0027, ip: \u002710.0.0.206\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 76.0.3809.132, chrome: {chromedriverVersion: 76.0.3809.126 (d80a294506b4..., userDataDir: C:\\Users\\Sovet\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:60091}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: e27795587281ca74c91a6ceabb1cf8f7\n*** Element info: {Using\u003dxpath, value\u003d//button[@id\u003dsearch-icon-legacy\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy16.isDisplayed(Unknown Source)\r\n\tat steps.YoutubeSteps.user_is_able_to_see_the_search_button(YoutubeSteps.java:27)\r\n\tat ✽.User is able to see the search button(src/test/resources/features/youtube.feature:8)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Testing youtube search",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@youtube,"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User searches for FUNNY dog VIDEOS",
  "keyword": "When "
});
formatter.match({
  "location": "YoutubeSteps.user_searches_for_FUNNY_dog_VIDEOS()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should see results related to funny dog videos",
  "keyword": "Then "
});
formatter.match({
  "location": "YoutubeSteps.user_should_see_results_related_to_funny_dog_videos()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User is on the homepage and is able to see searchbox and search button",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the youtube homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "YoutubeSteps.user_is_on_the_youtube_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to see the search box",
  "keyword": "And "
});
formatter.match({
  "location": "YoutubeSteps.user_is_able_to_see_the_search_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is able to see the search button",
  "keyword": "And "
});
formatter.match({
  "location": "YoutubeSteps.user_is_able_to_see_the_search_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.InvalidSelectorException: invalid selector: Unable to locate an element with the xpath expression //button[@id\u003dsearch-icon-legacy\u0027] because of the following error:\nSyntaxError: Failed to execute \u0027evaluate\u0027 on \u0027Document\u0027: The string \u0027//button[@id\u003dsearch-icon-legacy\u0027]\u0027 is not a valid XPath expression.\n  (Session info: chrome\u003d76.0.3809.132)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/invalid_selector_exception.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-JIDCRVM\u0027, ip: \u002710.0.0.206\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 76.0.3809.132, chrome: {chromedriverVersion: 76.0.3809.126 (d80a294506b4..., userDataDir: C:\\Users\\Sovet\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:60091}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: e27795587281ca74c91a6ceabb1cf8f7\n*** Element info: {Using\u003dxpath, value\u003d//button[@id\u003dsearch-icon-legacy\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy16.isDisplayed(Unknown Source)\r\n\tat steps.YoutubeSteps.user_is_able_to_see_the_search_button(YoutubeSteps.java:27)\r\n\tat ✽.User is able to see the search button(src/test/resources/features/youtube.feature:8)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Testing youtube search",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@youtube,"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User searches for FUNNY pet VIDEOS",
  "keyword": "When "
});
formatter.match({
  "location": "YoutubeSteps.user_searches_for_FUNNY_pet_VIDEOS()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User should see results related to funny pet videos",
  "keyword": "Then "
});
formatter.match({
  "location": "YoutubeSteps.user_should_see_results_related_to_funny_pet_videos()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "status": "passed"
});
});