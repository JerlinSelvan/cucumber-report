Feature: Register Test

Scenario: User register into TestMe Application
Given user opens the signup page of TestMe Application
When user enters username as "ascftghok"
And user enters fname as "Pavinciya"
And user enters lname as "Valan"
And user enters pass as "kavinciyo"
And user enters cpass as "kavinciyo"
And user select gender 
And user enters e-mail as "lkm@gmail.com"
And user enters num as "9876543210"
And user enters dob as "25/03/2000"
And user enters add as "Anna nagar,Chennai"

And user answer the question as "Red"
Then click on register button
And verify successful registration
