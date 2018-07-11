$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SharingDriver.feature");
formatter.feature({
  "line": 1,
  "name": "Registration page33",
  "description": "As a new user, I want to enter firstname and lastname as a parameter",
  "id": "registration-page33",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "validate Registration Scenario2",
  "description": "",
  "id": "registration-page33;validate-registration-scenario2",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "the user is on registration Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "he enters \"David\" as user name",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "he enters \"Rogers\" as user last name",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "check username is present in textbox",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "the user is on registration Page1",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "he enters \"David\" as user name2",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "he enters \"Rogers\" as user last name3",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "check username is present in textbox4",
  "keyword": "Then "
});
formatter.match({
  "location": "SharingDriver1.the_user_is_on_registration_Page()"
});
formatter.result({
  "duration": 11734143856,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "David",
      "offset": 11
    }
  ],
  "location": "SharingDriver1.He_enters_user_name(String)"
});
formatter.result({
  "duration": 111601303,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rogers",
      "offset": 11
    }
  ],
  "location": "SharingDriver1.He_enters_user_last_name(String)"
});
formatter.result({
  "duration": 5076628970,
  "status": "passed"
});
formatter.match({
  "location": "SharingDriver1.check_signup_should()"
});
formatter.result({
  "duration": 6731319,
  "status": "passed"
});
formatter.match({
  "location": "SharingDriver2.the_user_is_on_registration_Page()"
});
formatter.result({
  "duration": 6689941163,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "David",
      "offset": 11
    }
  ],
  "location": "SharingDriver2.He_enters_user_name(String)"
});
formatter.result({
  "duration": 148220129,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rogers",
      "offset": 11
    }
  ],
  "location": "SharingDriver2.He_enters_user_last_name(String)"
});
formatter.result({
  "duration": 5087320746,
  "status": "passed"
});
formatter.match({
  "location": "SharingDriver2.check_signup_should()"
});
formatter.result({
  "duration": 740353713,
  "status": "passed"
});
});