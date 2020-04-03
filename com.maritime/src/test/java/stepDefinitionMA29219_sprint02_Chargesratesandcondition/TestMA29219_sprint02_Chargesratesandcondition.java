package stepDefinitionMA29219_sprint02_Chargesratesandcondition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import maritimeutility.ConfigReader;

public class TestMA29219_sprint02_Chargesratesandcondition {
	

	
	WebDriver driver;
	
	ConfigReader config=new ConfigReader();

	//Scenario:  How to charge_One Charge including bed and meals - Meals on arrival and departure day_Full charge independent of arrival and departure time
	
		@Given("^open Vessel Manager login with valid user credentials$")
		public void open_Vessel_Manager_login_with_valid_user_credentials() throws Throwable {
			Thread.sleep(1000);
			System.setProperty("webdriver.chrome.driver",config.getChromePath());
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get(config.getSTGURLVM());	
			
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_BROWSERSTARTED_VESSELMANAGER");
			
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMUNINPUTFIELDID())).sendKeys(config.getSTGVMUNAdmin());
			driver.findElement(By.id(config.getSTGVMPWINPUTFIELDID())).sendKeys(config.getSTGVMPWAdmin());
			driver.findElement(By.id(config.getSTGVMLOGINBTN())).click();
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_LOG-IN_VESSELMANAGER");
		}
		
		@Then("^go to Personnel menu$")
		public void go_to_Personnel_menu() throws Throwable {
			Thread.sleep(1000);

			WebElement menu = driver.findElement(By.id(config.getSTGVMPERSONNELMENU()));
			Actions builder = new Actions(driver);    
			builder.moveToElement(menu).build().perform();
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_PERSONNELMENU_M&ASUBMENU");
		}
		
		@Then("^access Meals and Accommodation sub menu$")
		public void access_Meals_and_Accommodation_sub_menu() throws Throwable {
			//Thread.sleep(1000);
			
			//WebElement menuOption = driver.findElement(By.id(config.getSTGVMMASUBMENU()));
			//menuOption.click();
			
			Thread.sleep(1000);
			WebElement menuOption = driver.findElement(By.id("hyp_MA"));
			menuOption.click();
		}
		
		@Then("^validate if the current url is correct$")
		public void validate_if_the_current_url_is_correct() throws Throwable {
			Thread.sleep(1000);
			String URL = driver.getCurrentUrl();
			Assert.assertEquals(URL, config.getSTGVMMEALSANDACCOMMODATIONSUBMENUURL());
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_MEALSANDACCOMMODATIONSUBMENUURL");
		}
		
		@Then("^input valid date range period and click on submit button$")
		public void input_valid_date_range_period_and_click_on_submit_button() throws Throwable {
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodInputfield())).sendKeys("01/01/2018 - 23/01/2018");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodApplybuttonlocator())).click();
	        
	    	ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_DATERANGEPERIOD");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.id(config.getSTGVMSubmitbuttonreportdisplay())).click();
		}
		
		@Then("^access Setup Meals and Charges page$")
		public void access_Setup_Meals_and_Charges_page() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMSettingIconlocator())).click();

				Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMSetupofmealsandchargesIDlocator())).click();
		        
		        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPOFMEALSANDCHARGESMODAL_DISPLAY");
		        
		        Thread.sleep(1000);
		        JavascriptExecutor js = ((JavascriptExecutor) driver);
		        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		       

		}
		
		@Then("^under How to charge click One Charge including bed and meals radio button$")
		public void under_How_to_charge_click_One_Charge_including_bed_and_meals_radio_button() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMOneChargeincludingbedandmealsradio())).click();
		        
		        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPCONFIG1_DISPLAY");
		}
		
		@Then("^under Meals on day of arrival: click Full charge independent of arrival time radio button$")
		public void under_Meals_on_day_of_arrival_click_Full_charge_independent_of_arrival_time_radio_button() throws Throwable {
		       Thread.sleep(1000);
		       driver.findElement(By.xpath(config.getSTGVMChargepercentage3radio())).click();
		       
		        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPCONFIG2_DISPLAY");
		       
		}
		
		@Then("^under Meals on departure day: click Full charge independent of departure time radio button$")
		public void under_Meals_on_departure_day_click_Full_charge_independent_of_departure_time_radio_button() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMOneChargeincludingbedandmealsradio())).click();
		        
		        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPCONFIG3_DISPLAY");
		}
		
		@Then("^click on save changes button$")
		public void click_on_save_changes_button() throws Throwable {
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMSaveMASettingsLocator())).click();
		}
		
		@Then("^validate if the confirmation message that the changes has been saved did display$")
		public void validate_if_the_confirmation_message_that_the_changes_has_been_saved_did_display() throws Throwable {
			Thread.sleep(1000);
			
			String actual_VMMealsandchargessettingssavenotificationtext= driver.findElement(By.xpath(config.getSTGVMMealsandchargessettingssavenotificationlocator())).getAttribute("innerHTML");
			
			String expected_VMMealsandchargessettingssavenotificationtext="Success!";
			
		    Assert.assertEquals(expected_VMMealsandchargessettingssavenotificationtext, actual_VMMealsandchargessettingssavenotificationtext);
		    
		    Assert.assertTrue(actual_VMMealsandchargessettingssavenotificationtext.contains(config.getSTGVMMealsandchargessettingssavenotificationtext()));
			
			
	        System.out.println("VMMealsandchargessettingssavenotificationtext confirmed");
	        
	        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_Newsetupsuccessfullysaved");
		}
		
		@Then("^browser will close$")
		public void browser_will_close() throws Throwable {
		       Thread.sleep(1000);
		       driver.quit();
	
		}
		
		//Scenario:  How to charge_One Charge including bed and meals - Meals on arrival and departure day_Charge percentage (actual hours/24)

		
		@Given("^open Vessel Manager login with valid user credentials -for the second time$")
		public void open_Vessel_Manager_login_with_valid_user_credentials_for_the_second_time() throws Throwable {
			Thread.sleep(1000);
			System.setProperty("webdriver.chrome.driver",config.getChromePath());
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get(config.getSTGURLVM());	
			
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_BROWSERSTARTED_VESSELMANAGER");
			
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMUNINPUTFIELDID())).sendKeys(config.getSTGVMUNAdmin());
			driver.findElement(By.id(config.getSTGVMPWINPUTFIELDID())).sendKeys(config.getSTGVMPWAdmin());
			driver.findElement(By.id(config.getSTGVMLOGINBTN())).click();
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_LOG-IN_VESSELMANAGER");
		}
		
		@Then("^go to Personnel menu -for the second time$")
		public void go_to_Personnel_menu_for_the_second_time() throws Throwable {
			Thread.sleep(1000);

			WebElement menu = driver.findElement(By.id(config.getSTGVMPERSONNELMENU()));
			Actions builder = new Actions(driver);    
			builder.moveToElement(menu).build().perform();
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_PERSONNELMENU_M&ASUBMENU");
		}
		
		@Then("^access Meals and Accommodation sub menu -for the second time$")
		public void access_Meals_and_Accommodation_sub_menu_for_the_second_time() throws Throwable {
			Thread.sleep(1000);
			WebElement menuOption = driver.findElement(By.id("hyp_MA"));
			menuOption.click();
		}
		
		@Then("^validate if the current url is correct -for the second time$")
		public void validate_if_the_current_url_is_correct_for_the_second_time() throws Throwable {
			Thread.sleep(1000);
			String URL = driver.getCurrentUrl();
			Assert.assertEquals(URL, config.getSTGVMMEALSANDACCOMMODATIONSUBMENUURL());
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_MEALSANDACCOMMODATIONSUBMENUURL");
		}
		
		@Then("^input valid date range period and click on submit button -for the second time$")
		public void input_valid_date_range_period_and_click_on_submit_button_for_the_second_time() throws Throwable {
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodInputfield())).sendKeys("01/01/2018 - 23/01/2018");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodApplybuttonlocator())).click();
	        
	    	ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_DATERANGEPERIOD");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.id(config.getSTGVMSubmitbuttonreportdisplay())).click();
		}
		
		@Then("^access Setup Meals and Charges page -for the second time$")
		public void access_Setup_Meals_and_Charges_page_for_the_second_time() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMSettingIconlocator())).click();

				Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMSetupofmealsandchargesIDlocator())).click();
		        
		        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPOFMEALSANDCHARGESMODAL_DISPLAY");
		}
		
		@Then("^under How to charge click One Charge including bed and meals radio button -for the second time$")
		public void under_How_to_charge_click_One_Charge_including_bed_and_meals_radio_button_for_the_second_time() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMOneChargeincludingbedandmealsradio())).click();
		        
		        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPCONFIG4_DISPLAY");
		}
		
		@Then("^under Meals on day of arrival: click Charge in percentage \\( actual hours/ (\\d+) \\) radio button$")
		public void under_Meals_on_day_of_arrival_click_Charge_in_percentage_actual_hours_radio_button(int arg1) throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMChargeinpercentageradio2())).click();
		        
		        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPCONFIG5_DISPLAY");
		}
		
		@Then("^under Meals on departure day: click  Charge percentage \\(actual hours / (\\d+) \\) radio button$")
		public void under_Meals_on_departure_day_click_Charge_percentage_actual_hours_radio_button(int arg1) throws Throwable {
			Thread.sleep(1000);
			driver.findElement(By.xpath(config.getSTGVMChargeinpercentageradio3())).click();
			
	        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPCONFIG6_DISPLAY");
		}
		
		@Then("^click on save changes button -for the second time$")
		public void click_on_save_changes_button_for_the_second_time() throws Throwable {
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMSaveMASettingsLocator())).click();
		}
		
		@Then("^validate if the confirmation message that the changes have been saved did display -for the second time$")
		public void validate_if_the_confirmation_message_that_the_changes_have_been_saved_did_display_for_the_second_time() throws Throwable {
			Thread.sleep(1000);
			
			String actual_VMMealsandchargessettingssavenotificationtext= driver.findElement(By.xpath(config.getSTGVMMealsandchargessettingssavenotificationlocator())).getAttribute("innerHTML");
			
			String expected_VMMealsandchargessettingssavenotificationtext="Success!";
			
		    Assert.assertEquals(expected_VMMealsandchargessettingssavenotificationtext, actual_VMMealsandchargessettingssavenotificationtext);
		    
		    Assert.assertTrue(actual_VMMealsandchargessettingssavenotificationtext.contains(config.getSTGVMMealsandchargessettingssavenotificationtext()));
			
			
	        System.out.println("VMMealsandchargessettingssavenotificationtext confirmed");
	        
	        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_Newsetupsuccessfullysaved");
		}
		
		@And("^browser will close -for the second time$")
		public void browser_will_close_for_the_second_time() throws Throwable {
		       Thread.sleep(1000);
		       driver.quit();
		}
	
		//Scenario:  How to charge_One Charge including bed and meals - Meals on arrival and departure day_No charge
		
		
		@Given("^open Vessel Manager login with valid user credentials -for the third time$")
		public void open_Vessel_Manager_login_with_valid_user_credentials_for_the_third_time() throws Throwable {
			Thread.sleep(1000);
			System.setProperty("webdriver.chrome.driver",config.getChromePath());
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get(config.getSTGURLVM());	
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_BROWSERSTARTED_VESSELMANAGER");
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMUNINPUTFIELDID())).sendKeys(config.getSTGVMUNAdmin());
			driver.findElement(By.id(config.getSTGVMPWINPUTFIELDID())).sendKeys(config.getSTGVMPWAdmin());
			driver.findElement(By.id(config.getSTGVMLOGINBTN())).click();
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_LOG-IN_VESSELMANAGER");
		}
		
		@Then("^go to Personnel menu -for the third time$")
		public void go_to_Personnel_menu_for_the_third_time() throws Throwable {
			Thread.sleep(1000);

			WebElement menu = driver.findElement(By.id(config.getSTGVMPERSONNELMENU()));
			Actions builder = new Actions(driver);    
			builder.moveToElement(menu).build().perform();
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_PERSONNELMENU_M&ASUBMENU");
		}
		
		@Then("^access Meals and Accommodation sub menu -for the third time$")
		public void access_Meals_and_Accommodation_sub_menu_for_the_third_time() throws Throwable {
			Thread.sleep(1000);
			WebElement menuOption = driver.findElement(By.id("hyp_MA"));
			menuOption.click();
		}
		
		@Then("^validate if the current url is correct -for the third time$")
		public void validate_if_the_current_url_is_correct_for_the_third_time() throws Throwable {
			Thread.sleep(1000);
			String URL = driver.getCurrentUrl();
			Assert.assertEquals(URL, config.getSTGVMMEALSANDACCOMMODATIONSUBMENUURL());
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_MEALSANDACCOMMODATIONSUBMENUURL");
		}
		
		@Then("^input valid date range period and click on submit button -for the third time$")
		public void input_valid_date_range_period_and_click_on_submit_button_for_the_third_time() throws Throwable {
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodInputfield())).sendKeys("01/01/2018 - 23/01/2018");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodApplybuttonlocator())).click();
	        
	    	ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_DATERANGEPERIOD");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.id(config.getSTGVMSubmitbuttonreportdisplay())).click();
		}
		
		@Then("^access Setup Meals and Charges page -for the third time$")
		public void access_Setup_Meals_and_Charges_page_for_the_third_time() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMSettingIconlocator())).click();

				Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMSetupofmealsandchargesIDlocator())).click();
		        
		        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPOFMEALSANDCHARGESMODAL_DISPLAY");
		}
		
		@Then("^under How to charge click One Charge including bed and meals radio button -for the third time$")
		public void under_How_to_charge_click_One_Charge_including_bed_and_meals_radio_button_for_the_third_time() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMOneChargeincludingbedandmealsradio())).click();
		}
		
		@Then("^under Meals on day of arrival: click No charge radio button$")
		public void under_Meals_on_day_of_arrival_click_No_charge_radio_button() throws Throwable {
		       Thread.sleep(1000);
		       driver.findElement(By.xpath(config.getSTGVMNoCharge1())).click();
		       
		        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPCONFIG7_DISPLAY");
		}
		
		@Then("^under Meals on departure day: click No charge radio button$")
		public void under_Meals_on_departure_day_click_No_charge_radio_button() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMNoCharge2())).click();
		        
		        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPCONFIG8_DISPLAY");
		}
		
		@Then("^click on save changes button -for the third time$")
		public void click_on_save_changes_button_for_the_third_time() throws Throwable {
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMSaveMASettingsLocator())).click();
		}
		
		@Then("^validate if the confirmation message that the changes have been saved did display -for the third time$")
		public void validate_if_the_confirmation_message_that_the_changes_have_been_saved_did_display_for_the_third_time() throws Throwable {
			Thread.sleep(1000);
			
			String actual_VMMealsandchargessettingssavenotificationtext= driver.findElement(By.xpath(config.getSTGVMMealsandchargessettingssavenotificationlocator())).getAttribute("innerHTML");
			
			String expected_VMMealsandchargessettingssavenotificationtext="Success!";
			
		    Assert.assertEquals(expected_VMMealsandchargessettingssavenotificationtext, actual_VMMealsandchargessettingssavenotificationtext);
		    
		    Assert.assertTrue(actual_VMMealsandchargessettingssavenotificationtext.contains(config.getSTGVMMealsandchargessettingssavenotificationtext()));
			
			
	        System.out.println("VMMealsandchargessettingssavenotificationtext confirmed");
	        
	        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_Newsetupsuccessfullysaved");
		}
		
		@And("^browser will close -for the third time$")
		public void browser_will_close_for_the_third_time() throws Throwable {
		       Thread.sleep(1000);
		       driver.quit();
		}
		
		//Scenario:  How to charge_One Charge including bed and meals - Meals on arrival and departure day_No charge
		
		@Given("^open Vessel Manager login with valid user credentials -for the fourth time$")
		public void open_Vessel_Manager_login_with_valid_user_credentials_for_the_fourth_time() throws Throwable {
			Thread.sleep(1000);
			System.setProperty("webdriver.chrome.driver",config.getChromePath());
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get(config.getSTGURLVM());	
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_BROWSERSTARTED_VESSELMANAGER");
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMUNINPUTFIELDID())).sendKeys(config.getSTGVMUNAdmin());
			driver.findElement(By.id(config.getSTGVMPWINPUTFIELDID())).sendKeys(config.getSTGVMPWAdmin());
			driver.findElement(By.id(config.getSTGVMLOGINBTN())).click();
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_LOG-IN_VESSELMANAGER");
		}
		
		@Then("^go to Personnel menu -for the fourth time$")
		public void go_to_Personnel_menu_for_the_fourth_time() throws Throwable {
			Thread.sleep(1000);

			WebElement menu = driver.findElement(By.id(config.getSTGVMPERSONNELMENU()));
			Actions builder = new Actions(driver);    
			builder.moveToElement(menu).build().perform();
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_PERSONNELMENU_M&ASUBMENU");
		}
		
		@Then("^access Meals and Accommodation sub menu -for the fourth time$")
		public void access_Meals_and_Accommodation_sub_menu_for_the_fourth_time() throws Throwable {
			Thread.sleep(1000);
			WebElement menuOption = driver.findElement(By.id("hyp_MA"));
			menuOption.click();
		}
		
		@Then("^validate if the current url is correct -for the fourth time$")
		public void validate_if_the_current_url_is_correct_for_the_fourth_time() throws Throwable {
			Thread.sleep(1000);
			String URL = driver.getCurrentUrl();
			Assert.assertEquals(URL, config.getSTGVMMEALSANDACCOMMODATIONSUBMENUURL());
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_MEALSANDACCOMMODATIONSUBMENUURL");
		}
		
		@Then("^input valid date range period and click on submit button -for the fourth time$")
		public void input_valid_date_range_period_and_click_on_submit_button_for_the_fourth_time() throws Throwable {
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodInputfield())).sendKeys("01/01/2018 - 23/01/2018");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodApplybuttonlocator())).click();
	        
	    	ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_DATERANGEPERIOD");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.id(config.getSTGVMSubmitbuttonreportdisplay())).click();
		}
		
		@Then("^access Setup Meals and Charges page -for the fourth time$")
		public void access_Setup_Meals_and_Charges_page_for_the_fourth_time() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMSettingIconlocator())).click();

				Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMSetupofmealsandchargesIDlocator())).click();
		        
		        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPOFMEALSANDCHARGESMODAL_DISPLAY");
		}
		
		@Then("^under How to charge click One Charge including bed and meals radio button -for the fourth time$")
		public void under_How_to_charge_click_One_Charge_including_bed_and_meals_radio_button_for_the_fourth_time() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMOneChargeincludingbedandmealsradio())).click();
		        
		        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPCONFIG9_DISPLAY");
		}
		
		@Then("^under Meals on day of arrival: click Charged if arriving before radio button -for the fourth time$")
		public void under_Meals_on_day_of_arrival_click_Charged_if_arriving_before_radio_button_for_the_fourth_time() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMChargedifarrivingbeforeradio())).click();
		        
		        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPCONFIG10_DISPLAY");

		}
		
		@Then("^under Meals on departure day: click Charged if departing after radio button -for the fourth time$")
		public void under_Meals_on_departure_day_click_Charged_if_departing_after_radio_button_for_the_fourth_time() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMChargedifdepartingafter())).click();
		        
		        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPCONFIG11_DISPLAY");
		}
		

		@Then("^input charged if arriving before time -for the fourth time$")
		public void input_charged_if_arriving_before_time_for_the_fourth_time() throws Throwable {
		        Thread.sleep(1000);
		        driver.findElement(By.id(config.getSTGVMChargedifarrivingbeforeTimeLocator())).clear();
		        driver.findElement(By.id(config.getSTGVMChargedifarrivingbeforeTimeLocator())).sendKeys("12:01");

		        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPCONFIG12_DISPLAY");
		}
		
		@Then("^input charged if arriving after time -for the fourth time$")
		public void input_charged_if_arriving_after_time_for_the_fourth_time() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.id(config.getSTGVMChargedifarrivingbeforeTimeLocator2())).clear();
		        driver.findElement(By.id(config.getSTGVMChargedifarrivingbeforeTimeLocator2())).sendKeys("12:01");
		        
		        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPCONFIG13_DISPLAY");
		}
		
		@Then("^click on save changes button -for the fourth time$")
		public void click_on_save_changes_button_for_the_fourth_time() throws Throwable {
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMSaveMASettingsLocator())).click();
		}
		
		@Then("^validate if the confirmation message that the changes have been saved did display -for the fourth time$")
		public void validate_if_the_confirmation_message_that_the_changes_have_been_saved_did_display_for_the_fourth_time() throws Throwable {
			Thread.sleep(1000);
			
			String actual_VMMealsandchargessettingssavenotificationtext= driver.findElement(By.xpath(config.getSTGVMMealsandchargessettingssavenotificationlocator())).getAttribute("innerHTML");
			
			String expected_VMMealsandchargessettingssavenotificationtext="Success!";
			
		    Assert.assertEquals(expected_VMMealsandchargessettingssavenotificationtext, actual_VMMealsandchargessettingssavenotificationtext);
		    
		    Assert.assertTrue(actual_VMMealsandchargessettingssavenotificationtext.contains(config.getSTGVMMealsandchargessettingssavenotificationtext()));
			
			
	        System.out.println("VMMealsandchargessettingssavenotificationtext confirmed");
	        
	        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_Newsetupsuccessfullysaved");
		}
		
		@And("^browser will close -for the fourth time$")
		public void browser_will_close_for_the_fourth_time() throws Throwable {
		       Thread.sleep(1000);
		       driver.quit();
		}
		
		//Scenario:  How to charge_Bed and meals charged separately - Meals on arrival and departure day_Full charge independent of arrival and departure time

		
		@Given("^open Vessel Manager login with valid user credentials -for the fifth time$")
		public void open_Vessel_Manager_login_with_valid_user_credentials_for_the_fifth_time() throws Throwable {
			Thread.sleep(1000);
			System.setProperty("webdriver.chrome.driver",config.getChromePath());
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get(config.getSTGURLVM());	
				
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_BROWSERSTARTED_VESSELMANAGER");
				
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMUNINPUTFIELDID())).sendKeys(config.getSTGVMUNAdmin());
			driver.findElement(By.id(config.getSTGVMPWINPUTFIELDID())).sendKeys(config.getSTGVMPWAdmin());
			driver.findElement(By.id(config.getSTGVMLOGINBTN())).click();
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_LOG-IN_VESSELMANAGER");
		}
		
		@Then("^go to Personnel menu -for the fifth time$")
		public void go_to_Personnel_menu_for_the_fifth_time() throws Throwable {
			Thread.sleep(1000);

			WebElement menu = driver.findElement(By.id(config.getSTGVMPERSONNELMENU()));
			Actions builder = new Actions(driver);    
			builder.moveToElement(menu).build().perform();
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_PERSONNELMENU_M&ASUBMENU");
		}
		
		@Then("^access Meals and Accommodation sub menu -for the fifth time$")
		public void access_Meals_and_Accommodation_sub_menu_for_the_fifth_time() throws Throwable {
			Thread.sleep(1000);
			WebElement menuOption = driver.findElement(By.id("hyp_MA"));
			menuOption.click();
		}
		
		@Then("^validate if the current url is correct -for the fifth time$")
		public void validate_if_the_current_url_is_correct_for_the_fifth_time() throws Throwable {
			Thread.sleep(1000);
			String URL = driver.getCurrentUrl();
			Assert.assertEquals(URL, config.getSTGVMMEALSANDACCOMMODATIONSUBMENUURL());
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_MEALSANDACCOMMODATIONSUBMENUURL");
		}
		
		@Then("^input valid date range period and click on submit button -for the fifth time$")
		public void input_valid_date_range_period_and_click_on_submit_button_for_the_fifth_time() throws Throwable {
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodInputfield())).sendKeys("01/01/2018 - 23/01/2018");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodApplybuttonlocator())).click();
	        
	    	ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_DATERANGEPERIOD");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.id(config.getSTGVMSubmitbuttonreportdisplay())).click();
		}
		
		@Then("^access Setup Meals and Charges page -for the fifth time$")
		public void access_Setup_Meals_and_Charges_page_for_the_fifth_time() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMSettingIconlocator())).click();

				Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMSetupofmealsandchargesIDlocator())).click();
		        
		        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPOFMEALSANDCHARGESMODAL_DISPLAY");
		}
		
		@Then("^under How to charge click Bed and meals charged separately radio button -for the fifth time$")
		public void under_How_to_charge_click_Bed_and_meals_charged_separately_radio_button_for_the_fifth_time() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMBedandmealschargedseparatelyradio())).click();
		        
		        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPCONFIG14_DISPLAY");
		   
		}
		        
	    @Then("^input any amount to Accommodation and bed charges for (\\d+) day$")
	    public void input_any_amount_to_Accommodation_and_bed_charges_for_day(int arg1) throws Throwable {
			    Thread.sleep(1000);
			    driver.findElement(By.id(config.getSTGVMAccombedchargesfirstfieldlocator())).sendKeys("50");
			    
		        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPCONFIG15_DISPLAY");
		}
		
		@Then("^under Meals on day of arrival: click Full charge independent of arrival time radio button -for the fifth time$")
		public void under_Meals_on_day_of_arrival_click_Full_charge_independent_of_arrival_time_radio_button_for_the_fifth_time() throws Throwable {
		       Thread.sleep(1000);
		       driver.findElement(By.xpath(config.getSTGVMChargeinpercentageradio2())).click();
		       
		        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPCONFIG16_DISPLAY");
		}
		
		@Then("^under Meals on departure day: click Full charge independent of departure time radio button -for the fifth time$")
		public void under_Meals_on_departure_day_click_Full_charge_independent_of_departure_time_radio_button_for_the_fifth_time() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMChargeinpercentageradio3())).click();
		        
		        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPCONFIG17_DISPLAY");

		}
		
		@Then("^click on save changes button -for the fifth time$")
		public void click_on_save_changes_button_for_the_fifth_time() throws Throwable {
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMSaveMASettingsLocator())).click();
			

		}
		
		@Then("^validate if the confirmation message that the changes have been saved did display -for the fifth time$")
		public void validate_if_the_confirmation_message_that_the_changes_have_been_saved_did_display_for_the_fifth_time() throws Throwable {
			Thread.sleep(1000);
			
			String actual_VMMealsandchargessettingssavenotificationtext= driver.findElement(By.xpath(config.getSTGVMMealsandchargessettingssavenotificationlocator())).getAttribute("innerHTML");
			
			String expected_VMMealsandchargessettingssavenotificationtext="Success!";
			
		    Assert.assertEquals(expected_VMMealsandchargessettingssavenotificationtext, actual_VMMealsandchargessettingssavenotificationtext);
		    
		    Assert.assertTrue(actual_VMMealsandchargessettingssavenotificationtext.contains(config.getSTGVMMealsandchargessettingssavenotificationtext()));
			
			
	        System.out.println("VMMealsandchargessettingssavenotificationtext confirmed");
	        
	        ConfigReader.captureScreesnhot(driver, "29219_Newsetupsuccessfullysaved");
		}
		
		@And("^browser will close -for the fifth time$")
		public void browser_will_close_for_the_fifth_time() throws Throwable {
		       Thread.sleep(1000);
		       driver.quit();
		}
		
		
		//Scenario:  How to charge_Bed and meals charged separately - Meals on arrival and departure day_Charge percentage (actual hours/24)
		
		@Given("^open Vessel Manager login with valid user credentials -for the sixth time$")
		public void open_Vessel_Manager_login_with_valid_user_credentials_for_the_sixth_time() throws Throwable {
			Thread.sleep(1000);
			System.setProperty("webdriver.chrome.driver",config.getChromePath());
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get(config.getSTGURLVM());	
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_BROWSERSTARTED_VESSELMANAGER");
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMUNINPUTFIELDID())).sendKeys(config.getSTGVMUNAdmin());
			driver.findElement(By.id(config.getSTGVMPWINPUTFIELDID())).sendKeys(config.getSTGVMPWAdmin());
			driver.findElement(By.id(config.getSTGVMLOGINBTN())).click();
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_LOG-IN_VESSELMANAGER");
		}
		
		@Then("^go to Personnel menu -for the sixth time$")
		public void go_to_Personnel_menu_for_the_sixth_time() throws Throwable {
			Thread.sleep(1000);

			WebElement menu = driver.findElement(By.id(config.getSTGVMPERSONNELMENU()));
			Actions builder = new Actions(driver);    
			builder.moveToElement(menu).build().perform();
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_PERSONNELMENU_M&ASUBMENU");
		}
		
		@Then("^access Meals and Accommodation sub menu -for the sixth time$")
		public void access_Meals_and_Accommodation_sub_menu_for_the_sixth_time() throws Throwable {
			Thread.sleep(1000);
			WebElement menuOption = driver.findElement(By.id("hyp_MA"));
			menuOption.click();
		}
		
		@Then("^validate if the current url is correct -for the sixth time$")
		public void validate_if_the_current_url_is_correct_for_the_sixth_time() throws Throwable {
			Thread.sleep(1000);
			String URL = driver.getCurrentUrl();
			Assert.assertEquals(URL, config.getSTGVMMEALSANDACCOMMODATIONSUBMENUURL());
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_MEALSANDACCOMMODATIONSUBMENUURL");
		}
		
		@Then("^input valid date range period and click on submit button -for the sixth time$")
		public void input_valid_date_range_period_and_click_on_submit_button_for_the_sixth_time() throws Throwable {
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodInputfield())).sendKeys("01/01/2018 - 23/01/2018");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodApplybuttonlocator())).click();
	        
	    	ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_DATERANGEPERIOD");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.id(config.getSTGVMSubmitbuttonreportdisplay())).click();
		}
		
		@Then("^access Setup Meals and Charges page -for the sixth time$")
		public void access_Setup_Meals_and_Charges_page_for_the_sixth_time() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMSettingIconlocator())).click();

				Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMSetupofmealsandchargesIDlocator())).click();
		        
		        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPOFMEALSANDCHARGESMODAL_DISPLAY");
		}
		
		@Then("^under How to charge click Bed and meals charged separately radio button -for the sixth time$")
		public void under_How_to_charge_click_Bed_and_meals_charged_separately_radio_button_for_the_sixth_time() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMBedandmealschargedseparatelyradio())).click();
		        
		        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPCONFIG17_DISPLAY");
		}
		
		@Then("^under Meals on day of arrival: click Charge in percentage \\( actual hours/ (\\d+) \\) radio button -for the sixth time$")
		public void under_Meals_on_day_of_arrival_click_Charge_in_percentage_actual_hours_radio_button_for_the_sixth_time(int arg1) throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMChargeinpercentageradio2())).click();
		        
		        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPCONFIG18_DISPLAY");
		}
		
		@Then("^under Meals on departure day: click  Charge percentage \\(actual hours / (\\d+) \\) radio button -for the sixth time$")
		public void under_Meals_on_departure_day_click_Charge_percentage_actual_hours_radio_button_for_the_sixth_time(int arg1) throws Throwable {
			Thread.sleep(1000);
			driver.findElement(By.xpath(config.getSTGVMChargeinpercentageradio3())).click();
			
	        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPCONFIG19_DISPLAY");
		}
		
		@Then("^click on save changes button -for the sixth time$")
		public void click_on_save_changes_button_for_the_sixth_time() throws Throwable {
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMSaveMASettingsLocator())).click();
		}
		
		@Then("^validate if the confirmation message that the changes has been saved did display -for the sixth time$")
		public void validate_if_the_confirmation_message_that_the_changes_has_been_saved_did_display_for_the_sixth_time() throws Throwable {
			Thread.sleep(1000);
			
			String actual_VMMealsandchargessettingssavenotificationtext= driver.findElement(By.xpath(config.getSTGVMMealsandchargessettingssavenotificationlocator())).getAttribute("innerHTML");
			
			String expected_VMMealsandchargessettingssavenotificationtext="Success!";
			
		    Assert.assertEquals(expected_VMMealsandchargessettingssavenotificationtext, actual_VMMealsandchargessettingssavenotificationtext);
		    
		    Assert.assertTrue(actual_VMMealsandchargessettingssavenotificationtext.contains(config.getSTGVMMealsandchargessettingssavenotificationtext()));
			
			
	        System.out.println("VMMealsandchargessettingssavenotificationtext confirmed");
	        
	        ConfigReader.captureScreesnhot(driver, "29219_Newsetupsuccessfullysaved");
		}
		
		@And("^browser will close -for the sixth time$")
		public void browser_will_close_for_the_sixth_time() throws Throwable {
		       Thread.sleep(1000);
		       driver.quit();
		}
		
		//Scenario:  How to charge_Bed and meals charged separately - Meals on arrival and departure day_No charge
		
		@Given("^open Vessel Manager login with valid user credentials -for the seventh time$")
		public void open_Vessel_Manager_login_with_valid_user_credentials_for_the_seventh_time() throws Throwable {
			Thread.sleep(1000);
			System.setProperty("webdriver.chrome.driver",config.getChromePath());
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get(config.getSTGURLVM());	
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_BROWSERSTARTED_VESSELMANAGER");
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMUNINPUTFIELDID())).sendKeys(config.getSTGVMUNAdmin());
			driver.findElement(By.id(config.getSTGVMPWINPUTFIELDID())).sendKeys(config.getSTGVMPWAdmin());
			driver.findElement(By.id(config.getSTGVMLOGINBTN())).click();
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_LOG-IN_VESSELMANAGER");
		}
		
		@Then("^go to Personnel menu -for the seventh time$")
		public void go_to_Personnel_menu_for_the_seventh_time() throws Throwable {
			Thread.sleep(1000);

			WebElement menu = driver.findElement(By.id(config.getSTGVMPERSONNELMENU()));
			Actions builder = new Actions(driver);    
			builder.moveToElement(menu).build().perform();
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_PERSONNELMENU_M&ASUBMENU");
		}
		
		@Then("^access Meals and Accommodation sub menu -for the seventh time$")
		public void access_Meals_and_Accommodation_sub_menu_for_the_seventh_time() throws Throwable {
			Thread.sleep(1000);
			WebElement menuOption = driver.findElement(By.id("hyp_MA"));
			menuOption.click();
		}
		
		@Then("^validate if the current url is correct -for the seventh time$")
		public void validate_if_the_current_url_is_correct_for_the_seventh_time() throws Throwable {
			Thread.sleep(1000);
			String URL = driver.getCurrentUrl();
			Assert.assertEquals(URL, config.getSTGVMMEALSANDACCOMMODATIONSUBMENUURL());
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_MEALSANDACCOMMODATIONSUBMENUURL");
		}
		
		@Then("^input valid date range period and click on submit button -for the seventh time$")
		public void input_valid_date_range_period_and_click_on_submit_button_for_the_seventh_time() throws Throwable {
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodInputfield())).sendKeys("01/01/2018 - 23/01/2018");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodApplybuttonlocator())).click();
	        
	    	ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_DATERANGEPERIOD");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.id(config.getSTGVMSubmitbuttonreportdisplay())).click();
		}
		
		@Then("^access Setup Meals and Charges page -for the seventh time$")
		public void access_Setup_Meals_and_Charges_page_for_the_seventh_time() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMSettingIconlocator())).click();

				Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMSetupofmealsandchargesIDlocator())).click();
		        
		        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPOFMEALSANDCHARGESMODAL_DISPLAY");
		}
		
		@Then("^under How to charge click Bed and meals charged separately radio button -for the seventh time$")
		public void under_How_to_charge_click_Bed_and_meals_charged_separately_radio_button_for_the_seventh_time() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMBedandmealschargedseparatelyradio())).click();
		}
		
		@Then("^under Meals on day of arrival: click No charge radio button -for the seventh time$")
		public void under_Meals_on_day_of_arrival_click_No_charge_radio_button_for_the_seventh_time() throws Throwable {
		       Thread.sleep(1000);
		       driver.findElement(By.xpath(config.getSTGVMNoCharge1())).click();
		       
		        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPCONFIG20_DISPLAY");
		}
		
		@Then("^under Meals on departure day: click No charge radio button -for the seventh time$")
		public void under_Meals_on_departure_day_click_No_charge_radio_button_for_the_seventh_time() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMNoCharge2())).click();
		        
		        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPCONFIG21_DISPLAY");
		}
		
		@Then("^click on save changes button -for the seventh time$")
		public void click_on_save_changes_button_for_the_seventh_time() throws Throwable {
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMSaveMASettingsLocator())).click();
		}
		
		@Then("^validate if the confirmation message that the changes have been saved did display -for the seventh time$")
		public void validate_if_the_confirmation_message_that_the_changes_have_been_saved_did_display_for_the_seventh_time() throws Throwable {
			Thread.sleep(1000);
			
			String actual_VMMealsandchargessettingssavenotificationtext= driver.findElement(By.xpath(config.getSTGVMMealsandchargessettingssavenotificationlocator())).getAttribute("innerHTML");
			
			String expected_VMMealsandchargessettingssavenotificationtext="Success!";
			
		    Assert.assertEquals(expected_VMMealsandchargessettingssavenotificationtext, actual_VMMealsandchargessettingssavenotificationtext);
		    
		    Assert.assertTrue(actual_VMMealsandchargessettingssavenotificationtext.contains(config.getSTGVMMealsandchargessettingssavenotificationtext()));
			
			
	        System.out.println("VMMealsandchargessettingssavenotificationtext confirmed");
	        
	        ConfigReader.captureScreesnhot(driver, "29219_Newsetupsuccessfullysaved");
		}
		
		@Then("^browser will close -for the seventh time$")
		public void browser_will_close_for_the_seventh_time() throws Throwable {
		       Thread.sleep(1000);
		       driver.quit();
		}
		
		//Scenario:  How to charge_Bed and meals charged separately - Meals on arrival and departure day_Charged if arriving before & After
		
		@Given("^open Vessel Manager login with valid user credentials -for the ninth time$")
		public void open_Vessel_Manager_login_with_valid_user_credentials_for_the_ninth_time() throws Throwable {
			Thread.sleep(1000);
			System.setProperty("webdriver.chrome.driver",config.getChromePath());
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get(config.getSTGURLVM());	
				
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_BROWSERSTARTED_VESSELMANAGER");
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMUNINPUTFIELDID())).sendKeys(config.getSTGVMUNAdmin());
			driver.findElement(By.id(config.getSTGVMPWINPUTFIELDID())).sendKeys(config.getSTGVMPWAdmin());
			driver.findElement(By.id(config.getSTGVMLOGINBTN())).click();
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_LOG-IN_VESSELMANAGER");
		}
		
		@Then("^go to Personnel menu -for the ninth time$")
		public void go_to_Personnel_menu_for_the_ninth_time() throws Throwable {
			Thread.sleep(1000);

			WebElement menu = driver.findElement(By.id(config.getSTGVMPERSONNELMENU()));
			Actions builder = new Actions(driver);    
			builder.moveToElement(menu).build().perform();
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_PERSONNELMENU_M&ASUBMENU");
		}
		
		@Then("^access Meals and Accommodation sub menu -for the ninth time$")
		public void access_Meals_and_Accommodation_sub_menu_for_the_ninth_time() throws Throwable {
			Thread.sleep(1000);
			WebElement menuOption = driver.findElement(By.id("hyp_MA"));
			menuOption.click();
		}
		
		@Then("^validate if the current url is correct -for the ninth time$")
		public void validate_if_the_current_url_is_correct_for_the_ninth_time() throws Throwable {
			Thread.sleep(1000);
			String URL = driver.getCurrentUrl();
			Assert.assertEquals(URL, config.getSTGVMMEALSANDACCOMMODATIONSUBMENUURL());
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_MEALSANDACCOMMODATIONSUBMENUURL");
		}
		
		@Then("^input valid date range period and click on submit button -for the ninth time$")
		public void input_valid_date_range_period_and_click_on_submit_button_for_the_ninth_time() throws Throwable {
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodInputfield())).sendKeys("01/01/2018 - 23/01/2018");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodApplybuttonlocator())).click();
	        
	    	ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_DATERANGEPERIOD");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.id(config.getSTGVMSubmitbuttonreportdisplay())).click();
		}
		
		@Then("^access Setup Meals and Charges page -for the ninth time$")
		public void access_Setup_Meals_and_Charges_page_for_the_ninth_time() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMSettingIconlocator())).click();

				Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMSetupofmealsandchargesIDlocator())).click();
		        
		        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPOFMEALSANDCHARGESMODAL_DISPLAY");
		}
		
		@Then("^under How to charge click Bed and meals charged separately radio button -for the ninth time$")
		public void under_How_to_charge_click_Bed_and_meals_charged_separately_radio_button_for_the_ninth_time() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMBedandmealschargedseparatelyradio())).click();
		        
		        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPCONFIG30_DISPLAY");
		}
		
		@Then("^under Meals on day of arrival: click Charged if arriving before radio button -for the ninth time$")
		public void under_Meals_on_day_of_arrival_click_Charged_if_arriving_before_radio_button_for_the_ninth_time() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMChargedifarrivingbeforeradio())).click();
		        
		        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPCONFIG31_DISPLAY");
		}
		
		@Then("^input charged if arriving before time -for the ninth time$")
		public void input_charged_if_arriving_before_time_for_the_ninth_time() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMChargedifdepartingafter())).click();
		        
		        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPCONFIG32_DISPLAY");
		}
		
		@Then("^under Meals on departure day: click Charged if departing after radio button -for the ninth time$")
		public void under_Meals_on_departure_day_click_Charged_if_departing_after_radio_button_for_the_ninth_time() throws Throwable {
	        Thread.sleep(1000);
	        driver.findElement(By.id(config.getSTGVMChargedifarrivingbeforeTimeLocator())).clear();
	        driver.findElement(By.id(config.getSTGVMChargedifarrivingbeforeTimeLocator())).sendKeys("12:01");
	        
	        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPCONFIG33_DISPLAY");
		}
		
		@Then("^input charged if arriving after time -for the ninth time$")
		public void input_charged_if_arriving_after_time_for_the_ninth_time() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.id(config.getSTGVMChargedifarrivingbeforeTimeLocator2())).clear();
		        driver.findElement(By.id(config.getSTGVMChargedifarrivingbeforeTimeLocator2())).sendKeys("12:01");
		        
		        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPCONFIG34_DISPLAY");
		}
		
		@Then("^click on save changes button -for the ninth time$")
		public void click_on_save_changes_button_for_the_ninth_time() throws Throwable {
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMSaveMASettingsLocator())).click();
		}
		
		@Then("^validate if the confirmation message that the changes have been saved did display -for the ninth time$")
		public void validate_if_the_confirmation_message_that_the_changes_have_been_saved_did_display_for_the_ninth_time() throws Throwable {
			Thread.sleep(1000);
			
			String actual_VMMealsandchargessettingssavenotificationtext= driver.findElement(By.xpath(config.getSTGVMMealsandchargessettingssavenotificationlocator())).getAttribute("innerHTML");
			
			String expected_VMMealsandchargessettingssavenotificationtext="Success!";
			
		    Assert.assertEquals(expected_VMMealsandchargessettingssavenotificationtext, actual_VMMealsandchargessettingssavenotificationtext);
		    
		    Assert.assertTrue(actual_VMMealsandchargessettingssavenotificationtext.contains(config.getSTGVMMealsandchargessettingssavenotificationtext()));
			
			
	        System.out.println("VMMealsandchargessettingssavenotificationtext confirmed");
	        
	        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_Newsetupsuccessfullysaved");
		}
		
		@And("^browser will close -for the ninth time$")
		public void browser_will_close_for_the_ninth_time() throws Throwable {
		       Thread.sleep(1000);
		       driver.quit();
		}
		
		//Scenario:  How to charge_Bed and each meal charged separately - Meals on arrival and departure day_Full charge independent of arrival and departure time
		
		@Given("^open Vessel Manager login with valid user credentials -for the tenth time$")
		public void open_Vessel_Manager_login_with_valid_user_credentials_for_the_tenth_time() throws Throwable {
			Thread.sleep(1000);
			System.setProperty("webdriver.chrome.driver",config.getChromePath());
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get(config.getSTGURLVM());	
			
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_BROWSERSTARTED_VESSELMANAGER");
			
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMUNINPUTFIELDID())).sendKeys(config.getSTGVMUNAdmin());
			driver.findElement(By.id(config.getSTGVMPWINPUTFIELDID())).sendKeys(config.getSTGVMPWAdmin());
			driver.findElement(By.id(config.getSTGVMLOGINBTN())).click();
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_LOG-IN_VESSELMANAGER");
		}
		
		@Then("^go to Personnel menu -for the tenth time$")
		public void go_to_Personnel_menu_for_the_tenth_time() throws Throwable {
			Thread.sleep(1000);

			WebElement menu = driver.findElement(By.id(config.getSTGVMPERSONNELMENU()));
			Actions builder = new Actions(driver);    
			builder.moveToElement(menu).build().perform();
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_PERSONNELMENU_M&ASUBMENU");
		}
		
		@Then("^access Meals and Accommodation sub menu -for the tenth time$")
		public void access_Meals_and_Accommodation_sub_menu_for_the_tenth_time() throws Throwable {
			Thread.sleep(1000);
			WebElement menuOption = driver.findElement(By.id("hyp_MA"));
			menuOption.click();
		}
		
		@Then("^validate if the current url is correct -for the tenth time$")
		public void validate_if_the_current_url_is_correct_for_the_tenth_time() throws Throwable {
			Thread.sleep(1000);
			String URL = driver.getCurrentUrl();
			Assert.assertEquals(URL, config.getSTGVMMEALSANDACCOMMODATIONSUBMENUURL());
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_MEALSANDACCOMMODATIONSUBMENUURL");
		}
		
		@Then("^input valid date range period and click on submit button -for the tenth time$")
		public void input_valid_date_range_period_and_click_on_submit_button_for_the_tenth_time() throws Throwable {
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodInputfield())).sendKeys("01/01/2018 - 23/01/2018");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodApplybuttonlocator())).click();
	        
	    	ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_DATERANGEPERIOD");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.id(config.getSTGVMSubmitbuttonreportdisplay())).click();
		}
		
		@Then("^access Setup Meals and Charges page -for the tenth time$")
		public void access_Setup_Meals_and_Charges_page_for_the_tenth_time() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMSettingIconlocator())).click();

				Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMSetupofmealsandchargesIDlocator())).click();
		        
		        ConfigReader.captureScreesnhot(driver, "29219_VMSetupofmealsandchargespage");
		}
		
		@Then("^under How to charge click Bed and each meal charged separately radio button -for the tenth time$")
		public void under_How_to_charge_click_Bed_and_each_meal_charged_separately_radio_button_for_the_tenth_time() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMBedandeachmealchargedseparatelyradio())).click();
		}
		
		@Then("^under Meals on day of arrival: click Full charge independent of arrival time radio button -for the tenth time$")
		public void under_Meals_on_day_of_arrival_click_Full_charge_independent_of_arrival_time_radio_button_for_the_tenth_time() throws Throwable {
		       Thread.sleep(1000);
		       driver.findElement(By.xpath(config.getSTGVMChargepercentage3radio())).click();
		}
		
		@Then("^under Meals on departure day: click Full charge independent of departure time radio button -for the tenth time$")
		public void under_Meals_on_departure_day_click_Full_charge_independent_of_departure_time_radio_button_for_the_tenth_time() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMOneChargeincludingbedandmealsradio())).click();
		}
		
		@Then("^click on save changes button -for the tenth time$")
		public void click_on_save_changes_button_for_the_tenth_time() throws Throwable {
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMSaveMASettingsLocator())).click();
		}
		
		@Then("^validate if the confirmation message that the changes have been saved did display -for the tenth time$")
		public void validate_if_the_confirmation_message_that_the_changes_have_been_saved_did_display_for_the_tenth_time() throws Throwable {
			Thread.sleep(1000);
			
			String actual_VMMealsandchargessettingssavenotificationtext= driver.findElement(By.xpath(config.getSTGVMMealsandchargessettingssavenotificationlocator())).getAttribute("innerHTML");
			
			String expected_VMMealsandchargessettingssavenotificationtext="Success!";
			
		    Assert.assertEquals(expected_VMMealsandchargessettingssavenotificationtext, actual_VMMealsandchargessettingssavenotificationtext);
		    
		    Assert.assertTrue(actual_VMMealsandchargessettingssavenotificationtext.contains(config.getSTGVMMealsandchargessettingssavenotificationtext()));
			
			
	        System.out.println("VMMealsandchargessettingssavenotificationtext confirmed");
	        
	        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_Newsetupsuccessfullysaved");
		}
		
		@And("^browser will close -for the tenth time$")
		public void browser_will_close_for_the_tenth_time() throws Throwable {
		       Thread.sleep(1000);
		       driver.quit();
		}
		
		//Scenario:  How to charge_Bed and each meal charged separately - Meals on arrival and departure day_Charge percentage (actual hours/24)
		
		@Given("^open Vessel Manager login with valid user credentials -for the eleventh time$")
		public void open_Vessel_Manager_login_with_valid_user_credentials_for_the_eleventh_time() throws Throwable {
			Thread.sleep(1000);
			System.setProperty("webdriver.chrome.driver",config.getChromePath());
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get(config.getSTGURLVM());	
			
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_BROWSERSTARTED_VESSELMANAGER");
			
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMUNINPUTFIELDID())).sendKeys(config.getSTGVMUNAdmin());
			driver.findElement(By.id(config.getSTGVMPWINPUTFIELDID())).sendKeys(config.getSTGVMPWAdmin());
			driver.findElement(By.id(config.getSTGVMLOGINBTN())).click();
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_LOG-IN_VESSELMANAGER");
		}
		
		@Then("^go to Personnel menu -for the eleventh time$")
		public void go_to_Personnel_menu_for_the_eleventh_time() throws Throwable {
			Thread.sleep(1000);

			WebElement menu = driver.findElement(By.id(config.getSTGVMPERSONNELMENU()));
			Actions builder = new Actions(driver);    
			builder.moveToElement(menu).build().perform();
		}
		
		@Then("^access Meals and Accommodation sub menu -for the eleventh time$")
		public void access_Meals_and_Accommodation_sub_menu_for_the_eleventh_time() throws Throwable {
			Thread.sleep(1000);
			WebElement menuOption = driver.findElement(By.id("hyp_MA"));
			menuOption.click();
		}
		
		@Then("^validate if the current url is correct -for the eleventh time$")
		public void validate_if_the_current_url_is_correct_for_the_eleventh_time() throws Throwable {
			Thread.sleep(1000);
			String URL = driver.getCurrentUrl();
			Assert.assertEquals(URL, config.getSTGVMMEALSANDACCOMMODATIONSUBMENUURL());
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_MEALSANDACCOMMODATIONSUBMENUURL");
		}
		
		@Then("^input valid date range period and click on submit button -for the eleventh time$")
		public void input_valid_date_range_period_and_click_on_submit_button_for_the_eleventh_time() throws Throwable {
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodInputfield())).sendKeys("01/01/2018 - 23/01/2018");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodApplybuttonlocator())).click();
	        
	    	ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_DATERANGEPERIOD");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.id(config.getSTGVMSubmitbuttonreportdisplay())).click();
		}
		
		@Then("^access Setup Meals and Charges page -for the eleventh time$")
		public void access_Setup_Meals_and_Charges_page_for_the_eleventh_time() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMSettingIconlocator())).click();

				Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMSetupofmealsandchargesIDlocator())).click();
		        
		        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPOFMEALSANDCHARGESMODAL_DISPLAY");

		}
		
		@Then("^under How to charge click Bed and each meal charged separately radio button -for the eleventh time$")
		public void under_How_to_charge_click_Bed_and_each_meal_charged_separately_radio_button_for_the_eleventh_time() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMBedandeachmealchargedseparatelyradio())).click();
		}
		
		@Then("^under Meals on day of arrival: click Charge in percentage \\( actual hours/ (\\d+) \\) radio button -for the eleventh time$")
		public void under_Meals_on_day_of_arrival_click_Charge_in_percentage_actual_hours_radio_button_for_the_eleventh_time(int arg1) throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMChargeinpercentageradio2())).click();
		}
		
		@Then("^under Meals on departure day: click  Charge percentage \\(actual hours / (\\d+) \\) radio button -for the eleventh time$")
		public void under_Meals_on_departure_day_click_Charge_percentage_actual_hours_radio_button_for_the_eleventh_time(int arg1) throws Throwable {
			Thread.sleep(1000);
			driver.findElement(By.xpath(config.getSTGVMChargeinpercentageradio3())).click();
		}
		
		@Then("^click on save changes button -for the eleventh time$")
		public void click_on_save_changes_button_for_the_eleventh_time() throws Throwable {
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMSaveMASettingsLocator())).click();
		}
		
		@Then("^validate if the confirmation message that the changes have been saved did display -for the eleventh time$")
		public void validate_if_the_confirmation_message_that_the_changes_have_been_saved_did_display_for_the_eleventh_time() throws Throwable {
			Thread.sleep(1000);
			
			String actual_VMMealsandchargessettingssavenotificationtext= driver.findElement(By.xpath(config.getSTGVMMealsandchargessettingssavenotificationlocator())).getAttribute("innerHTML");
			
			String expected_VMMealsandchargessettingssavenotificationtext="Success!";
			
		    Assert.assertEquals(expected_VMMealsandchargessettingssavenotificationtext, actual_VMMealsandchargessettingssavenotificationtext);
		    
		    Assert.assertTrue(actual_VMMealsandchargessettingssavenotificationtext.contains(config.getSTGVMMealsandchargessettingssavenotificationtext()));
			
			
	        System.out.println("VMMealsandchargessettingssavenotificationtext confirmed");
	        
	        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_Newsetupsuccessfullysaved");
		}
		
		@And("^browser will close -for the eleventh time$")
		public void browser_will_close_for_the_eleventh_time() throws Throwable {
		       Thread.sleep(1000);
		       driver.quit();
		}
		
		//Scenario:  How to charge_Bed and each meal charged separately - Meals on arrival and departure day_No charge
		
		@Given("^open Vessel Manager login with valid user credentials -for the twelfth time$")
		public void open_Vessel_Manager_login_with_valid_user_credentials_for_the_twelfth_time() throws Throwable {
			Thread.sleep(1000);
			System.setProperty("webdriver.chrome.driver",config.getChromePath());
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get(config.getSTGURLVM());	
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_BROWSERSTARTED_VESSELMANAGER");
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMUNINPUTFIELDID())).sendKeys(config.getSTGVMUNAdmin());
			driver.findElement(By.id(config.getSTGVMPWINPUTFIELDID())).sendKeys(config.getSTGVMPWAdmin());
			driver.findElement(By.id(config.getSTGVMLOGINBTN())).click();
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_LOG-IN_VESSELMANAGER");
		}
		
		@Then("^go to Personnel menu -for the twelfth time$")
		public void go_to_Personnel_menu_for_the_twelfth_time() throws Throwable {
			Thread.sleep(1000);

			WebElement menu = driver.findElement(By.id(config.getSTGVMPERSONNELMENU()));
			Actions builder = new Actions(driver);    
			builder.moveToElement(menu).build().perform();
		}
		
		@Then("^access Meals and Accommodation sub menu -for the twelfth time$")
		public void access_Meals_and_Accommodation_sub_menu_for_the_twelfth_time() throws Throwable {
			Thread.sleep(1000);
			WebElement menuOption = driver.findElement(By.id("hyp_MA"));
			menuOption.click();
		}
		
		@Then("^validate if the current url is correct -for the twelfth time$")
		public void validate_if_the_current_url_is_correct_for_the_twelfth_time() throws Throwable {
			Thread.sleep(1000);
			String URL = driver.getCurrentUrl();
			Assert.assertEquals(URL, config.getSTGVMMEALSANDACCOMMODATIONSUBMENUURL());
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_MEALSANDACCOMMODATIONSUBMENUURL");
		}
		
		@Then("^input valid date range period and click on submit button -for the twelfth time$")
		public void input_valid_date_range_period_and_click_on_submit_button_for_the_twelfth_time() throws Throwable {
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodInputfield())).sendKeys("01/01/2018 - 23/01/2018");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodApplybuttonlocator())).click();
	        
	    	ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_DATERANGEPERIOD");
	    	
	        Thread.sleep(1000);
	        driver.findElement(By.id(config.getSTGVMSubmitbuttonreportdisplay())).click();
		}
	        @Then("^access Setup Meals and Charges page -for the twelfth time$")
	        public void access_Setup_Meals_and_Charges_page_for_the_twelfth_time() throws Throwable {
	        
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMSettingIconlocator())).click();

				Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMSetupofmealsandchargesIDlocator())).click();
		        
		        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPOFMEALSANDCHARGESMODAL_DISPLAY");
		}
		
		@Then("^under How to charge click Bed and each meal charged separately radio button -for the twelfth time$")
		public void under_How_to_charge_click_Bed_and_each_meal_charged_separately_radio_button_for_the_twelfth_time() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMBedandeachmealchargedseparatelyradio())).click();
		}
		
		@Then("^under Meals on day of arrival: click No charge radio button -for the twelfth time$")
		public void under_Meals_on_day_of_arrival_click_No_charge_radio_button_for_the_twelfth_time() throws Throwable {
		       Thread.sleep(1000);
		       driver.findElement(By.xpath(config.getSTGVMNoCharge1())).click();
		}
		
		@Then("^under Meals on departure day: click No charge radio button -for the twelfth time$")
		public void under_Meals_on_departure_day_click_No_charge_radio_button_for_the_twelfth_time() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMNoCharge2())).click();
		}
		
		@Then("^click on save changes button -for the twelfth time$")
		public void click_on_save_changes_button_for_the_twelfth_time() throws Throwable {
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMSaveMASettingsLocator())).click();
		}
		
		@Then("^validate if the confirmation message that the changes have been saved did display -for the twelfth time$")
		public void validate_if_the_confirmation_message_that_the_changes_have_been_saved_did_display_for_the_twelfth_time() throws Throwable {
			Thread.sleep(1000);
			
			String actual_VMMealsandchargessettingssavenotificationtext= driver.findElement(By.xpath(config.getSTGVMMealsandchargessettingssavenotificationlocator())).getAttribute("innerHTML");
			
			String expected_VMMealsandchargessettingssavenotificationtext="Success!";
			
		    Assert.assertEquals(expected_VMMealsandchargessettingssavenotificationtext, actual_VMMealsandchargessettingssavenotificationtext);
		    
		    Assert.assertTrue(actual_VMMealsandchargessettingssavenotificationtext.contains(config.getSTGVMMealsandchargessettingssavenotificationtext()));
			
			
	        System.out.println("VMMealsandchargessettingssavenotificationtext confirmed");
	        
	        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_Newsetupsuccessfullysaved");
		}
		
		@And("^browser will close -for the twelfth time$")
		public void browser_will_close_for_the_twelfth_time() throws Throwable {
		       Thread.sleep(1000);
		       driver.quit();
		}
		
		//Scenario:  How to charge_Bed and each meal charged separately - Meals on arrival and departure day_Charged if arriving before & After
		
		@Given("^open Vessel Manager login with valid user credentials -for the thirteenth time$")
		public void open_Vessel_Manager_login_with_valid_user_credentials_for_the_thirteenth_time() throws Throwable {
			Thread.sleep(1000);
			System.setProperty("webdriver.chrome.driver",config.getChromePath());
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get(config.getSTGURLVM());	
			
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_BROWSERSTARTED_VESSELMANAGER");
			
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMUNINPUTFIELDID())).sendKeys(config.getSTGVMUNAdmin());
			driver.findElement(By.id(config.getSTGVMPWINPUTFIELDID())).sendKeys(config.getSTGVMPWAdmin());
			driver.findElement(By.id(config.getSTGVMLOGINBTN())).click();
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_LOG-IN_VESSELMANAGER");
		}
		
		@Then("^go to Personnel menu -for the thirteenth time$")
		public void go_to_Personnel_menu_for_the_thirteenth_time() throws Throwable {
			Thread.sleep(1000);

			WebElement menu = driver.findElement(By.id(config.getSTGVMPERSONNELMENU()));
			Actions builder = new Actions(driver);    
			builder.moveToElement(menu).build().perform();
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_PERSONNELMENU_M&ASUBMENU");
		}
		
		@Then("^access Meals and Accommodation sub menu -for the thirteenth time$")
		public void access_Meals_and_Accommodation_sub_menu_for_the_thirteenth_time() throws Throwable {
			Thread.sleep(1000);
			WebElement menuOption = driver.findElement(By.id("hyp_MA"));
			menuOption.click();
		}
		
		@Then("^validate if the current url is correct -for the thirteenth time$")
		public void validate_if_the_current_url_is_correct_for_the_thirteenth_time() throws Throwable {
			Thread.sleep(1000);
			String URL = driver.getCurrentUrl();
			Assert.assertEquals(URL, config.getSTGVMMEALSANDACCOMMODATIONSUBMENUURL());
			
			ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_MEALSANDACCOMMODATIONSUBMENUURL");
		}
		
		@Then("^input valid date range period and click on submit button -for the thirteenth time$")
		public void input_valid_date_range_period_and_click_on_submit_button_for_the_thirteenth_time() throws Throwable {
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodInputfield())).sendKeys("01/01/2018 - 23/01/2018");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodApplybuttonlocator())).click();
	        
	    	ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_DATERANGEPERIOD");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.id(config.getSTGVMSubmitbuttonreportdisplay())).click();
		}
		
		@Then("^access Setup Meals and Charges page -for the thirteenth time$")
		public void access_Setup_Meals_and_Charges_page_for_the_thirteenth_time() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMSettingIconlocator())).click();

				Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMSetupofmealsandchargesIDlocator())).click();
		        
		        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_SETUPOFMEALSANDCHARGESMODAL_DISPLAY");
		}
		
		@Then("^under How to charge click Bed and each meal charged separately radio button -for the thirteenth time$")
		public void under_How_to_charge_click_Bed_and_each_meal_charged_separately_radio_button_for_the_thirteenth_time() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMBedandeachmealchargedseparatelyradio())).click();
		}
		
		@Then("^under Meals on day of arrival: click Charged if arriving before radio button -for the thirteenth time$")
		public void under_Meals_on_day_of_arrival_click_Charged_if_arriving_before_radio_button_for_the_thirteenth_time() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMChargedifarrivingbeforeradio())).click();
		}
		
		@Then("^input charged if arriving before time -for the thirteenth time$")
		public void input_charged_if_arriving_before_time_for_the_thirteenth_time() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.id(config.getSTGVMChargedifarrivingbeforeTimeLocator())).clear();
		        driver.findElement(By.id(config.getSTGVMChargedifarrivingbeforeTimeLocator())).sendKeys("12:01");
		}
		
		@Then("^under Meals on departure day: click Charged if departing after radio button -for the thirteenth time$")
		public void under_Meals_on_departure_day_click_Charged_if_departing_after_radio_button_for_the_thirteenth_time() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.xpath(config.getSTGVMChargedifdepartingafter())).click();
		}
		
		@Then("^input charged if arriving after time -for the thirteenth time$")
		public void input_charged_if_arriving_after_time_for_the_thirteenth_time() throws Throwable {
		       Thread.sleep(1000);
		        driver.findElement(By.id(config.getSTGVMChargedifarrivingbeforeTimeLocator2())).clear();
		        driver.findElement(By.id(config.getSTGVMChargedifarrivingbeforeTimeLocator2())).sendKeys("12:01");
		}
		
		@Then("^click on save changes button -for the thirteenth time$")
		public void click_on_save_changes_button_for_the_thirteenth_time() throws Throwable {
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMSaveMASettingsLocator())).click();
		}
		
		@Then("^validate if the confirmation message that the changes have been saved did display -for the thirteenth time$")
		public void validate_if_the_confirmation_message_that_the_changes_have_been_saved_did_display_for_the_thirteenth_time() throws Throwable {
			Thread.sleep(1000);
			
			String actual_VMMealsandchargessettingssavenotificationtext= driver.findElement(By.xpath(config.getSTGVMMealsandchargessettingssavenotificationlocator())).getAttribute("innerHTML");
			
			String expected_VMMealsandchargessettingssavenotificationtext="Success!";
			
		    Assert.assertEquals(expected_VMMealsandchargessettingssavenotificationtext, actual_VMMealsandchargessettingssavenotificationtext);
		    
		    Assert.assertTrue(actual_VMMealsandchargessettingssavenotificationtext.contains(config.getSTGVMMealsandchargessettingssavenotificationtext()));
			
			
	        System.out.println("VMMealsandchargessettingssavenotificationtext confirmed");
	        
	        ConfigReader.captureScreesnhot(driver, "29219_SPRINT02_Newsetupsuccessfullysaved");
		}
		
		@And("^browser will close -for the thirteenth time$")
		public void browser_will_close_for_the_thirteenth_time() throws Throwable {
		       Thread.sleep(1000);
		       driver.quit();
		}
}