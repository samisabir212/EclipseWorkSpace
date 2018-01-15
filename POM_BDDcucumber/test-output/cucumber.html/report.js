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
  "name": "homepage is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "validate home page",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "free-crm-application-test;validate-valid-login-to-home-page-test;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13,
      "id": "free-crm-application-test;validate-valid-login-to-home-page-test;;1"
    },
    {
      "cells": [
        "samisabir212",
        "Peoplentech212"
      ],
      "line": 14,
      "id": "free-crm-application-test;validate-valid-login-to-home-page-test;;2"
    },
    {
      "cells": [
        "hifdsklfjlds",
        "sasas"
      ],
      "line": 15,
      "id": "free-crm-application-test;validate-valid-login-to-home-page-test;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3953816501,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
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
  "name": "homepage is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "validate home page",
  "keyword": "Then "
});
formatter.match({
  "location": "ValidLoginStepDefinitions.user_opens_browser_and_navigates_to_FreeCrm_web_page()"
});
formatter.result({
  "duration": 3621709345,
  "status": "passed"
});
formatter.match({
  "location": "ValidLoginStepDefinitions.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 9613177,
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
  "location": "ValidLoginStepDefinitions.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 2627553,
  "error_message": "java.lang.NullPointerException\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy16.sendKeys(Unknown Source)\n\tat com.qa.pages.LoginPage.login(LoginPage.java:68)\n\tat stepDefinitions.ValidLoginStepDefinitions.user_enters_username_and_password(ValidLoginStepDefinitions.java:41)\n\tat ✽.And user enters \"samisabir212\" and \"Peoplentech212\"(/Users/sami/git/EclipseWorkSpace/POM_BDDcucumber/src/test/java/features/ValidLoginFeature.feature:7)\n",
  "status": "failed"
});
formatter.match({
  "location": "ValidLoginStepDefinitions.clicks_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ValidLoginStepDefinitions.homepage_is_displayed()"
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
  "duration": 82070916,
  "status": "passed"
});
formatter.before({
  "duration": 5185364467,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
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
  "name": "homepage is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "validate home page",
  "keyword": "Then "
});
formatter.match({
  "location": "ValidLoginStepDefinitions.user_opens_browser_and_navigates_to_FreeCrm_web_page()"
});
formatter.result({
  "duration": 4754765528,
  "status": "passed"
});
formatter.match({
  "location": "ValidLoginStepDefinitions.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 13000907,
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
  "location": "ValidLoginStepDefinitions.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 35534819,
  "error_message": "org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?\nBuild info: version: \u00273.7.1\u0027, revision: \u00278a0099a\u0027, time: \u00272017-11-06T21:01:39.354Z\u0027\nSystem info: host: \u0027Samis-MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:86a:a817:a5b0:2a85%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.12.6\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: driver.version: RemoteWebDriver\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:131)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:600)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:370)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByName(RemoteWebDriver.java:448)\n\tat org.openqa.selenium.By$ByName.findElement(By.java:303)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:362)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy16.sendKeys(Unknown Source)\n\tat com.qa.pages.LoginPage.login(LoginPage.java:68)\n\tat stepDefinitions.ValidLoginStepDefinitions.user_enters_username_and_password(ValidLoginStepDefinitions.java:41)\n\tat ✽.And user enters \"hifdsklfjlds\" and \"sasas\"(/Users/sami/git/EclipseWorkSpace/POM_BDDcucumber/src/test/java/features/ValidLoginFeature.feature:7)\n",
  "status": "failed"
});
formatter.match({
  "location": "ValidLoginStepDefinitions.clicks_login_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "ValidLoginStepDefinitions.homepage_is_displayed()"
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
  "duration": 131072197,
  "status": "passed"
});
});