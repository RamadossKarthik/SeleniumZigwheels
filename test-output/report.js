$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Sample.feature");
formatter.feature({
  "line": 1,
  "name": "Learning concepts of Automation",
  "description": "",
  "id": "learning-concepts-of-automation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Starting up",
  "description": "",
  "id": "learning-concepts-of-automation;starting-up",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "The browser is launched",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "The user views the home screen and searches the desired car",
  "keyword": "Then "
});
formatter.match({
  "location": "Testing.the_browser_is_launched()"
});
formatter.result({
  "duration": 11429213400,
  "status": "passed"
});
formatter.match({
  "location": "Testing.the_user_views_the_home_screen_and_searches_the_desired_car()"
});
formatter.result({
  "duration": 3151375900,
  "status": "passed"
});
});