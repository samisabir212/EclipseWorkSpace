$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/sami/git/EclipseWorkSpace/FreeCRM_Cucumber/src/main/java/features/login.feature");
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
      "value": "#*******without examples keyword********"
    },
    {
      "line": 4,
      "value": "#Scenario: Free CRM Login test scenario"
    },
    {
      "line": 5,
      "value": "#"
    },
    {
      "line": 6,
      "value": "#Given user is already on the login page"
    },
    {
      "line": 7,
      "value": "#When title of login page is Free CRM"
    },
    {
      "line": 8,
      "value": "#Then user enters \"samisabir212\" and \"Peoplentech212\""
    },
    {
      "line": 9,
      "value": "#Then user clicks on login button"
    },
    {
      "line": 10,
      "value": "#And user is on the home page"
    },
    {
      "line": 11,
      "value": "#Then user closes the browser"
    },
    {
      "line": 15,
      "value": "#with Examples Keyword"
    }
  ],
  "line": 16,
  "name": "Free CRM Login test scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 18,
  "name": "user is already on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "user is on the home page",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user closes the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 25,
  "name": "",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 26,
      "id": "free-crm-login-feature;free-crm-login-test-scenario;;1"
    },
    {
      "cells": [
        "samisabir212",
        "Peoplentech212"
      ],
      "line": 27,
      "id": "free-crm-login-feature;free-crm-login-test-scenario;;2"
    },
    {
      "cells": [
        "hifdsklfjlds",
        "sasas"
      ],
      "line": 28,
      "id": "free-crm-login-feature;free-crm-login-test-scenario;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 266775,
  "status": "passed"
});
formatter.before({
  "duration": 108749,
  "status": "passed"
});
formatter.before({
  "duration": 215716,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Free CRM Login test scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 18,
  "name": "user is already on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user enters \"samisabir212\" and \"Peoplentech212\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "user is on the home page",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user closes the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.initialize()"
});
formatter.result({
  "duration": 4229622628,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.LoginPageTitle()"
});
formatter.result({
  "duration": 9747624,
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
  "duration": 5237639407,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 15313716602,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_the_home_page()"
});
formatter.result({
  "duration": 6068865,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_closes_the_browser()"
});
formatter.result({
  "duration": 79143514,
  "status": "passed"
});
formatter.after({
  "duration": 100679,
  "status": "passed"
});
formatter.after({
  "duration": 51227,
  "status": "passed"
});
formatter.after({
  "duration": 54281,
  "status": "passed"
});
formatter.before({
  "duration": 397367,
  "status": "passed"
});
formatter.before({
  "duration": 108017,
  "status": "passed"
});
formatter.before({
  "duration": 113581,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Free CRM Login test scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 18,
  "name": "user is already on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user enters \"hifdsklfjlds\" and \"sasas\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "user is on the home page",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user closes the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.initialize()"
});
formatter.result({
  "duration": 3393121871,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.LoginPageTitle()"
});
formatter.result({
  "duration": 9367101,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "hifdsklfjlds",
      "offset": 13
    },
    {
      "val": "sasas",
      "offset": 32
    }
  ],
  "location": "LoginStepDefinition.user_enters_username_and_password(String,String)"
});
