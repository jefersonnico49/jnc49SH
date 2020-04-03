$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("boardingcarddisplay.feature");
formatter.feature({
  "line": 1,
  "name": "As a Admin, I can see the boarding card proper display",
  "description": "",
  "id": "as-a-admin,-i-can-see-the-boarding-card-proper-display",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validation of Boarding Card display for Vessel Manager",
  "description": "",
  "id": "as-a-admin,-i-can-see-the-boarding-card-proper-display;validation-of-boarding-card-display-for-vessel-manager",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "open Vessel Manager WebApp Login with valid user credentials",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "go to Personnel menu",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "click on Boarding Card sub menu",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "validate the current url for boarding card is correct",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "validate Boarding Card Text in the upper left part of the web page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "validate Find person by criteria text if displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "validate if the Name under Find person by Criteria text is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "validate if the Card ID under Find person by Criteria text is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "validate if the Name under Find person by Criteria text input field is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "validate if the Card ID under Find person by Criteria text input field is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "validate if the Name search button is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "validate if the Card ID search button is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "validate Selected person text if displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "validate if the Name text under Selected person by Criteria is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "validate if the Company text under Selected person by Criteria is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "validate if the Position text under Selected person by Criteria is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "validate if the Category text under Selected person by Criteria is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "validate if the Card ID text under Selected person by Criteria is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "validate if the PIN text under Selected person by Criteria is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "validate if the Card ID text input field under Selected person by Criteria is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "validate if the PIN text input field under Selected person by Criteria is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "validate if the Take Picture text is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "validate if the Print text is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "validate if the Save text is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "validate if the Empty fields text is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "validate if the Take Picture button is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "validate if the Print button is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "validate if the Save button is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 38,
  "name": "validate if the Empty fields button is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "validate if the Preview card text is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "validate if the Preview card Object is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "browser will closed",
  "keyword": "And "
});
formatter.match({
  "location": "Testboardingcarddisplay.open_Vessel_Manager_WebApp_Login_with_valid_user_credentials()"
});
formatter.result({
  "duration": 11071848683,
  "status": "passed"
});
formatter.match({
  "location": "Testboardingcarddisplay.go_to_Personnel_menu()"
});
formatter.result({
  "duration": 1075390013,
  "status": "passed"
});
formatter.match({
  "location": "Testboardingcarddisplay.click_on_Boarding_Card_sub_menu()"
});
formatter.result({
  "duration": 8198062180,
  "status": "passed"
});
formatter.match({
  "location": "Testboardingcarddisplay.validate_the_current_url_for_boarding_card_is_correct()"
});
formatter.result({
  "duration": 1023524406,
  "error_message": "org.junit.ComparisonFailure: expected:\u003chttp://stg0[3].shipadmin.com/VM/Ca...\u003e but was:\u003chttp://stg0[2].shipadmin.com/VM/Ca...\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat stepDefinitionboardingcarddisplay.Testboardingcarddisplay.validate_the_current_url_for_boarding_card_is_correct(Testboardingcarddisplay.java:65)\r\n\tat ✽.Then validate the current url for boarding card is correct(boardingcarddisplay.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Testboardingcarddisplay.validate_Boarding_Card_Text_in_the_upper_left_part_of_the_web_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Testboardingcarddisplay.validate_Find_person_by_criteria_text_if_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Testboardingcarddisplay.validate_if_the_Name_under_Find_person_by_Criteria_text_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Testboardingcarddisplay.validate_if_the_Card_ID_under_Find_person_by_Criteria_text_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Testboardingcarddisplay.validate_if_the_Name_under_Find_person_by_Criteria_text_input_field_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Testboardingcarddisplay.validate_if_the_Card_ID_under_Find_person_by_Criteria_text_input_field_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Testboardingcarddisplay.validate_if_the_Name_search_button_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Testboardingcarddisplay.validate_if_the_Card_ID_search_button_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Testboardingcarddisplay.validate_Selected_person_text_if_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Testboardingcarddisplay.validate_if_the_Name_text_under_Selected_person_by_Criteria_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Testboardingcarddisplay.validate_if_the_Company_text_under_Selected_person_by_Criteria_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Testboardingcarddisplay.validate_if_the_Position_text_under_Selected_person_by_Criteria_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Testboardingcarddisplay.validate_if_the_Category_text_under_Selected_person_by_Criteria_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Testboardingcarddisplay.validate_if_the_Card_ID_text_under_Selected_person_by_Criteria_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Testboardingcarddisplay.validate_if_the_PIN_text_under_Selected_person_by_Criteria_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Testboardingcarddisplay.validate_if_the_Card_ID_text_input_field_under_Selected_person_by_Criteria_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Testboardingcarddisplay.validate_if_the_PIN_text_input_field_under_Selected_person_by_Criteria_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Testboardingcarddisplay.validate_if_the_Take_Picture_text_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Testboardingcarddisplay.validate_if_the_Print_text_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Testboardingcarddisplay.validate_if_the_Save_text_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Testboardingcarddisplay.validate_if_the_Empty_fields_text_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Testboardingcarddisplay.validate_if_the_Take_Picture_button_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Testboardingcarddisplay.validate_if_the_Print_button_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Testboardingcarddisplay.validate_if_the_Save_button_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Testboardingcarddisplay.validate_if_the_Empty_fields_button_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Testboardingcarddisplay.validate_if_the_Preview_card_text_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Testboardingcarddisplay.validate_if_the_Preview_card_Object_is_displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Testboardingcarddisplay.browser_will_closed()"
});
formatter.result({
  "status": "skipped"
});
});