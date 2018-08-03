$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/DarkSky.feature");
formatter.feature({
  "line": 4,
  "name": "Verify temp timeline",
  "description": "",
  "id": "verify-temp-timeline",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@temp"
    }
  ]
});
formatter.before({
  "duration": 2965745372,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Verify timeline is displayed in correct format",
  "description": "",
  "id": "verify-temp-timeline;verify-timeline-is-displayed-in-correct-format",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@temp-1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am on Darksky home page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I verify timeline is displayed with two hours incremented",
  "keyword": "Then "
});
formatter.match({
  "location": "DarkSkySD.iamOnHomePage()"
});
formatter.result({
  "duration": 334331838,
  "status": "passed"
});
formatter.match({
  "location": "DarkSkySD.verifyTwoHoursIncrement()"
});
formatter.result({
  "duration": 368011683,
  "status": "passed"
});
formatter.after({
  "duration": 111390658,
  "status": "passed"
});
});