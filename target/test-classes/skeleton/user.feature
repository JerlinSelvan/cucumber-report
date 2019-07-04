Feature: Login

Scenario Outline: Login with given credentials
Given user open login page
When user enters loginusername as "<un>"
And user enters password as "<pass>"
Then Click login button
And verify successful login



Examples:
|un|pass|
|lalitha|password123|