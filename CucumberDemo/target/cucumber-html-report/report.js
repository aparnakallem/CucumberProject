$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("hrms.feature");
formatter.feature({
  "line": 2,
  "name": "Testing HRMS application",
  "description": "",
  "id": "testing-hrms-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginTest"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "Verify Login",
  "description": "",
  "id": "testing-hrms-application;verify-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open HRMS application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Typing User name and Password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Login page should be shown and  Logout from the application",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "browser should be closed",
  "keyword": "Then "
});
formatter.match({
  "location": "TC001.openbrowser()"
});
formatter.result({
  "duration": 18384071608,
  "status": "passed"
});
formatter.match({
  "location": "TC001.login()"
});
formatter.result({
  "duration": 9509757478,
  "status": "passed"
});
formatter.match({
  "location": "TC001.logout()"
});
formatter.result({
  "duration": 6058858163,
  "status": "passed"
});
formatter.match({
  "location": "TC001.closebrowser()"
});
formatter.result({
  "duration": 228550995,
  "status": "passed"
});
});