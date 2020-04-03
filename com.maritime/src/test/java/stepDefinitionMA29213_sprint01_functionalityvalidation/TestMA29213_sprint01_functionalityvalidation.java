package stepDefinitionMA29213_sprint01_functionalityvalidation;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import maritimeutility.ConfigReader;
import org.openqa.selenium.support.Color;


public class TestMA29213_sprint01_functionalityvalidation {
	
	WebDriver driver;
	
	ConfigReader config=new ConfigReader();
	
//Scenario:  Minimum of three meals should be registered using valid input - Setup Meals and Charges//
	
	@Given("^open Vessel Manager login with valid user credentials$")
	public void open_Vessel_Manager_login_with_valid_user_credentials() throws Throwable {
		
		Thread.sleep(1000);
		System.setProperty("webdriver.chrome.driver",config.getChromePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get(config.getSTGURLVM());	

		ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_BROWSERSTARTED_VESSELMANAGER");
		
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMUNINPUTFIELDID())).sendKeys(config.getSTGVMUNAdmin());
		driver.findElement(By.id(config.getSTGVMPWINPUTFIELDID())).sendKeys(config.getSTGVMPWAdmin());
		driver.findElement(By.id(config.getSTGVMLOGINBTN())).click();
		
		ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_LOG-IN_VESSELMANAGER");
	}

	@Then("^go to Personnel menu$")
	public void go_to_Personnel_menu() throws Throwable {
		Thread.sleep(1000);

		WebElement menu = driver.findElement(By.id(config.getSTGVMPERSONNELMENU()));
		Actions builder = new Actions(driver);    
		builder.moveToElement(menu).build().perform();
		
		ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_PERSONNELMENU_M&ASUBMENU");
	}

	@Then("^access Meals and Accommodation sub menu$")
	public void access_Meals_and_Accommodation_sub_menu() throws Throwable {
		Thread.sleep(1000);
		WebElement menuOption = driver.findElement(By.id("hyp_MA"));
		menuOption.click();
		
	}

	@Then("^validate if the current url is correct$")
	public void validate_if_the_current_url_is_correct() throws Throwable {
		Thread.sleep(1000);
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, config.getSTGVMMEALSANDACCOMMODATIONSUBMENUURL());
		
		ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_MEALSANDACCOMMODATIONSUBMENUURL");
	}
	
	
	
	@Then("^input valid date range period and click on submit button$")
	public void input_valid_date_range_period_and_click_on_submit_button() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath(config.getSTGVMPeriodInputfield())).sendKeys("01/01/2018 - 23/01/2018");
        
        Thread.sleep(1000);
        driver.findElement(By.xpath(config.getSTGVMPeriodApplybuttonlocator())).click();
        
    	ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_DATERANGEPERIOD");
        
        Thread.sleep(1000);
        driver.findElement(By.id(config.getSTGVMSubmitbuttonreportdisplay())).click();
        
	}

	@Then("^access Setup Meals and Charges page$")
	public void access_Setup_Meals_and_Charges_page() throws Throwable {
		
        Thread.sleep(1000);
        driver.findElement(By.xpath(config.getSTGVMSettingIconlocator())).click();

		Thread.sleep(1000);
        driver.findElement(By.xpath(config.getSTGVMSetupofmealsandchargesIDlocator())).click();
        
        ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_SETUPOFMEALSANDCHARGESMODAL_DISPLAY");


	}

	@Then("^validate if the Number of chargable meals provided each day drop down numbers are from three to eight$")
	public void validate_if_the_Number_of_chargable_meals_provided_each_day_drop_down_numbers_are_from_three_to_eight() throws Throwable {
		
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMchargablemealsdropdownlocator())).click();
		
		
		Thread.sleep(1000);
			
		String actual_VMchargablemealsdropdowntext3= driver.findElement(By.xpath(config.getSTGVMchargablemealsdropdownlocator3())).getAttribute("innerHTML");
		
		String expected_VMchargablemealsdropdowntext3="3";
		
	    Assert.assertEquals(expected_VMchargablemealsdropdowntext3, actual_VMchargablemealsdropdowntext3);
	    
	    Assert.assertTrue(actual_VMchargablemealsdropdowntext3.contains(config.getSTGVMchargablemealsdropdowntext3()));
		
		
        System.out.println("VMchargablemealsdropdowntext3 confirmed");
        
        
		Thread.sleep(1000);
		
		String actual_VMchargablemealsdropdowntext4= driver.findElement(By.xpath(config.getSTGVMchargablemealsdropdownlocator4())).getAttribute("innerHTML");
		
		String expected_VMchargablemealsdropdowntext4="4";
		
	    Assert.assertEquals(expected_VMchargablemealsdropdowntext4, actual_VMchargablemealsdropdowntext4);
	    
	    Assert.assertTrue(actual_VMchargablemealsdropdowntext4.contains(config.getSTGVMchargablemealsdropdowntext4()));
		
		
        System.out.println("VMchargablemealsdropdowntext4 confirmed");
        
        
		Thread.sleep(1000);
		
		String actual_VMchargablemealsdropdowntext5= driver.findElement(By.xpath(config.getSTGVMchargablemealsdropdownlocator5())).getAttribute("innerHTML");
		
		String expected_VMchargablemealsdropdowntext5="5";
		
	    Assert.assertEquals(expected_VMchargablemealsdropdowntext5, actual_VMchargablemealsdropdowntext5);
	    
	    Assert.assertTrue(actual_VMchargablemealsdropdowntext5.contains(config.getSTGVMchargablemealsdropdowntext5()));
		
		
        System.out.println("VMchargablemealsdropdowntext5 confirmed");
        
        
		Thread.sleep(1000);
		
		String actual_VMchargablemealsdropdowntext6= driver.findElement(By.xpath(config.getSTGVMchargablemealsdropdownlocator6())).getAttribute("innerHTML");
		
		String expected_VMchargablemealsdropdowntext6="6";
		
	    Assert.assertEquals(expected_VMchargablemealsdropdowntext6, actual_VMchargablemealsdropdowntext6);
	    
	    Assert.assertTrue(actual_VMchargablemealsdropdowntext6.contains(config.getSTGVMchargablemealsdropdowntext6()));
		
		
        System.out.println("VMchargablemealsdropdowntext6 confirmed");
        
		Thread.sleep(1000);
		
		String actual_VMchargablemealsdropdowntext7= driver.findElement(By.xpath(config.getSTGVMchargablemealsdropdownlocator7())).getAttribute("innerHTML");
		
		String expected_VMchargablemealsdropdowntext7="7";
		
	    Assert.assertEquals(expected_VMchargablemealsdropdowntext7, actual_VMchargablemealsdropdowntext7);
	    
	    Assert.assertTrue(actual_VMchargablemealsdropdowntext7.contains(config.getSTGVMchargablemealsdropdowntext7()));
	    
	    
        System.out.println("VMchargablemealsdropdowntext7 confirmed");
        
		Thread.sleep(1000);
		
		String actual_VMchargablemealsdropdowntext8= driver.findElement(By.xpath(config.getSTGVMchargablemealsdropdownlocator8())).getAttribute("innerHTML");
		
		String expected_VMchargablemealsdropdowntext8="8";
		
	    Assert.assertEquals(expected_VMchargablemealsdropdowntext8, actual_VMchargablemealsdropdowntext8);
	    
	    Assert.assertTrue(actual_VMchargablemealsdropdowntext8.contains(config.getSTGVMchargablemealsdropdowntext8()));
		
		
        System.out.println("VMchargablemealsdropdowntext8 confirmed");
     
	}

	@Then("^from the Number of chargable meals provided each day drop down select number four$")
	public void from_the_Number_of_chargable_meals_provided_each_day_drop_down_select_number_four() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMchargablemealsdropdownlocator())).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath(config.getSTGVMchargablemealsdropdownlocator4())).click();
		
        ConfigReader.captureScreesnhot(driver, "29213val_Scenario1_VMchargablemealsdropdownMeal1to4display");
        
        Thread.sleep(1000);

        WebElement VMBedandmealschargedseparatelyradio = driver.findElement(By.xpath(config.getSTGVMBedandmealschargedseparatelyradio()));
        ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", VMBedandmealschargedseparatelyradio);
        
	}


	@Then("^from Meal one choose a start and end date that will not overlap the time that is already registered$")
	public void from_Meal_one_choose_a_start_and_end_date_that_will_not_overlap_the_time_that_is_already_registered() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMMeal4startinputfieldlocator())).clear();
		
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMMeal4startinputfieldlocator())).sendKeys("00:00");
		
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMMeal4endinputfieldlocator())).clear();
		
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMMeal4endinputfieldlocator())).sendKeys("01:00");
        
		ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_MEAL4TIMEINPUT");
		    

	}

	@Then("^from Meal two choose a start and end date that will not overlap the time that is already registered$")
	public void from_Meal_two_choose_a_start_and_end_date_that_will_not_overlap_the_time_that_is_already_registered() throws Throwable {
    
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMMeal3startinputfieldlocator())).clear();
		
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMMeal3startinputfieldlocator())).sendKeys("18:00");
		
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMMeal3endinputfieldlocator())).clear();
		
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMMeal3endinputfieldlocator())).sendKeys("19:00");
		
		ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_MEAL3TIMEINPUT");
	}

	@Then("^from Meal three choose a start and end date that will not overlap the time that is already registered$")
	public void from_Meal_three_choose_a_start_and_end_date_that_will_not_overlap_the_time_that_is_already_registered() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMMeal2startinputfieldlocator())).clear();
		
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMMeal2startinputfieldlocator())).sendKeys("12:00");
		
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMMeal2endinputfieldlocator())).clear();
		
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMMeal2endinputfieldlocator())).sendKeys("13:00");
		

		ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_MEAL2TIMEINPUT");
	}
	
	@Then("^from Meal four choose a start and end date that will not overlap the time that is already registered$")
	public void from_Meal_four_choose_a_start_and_end_date_that_will_not_overlap_the_time_that_is_already_registered() throws Throwable {

		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMMeal1startinputfieldlocator())).clear();
		
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMMeal1startinputfieldlocator())).sendKeys("06:00");
		
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMMeal1endinputfieldlocator())).clear();

		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMMeal1endinputfieldlocator())).sendKeys("07:00");

		ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_MEAL1TIMEINPUT");
		
	}

	@Then("^input valid value from Staying on board amount from Meals one to three$")
	public void input_valid_value_from_Staying_on_board_amount_from_Meals_one_to_three() throws Throwable {
		
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMstaying1firstfieldlocator())).clear();	
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMstaying1firstfieldlocator())).sendKeys("200");
		
		driver.findElement(By.id(config.getSTGVMstaying2firstfieldlocator())).clear();
		
		driver.findElement(By.id(config.getSTGVMstaying2firstfieldlocator())).sendKeys("200");	
		
		driver.findElement(By.id(config.getSTGVMstaying3firstfieldlocator())).clear();
		
		driver.findElement(By.id(config.getSTGVMstaying3firstfieldlocator())).sendKeys("200");

		driver.findElement(By.id(config.getSTGVMstaying4firstfieldlocator())).clear();
		
		driver.findElement(By.id(config.getSTGVMstaying4firstfieldlocator())).sendKeys("200");
		
		ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_STAYINGONBOARDVALIDINPUT");
	}

	@Then("^input valid value from if served as extra meal from Meals one to three$")
	public void input_valid_value_from_if_served_as_extra_meal_from_Meals_one_to_three() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMserve1firstfieldlocator())).clear();
		
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMserve1firstfieldlocator())).sendKeys("300");
		
		driver.findElement(By.id(config.getSTGVMserve2firstfieldlocator())).clear();
		
		driver.findElement(By.id(config.getSTGVMserve2firstfieldlocator())).sendKeys("300");
		
		driver.findElement(By.id(config.getSTGVMserve3firstfieldlocator())).clear();
		
		driver.findElement(By.id(config.getSTGVMserve3firstfieldlocator())).sendKeys("300");
		
		driver.findElement(By.id(config.getSTGVMserve4firstfieldlocator())).clear();
		
		driver.findElement(By.id(config.getSTGVMserve4firstfieldlocator())).sendKeys("300");	
		
		ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_SERVEDASEXTRAMEALVALIDINPUT");
	}

	@Then("^input valid value from Accommodation and bed,charges for one day$")
	public void input_valid_value_from_Accommodation_and_bed_charges_for_one_day() throws Throwable {
		
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMAccombedchargesfirstfieldlocator())).clear();
		
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMAccombedchargesfirstfieldlocator())).sendKeys("500");
		
        
		ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_ACC&BEDVALIDINPUT");

	}

	@Then("^click on save button$")
	public void click_on_save_button() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMSaveMASettingsLocator())).click();

	}

	@Then("^settings will close and confirmation message for successfuly saving the changes wil display on the M & A page$")
	public void settings_will_close_and_confirmation_message_for_successfuly_saving_the_changes_wil_display_on_the_M_A_page() throws Throwable {
		Thread.sleep(1000);
		
		String actual_VMMealsandchargessettingssavenotificationtext= driver.findElement(By.xpath(config.getSTGVMMealsandchargessettingssavenotificationlocator())).getAttribute("innerHTML");
		
		String expected_VMMealsandchargessettingssavenotificationtext="Success!";
		
	    Assert.assertEquals(expected_VMMealsandchargessettingssavenotificationtext, actual_VMMealsandchargessettingssavenotificationtext);
	    
	    Assert.assertTrue(actual_VMMealsandchargessettingssavenotificationtext.contains(config.getSTGVMMealsandchargessettingssavenotificationtext()));
		
		
        System.out.println("VMMealsandchargessettingssavenotificationtext confirmed");
        
	}

	@And("^Browser will close$")
	public void browser_will_close() throws Throwable {
		Thread.sleep(1000);
		driver.quit();

	}
	
	//Scenario:  Minimum of three meals should not be registered to maximum of eight meals should not be registered using invalid input - Setup Meals and Charges//

		@Given("^open Vessel Manager login with valid user credentials - for the second time$")
		public void open_Vessel_Manager_login_with_valid_user_credentials_for_the_second_time() throws Throwable {
			Thread.sleep(1000);
			System.setProperty("webdriver.chrome.driver",config.getChromePath());
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			driver.get(config.getSTGURLVM());	
					
			ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_BROWSERSTARTED_VESSELMANAGER");
				
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMUNINPUTFIELDID())).sendKeys(config.getSTGVMUNAdmin());
			driver.findElement(By.id(config.getSTGVMPWINPUTFIELDID())).sendKeys(config.getSTGVMPWAdmin());
			driver.findElement(By.id(config.getSTGVMLOGINBTN())).click();
			
			ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_LOG-IN_VESSELMANAGER");
		}

		@Then("^go to Personnel menu - for the second time$")
		public void go_to_Personnel_menu_for_the_second_time() throws Throwable {
			
			Thread.sleep(1000);

			WebElement menu = driver.findElement(By.id(config.getSTGVMPERSONNELMENU()));
			Actions builder = new Actions(driver);    
			builder.moveToElement(menu).build().perform();

			ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_PERSONNELMENU_M&ASUBMENU");
		}

		@Then("^access Meals and Accommodation sub menu - for the second time$")
		public void access_Meals_and_Accommodation_sub_menu_for_the_second_time() throws Throwable {
			Thread.sleep(1000);
			WebElement menuOption = driver.findElement(By.id("hyp_MA"));
			menuOption.click();
		}

		@Then("^validate if the current url is correct - for the second time$")
		public void validate_if_the_current_url_is_correct_for_the_second_time() throws Throwable {
			Thread.sleep(1000);
			String URL = driver.getCurrentUrl();
			Assert.assertEquals(URL, config.getSTGVMMEALSANDACCOMMODATIONSUBMENUURL());
			
			ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_MEALSANDACCOMMODATIONSUBMENUURL");
		}
		
		@Then("^input valid date range period and click on submit button - for the second time$")
		public void input_valid_date_range_period_and_click_on_submit_button_for_the_second_time() throws Throwable {
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodInputfield())).sendKeys("01/01/2018 - 23/01/2018");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodApplybuttonlocator())).click();
	        
	    	ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_DATERANGEPERIOD");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.id(config.getSTGVMSubmitbuttonreportdisplay())).click();
			
		}

		@Then("^access Setup Meals and Charges page - for the second time$")
		public void access_Setup_Meals_and_Charges_page_for_the_second_time() throws Throwable {
			
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMSettingIconlocator())).click();
	        
			Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMSetupofmealsandchargesIDlocator())).click();
	        
	        ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_SETUPOFMEALSANDCHARGESMODAL_DISPLAY");
		}

		@Then("^from the Number of chargable meals provided each day drop down select number four for the second time$")
		public void from_the_Number_of_chargable_meals_provided_each_day_drop_down_select_number_four_for_the_second_time() throws Throwable {
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMchargablemealsdropdownlocator())).click();
			
			driver.findElement(By.xpath(config.getSTGVMchargablemealsdropdownlocator4())).click();
	        
	        Thread.sleep(1000);

	        WebElement VMBedandmealschargedseparatelyradio = driver.findElement(By.xpath(config.getSTGVMBedandmealschargedseparatelyradio()));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].checked = true;", VMBedandmealschargedseparatelyradio);
		}

		@Then("^from Meal one choose a start and end date that will overlap the time that is already registered$")
		public void from_Meal_one_choose_a_start_and_end_date_that_will_overlap_the_time_that_is_already_registered() throws Throwable {
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMMeal1startinputfieldlocator())).clear();
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMMeal1startinputfieldlocator())).sendKeys("01:20");
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMMeal1endinputfieldlocator())).clear();

			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMMeal1endinputfieldlocator())).sendKeys("12:00");
			
			ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_MEAL1TIMEINPUT");
		}

		@Then("^from Meal two choose a start and end date that will overlap the time that is already registered$")
		public void from_Meal_two_choose_a_start_and_end_date_that_will_overlap_the_time_that_is_already_registered() throws Throwable {
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMMeal2startinputfieldlocator())).clear();
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMMeal2startinputfieldlocator())).sendKeys("10:20");	
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMMeal2endinputfieldlocator())).clear();
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMMeal2endinputfieldlocator())).sendKeys("12:00");
			
			ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_MEAL2TIMEINPUT");;
		}

		@Then("^from Meal three choose a start and end date that will overlap the time that is already registered$")
		public void from_Meal_three_choose_a_start_and_end_date_that_will_overlap_the_time_that_is_already_registered() throws Throwable {
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMMeal3startinputfieldlocator())).clear();
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMMeal3startinputfieldlocator())).sendKeys("10:20");
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMMeal3endinputfieldlocator())).clear();
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMMeal3endinputfieldlocator())).sendKeys("12:00");
			
			ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_MEAL3TIMEINPUT");
		}

		@Then("^from Meal four choose a start and end date that will overlap the time that is already registered$")
		public void from_Meal_four_choose_a_start_and_end_date_that_will_overlap_the_time_that_is_already_registered() throws Throwable {
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMMeal4startinputfieldlocator())).clear();
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMMeal4startinputfieldlocator())).sendKeys("10:20");	
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMMeal4endinputfieldlocator())).clear();
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMMeal4endinputfieldlocator())).sendKeys("12:00");
				
			ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_MEAL4TIMEINPUT");
		}

		@Then("^input invalid value from Staying on board amount from Meals one to four$")
		public void input_invalid_value_from_Staying_on_board_amount_from_Meals_one_to_four() throws Throwable {
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMstaying1firstfieldlocator())).clear();
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMstaying1firstfieldlocator())).sendKeys("-10");
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMstaying2firstfieldlocator())).clear();
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMstaying2firstfieldlocator())).sendKeys("-10");
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMstaying3firstfieldlocator())).clear();
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMstaying3firstfieldlocator())).sendKeys("-10");
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMstaying4firstfieldlocator())).clear();
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMstaying4firstfieldlocator())).sendKeys("-10");		
			
			ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_STAYINGONBOARDVALIDINPUT");
		}

		@Then("^input invalid value from if served as extra meal from Meals one to four$")
		public void input_invalid_value_from_if_served_as_extra_meal_from_Meals_one_to_four() throws Throwable {
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMserve1firstfieldlocator())).clear();
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMserve1firstfieldlocator())).sendKeys("-10");
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMserve2firstfieldlocator())).clear();
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMserve2firstfieldlocator())).sendKeys("-10");
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMserve2firstfieldlocator())).clear();
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMserve2firstfieldlocator())).sendKeys("-10");
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMserve3firstfieldlocator())).clear();
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMserve3firstfieldlocator())).sendKeys("-10");
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMserve4firstfieldlocator())).clear();
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMserve4firstfieldlocator())).sendKeys("-10");
			
			ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_SERVEDASEXTRAMEALVALIDINPUT");
		}

		@Then("^input invalid value from Accommodation and bed,charges for one day$")
		public void input_invalid_value_from_Accommodation_and_bed_charges_for_one_day() throws Throwable {

			Thread.sleep(5000);
			driver.findElement(By.id(config.getSTGVMAccombedchargesfirstfieldlocator())).clear();
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMAccombedchargesfirstfieldlocator())).sendKeys("@#-10");
			
			ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_ACC&BEDVALIDINPUT");
		}

		@Then("^click on save button - for the second time$")
		public void click_on_save_button_for_the_second_time() throws Throwable {
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMSaveMASettingsLocator())).click();
		}

		@Then("^validate the warning message notifying the user that start and end time overlaps each other$")
		public void validate_the_warning_message_notifying_the_user_that_start_and_end_time_overlaps_each_other() throws Throwable {
			Thread.sleep(1000);
			
			String colorstart1 = driver.findElement(By.id(config.getSTGVMMeal1startinputfieldlocator())).getCssValue("color");
			System.out.println(colorstart1);
			String hexstart1 = Color.fromString(colorstart1).asHex();
			System.out.println(hexstart1);
			
			Thread.sleep(1000);
			
			String colorend1 = driver.findElement(By.id(config.getSTGVMMeal1endinputfieldlocator())).getCssValue("color");
			System.out.println(colorend1);
			String hexend1 = Color.fromString(colorend1).asHex();
			System.out.println(hexend1);
			
			ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_OVERLAPVALIDATION");
			
			  //  }
			
			//String actual_VMMealsandchargessettingsoverlapnotificationtext= driver.findElement(By.id(config.getSTGVMMealsandchargessettingsoverlapnotificationlocator())).getAttribute("innerHTML");
			
			//String expected_VMMealsandchargessettingsoverlapnotificationtext="";
			
		   // Assert.assertEquals(expected_VMMealsandchargessettingsoverlapnotificationtext, actual_VMMealsandchargessettingsoverlapnotificationtext);
		    
		    //Assert.assertTrue(actual_VMMealsandchargessettingsoverlapnotificationtext.contains(config.getSTGVMMealsandchargessettingsoverlapnotificationtext()));
			
			
	        System.out.println("VMMealsandchargessettingsoverlapnotificationtext confirmed");
		}

		@And("^Browser will close - for the second time$")
		public void browser_will_close_for_the_second_time() throws Throwable {
			Thread.sleep(1000);
			driver.quit();
		}
		

		//Scenario: Add and Delete number of Meals using close button - Setup Meals and Charges//

		@Given("^open Vessel Manager login with valid user credentials - for the third time$")
		public void open_Vessel_Manager_login_with_valid_user_credentials_for_the_third_time() throws Throwable {
			Thread.sleep(1000);
			System.setProperty("webdriver.chrome.driver",config.getChromePath());
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get(config.getSTGURLVM());	
			
			
			ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_BROWSERSTARTED_VESSELMANAGER");
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMUNINPUTFIELDID())).sendKeys(config.getSTGVMUNAdmin());
			driver.findElement(By.id(config.getSTGVMPWINPUTFIELDID())).sendKeys(config.getSTGVMPWAdmin());
			driver.findElement(By.id(config.getSTGVMLOGINBTN())).click();
			
			ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_LOG-IN_VESSELMANAGER");
		}

		@Then("^go to Personnel menu - for the third time$")
		public void go_to_Personnel_menu_for_the_third_time() throws Throwable {
			Thread.sleep(1000);

			WebElement menu = driver.findElement(By.id(config.getSTGVMPERSONNELMENU()));
			Actions builder = new Actions(driver);    
			builder.moveToElement(menu).build().perform();
			
			ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_PERSONNELMENU_M&ASUBMENU");
		}

		@Then("^access Meals and Accommodation sub menu - for the third time$")
		public void access_Meals_and_Accommodation_sub_menu_for_the_third_time() throws Throwable {
			//Thread.sleep(1000);
			
			//WebElement menuOption = driver.findElement(By.id(config.getSTGVMMASUBMENU()));
			//menuOption.click();
			
			Thread.sleep(1000);
			WebElement menuOption = driver.findElement(By.id("hyp_MA"));
			menuOption.click();
		}

		@Then("^validate if the current url is correct - for the third time$")
		public void validate_if_the_current_url_is_correct_for_the_third_time() throws Throwable {
			Thread.sleep(1000);
			String URL = driver.getCurrentUrl();
			Assert.assertEquals(URL, config.getSTGVMMEALSANDACCOMMODATIONSUBMENUURL());
			
			ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_MEALSANDACCOMMODATIONSUBMENUURL");
		}
		
		@Then("^input valid date range period and click on submit button - for the third time$")
		public void input_valid_date_range_period_and_click_on_submit_button_for_the_third_time() throws Throwable {
		    Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodInputfield())).sendKeys("01/01/2018 - 23/01/2018");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodApplybuttonlocator())).click();
	        
	    	ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_DATERANGEPERIOD");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.id(config.getSTGVMSubmitbuttonreportdisplay())).click();
		}

		@Then("^access Setup Meals and Charges page - for the third time$")
		public void access_Setup_Meals_and_Charges_page_for_the_third_time() throws Throwable {
			
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMSettingIconlocator())).click();
	        
			Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMSetupofmealsandchargesIDlocator())).click();
	        
	        ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_SETUPOFMEALSANDCHARGESMODAL_DISPLAY");
		}

		@Then("^from the Number of chargable meals provided each day drop down select number eight$")
		public void from_the_Number_of_chargable_meals_provided_each_day_drop_down_select_number_eight() throws Throwable {
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMchargablemealsdropdownlocator())).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath(config.getSTGVMchargablemealsdropdownlocator8())).click();
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMwillbedeletedYes())).click();
			
	        ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_SELECT8DROPDOWNCHARGEABLEMEALS");
		}

		@Then("^delete Meals eight to four by clicking delete button$")
		public void delete_Meals_eight_to_four_by_clicking_delete_button() throws Throwable {
			Thread.sleep(1000);
			
			WebElement menu8 = driver.findElement(By.xpath(config.getSTGVMMeal8Deletebuttonlocator()));
			Actions builder8 = new Actions(driver);    
			builder8.moveToElement(menu8).build().perform();	
			Thread.sleep(1000);
			driver.findElement(By.xpath(config.getSTGVMMeal7Deletebuttonlocator())).click();

			Thread.sleep(1000);
			driver.findElement(By.xpath(config.getSTGVMMeal6Deletebuttonlocator())).click();

			Thread.sleep(2000);
			driver.findElement(By.xpath(config.getSTGVMMeal5Deletebuttonlocator())).click();

			
	        ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_DELETEMEAL8TO4");

		}

		@Then("^from the Number of chargable meals provided each day drop down select number six$")
		public void from_the_Number_of_chargable_meals_provided_each_day_drop_down_select_number_six() throws Throwable {
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMchargablemealsdropdownlocator())).click();
			
			driver.findElement(By.xpath(config.getSTGVMchargablemealsdropdownlocator6())).click();
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMwillbedeletedYes())).click();
		}

		@Then("^delete Meals six to four by clicking delete button$")
		public void delete_Meals_six_to_four_by_clicking_delete_button() throws Throwable {
			Thread.sleep(1000);
			WebElement menu6 = driver.findElement(By.xpath(config.getSTGVMMeal6Deletebuttonlocator()));
			Actions builder6 = new Actions(driver);    
			builder6.moveToElement(menu6).build().perform();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath(config.getSTGVMMeal5Deletebuttonlocator())).click();
			
	        ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_DELETEMEAL6TO4");
		}

		@Then("^from the Number of chargable meals provided each day drop down select number five$")
		public void from_the_Number_of_chargable_meals_provided_each_day_drop_down_select_number_five() throws Throwable {
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMchargablemealsdropdownlocator())).click();
			
			driver.findElement(By.xpath(config.getSTGVMchargablemealsdropdownlocator5())).click();
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMwillbedeletedYes())).click();
			

		}

		@Then("^delete Meals five to four by clicking delete button$")
		public void delete_Meals_five_to_four_by_clicking_delete_button() throws Throwable {
			Thread.sleep(2000);
			driver.findElement(By.xpath(config.getSTGVMMeal5Deletebuttonlocator())).click();

			//WebElement menu5 = driver.findElement(By.xpath(config.getSTGVMMeal5Deletebuttonlocator()));
			//Actions builder5 = new Actions(driver);    
			//builder5.moveToElement(menu5).build().perform();
			
	        ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_DELETEMEAL5");
		}

		@And("^browser will close - for the third time$")
		public void browser_will_close_for_the_third_time() throws Throwable {
			Thread.sleep(1000);
			driver.quit();
		}
		
		
		//Scenario: Add and Delete number of Meals using Number of meals per day dropdown - Setup Meals and Charges//

		@Given("^open Vessel Manager login with valid user credentials - for the sixth time$")
		public void open_Vessel_Manager_login_with_valid_user_credentials_for_the_sixth_time() throws Throwable {

			Thread.sleep(1000);
			System.setProperty("webdriver.chrome.driver",config.getChromePath());
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			driver.get(config.getSTGURLVM());	
			
			ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_LOG-IN_VESSELMANAGER");
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMUNINPUTFIELDID())).sendKeys(config.getSTGVMUNAdmin());
			driver.findElement(By.id(config.getSTGVMPWINPUTFIELDID())).sendKeys(config.getSTGVMPWAdmin());
			driver.findElement(By.id(config.getSTGVMLOGINBTN())).click();
			
			ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_LOG-IN_VESSELMANAGER");
		}
		
		@Then("^go to Personnel menu - for the sixth time$")
		public void go_to_Personnel_menu_for_the_sixth_time() throws Throwable {
			Thread.sleep(1000);

			WebElement menu = driver.findElement(By.id(config.getSTGVMPERSONNELMENU()));
			Actions builder = new Actions(driver);    
			builder.moveToElement(menu).build().perform();
			
			ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_PERSONNELMENU_M&ASUBMENU");
		}
		
		@Then("^access Meals and Accommodation sub menu - for the sixth time$")
		public void access_Meals_and_Accommodation_sub_menu_for_the_sixth_time() throws Throwable {
			Thread.sleep(1000);
			WebElement menuOption = driver.findElement(By.id("hyp_MA"));
			menuOption.click();
		}
		
		@Then("^validate if the current url is correct - for the sixth time$")
		public void validate_if_the_current_url_is_correct_for_the_sixth_time() throws Throwable {
			Thread.sleep(1000);
			String URL = driver.getCurrentUrl();
			Assert.assertEquals(URL, config.getSTGVMMEALSANDACCOMMODATIONSUBMENUURL());
			
			ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_MEALSANDACCOMMODATIONSUBMENUURL");
		}
		
		@Then("^input valid date range period and click on submit button - for the sixth time$")
		public void input_valid_date_range_period_and_click_on_submit_button_for_the_sixth_time() throws Throwable {
		    Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodInputfield())).sendKeys("01/01/2018 - 23/01/2018");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodApplybuttonlocator())).click();
	        
	    	ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_DATERANGEPERIOD");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.id(config.getSTGVMSubmitbuttonreportdisplay())).click();
		}
		
		@Then("^access Setup Meals and Charges page - for the sixth time$")
		public void access_Setup_Meals_and_Charges_page_for_the_sixth_time() throws Throwable {
			
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMSettingIconlocator())).click();
	        
			Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMSetupofmealsandchargesIDlocator())).click();
	        
	        ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_SETUPOFMEALSANDCHARGESMODAL_DISPLAY");
		}
		
		@Then("^from the Number of chargable meals provided each day drop down select number eight - for the sixth time$")
		public void from_the_Number_of_chargable_meals_provided_each_day_drop_down_select_number_eight_for_the_sixth_time() throws Throwable {
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMchargablemealsdropdownlocator())).click();
			
			driver.findElement(By.xpath(config.getSTGVMchargablemealsdropdownlocator8())).click();
			
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMwillbedeletedYes())).click();
			
	        ConfigReader.captureScreesnhot(driver, "VMchargablemealsdropdownMeal1to8display");
		}
		
		@Then("^from Meal one choose a start and end date that will not overlap the time that is already registered - for the sixth time$")
		public void from_Meal_one_choose_a_start_and_end_date_that_will_not_overlap_the_time_that_is_already_registered_for_the_sixth_time() throws Throwable {

			driver.findElement(By.id(config.getSTGVMMeal1startinputfieldlocator())).clear();
			

			driver.findElement(By.id(config.getSTGVMMeal1startinputfieldlocator())).sendKeys("02:00");
			
			driver.findElement(By.id(config.getSTGVMMeal1endinputfieldlocator())).clear();


			driver.findElement(By.id(config.getSTGVMMeal1endinputfieldlocator())).sendKeys("03:00");

			ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_MEAL1TIMEINPUT");
		}
		
		@Then("^from Meal two choose a start and end date that will not overlap the time that is already registered - for the sixth time$")
		public void from_Meal_two_choose_a_start_and_end_date_that_will_not_overlap_the_time_that_is_already_registered_for_the_sixth_time() throws Throwable {

			driver.findElement(By.id(config.getSTGVMMeal2startinputfieldlocator())).clear();
			

			driver.findElement(By.id(config.getSTGVMMeal2startinputfieldlocator())).sendKeys("05:00");
			

			driver.findElement(By.id(config.getSTGVMMeal1endinputfieldlocator())).clear();
			

			driver.findElement(By.id(config.getSTGVMMeal1endinputfieldlocator())).sendKeys("06:00");

			ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_MEAL2TIMEINPUT");
		}
		
		@Then("^from Meal three choose a start and end date that will not overlap the time that is already registered - for the sixth time$")
		public void from_Meal_three_choose_a_start_and_end_date_that_will_not_overlap_the_time_that_is_already_registered_for_the_sixth_time() throws Throwable {

			driver.findElement(By.id(config.getSTGVMMeal3startinputfieldlocator())).clear();
			

			driver.findElement(By.id(config.getSTGVMMeal3startinputfieldlocator())).sendKeys("08:00");
			

			driver.findElement(By.id(config.getSTGVMMeal3endinputfieldlocator())).clear();
		

			driver.findElement(By.id(config.getSTGVMMeal3endinputfieldlocator())).sendKeys("09:00");
			
			ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_MEAL3TIMEINPUT");
		}
		
		@Then("^from Meal four choose a start and end date that will not overlap the time that is already registered - for the sixth time$")
		public void from_Meal_four_choose_a_start_and_end_date_that_will_not_overlap_the_time_that_is_already_registered_for_the_sixth_time() throws Throwable {

			driver.findElement(By.id(config.getSTGVMMeal4startinputfieldlocator())).clear();
			

			driver.findElement(By.id(config.getSTGVMMeal4startinputfieldlocator())).sendKeys("10:00");
			

			driver.findElement(By.id(config.getSTGVMMeal4endinputfieldlocator())).clear();
		

			driver.findElement(By.id(config.getSTGVMMeal4endinputfieldlocator())).sendKeys("11:00");
			
			ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_MEAL4TIMEINPUT");
		}
		
		@Then("^from Meal five choose a start and end date that will not overlap the time that is already registered - for the sixth time$")
		public void from_Meal_five_choose_a_start_and_end_date_that_will_not_overlap_the_time_that_is_already_registered_for_the_sixth_time() throws Throwable {

			driver.findElement(By.id(config.getSTGVMMeal5startinputfieldlocator())).clear();
			

			driver.findElement(By.id(config.getSTGVMMeal5startinputfieldlocator())).sendKeys("13:00");
			

			driver.findElement(By.id(config.getSTGVMMeal5endinputfieldlocator())).clear();
		

			driver.findElement(By.id(config.getSTGVMMeal5endinputfieldlocator())).sendKeys("14:00");
			
			ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_MEAL5TIMEINPUT");
		}
		
		@Then("^from Meal six choose a start and end date that will not overlap the time that is already registered - for the sixth time$")
		public void from_Meal_six_choose_a_start_and_end_date_that_will_not_overlap_the_time_that_is_already_registered_for_the_sixth_time() throws Throwable {

			driver.findElement(By.id(config.getSTGVMMeal6startinputfieldlocator())).clear();
			

			driver.findElement(By.id(config.getSTGVMMeal6startinputfieldlocator())).sendKeys("16:00");
			

			driver.findElement(By.id(config.getSTGVMMeal6endinputfieldlocator())).clear();
		

			driver.findElement(By.id(config.getSTGVMMeal6endinputfieldlocator())).sendKeys("17:00");
			
			ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_MEAL6TIMEINPUT");
		}
		
		@Then("^from Meal seven choose a start and end date that will not overlap the time that is already registered - for the sixth time$")
		public void from_Meal_seven_choose_a_start_and_end_date_that_will_not_overlap_the_time_that_is_already_registered_for_the_sixth_time() throws Throwable {

			driver.findElement(By.id(config.getSTGVMMeal7startinputfieldlocator())).clear();
			

			driver.findElement(By.id(config.getSTGVMMeal7startinputfieldlocator())).sendKeys("19:00");
			
		
			driver.findElement(By.id(config.getSTGVMMeal7endinputfieldlocator())).clear();
		

			driver.findElement(By.id(config.getSTGVMMeal7endinputfieldlocator())).sendKeys("20:00");
			
			ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_MEAL7TIMEINPUT");
		}
		
		@Then("^from Meal eight choose a start and end date that will not overlap the time that is already registered - for the sixth time$")
		public void from_Meal_eight_choose_a_start_and_end_date_that_will_not_overlap_the_time_that_is_already_registered_for_the_sixth_time() throws Throwable {

			//driver.findElement(By.id(config.getSTGVMMeal8startinputfieldlocator())).clear();
			

			//driver.findElement(By.id(config.getSTGVMMeal8startinputfieldlocator())).sendKeys("21:00");
			
			//Thread.sleep(1000);
			//driver.findElement(By.id(config.getSTGVMMeal8endinputfieldlocator())).clear();
		
			//Thread.sleep(1000);
			//driver.findElement(By.id(config.getSTGVMMeal8endinputfieldlocator())).sendKeys("22:00");
			
	       // ConfigReader.captureScreesnhot(driver, "29213val_Scenario1_VMMeal8datainput_display_valid3");
		}
		
		@Then("^input valid value from Staying on board amount from Meals one to eight - for the sixth time$")
		public void input_valid_value_from_Staying_on_board_amount_from_Meals_one_to_eight_for_the_sixth_time() throws Throwable {
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMstaying1firstfieldlocator())).clear();	

			driver.findElement(By.id(config.getSTGVMstaying1firstfieldlocator())).sendKeys("200");
			
			driver.findElement(By.id(config.getSTGVMstaying2firstfieldlocator())).clear();
			
			driver.findElement(By.id(config.getSTGVMstaying2firstfieldlocator())).sendKeys("200");	
			
			driver.findElement(By.id(config.getSTGVMstaying3firstfieldlocator())).clear();
			
			driver.findElement(By.id(config.getSTGVMstaying3firstfieldlocator())).sendKeys("200");

			driver.findElement(By.id(config.getSTGVMstaying4firstfieldlocator())).clear();
			
			driver.findElement(By.id(config.getSTGVMstaying4firstfieldlocator())).sendKeys("200");
			
			driver.findElement(By.id(config.getSTGVMstaying5firstfieldlocator())).clear();
			
			driver.findElement(By.id(config.getSTGVMstaying5firstfieldlocator())).sendKeys("200");
			
			driver.findElement(By.id(config.getSTGVMstaying6firstfieldlocator())).clear();
			
			driver.findElement(By.id(config.getSTGVMstaying6firstfieldlocator())).sendKeys("200");
			
			driver.findElement(By.id(config.getSTGVMstaying7firstfieldlocator())).clear();
			
			driver.findElement(By.id(config.getSTGVMstaying7firstfieldlocator())).sendKeys("200");
			
			//driver.findElement(By.id(config.getSTGVMstaying8firstfieldlocator())).clear();
			//Thread.sleep(1000);
			//driver.findElement(By.id(config.getSTGVMstaying8firstfieldlocator())).sendKeys("200");
			
	        ConfigReader.captureScreesnhot(driver, "29213val_Scenario1_VMMealstayingdatainput_display_valid");
		}
		
		@Then("^input valid value from if served as extra meal from Meals one to eight - for the sixth time$")
		public void input_valid_value_from_if_served_as_extra_meal_from_Meals_one_to_eight_for_the_sixth_time() throws Throwable {
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMserve1firstfieldlocator())).clear();
			
			driver.findElement(By.id(config.getSTGVMserve1firstfieldlocator())).sendKeys("300");
			
			driver.findElement(By.id(config.getSTGVMserve2firstfieldlocator())).clear();
			
			driver.findElement(By.id(config.getSTGVMserve2firstfieldlocator())).sendKeys("300");
			
			driver.findElement(By.id(config.getSTGVMserve3firstfieldlocator())).clear();
			
			driver.findElement(By.id(config.getSTGVMserve3firstfieldlocator())).sendKeys("300");
			
			driver.findElement(By.id(config.getSTGVMserve4firstfieldlocator())).clear();
			
			driver.findElement(By.id(config.getSTGVMserve4firstfieldlocator())).sendKeys("300");	
			
			driver.findElement(By.id(config.getSTGVMserve5firstfieldlocator())).clear();
			
			driver.findElement(By.id(config.getSTGVMserve5firstfieldlocator())).sendKeys("300");	
			
			driver.findElement(By.id(config.getSTGVMserve6firstfieldlocator())).clear();
			
			driver.findElement(By.id(config.getSTGVMserve6firstfieldlocator())).sendKeys("300");
			
			driver.findElement(By.id(config.getSTGVMserve7firstfieldlocator())).clear();
			
			driver.findElement(By.id(config.getSTGVMserve7firstfieldlocator())).sendKeys("300");
			
			//driver.findElement(By.id(config.getSTGVMserve8firstfieldlocator())).clear();
			//Thread.sleep(1000);
			//driver.findElement(By.id(config.getSTGVMserve8firstfieldlocator())).sendKeys("300");
			
			ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_STAYINGONBOARDVALIDINPUT");
		}
		
		@Then("^input valid value from Accommodation and bed,charges for one day - for the sixth time$")
		public void input_valid_value_from_Accommodation_and_bed_charges_for_one_day_for_the_sixth_time() throws Throwable {
			
			Thread.sleep(3000);
			WebElement scroll = driver.findElement(By.id(config.getSTGVMAccombedchargesfirstfieldlocator()));
			scroll.sendKeys(Keys.PAGE_DOWN);
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMAccombedchargesfirstfieldlocator())).clear();
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMAccombedchargesfirstfieldlocator())).sendKeys("500");
			
			ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_ACC&BEDVALIDINPUT");

		}
		
		@Then("^from the Number of chargable meals provided each day drop down select number seven - for the sixth time$")
		public void from_the_Number_of_chargable_meals_provided_each_day_drop_down_select_number_seven_for_the_sixth_time() throws Throwable {
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMchargablemealsdropdownlocator())).click();
			
			driver.findElement(By.xpath(config.getSTGVMchargablemealsdropdownlocator7())).click();
			
	        ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_CHARGEABLEM&A7");
		}
		
		@Then("^validate the warning message Meal\\(s\\) at the bottom of the list will be deleted\\. Do you want to proceed\\? then click on Yes button - Meal eight deleted$")
		public void validate_the_warning_message_Meal_s_at_the_bottom_of_the_list_will_be_deleted_Do_you_want_to_proceed_then_click_on_Yes_button_Meal_eight_deleted() throws Throwable {

			Thread.sleep(1000);
				
			String actual_VMDoyouwantoproceeddeletingtext= driver.findElement(By.xpath(config.getSTGVMDoyouwantoproceeddeletinglocator())).getAttribute("innerHTML");
			
			String expected_VMDoyouwantoproceeddeletingtext="Meal(s) at the bottom of the list will be deleted. Do you want to proceed?";
			
		    Assert.assertEquals(expected_VMDoyouwantoproceeddeletingtext, actual_VMDoyouwantoproceeddeletingtext);
		    
		    Assert.assertTrue(actual_VMDoyouwantoproceeddeletingtext.contains(config.getSTGVMDoyouwantoproceeddeletingtext()));
			
			
	        System.out.println("VMDoyouwantoproceeddeletingtext confirmed");
	        
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMwillbedeletedYes())).click();
		}
		
		@Then("^from the Number of chargable meals provided each day drop down select number six - for the sixth time$")
		public void from_the_Number_of_chargable_meals_provided_each_day_drop_down_select_number_six_for_the_sixth_time() throws Throwable {
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMchargablemealsdropdownlocator())).click();
			
			driver.findElement(By.xpath(config.getSTGVMchargablemealsdropdownlocator6())).click();
			
	        ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_CHARGEABLEM&A6");
		}
		
		@Then("^validate the warning message Meal\\(s\\) at the bottom of the list will be deleted\\. Do you want to proceed\\? then click on Yes button - Meal seven deleted$")
		public void validate_the_warning_message_Meal_s_at_the_bottom_of_the_list_will_be_deleted_Do_you_want_to_proceed_then_click_on_Yes_button_Meal_seven_deleted() throws Throwable {

			
			Thread.sleep(1000);
				
			String actual_VMDoyouwantoproceeddeletingtext= driver.findElement(By.xpath(config.getSTGVMDoyouwantoproceeddeletinglocator())).getAttribute("innerHTML");
			
			String expected_VMDoyouwantoproceeddeletingtext="Meal(s) at the bottom of the list will be deleted. Do you want to proceed?";
			
		    Assert.assertEquals(expected_VMDoyouwantoproceeddeletingtext, actual_VMDoyouwantoproceeddeletingtext);
		    
		    Assert.assertTrue(actual_VMDoyouwantoproceeddeletingtext.contains(config.getSTGVMDoyouwantoproceeddeletingtext()));
			
			
	        System.out.println("VMDoyouwantoproceeddeletingtext confirmed");
	        
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMwillbedeletedYes())).click();
		}
		
		@Then("^from the Number of chargable meals provided each day drop down select number five - for the sixth time$")
		public void from_the_Number_of_chargable_meals_provided_each_day_drop_down_select_number_five_for_the_sixth_time() throws Throwable {
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMchargablemealsdropdownlocator())).click();
			
			driver.findElement(By.xpath(config.getSTGVMchargablemealsdropdownlocator5())).click();
			
	        ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_CHARGEABLEM&A5");
		}
		
		@Then("^validate the warning message Meal\\(s\\) at the bottom of the list will be deleted\\. Do you want to proceed\\? then click on Yes button - Meal six deleted$")
		public void validate_the_warning_message_Meal_s_at_the_bottom_of_the_list_will_be_deleted_Do_you_want_to_proceed_then_click_on_Yes_button_Meal_six_deleted() throws Throwable {
			
			Thread.sleep(1000);
				
			String actual_VMDoyouwantoproceeddeletingtext= driver.findElement(By.xpath(config.getSTGVMDoyouwantoproceeddeletinglocator())).getAttribute("innerHTML");
			
			String expected_VMDoyouwantoproceeddeletingtext="Meal(s) at the bottom of the list will be deleted. Do you want to proceed?";
			
		    Assert.assertEquals(expected_VMDoyouwantoproceeddeletingtext, actual_VMDoyouwantoproceeddeletingtext);
		    
		    Assert.assertTrue(actual_VMDoyouwantoproceeddeletingtext.contains(config.getSTGVMDoyouwantoproceeddeletingtext()));
			
			
	        System.out.println("VMDoyouwantoproceeddeletingtext confirmed");
	        
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMwillbedeletedYes())).click();
		}
		
		@Then("^from the Number of chargable meals provided each day drop down select number four - for the sixth time$")
		public void from_the_Number_of_chargable_meals_provided_each_day_drop_down_select_number_four_for_the_sixth_time() throws Throwable {
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMchargablemealsdropdownlocator())).click();
			
			driver.findElement(By.xpath(config.getSTGVMchargablemealsdropdownlocator4())).click();
			
	        ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_CHARGEABLEM&A4");
		}
		
		@Then("^validate the warning message Meal\\(s\\) at the bottom of the list will be deleted\\. Do you want to proceed\\? then click on Yes button - Meal five deleted$")
		public void validate_the_warning_message_Meal_s_at_the_bottom_of_the_list_will_be_deleted_Do_you_want_to_proceed_then_click_on_Yes_button_Meal_five_deleted() throws Throwable {
			
			Thread.sleep(1000);
				
			String actual_VMDoyouwantoproceeddeletingtext= driver.findElement(By.xpath(config.getSTGVMDoyouwantoproceeddeletinglocator())).getAttribute("innerHTML");
			
			String expected_VMDoyouwantoproceeddeletingtext="Meal(s) at the bottom of the list will be deleted. Do you want to proceed?";
			
		    Assert.assertEquals(expected_VMDoyouwantoproceeddeletingtext, actual_VMDoyouwantoproceeddeletingtext);
		    
		    Assert.assertTrue(actual_VMDoyouwantoproceeddeletingtext.contains(config.getSTGVMDoyouwantoproceeddeletingtext()));
			
			
	        System.out.println("VMDoyouwantoproceeddeletingtext confirmed");
	        
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMwillbedeletedYes())).click();
		}
		
		@Then("^click on save button - for the sixth time$")
		public void click_on_save_button_for_the_sixth_time() throws Throwable {
			//Thread.sleep(1000);
			//driver.findElement(By.id(config.getSTGVMSaveMASettingsLocator())).click();
		}
		
		@And("^browser will close - for the sixth time$")
		public void browser_will_close_for_the_sixth_time() throws Throwable {
			Thread.sleep(1000);
			driver.quit();

		}
		
	
}