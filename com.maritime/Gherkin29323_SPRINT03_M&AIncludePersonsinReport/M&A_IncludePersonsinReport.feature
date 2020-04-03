Feature: As a User, I have the option to "Include Persons in Report" from overview and report of M&A so that report per Company is available too.

Scenario:  Validate if the Company Names are available for Company Report

Given open Vessel Manager login with valid user credentials
Then go to Personnel menu
Then access Meals and Accommodation sub menu
Then validate if the current url is correct
Then input valid date range period 
Then under company select Symbit and click on submit button
Then validate if Symbit display under Company
And browser will close

Given open Vessel Manager login with valid user credentials for the second time
Then go to Personnel menu for the second time
Then access Meals and Accommodation sub menu for the second time
Then validate if the current url is correct for the second time
Then input valid date range period for the second time
Then under company select AB12 Company and click on submit button for the second time
Then validate if AB12 Company display under Company for the second time
And browser will close for the second time

Given open Vessel Manager login with valid user credentials for the third time
Then go to Personnel menu for the third time
Then access Meals and Accommodation sub menu for the third time
Then validate if the current url is correct for the third time
Then input valid date range period for the third time
Then under company select Shipadmin Company and click on submit button for the third time
Then validate if Shipadmin Company display under Company for the third time
And browser will close for the third time

Given open Vessel Manager login with valid user credentials for the fourth time
Then go to Personnel menu for the fourth time
Then access Meals and Accommodation sub menu for the fourth time
Then validate if the current url is correct for the fourth time
Then input valid date range period and click on submit button
Then validate if Symbit display under Company for the fourth time
Then validate if AB12 Company display under Company for the fourth time
Then validate if Shipadmin Company display under Company for the fourth time
And browser will close for the fourth time

Scenario:  Validate if the report per Company Header is available

Given open Vessel Manager login with valid user credentials for the fifth time
Then go to Personnel menu for the for the fifth time
Then access Meals and Accommodation sub menu for the fifth time
Then validate if the current url is correct for the fifth time
Then input valid date range period and click on submit button for the fifth time
Then validate if the Company Header is available
Then validate if the Meals Header is available
Then validate if the Charge Header is available
Then validate if the Extra Charges Header is available
Then validate if the Total Header is available
And browser will close for the fourth time for the fifth time


Scenario:  Validate if the Include Persons on the Report are available 

Given open Vessel Manager login with valid user credentials for the sixth time
Then go to Personnel menu for the for the sixth time
Then access Meals and Accommodation sub menu for the sixth time
Then validate if the current url is correct for the sixth time
Then input valid date range period and click on submit button for the sixth time
Then click on Include Persons on the Report
Then validate if the Name Header is available
Then validate if the Position Header is available
Then validate if the Company Header is available for the sixth time
Then validate if the Days Header is available
Then validate if the Meals Header is available for the sixth time
Then validate if the Charge Header is available for the sixth time
Then validate if the Extra Charges Header is available for the sixth time
Then validate if the Total Header is available for the sixth time
And browser will close for the fourth time for the sixth time

Scenario: Validate if the Personnel Nicole, Heaven and Lian German is present with meals and Accommodation

Given open Vessel Manager login with valid user credentials for the seventh time
Then go to Personnel menu for the seventh time
Then access Meals and Accommodation sub menu for the seventh time
Then validate if the current url is correct for the seventh time
Then input valid date range period and click on submit button for the seventh time
Then click on Include Persons on the Report for the seventh time
Then click on Display only persons with meals and accommodation for the seventh time

Then validate if German, Nicole is present
Then validate if German, Nicole meals and accommodation icon is present 
Then validate if German, Nicole position is correct
Then validate if German, Nicole Company is correct
Then validate if German, Nicole Days onboard is correct

Then validate if German, Heaven is present
Then validate if German, Heaven meals and accommodation icon is present 
Then validate if German, Heaven position is correct
Then validate if German, Heaven Company is correct
Then validate if German, Heaven Days onboard is correct

Then validate if German, Lian is present
Then validate if German, Lian meals and accommodation icon is present 
Then validate if German, Lian position is correct
Then validate if German, Lian Company is correct
Then validate if German, Lian Days onboard is correct
And Browser will close for the seventh time



