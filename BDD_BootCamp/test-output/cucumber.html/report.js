$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("What_Can_I_Afford.feature");
formatter.feature({
  "line": 1,
  "name": "What can i afford Calc",
  "description": "",
  "id": "what-can-i-afford-calc",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "user should be able to calculate the ideal range for buying a car",
  "description": "",
  "id": "what-can-i-afford-calc;user-should-be-able-to-calculate-the-ideal-range-for-buying-a-car",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user navigates to the Edmunds Calculator webapp page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters \"\u003cmonthly_payment\u003e\" in the what can i afford field",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks the Go button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is navigated to the calculators affordability",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user enters the \"\u003czipcode\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user enters \"\u003ccash_down_payment\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user clicks calculate button",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "what-can-i-afford-calc;user-should-be-able-to-calculate-the-ideal-range-for-buying-a-car;",
  "rows": [
    {
      "cells": [
        "monthly_payment",
        "zipcode"
      ],
      "line": 16,
      "id": "what-can-i-afford-calc;user-should-be-able-to-calculate-the-ideal-range-for-buying-a-car;;1"
    },
    {
      "cells": [
        "350",
        "22042",
        "5000"
      ],
      "line": 17,
      "id": "what-can-i-afford-calc;user-should-be-able-to-calculate-the-ideal-range-for-buying-a-car;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 36939695947,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "user should be able to calculate the ideal range for buying a car",
  "description": "",
  "id": "what-can-i-afford-calc;user-should-be-able-to-calculate-the-ideal-range-for-buying-a-car;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user navigates to the Edmunds Calculator webapp page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters \"350\" in the what can i afford field",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks the Go button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is navigated to the calculators affordability",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user enters the \"22042\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user enters \"\u003ccash_down_payment\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user clicks calculate button",
  "keyword": "Then "
});
formatter.match({
  "location": "What_Can_I_Afford_Feature.userNavigatesToCalcApp()"
});
formatter.result({
  "duration": 136794646,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d55.0.2883.75)\n  (Driver info: chromedriver\u003d2.25.426935 (820a95b0b81d33e42712f9198c215f703412e1a1),platform\u003dMac OS X 10.12.6 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.7.1\u0027, revision: \u00278a0099a\u0027, time: \u00272017-11-06T21:01:39.354Z\u0027\nSystem info: host: \u0027Samis-MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:98:15f6:1c39:fd8e%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.12.6\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptSslCerts: true, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.25.426935 (820a95b0b81d33..., userDataDir: /var/folders/np/61dbzy9x4vz...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, rotatable: false, takesHeapSnapshot: true, takesScreenshot: true, version: 55.0.2883.75, webStorageEnabled: true}\nSession ID: fa0ac4acbe7b3d0421e56363fe123329\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:657)\n\tat org.openqa.selenium.remote.RemoteWebDriver.getTitle(RemoteWebDriver.java:328)\n\tat stepDefinitons.What_Can_I_Afford_Feature.userNavigatesToCalcApp(What_Can_I_Afford_Feature.java:41)\n\tat ✽.Given user navigates to the Edmunds Calculator webapp page(What_Can_I_Afford.feature:6)\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "350",
      "offset": 13
    }
  ],
  "location": "What_Can_I_Afford_Feature.userEntersMonthlyPayment(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "What_Can_I_Afford_Feature.userClicksGo()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "What_Can_I_Afford_Feature.user_is_navigated_to_the_calculators_affordability()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "22042",
      "offset": 17
    }
  ],
  "location": "What_Can_I_Afford_Feature.user_enters_Zipcode(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003ccash_down_payment\u003e",
      "offset": 13
    }
  ],
  "location": "What_Can_I_Afford_Feature.userEntersCashDownPayment(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "What_Can_I_Afford_Feature.user_clicks_calculate_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 79980255,
  "status": "passed"
});
});