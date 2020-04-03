Feature: Open meals and accomoodation

Scenario: Validation of Meals and Accommodation 

Given open Vessel Manager login with valid user credentials
Then go to Personnel menu
Then access Meals and Accommodation sub menu
Then validate if the current url is correct
Then input valid date range period and click on submit button
And browser will close 
