$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/skeleton/scenario3.feature");
formatter.feature({
  "name": "Search for product",
  "description": "Description: Alex, an elite user of TestMeApp, purchase most of his products from TestMeApp.Being an elite user,\nhe gets lot of rewards and offers.One day Alex logins in TestMeApp and use search functionality to purchase Head Phone. \nHe found that the search engine is very fast and accurate and purchase is done in just a min",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "user searches for the product",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user opens login page",
  "keyword": "Given "
});
formatter.match({
  "location": "scenario3.user_opens_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter loginusername as \"lalitha\"",
  "keyword": "When "
});
formatter.match({
  "location": "scenario3.user_enter_loginusername_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter password as \"password123\"",
  "keyword": "And "
});
formatter.match({
  "location": "scenario3.user_enter_password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "scenario3.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the product as \"head\"",
  "keyword": "And "
});
formatter.match({
  "location": "scenario3.user_enter_the_product_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select the product",
  "keyword": "And "
});
formatter.match({
  "location": "scenario3.select_the_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify",
  "keyword": "Then "
});
formatter.match({
  "location": "scenario3.verify()"
});
formatter.result({
  "status": "passed"
});
});