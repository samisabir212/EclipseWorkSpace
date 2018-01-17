$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/sami/git/EclipseWorkSpace/POM_BDDcucumber/src/test/java/features/ValidLoginFeature.feature");
formatter.feature({
  "line": 1,
  "name": "free crm application test",
  "description": "",
  "id": "free-crm-application-test",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "validate valid login to home page test",
  "description": "",
  "id": "free-crm-application-test;validate-valid-login-to-home-page-test",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user opens browser and navigates to FreeCrm web page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on the login page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "clicks login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "validate home page",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "free-crm-application-test;validate-valid-login-to-home-page-test;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "free-crm-application-test;validate-valid-login-to-home-page-test;;1"
    },
    {
      "cells": [
        "samisabir212",
        "Peoplentech212"
      ],
      "line": 13,
      "id": "free-crm-application-test;validate-valid-login-to-home-page-test;;2"
    },
    {
      "cells": [
        "hifdsklfjlds",
        "sasas"
      ],
      "line": 14,
      "id": "free-crm-application-test;validate-valid-login-to-home-page-test;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3413317984,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "validate valid login to home page test",
  "description": "",
  "id": "free-crm-application-test;validate-valid-login-to-home-page-test;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user opens browser and navigates to FreeCrm web page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on the login page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enters \"samisabir212\" and \"Peoplentech212\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "clicks login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "validate home page",
  "keyword": "Then "
});
formatter.match({
  "location": "ValidLoginStepDefinitions.user_opens_browser_and_navigates_to_FreeCrm_web_page()"
});
formatter.result({
  "duration": 2828493535,
  "status": "passed"
});
formatter.match({
  "location": "ValidLoginStepDefinitions.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 1059516,
  "error_message": "java.lang.NullPointerException\n\tat stepDefinitions.ValidLoginStepDefinitions.user_is_on_the_login_page(ValidLoginStepDefinitions.java:35)\n\tat ✽.Then user is on the login page(/Users/sami/git/EclipseWorkSpace/POM_BDDcucumber/src/test/java/features/ValidLoginFeature.feature:6)\n",
  "status": "failed"
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
  "location": "ValidLoginStepDefinitions.user_enters_username_and_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ValidLoginStepDefinitions.clicks_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ValidLoginStepDefinitions.validate_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 76105557,
  "status": "passed"
});
formatter.before({
  "duration": 6173709486,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "validate valid login to home page test",
  "description": "",
  "id": "free-crm-application-test;validate-valid-login-to-home-page-test;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user opens browser and navigates to FreeCrm web page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on the login page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user enters \"hifdsklfjlds\" and \"sasas\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "clicks login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "validate home page",
  "keyword": "Then "
});
formatter.match({
  "location": "ValidLoginStepDefinitions.user_opens_browser_and_navigates_to_FreeCrm_web_page()"
});
formatter.result({
  "duration": 3475646792,
  "status": "passed"
});
formatter.match({
  "location": "ValidLoginStepDefinitions.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 3365214,
  "error_message": "java.lang.NullPointerException\n\tat stepDefinitions.ValidLoginStepDefinitions.user_is_on_the_login_page(ValidLoginStepDefinitions.java:35)\n\tat ✽.Then user is on the login page(/Users/sami/git/EclipseWorkSpace/POM_BDDcucumber/src/test/java/features/ValidLoginFeature.feature:6)\n",
  "status": "failed"
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
  "location": "ValidLoginStepDefinitions.user_enters_username_and_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ValidLoginStepDefinitions.clicks_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ValidLoginStepDefinitions.validate_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 74543146,
  "status": "passed"
});
});