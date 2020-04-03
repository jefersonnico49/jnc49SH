Feature: Meals and Accommodation Charge rates and condition for Vessel Manager

Scenario:  How to charge_One Charge including bed and meals - Meals on arrival and departure day_Full charge independent of arrival and departure time

Given open Vessel Manager login with valid user credentials
Then go to Personnel menu
Then access Meals and Accommodation sub menu
Then validate if the current url is correct
Then input valid date range period and click on submit button
Then access Setup Meals and Charges page
Then under How to charge click One Charge including bed and meals radio button
Then under Meals on day of arrival: click Full charge independent of arrival time radio button
Then under Meals on departure day: click Full charge independent of departure time radio button
Then click on save changes button
Then validate if the confirmation message that the changes has been saved did display
And browser will close


Scenario:  How to charge_One Charge including bed and meals - Meals on arrival and departure day_Charge percentage (actual hours/24)

Given open Vessel Manager login with valid user credentials -for the second time
Then go to Personnel menu -for the second time
Then access Meals and Accommodation sub menu -for the second time
Then validate if the current url is correct -for the second time
Then input valid date range period and click on submit button -for the second time
Then access Setup Meals and Charges page -for the second time
Then under How to charge click One Charge including bed and meals radio button -for the second time
Then under Meals on day of arrival: click Charge in percentage ( actual hours/ 24 ) radio button
Then under Meals on departure day: click  Charge percentage (actual hours / 24 ) radio button
Then click on save changes button -for the second time
Then validate if the confirmation message that the changes have been saved did display -for the second time
And browser will close -for the second time

Scenario:  How to charge_One Charge including bed and meals - Meals on arrival and departure day_No charge

Given open Vessel Manager login with valid user credentials -for the third time
Then go to Personnel menu -for the third time
Then access Meals and Accommodation sub menu -for the third time
Then validate if the current url is correct -for the third time
Then input valid date range period and click on submit button -for the third time
Then access Setup Meals and Charges page -for the third time
Then under How to charge click One Charge including bed and meals radio button -for the third time
Then under Meals on day of arrival: click No charge radio button
Then under Meals on departure day: click No charge radio button
Then click on save changes button -for the third time
Then validate if the confirmation message that the changes have been saved did display -for the third time
And browser will close -for the third time

Scenario:  How to charge_One Charge including bed and meals - Meals on arrival and departure day_Charged if arriving before & After

Given open Vessel Manager login with valid user credentials -for the fourth time
Then go to Personnel menu -for the fourth time
Then access Meals and Accommodation sub menu -for the fourth time
Then validate if the current url is correct -for the fourth time
Then input valid date range period and click on submit button -for the fourth time
Then access Setup Meals and Charges page -for the fourth time
Then under How to charge click One Charge including bed and meals radio button -for the fourth time
Then under Meals on day of arrival: click Charged if arriving before radio button -for the fourth time
Then under Meals on departure day: click Charged if departing after radio button -for the fourth time
Then input charged if arriving before time -for the fourth time
Then input charged if arriving after time -for the fourth time
Then click on save changes button -for the fourth time
Then validate if the confirmation message that the changes have been saved did display -for the fourth time
And browser will close -for the fourth time

Scenario:  How to charge_Bed and meals charged separately - Meals on arrival and departure day_Full charge independent of arrival and departure time

Given open Vessel Manager login with valid user credentials -for the fifth time
Then go to Personnel menu -for the fifth time
Then access Meals and Accommodation sub menu -for the fifth time
Then validate if the current url is correct -for the fifth time
Then input valid date range period and click on submit button -for the fifth time
Then access Setup Meals and Charges page -for the fifth time
Then under How to charge click Bed and meals charged separately radio button -for the fifth time
Then input any amount to Accommodation and bed charges for 1 day
Then under Meals on day of arrival: click Full charge independent of arrival time radio button -for the fifth time
Then under Meals on departure day: click Full charge independent of departure time radio button -for the fifth time
Then click on save changes button -for the fifth time
Then validate if the confirmation message that the changes have been saved did display -for the fifth time
And browser will close -for the fifth time

Scenario:  How to charge_Bed and meals charged separately - Meals on arrival and departure day_Charge percentage (actual hours/24)

Given open Vessel Manager login with valid user credentials -for the sixth time
Then go to Personnel menu -for the sixth time
Then access Meals and Accommodation sub menu -for the sixth time
Then validate if the current url is correct -for the sixth time
Then input valid date range period and click on submit button -for the sixth time
Then access Setup Meals and Charges page -for the sixth time
Then under How to charge click Bed and meals charged separately radio button -for the sixth time
Then under Meals on day of arrival: click Charge in percentage ( actual hours/ 24 ) radio button -for the sixth time
Then under Meals on departure day: click  Charge percentage (actual hours / 24 ) radio button -for the sixth time
Then click on save changes button -for the sixth time
Then validate if the confirmation message that the changes has been saved did display -for the sixth time
And browser will close -for the sixth time


Scenario:  How to charge_Bed and meals charged separately - Meals on arrival and departure day_No charge

Given open Vessel Manager login with valid user credentials -for the seventh time
Then go to Personnel menu -for the seventh time
Then access Meals and Accommodation sub menu -for the seventh time
Then validate if the current url is correct -for the seventh time
Then input valid date range period and click on submit button -for the seventh time
Then access Setup Meals and Charges page -for the seventh time
Then under How to charge click Bed and meals charged separately radio button -for the seventh time
Then under Meals on day of arrival: click No charge radio button -for the seventh time
Then under Meals on departure day: click No charge radio button -for the seventh time
Then click on save changes button -for the seventh time
Then validate if the confirmation message that the changes have been saved did display -for the seventh time
And browser will close -for the seventh time


Scenario:  How to charge_Bed and meals charged separately - Meals on arrival and departure day_Charged if arriving before & After

Given open Vessel Manager login with valid user credentials -for the ninth time
Then go to Personnel menu -for the ninth time
Then access Meals and Accommodation sub menu -for the ninth time
Then validate if the current url is correct -for the ninth time
Then input valid date range period and click on submit button -for the ninth time
Then access Setup Meals and Charges page -for the ninth time
Then under How to charge click Bed and meals charged separately radio button -for the ninth time
Then under Meals on day of arrival: click Charged if arriving before radio button -for the ninth time
And input charged if arriving before time -for the ninth time
Then under Meals on departure day: click Charged if departing after radio button -for the ninth time
And input charged if arriving after time -for the ninth time
Then click on save changes button -for the ninth time
Then validate if the confirmation message that the changes have been saved did display -for the ninth time
And browser will close -for the ninth time


Scenario:  How to charge_Bed and each meal charged separately - Meals on arrival and departure day_Full charge independent of arrival and departure time

Given open Vessel Manager login with valid user credentials -for the tenth time
Then go to Personnel menu -for the tenth time
Then access Meals and Accommodation sub menu -for the tenth time
Then validate if the current url is correct -for the tenth time
Then input valid date range period and click on submit button -for the tenth time
Then access Setup Meals and Charges page -for the tenth time
Then under How to charge click Bed and each meal charged separately radio button -for the tenth time
Then under Meals on day of arrival: click Full charge independent of arrival time radio button -for the tenth time
Then under Meals on departure day: click Full charge independent of departure time radio button -for the tenth time
Then click on save changes button -for the tenth time
Then validate if the confirmation message that the changes have been saved did display -for the tenth time
And browser will close -for the tenth time

Scenario:  How to charge_Bed and each meal charged separately - Meals on arrival and departure day_Charge percentage (actual hours/24)

Given open Vessel Manager login with valid user credentials -for the eleventh time
Then go to Personnel menu -for the eleventh time
Then access Meals and Accommodation sub menu -for the eleventh time
Then validate if the current url is correct -for the eleventh time
Then input valid date range period and click on submit button -for the eleventh time
Then access Setup Meals and Charges page -for the eleventh time
Then under How to charge click Bed and each meal charged separately radio button -for the eleventh time
Then under Meals on day of arrival: click Charge in percentage ( actual hours/ 24 ) radio button -for the eleventh time
Then under Meals on departure day: click  Charge percentage (actual hours / 24 ) radio button -for the eleventh time
Then click on save changes button -for the eleventh time
Then validate if the confirmation message that the changes have been saved did display -for the eleventh time
And browser will close -for the eleventh time

Scenario:  How to charge_Bed and each meal charged separately - Meals on arrival and departure day_No charge

Given open Vessel Manager login with valid user credentials -for the twelfth time
Then go to Personnel menu -for the twelfth time
Then access Meals and Accommodation sub menu -for the twelfth time
Then validate if the current url is correct -for the twelfth time
Then input valid date range period and click on submit button -for the twelfth time
Then access Setup Meals and Charges page -for the twelfth time
Then under How to charge click Bed and each meal charged separately radio button -for the twelfth time
Then under Meals on day of arrival: click No charge radio button -for the twelfth time
Then under Meals on departure day: click No charge radio button -for the twelfth time
Then click on save changes button -for the twelfth time
Then validate if the confirmation message that the changes have been saved did display -for the twelfth time
And browser will close -for the twelfth time

Scenario:  How to charge_Bed and each meal charged separately - Meals on arrival and departure day_Charged if arriving before & After

Given open Vessel Manager login with valid user credentials -for the thirteenth time
Then go to Personnel menu -for the thirteenth time
Then access Meals and Accommodation sub menu -for the thirteenth time
Then validate if the current url is correct -for the thirteenth time
Then input valid date range period and click on submit button -for the thirteenth time
Then access Setup Meals and Charges page -for the thirteenth time
Then under How to charge click Bed and each meal charged separately radio button -for the thirteenth time
Then under Meals on day of arrival: click Charged if arriving before radio button -for the thirteenth time
And input charged if arriving before time -for the thirteenth time
Then under Meals on departure day: click Charged if departing after radio button -for the thirteenth time
And input charged if arriving after time -for the thirteenth time
Then click on save changes button -for the thirteenth time
Then validate if the confirmation message that the changes have been saved did display -for the thirteenth time
And browser will close -for the thirteenth time



