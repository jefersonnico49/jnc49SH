Feature: Overview of  Meals and Accommodation table

Scenario:  Can select date period: FROM - TO - Valid date range

Given open Vessel Manager login with valid user credentials
Then go to Personnel menu
Then access Meals and Accommodation sub menu
Then validate if the current url is correct
Then input valid date range period and click on submit button
And browser will close 

Scenario:  Can select date period: FROM - TO - Invalid date range

Given open Vessel Manager login with valid user credentials for the second time
Then go to Personnel menu for the second time
Then access Meals and Accommodation sub menu for the second time
Then validate if the current url is correct for the second time
Then input invalid date range period and click on submit button
Then validate if the calendar date picker is highlighted 
And browser will close for the second time

Scenario: Can select one, multiple 

Given open Vessel Manager login with valid user credentials for the third time
Then go to Personnel menu for the third time
Then access Meals and Accommodation sub menu for the third time
Then validate if the current url is correct for the third time
Then input valid date range period for the third time
Then select a company  
Then select multiple company available
Then click on submit button 
And browser will close for the third time

Scenario: Can select All companies 

Given open Vessel Manager login with valid user credentials for the fourth time
Then go to Personnel menu for the fourth time
Then access Meals and Accommodation sub menu for the fourth time
Then validate if the current url is correct for the fourth time
Then input valid date range period for the fourth time
Then under company do not select any
Then click on submit button for the fourth time
And browser will close for the fourth time

Scenario: Home redirection to Home page

Given open Vessel Manager login with valid user credentials for the fifth time
Then go to Personnel menu for the fifth time
Then access Meals and Accommodation sub menu for the fifth time
Then validate if the current url is correct for the fifth time
Then click Home
Then validate if redirect to Home page validate the url if correct
And browser will close for the fifth time




