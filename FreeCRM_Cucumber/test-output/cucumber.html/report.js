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
  "name": "i enter my information in the contacts page.",
  "description": "",
  "id": "free-crm-login-feature;i-enter-my-information-in-the-contacts-page.",
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
  "id": "free-crm-login-feature;i-enter-my-information-in-the-contacts-page.;",
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
      "id": "free-crm-login-feature;i-enter-my-information-in-the-contacts-page.;;1"
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
      "id": "free-crm-login-feature;i-enter-my-information-in-the-contacts-page.;;2"
    },
    {
      "cells": [
        "samisabir212",
        "Peoplentech212",
        "alfred",
        "pupel",
        "batman butler"
      ],
      "line": 19,
      "id": "free-crm-login-feature;i-enter-my-information-in-the-contacts-page.;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 271508,
  "status": "passed"
});
formatter.before({
  "duration": 118577,
  "status": "passed"
});
formatter.before({
  "duration": 149275,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "i enter my information in the contacts page.",
  "description": "",
  "id": "free-crm-login-feature;i-enter-my-information-in-the-contacts-page.;;2",
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
  "duration": 6587936665,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.LoginPageTitle()"
});
formatter.result({
  "duration": 7410081,
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
  "duration": 5581789896,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
