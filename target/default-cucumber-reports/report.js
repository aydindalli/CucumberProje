$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/koalapalace.feature");
formatter.feature({
  "name": "Koalapalace login test case",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@KoalaPalace"
    }
  ]
});
formatter.scenario({
  "name": "TC10_Valid Credentials Log in",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@KoalaPalace"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user must visit \"http://kaolapalace-qa-environment.com/Account/Logon\"",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDefinitions.user_must_visit(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user must enter a valid username",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDefinitions.user_must_enter_a_valid_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user must enter a valid password",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.KoalaPalaceStepDefinitions.user_must_enter_a_valid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});