$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/sami/git/EclipseWorkSpace/BDD_BootCamp/src/main/java/features/What_Can_I_Afford.feature");
formatter.feature({
  "line": 1,
  "name": "What can i afford Calc",
  "description": "",
  "id": "what-can-i-afford-calc",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "user should be able to calculate the ideal range for buying a car",
  "description": "",
  "id": "what-can-i-afford-calc;user-should-be-able-to-calculate-the-ideal-range-for-buying-a-car",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user navigates to the Edmunds Calculator webapp page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters \"\u003cmonthly_payment\u003e\" in the what can i afford field",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks the Go button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user is navigated to the calculators affordability",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enters the \"\u003czipcode\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user enters \"\u003ccash_down_payment\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks calculate button",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "what-can-i-afford-calc;user-should-be-able-to-calculate-the-ideal-range-for-buying-a-car;",
  "rows": [
    {
      "cells": [
        "monthly_payment",
        "zipcode",
        "cash_down_payment"
      ],
      "line": 15,
      "id": "what-can-i-afford-calc;user-should-be-able-to-calculate-the-ideal-range-for-buying-a-car;;1"
    },
    {
      "cells": [
        "350",
        "22042",
        "5000"
      ],
      "line": 16,
      "id": "what-can-i-afford-calc;user-should-be-able-to-calculate-the-ideal-range-for-buying-a-car;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6375783512,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "user should be able to calculate the ideal range for buying a car",
  "description": "",
  "id": "what-can-i-afford-calc;user-should-be-able-to-calculate-the-ideal-range-for-buying-a-car;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user navigates to the Edmunds Calculator webapp page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters \"350\" in the what can i afford field",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks the Go button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user is navigated to the calculators affordability",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user enters the \"22042\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user enters \"5000\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user clicks calculate button",
  "keyword": "Then "
});
formatter.match({
  "location": "What_Can_I_Afford_Feature.userNavigatesToCalcApp()"
});
formatter.result({
  "duration": 153415194,
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
  "duration": 138606500,
  "status": "passed"
});
formatter.match({
  "location": "What_Can_I_Afford_Feature.userClicksGo()"
});
formatter.result({
  "duration": 842413748,
  "status": "passed"
});
formatter.match({
  "location": "What_Can_I_Afford_Feature.user_is_navigated_to_the_calculators_affordability()"
});
formatter.result({
  "duration": 101443038,
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
  "duration": 239554161,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5000",
      "offset": 13
    }
  ],
  "location": "What_Can_I_Afford_Feature.userEntersCashDownPayment(String)"
});
formatter.result({
  "duration": 77245375,
  "status": "passed"
});
formatter.match({
  "location": "What_Can_I_Afford_Feature.user_clicks_calculate_button()"
});
formatter.result({
  "duration": 6018186244,
  "status": "passed"
});
formatter.after({
  "duration": 86239920,
  "status": "passed"
});
});