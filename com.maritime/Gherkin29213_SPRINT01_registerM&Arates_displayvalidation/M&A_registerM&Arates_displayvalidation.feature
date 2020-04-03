Feature: As a User, I can register M&A rates so that it will serve as the basis of computation of charges

Scenario: Validation of Meals and Accommodation charge settings display for Vessel Manager

Given open Vessel Manager login with valid user credentials
Then go to Personnel menu
Then access Meals and Accommodation sub menu
Then validate if the current url is correct
Then input valid date range period and click on submit button
Then validate if the Settings icon is present
Then validate if access Setup Meals and Charges is present 
Then access Setup Meals and Charges page


Then validate if access Setup Meals and Charges text is present 
Then validate if Number of Meals per day text is present
Then validate if Number of Meals per day drop down is present 
Then validate if the currency text is present
Then validate if the currency drop down is present
Then validate if the Start text is present
Then validate if the End text is present
Then validate if the Staying On board text is present
Then validate if the if served as extra meal text is present 

Then validate if the How to charge: text is present
Then validate if the One Charge including bed and meals text is present
Then validate if the Bed and meals charged separately text is present
Then validate if the Bed and each meal charged separately text is present

Then validate if the on day of arrival text is present
Then validate if the Full charge  of arrival time text is present - on day of arrival
Then validate if the charge in percentage (actual hours/24) text is present - on day of arrival
Then validate if the No Charge text is present - on day of arrival
Then validate if the Charged if arriving before: text is present - on day of arrival
Then validate if the object for time selection for Changed if arriving before is present - on day of arrival

Then validate if the Meals on arrival departure day: text is present
Then validate if the Only meals served when the person was on board will be charged text is present 
Then validate if the *may also be adjusted manually in software text is present

Then validate if the On day of departure text is present
Then validate if the Full charge  of arrival time text is present - On day of departure
Then validate if the charge in percentage (actual hours/24) text is present - On day of departure
Then validate if the No Charge text is present - On day of departure
Then validate if the Charged if arriving before: text is present - On day of departure
Then validate if the object for time selection for Changed if arriving before is present - On day of departure

Then validate if the Save button is available
Then validate if the Save button text is correct
Then validate if the Cancel button is available
Then validate if the Cancel button text is correct
Then validate if the close icon is available 
And browser will close 




