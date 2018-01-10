$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/sami/eclipse-workspace/FreeCRMBDD/src/main/java/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM Login test scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters \"samisabir212\" and \"Peoplentech212\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on the home page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user closes the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.initialize()"
});
formatter.result({
  "duration": 3505186153,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 7730796,
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
  "duration": 539150147,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 8107692842,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_the_home_page()"
});
formatter.result({
  "duration": 980649846,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_closes_the_browser()"
});
formatter.result({
  "duration": 79567449,
  "status": "passed"
});
});