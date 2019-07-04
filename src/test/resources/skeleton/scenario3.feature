Feature: Search for product
Description: Alex, an elite user of TestMeApp, purchase most of his products from TestMeApp.Being an elite user,
he gets lot of rewards and offers.One day Alex logins in TestMeApp and use search functionality to purchase Head Phone. 
He found that the search engine is very fast and accurate and purchase is done in just a min

Scenario: user searches for the product
Given user opens login page
When user enter loginusername as "lalitha"
And user enter password as "password123"
And Click on login button
And user enter the product as "head"
And select the product
Then verify 
