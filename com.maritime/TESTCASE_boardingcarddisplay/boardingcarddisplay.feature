Feature: As a Admin, I can see the boarding card proper display

Scenario: Validation of Boarding Card display for Vessel Manager

Given open Vessel Manager WebApp Login with valid user credentials
Then go to Personnel menu
Then click on Boarding Card sub menu
Then validate the current url for boarding card is correct
Then validate Boarding Card Text in the upper left part of the web page
Then validate Find person by criteria text if displayed
Then validate if the Name under Find person by Criteria text is displayed
Then validate if the Card ID under Find person by Criteria text is displayed

Then validate if the Name under Find person by Criteria text input field is displayed
Then validate if the Card ID under Find person by Criteria text input field is displayed

Then validate if the Name search button is displayed
Then validate if the Card ID search button is displayed

Then validate Selected person text if displayed
Then validate if the Name text under Selected person by Criteria is displayed
Then validate if the Company text under Selected person by Criteria is displayed
Then validate if the Position text under Selected person by Criteria is displayed
Then validate if the Category text under Selected person by Criteria is displayed
Then validate if the Card ID text under Selected person by Criteria is displayed
Then validate if the PIN text under Selected person by Criteria is displayed
Then validate if the Card ID text input field under Selected person by Criteria is displayed
Then validate if the PIN text input field under Selected person by Criteria is displayed

Then validate if the Take Picture text is displayed
Then validate if the Print text is displayed
Then validate if the Save text is displayed
Then validate if the Empty fields text is displayed

Then validate if the Take Picture button is displayed
Then validate if the Print button is displayed
Then validate if the Save button is displayed
Then validate if the Empty fields button is displayed

Then validate if the Preview card text is displayed
Then validate if the Preview card Object is displayed
And browser will closed
