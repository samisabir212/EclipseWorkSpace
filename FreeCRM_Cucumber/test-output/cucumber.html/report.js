$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/sami/git/EclipseWorkSpace/FreeCRM_Cucumber/src/main/java/features/tagging.feature");
formatter.feature({
  "line": 2,
  "name": "Free CRM application testing",
  "description": "",
  "id": "free-crm-application-testing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Login with correct username and correct password",
  "description": "",
  "id": "free-crm-application-testing;login-with-correct-username-and-correct-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@P1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "This is a valid login test",
  "keyword": "Given "
});
formatter.match({
  "location": "TagginStepDefinitions.this_is_a_valid_login_test()"
});
formatter.result({
  "duration": 98888769,
  "status": "passed"
});
});