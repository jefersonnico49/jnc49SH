Feature: Meals and Accommodation Add Extra Charges functionality for Vessel Manager

Scenario:  Add valid description and Price - Add Extra Charge

Given open Vessel Manager login with valid user credentials
Then go to Personnel menu
Then access Meals and Accommodation sub menu
Then validate if the current url is correct
Then input valid date range period and click on submit button
Then click on Include Persons on the Report
Then click on a specific personnel 
Then click on the positive icon to Add Extra charges
Then input a description - Extra charge first line
Then input Price - Extra charge first line
Then click Add another item button five times
Then input a description - Extra charge second line
Then input Price - Extra charge second line
Then input a description - Extra charge third line
Then input Price - Extra charge third line
Then input a description - Extra charge fourth line
Then input Price - Extra charge fourth line
Then input a description - Extra charge fifth line
Then input Price - Extra charge fifth line
Then click on Save Changes button
Then validate if the confirmation message for successfully saving the Extra charges will display
And browser will close


Scenario:  Add invalid description and Price - Add Extra Charge

Given open Vessel Manager login with valid user credentials - for the second time
Then go to Personnel menu - for the second time
Then access Meals and Accommodation sub menu - for the second time
Then validate if the current url is correct - for the second time
Then input valid date range period and click on submit button - for the second time
Then click on Include Persons on the Report for the second time
Then click on a specific personnel  - for the second time
Then click on the positive icon to Add Extra charges - for the second time
Then input a description - Extra charge first line over the max limit fifty characters
Then input Price - Extra charge first line Alphanumeric characters
Then input a description - Extra charge second line over the max limit fifty characters
Then click Add another item button five times - for the second time
Then input Price - Extra charge second line Alphanumeric characters
Then input a description - Extra charge third line over the max limit fifty characters
Then input Price - Extra charge third line Alphanumeric characters
Then input a description - Extra charge fourth line over the max limit fifty characters
Then input Price - Extra charge fourth line Alphanumeric characters
Then input a description - Extra charge fifth line over the max limit fifty characters
Then input Price - Extra charge fifth line Alphanumeric characters
Then click on Save Changes button - for the second time
Then validate if the confirmation message for successfully saving the Extra charges will display - for the second time
And browser will close - for the second time


Scenario:  Delete existing description and Price - Add Extra Charge

Given open Vessel Manager login with valid user credentials - for the fourth time
Then go to Personnel menu -for the fourth time
Then access Meals and Accommodation sub menu - for the fourth time
Then validate if the current url is correct - for the fourth time
Then input valid date range period and click on submit button - for the fourth time
Then click on Include Persons on the Report for the third time
Then click on a specific personnel -for the fourth time
Then click on the positive icon to Add Extra charges - for the fourth time
Then delete fifth line description and price - for the fourth time
Then delete fourth line description and price - for the fourth time
Then delete third line description and price - for the fourth time
Then delete second line description and price - for the fourth time
Then delete first line description and price - for the fourth time
Then click on Save Changes button - for the fourth time
Then validate if the confirmation message for successfully saving the Extra charges will display - for the fourth time
And browser will close - for the fourth time

