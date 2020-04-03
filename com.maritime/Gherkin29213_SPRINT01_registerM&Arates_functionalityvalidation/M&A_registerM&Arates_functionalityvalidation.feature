Feature: Meals and Accommodation charge settings functionality for Vessel Manager

Scenario:  Minimum of three meals should be registered using valid input - Setup Meals and Charges

Given open Vessel Manager login with valid user credentials
Then go to Personnel menu
Then access Meals and Accommodation sub menu
Then validate if the current url is correct
Then input valid date range period and click on submit button
Then access Setup Meals and Charges page
Then validate if the Number of chargable meals provided each day drop down numbers are from three to eight
Then from the Number of chargable meals provided each day drop down select number four
Then from Meal one choose a start and end date that will not overlap the time that is already registered
Then from Meal two choose a start and end date that will not overlap the time that is already registered
Then from Meal three choose a start and end date that will not overlap the time that is already registered
Then from Meal four choose a start and end date that will not overlap the time that is already registered
Then input valid value from Staying on board amount from Meals one to three
Then input valid value from if served as extra meal from Meals one to three
Then input valid value from Accommodation and bed,charges for one day 
Then click on save button
Then settings will close and confirmation message for successfuly saving the changes wil display on the M & A page
And Browser will close


Scenario:  Minimum of three meals should not be registered to maximum of eight meals should not be registered using invalid input - Setup Meals and Charges

Given open Vessel Manager login with valid user credentials - for the second time
Then go to Personnel menu - for the second time
Then access Meals and Accommodation sub menu - for the second time
Then validate if the current url is correct - for the second time
Then input valid date range period and click on submit button - for the second time
Then access Setup Meals and Charges page - for the second time
Then from the Number of chargable meals provided each day drop down select number four for the second time
Then from Meal one choose a start and end date that will overlap the time that is already registered
Then from Meal two choose a start and end date that will overlap the time that is already registered
Then from Meal three choose a start and end date that will overlap the time that is already registered
Then from Meal four choose a start and end date that will overlap the time that is already registered
Then input invalid value from Staying on board amount from Meals one to four
Then input invalid value from if served as extra meal from Meals one to four
Then input invalid value from Accommodation and bed,charges for one day 
Then click on save button - for the second time
Then validate the warning message notifying the user that start and end time overlaps each other
And Browser will close - for the second time


Scenario: Add and Delete number of Meals using close button - Setup Meals and Charges

Given open Vessel Manager login with valid user credentials - for the third time
Then go to Personnel menu - for the third time
Then access Meals and Accommodation sub menu - for the third time
Then validate if the current url is correct - for the third time
Then input valid date range period and click on submit button - for the third time
Then access Setup Meals and Charges page - for the third time
Then from the Number of chargable meals provided each day drop down select number eight
Then delete Meals eight to four by clicking delete button
Then from the Number of chargable meals provided each day drop down select number six
Then delete Meals six to four by clicking delete button
Then from the Number of chargable meals provided each day drop down select number five
Then delete Meals five to four by clicking delete button
And browser will close - for the third time


Scenario: Add and Delete number of Meals using Number of meals per day dropdown - Setup Meals and Charges

Given open Vessel Manager login with valid user credentials - for the sixth time
Then go to Personnel menu - for the sixth time
Then access Meals and Accommodation sub menu - for the sixth time
Then validate if the current url is correct - for the sixth time
Then input valid date range period and click on submit button - for the sixth time
Then access Setup Meals and Charges page - for the sixth time
Then from the Number of chargable meals provided each day drop down select number eight - for the sixth time
Then from Meal one choose a start and end date that will not overlap the time that is already registered - for the sixth time
Then from Meal two choose a start and end date that will not overlap the time that is already registered - for the sixth time
Then from Meal three choose a start and end date that will not overlap the time that is already registered - for the sixth time
Then from Meal four choose a start and end date that will not overlap the time that is already registered - for the sixth time
Then from Meal five choose a start and end date that will not overlap the time that is already registered - for the sixth time
Then from Meal six choose a start and end date that will not overlap the time that is already registered - for the sixth time
Then from Meal seven choose a start and end date that will not overlap the time that is already registered - for the sixth time
Then from Meal eight choose a start and end date that will not overlap the time that is already registered - for the sixth time
Then input valid value from Staying on board amount from Meals one to eight - for the sixth time
Then input valid value from if served as extra meal from Meals one to eight - for the sixth time
Then input valid value from Accommodation and bed,charges for one day - for the sixth time
Then from the Number of chargable meals provided each day drop down select number seven - for the sixth time
Then validate the warning message Meal(s) at the bottom of the list will be deleted. Do you want to proceed? then click on Yes button - Meal eight deleted
Then from the Number of chargable meals provided each day drop down select number six - for the sixth time
Then validate the warning message Meal(s) at the bottom of the list will be deleted. Do you want to proceed? then click on Yes button - Meal seven deleted
Then from the Number of chargable meals provided each day drop down select number five - for the sixth time
Then validate the warning message Meal(s) at the bottom of the list will be deleted. Do you want to proceed? then click on Yes button - Meal six deleted
Then from the Number of chargable meals provided each day drop down select number four - for the sixth time
Then validate the warning message Meal(s) at the bottom of the list will be deleted. Do you want to proceed? then click on Yes button - Meal five deleted
Then click on save button - for the sixth time
And browser will close - for the sixth time











