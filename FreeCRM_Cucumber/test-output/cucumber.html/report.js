$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/sami/git/EclipseWorkSpace/FreeCRM_Cucumber/src/main/java/features/contacts.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 3,
      "value": "#with Examples Keyword"
    }
  ],
  "line": 4,
  "name": "Free CRM Login test scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user is already on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user is on the home page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user moves to the new contact page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user enters contacts details \"\u003cfirstname\u003e\" and \"\u003clastname\u003e\" and \"\u003cposition\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user closes the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "firstname",
        "lastname",
        "position"
      ],
      "line": 17,
      "id": "free-crm-login-feature;free-crm-login-test-scenario;;1"
    },
    {
      "cells": [
        "samisabir212",
        "Peoplentech212",
        "sami",
        "sabir",
        "Selenium Automation tester"
      ],
      "line": 18,
      "id": "free-crm-login-feature;free-crm-login-test-scenario;;2"
    },
    {
      "cells": [
        "test",
        "test0001",
        "alfred",
        "pupel",
        "batman butler"
      ],
      "line": 19,
      "id": "free-crm-login-feature;free-crm-login-test-scenario;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 18,
  "name": "Free CRM Login test scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user is already on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters \"samisabir212\" and \"Peoplentech212\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user is on the home page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user moves to the new contact page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user enters contacts details \"sami\" and \"sabir\" and \"Selenium Automation tester\"",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user closes the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.initialize()"
});
formatter.result({
  "duration": 4090568692,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.LoginPageTitle()"
});
formatter.result({
  "duration": 10081311,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "samisabir212",
      "offset": 13
    },
    {
      "val": "Peoplentech212",
      "offset": 32
    }
  ],
  "location": "LoginStepDefinition.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 379405976,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 14528387188,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_the_home_page()"
});
formatter.result({
  "duration": 5727890,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_moves_to_the_new_contact_page()"
});
formatter.result({
  "duration": 1273973965,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sami",
      "offset": 30
    },
    {
      "val": "sabir",
      "offset": 41
    },
    {
      "val": "Selenium Automation tester",
      "offset": 53
    }
  ],
  "location": "LoginStepDefinition.user_enters_contacts_details_and_and(String,String,String)"
});
formatter.result({
  "duration": 601041022,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_closes_the_browser()"
});
formatter.result({
  "duration": 85321135,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Free CRM Login test scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "user is already on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user enters \"test\" and \"test0001\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user is on the home page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user moves to the new contact page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user enters contacts details \"alfred\" and \"pupel\" and \"batman butler\"",
  "matchedColumns": [
    2,
    3,
    4
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user closes the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.initialize()"
});
formatter.result({
  "duration": 3170225656,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.LoginPageTitle()"
});
formatter.result({
  "duration": 6168196,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test",
      "offset": 13
    },
    {
      "val": "test0001",
      "offset": 24
    }
  ],
  "location": "LoginStepDefinition.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 167545218,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 12344093419,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_the_home_page()"
});
formatter.result({
  "duration": 600049485994,
  "error_message": "org.openqa.selenium.TimeoutException: timeout: Timed out receiving message from renderer: 600.000\n  (Session info: chrome\u003d55.0.2883.75)\n  (Driver info: chromedriver\u003d2.26.436421 (6c1a3ab469ad86fd49c8d97ede4a6b96a49ca5f6),platform\u003dMac OS X 10.12.6 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027Samis-MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:1c03:d5df:3b13:11ae%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.12.6\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.26.436421 (6c1a3ab469ad86fd49c8d97ede4a6b96a49ca5f6), userDataDir\u003d/var/folders/np/61dbzy9x4vz7n8t8yvcn0b0w0000gn/T/.org.chromium.Chromium.5icU8e}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, hasTouchScreen\u003dfalse, version\u003d55.0.2883.75, platform\u003dMAC, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dMAC, cssSelectorsEnabled\u003dtrue, unexpectedAlertBehaviour\u003d}]\nSession ID: c62c42b56cc4f6c9fa776914cd95eb48\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:646)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:703)\n\tat org.openqa.selenium.remote.RemoteWebDriver.getTitle(RemoteWebDriver.java:374)\n\tat stepDefinitions.LoginStepDefinition.user_is_on_the_home_page(LoginStepDefinition.java:71)\n\tat ✽.And user is on the home page(/Users/sami/git/EclipseWorkSpace/FreeCRM_Cucumber/src/main/java/features/contacts.feature:10)\n",
  "status": "failed"
});
formatter.match({
  "location": "LoginStepDefinition.user_moves_to_the_new_contact_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "alfred",
      "offset": 30
    },
    {
      "val": "pupel",
      "offset": 43
    },
    {
      "val": "batman butler",
      "offset": 55
    }
  ],
  "location": "LoginStepDefinition.user_enters_contacts_details_and_and(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_closes_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});