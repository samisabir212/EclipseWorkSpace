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
  "duration": 6031438951,
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
  "duration": 89465581,
  "status": "passed"
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
  "duration": 101079344,
  "status": "passed"
});
formatter.match({
  "location": "What_Can_I_Afford_Feature.userClicksGo()"
});
formatter.result({
  "duration": 2985705086,
  "status": "passed"
});
formatter.match({
  "location": "What_Can_I_Afford_Feature.user_is_navigated_to_the_calculators_affordability()"
});
formatter.result({
  "duration": 28442400,
  "status": "passed"
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
  "duration": 144519056,
  "status": "passed"
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
  "duration": 77570033,
  "status": "passed"
});
formatter.match({
  "location": "What_Can_I_Afford_Feature.user_clicks_calculate_button()"
});
formatter.result({
  "duration": 60871051,
  "status": "passed"
});
formatter.after({
  "duration": 80729616,
  "status": "passed"
});
});