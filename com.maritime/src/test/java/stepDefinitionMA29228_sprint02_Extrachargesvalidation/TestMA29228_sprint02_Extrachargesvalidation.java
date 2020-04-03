package stepDefinitionMA29228_sprint02_Extrachargesvalidation;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import maritimeutility.ConfigReader;

public class TestMA29228_sprint02_Extrachargesvalidation {
	
	WebDriver driver;
	
	ConfigReader config=new ConfigReader();
	
	//Scenario:  Add valid description and Price - Add Extra Charge//
	
	@Given("^open Vessel Manager login with valid user credentials$")
	public void open_Vessel_Manager_login_with_valid_user_credentials() throws Throwable {
		
		Thread.sleep(1000);
		System.setProperty("webdriver.chrome.driver",config.getChromePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get(config.getSTGURLVM());	

		ConfigReader.captureScreesnhot(driver, "29213val_Scenario1_BrowserStarted_VesselManagerHomepage_Mealsandaccommodation_1");
		
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMUNINPUTFIELDID())).sendKeys(config.getSTGVMUNAdmin());
		driver.findElement(By.id(config.getSTGVMPWINPUTFIELDID())).sendKeys(config.getSTGVMPWAdmin());
		driver.findElement(By.id(config.getSTGVMLOGINBTN())).click();
		
		ConfigReader.captureScreesnhot(driver, "Log-in_VesselManager");
	}

	@Then("^go to Personnel menu$")
	public void go_to_Personnel_menu() throws Throwable {
		Thread.sleep(1000);

		WebElement menu = driver.findElement(By.id(config.getSTGVMPERSONNELMENU()));
		Actions builder = new Actions(driver);    
		builder.moveToElement(menu).build().perform();
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
		
		ConfigReader.captureScreesnhot(driver, "29213val_Scenario1_MEALSANDACCOMMODATIONSUBMENUURLANDPAGE_1");
	}

	@Then("^input valid date range period and click on submit button$")
	public void input_valid_date_range_period_and_click_on_submit_button() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath(config.getSTGVMPeriodInputfield())).sendKeys("01/01/2018 - 23/01/2018");
        
        Thread.sleep(1000);
        driver.findElement(By.xpath(config.getSTGVMPeriodApplybuttonlocator())).click();
        
        Thread.sleep(1000);
        driver.findElement(By.id(config.getSTGVMSubmitbuttonreportdisplay())).click();
	}
	
	@Then("^click on Include Persons on the Report$")
	public void click_on_Include_Persons_on_the_Report() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath(config.getSTGVMIncludePersonsontheReportcheckbox())).click();
	}

	@Then("^click on a specific personnel$")
	public void click_on_a_specific_personnel() throws Throwable {
	    Thread.sleep(1000);
	    driver.findElement(By.xpath(config.getSTGVMPersonnelInfodropdown())).click();
	}

	@Then("^click on the positive icon to Add Extra charges$")
	public void click_on_the_positive_icon_to_Add_Extra_charges() throws Throwable {
	    Thread.sleep(1000);
	    driver.findElement(By.xpath(config.getSTGVMAddExtrachargeicon())).click();
	}

	@Then("^input a description - Extra charge first line$")
	public void input_a_description_Extra_charge_first_line() throws Throwable {
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargeDescriptioninputfield1())).clear();
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargeDescriptioninputfield1())).sendKeys("Notebook");
	}

	@Then("^input Price - Extra charge first line$")
	public void input_Price_Extra_charge_first_line() throws Throwable {
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargePriceinputfield1())).clear();
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargePriceinputfield1())).sendKeys("12");
	}

	@Then("^click Add another item button five times$")
	public void click_Add_another_item_button_five_times() throws Throwable {
	    //Thread.sleep(1000);
	   // for (int i = 0; i < 4; i++){
	    //driver.findElement(By.id(config.getSTGVMbtnAddExtra())).click();
	    //Thread.sleep(2000);
	   // } 
	}

	@Then("^input a description - Extra charge second line$")
	public void input_a_description_Extra_charge_second_line() throws Throwable {
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargeDescriptioninputfield2())).clear();
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargeDescriptioninputfield2())).sendKeys("Ballpen");
	}

	@Then("^input Price - Extra charge second line$")
	public void input_Price_Extra_charge_second_line() throws Throwable {
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargePriceinputfield2())).clear();
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargePriceinputfield2())).sendKeys("20");
	}

	@Then("^input a description - Extra charge third line$")
	public void input_a_description_Extra_charge_third_line() throws Throwable {
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargeDescriptioninputfield3())).clear();
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargeDescriptioninputfield3())).sendKeys("Wine");
	}

	@Then("^input Price - Extra charge third line$")
	public void input_Price_Extra_charge_third_line() throws Throwable {
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargePriceinputfield3())).clear();;
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargePriceinputfield3())).sendKeys("150");
	}

	@Then("^input a description - Extra charge fourth line$")
	public void input_a_description_Extra_charge_fourth_line() throws Throwable {
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargeDescriptioninputfield4())).clear();
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargeDescriptioninputfield4())).sendKeys("Beer");
	}

	@Then("^input Price - Extra charge fourth line$")
	public void input_Price_Extra_charge_fourth_line() throws Throwable {
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargePriceinputfield4())).clear();
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargePriceinputfield4())).sendKeys("350");
	}

	@Then("^input a description - Extra charge fifth line$")
	public void input_a_description_Extra_charge_fifth_line() throws Throwable {
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargeDescriptioninputfield5())).clear();
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargeDescriptioninputfield5())).sendKeys("Soap");
	}

	@Then("^input Price - Extra charge fifth line$")
	public void input_Price_Extra_charge_fifth_line() throws Throwable {
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargePriceinputfield5())).clear();
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargePriceinputfield5())).sendKeys("356");
	}

	@Then("^click on Save Changes button$")
	public void click_on_Save_Changes_button() throws Throwable {
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargeSavechangesbtn())).click();
	}

	@Then("^validate if the confirmation message for successfully saving the Extra charges will display$")
	public void validate_if_the_confirmation_message_for_successfully_saving_the_Extra_charges_will_display() throws Throwable {

	}

	@And("^browser will close$")
	public void browser_will_close() throws Throwable {
			Thread.sleep(1000);
			driver.quit();
	}
	
	
	//Scenario:  Add invalid description and Price - Add Extra Charge//
	
	@Given("^open Vessel Manager login with valid user credentials - for the second time$")
	public void open_Vessel_Manager_login_with_valid_user_credentials_for_the_second_time() throws Throwable {
		Thread.sleep(1000);
		System.setProperty("webdriver.chrome.driver",config.getChromePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get(config.getSTGURLVM());	

		ConfigReader.captureScreesnhot(driver, "29213val_Scenario1_BrowserStarted_VesselManagerHomepage_Mealsandaccommodation_1");
		
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMUNINPUTFIELDID())).sendKeys(config.getSTGVMUNAdmin());
		driver.findElement(By.id(config.getSTGVMPWINPUTFIELDID())).sendKeys(config.getSTGVMPWAdmin());
		driver.findElement(By.id(config.getSTGVMLOGINBTN())).click();
		
		ConfigReader.captureScreesnhot(driver, "Log-in_VesselManager");
	}

	@Then("^go to Personnel menu - for the second time$")
	public void go_to_Personnel_menu_for_the_second_time() throws Throwable {
		Thread.sleep(1000);

		WebElement menu = driver.findElement(By.id(config.getSTGVMPERSONNELMENU()));
		Actions builder = new Actions(driver);    
		builder.moveToElement(menu).build().perform();
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
		
		ConfigReader.captureScreesnhot(driver, "29213val_Scenario1_MEALSANDACCOMMODATIONSUBMENUURLANDPAGE_1");
	}

	@Then("^input valid date range period and click on submit button - for the second time$")
	public void input_valid_date_range_period_and_click_on_submit_button_for_the_second_time() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath(config.getSTGVMPeriodInputfield())).sendKeys("01/01/2018 - 23/01/2018");
        
        Thread.sleep(1000);
        driver.findElement(By.xpath(config.getSTGVMPeriodApplybuttonlocator())).click();
        
        Thread.sleep(1000);
        driver.findElement(By.id(config.getSTGVMSubmitbuttonreportdisplay())).click();
	}
	
	@Then("^click on Include Persons on the Report for the second time$")
	public void click_on_Include_Persons_on_the_Report_for_the_second_time() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath(config.getSTGVMIncludePersonsontheReportcheckbox())).click();
	}

	@Then("^click on a specific personnel  - for the second time$")
	public void click_on_a_specific_personnel_for_the_second_time() throws Throwable {
	    Thread.sleep(1000);
	    driver.findElement(By.xpath(config.getSTGVMPersonnelInfodropdown())).click();
	}

	@Then("^click on the positive icon to Add Extra charges - for the second time$")
	public void click_on_the_positive_icon_to_Add_Extra_charges_for_the_second_time() throws Throwable {
	    Thread.sleep(1000);
	    driver.findElement(By.xpath(config.getSTGVMAddExtrachargeicon())).click();
	}

	@Then("^input a description - Extra charge first line over the max limit fifty characters$")
	public void input_a_description_Extra_charge_first_line_over_the_max_limit_fifty_characters() throws Throwable {
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargeDescriptioninputfield1())).clear();
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargeDescriptioninputfield1())).sendKeys("The video game and technology industries are change");
	}

	@Then("^input Price - Extra charge first line Alphanumeric characters$")
	public void input_Price_Extra_charge_first_line_Alphanumeric_characters() throws Throwable {
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargePriceinputfield1())).clear();
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargePriceinputfield1())).sendKeys("as@%*12");
	}
	
	@Then("^click Add another item button five times - for the second time$")
	public void click_Add_another_item_button_five_times_for_the_second_time() throws Throwable {
	    //Thread.sleep(1000);
	    //for (int i = 0; i < 4; i++){
	    //driver.findElement(By.id(config.getSTGVMbtnAddExtra())).click();
	    //Thread.sleep(2000);
	    //} 
	}

	@Then("^input a description - Extra charge second line over the max limit fifty characters$")
	public void input_a_description_Extra_charge_second_line_over_the_max_limit_fifty_characters() throws Throwable {
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargeDescriptioninputfield2())).clear();
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargeDescriptioninputfield2())).sendKeys("The video game and technology industries are change");
	}

	@Then("^input Price - Extra charge second line Alphanumeric characters$")
	public void input_Price_Extra_charge_second_line_Alphanumeric_characters() throws Throwable {
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargePriceinputfield2())).clear();
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargePriceinputfield2())).sendKeys("as@%*20");
	}

	@Then("^input a description - Extra charge third line over the max limit fifty characters$")
	public void input_a_description_Extra_charge_third_line_over_the_max_limit_fifty_characters() throws Throwable {
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargeDescriptioninputfield3())).clear();
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargeDescriptioninputfield3())).sendKeys("The video game and technology industries are change");
	}

	@Then("^input Price - Extra charge third line Alphanumeric characters$")
	public void input_Price_Extra_charge_third_line_Alphanumeric_characters() throws Throwable {
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargePriceinputfield3())).clear();;
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargePriceinputfield3())).sendKeys("as@%*150");
	}

	@Then("^input a description - Extra charge fourth line over the max limit fifty characters$")
	public void input_a_description_Extra_charge_fourth_line_over_the_max_limit_fifty_characters() throws Throwable {
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargeDescriptioninputfield4())).clear();
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargeDescriptioninputfield4())).sendKeys("The video game and technology industries are change");
	}

	@Then("^input Price - Extra charge fourth line Alphanumeric characters$")
	public void input_Price_Extra_charge_fourth_line_Alphanumeric_characters() throws Throwable {
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargePriceinputfield4())).clear();
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargePriceinputfield4())).sendKeys("as@%*350");
	}

	@Then("^input a description - Extra charge fifth line over the max limit fifty characters$")
	public void input_a_description_Extra_charge_fifth_line_over_the_max_limit_fifty_characters() throws Throwable {
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargeDescriptioninputfield5())).clear();
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargeDescriptioninputfield5())).sendKeys("The video game and technology industries are change");
	}

	@Then("^input Price - Extra charge fifth line Alphanumeric characters$")
	public void input_Price_Extra_charge_fifth_line_Alphanumeric_characters() throws Throwable {
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargePriceinputfield5())).clear();
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargePriceinputfield5())).sendKeys("as@%*356");
	}

	@Then("^click on Save Changes button - for the second time$")
	public void click_on_Save_Changes_button_for_the_second_time() throws Throwable {
	    Thread.sleep(1000);
	    driver.findElement(By.id(config.getSTGVMAddExtrachargeSavechangesbtn())).click();
	}

	@Then("^validate if the confirmation message for successfully saving the Extra charges will display - for the second time$")
	public void validate_if_the_confirmation_message_for_successfully_saving_the_Extra_charges_will_display_for_the_second_time() throws Throwable {

	}

	@Then("^browser will close - for the second time$")
	public void browser_will_close_for_the_second_time() throws Throwable {
		Thread.sleep(1000);
		driver.quit();
	}

	//Scenario:  Delete existing description and Price - Add Extra Charge//

	@Given("^open Vessel Manager login with valid user credentials - for the fourth time$")
	public void open_Vessel_Manager_login_with_valid_user_credentials_for_the_fourth_time() throws Throwable {
		Thread.sleep(1000);
		System.setProperty("webdriver.chrome.driver",config.getChromePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get(config.getSTGURLVM());	

		ConfigReader.captureScreesnhot(driver, "29213val_Scenario1_BrowserStarted_VesselManagerHomepage_Mealsandaccommodation_1");
		
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMUNINPUTFIELDID())).sendKeys(config.getSTGVMUNAdmin());
		driver.findElement(By.id(config.getSTGVMPWINPUTFIELDID())).sendKeys(config.getSTGVMPWAdmin());
		driver.findElement(By.id(config.getSTGVMLOGINBTN())).click();
		
		ConfigReader.captureScreesnhot(driver, "Log-in_VesselManager");
	}

	@Then("^go to Personnel menu -for the fourth time$")
	public void go_to_Personnel_menu_for_the_fourth_time() throws Throwable {
		Thread.sleep(1000);

		WebElement menu = driver.findElement(By.id(config.getSTGVMPERSONNELMENU()));
		Actions builder = new Actions(driver);    
		builder.moveToElement(menu).build().perform();
	}

	@Then("^access Meals and Accommodation sub menu - for the fourth time$")
	public void access_Meals_and_Accommodation_sub_menu_for_the_fourth_time() throws Throwable {
		Thread.sleep(1000);
		WebElement menuOption = driver.findElement(By.id("hyp_MA"));
		menuOption.click();
	}

	@Then("^validate if the current url is correct - for the fourth time$")
	public void validate_if_the_current_url_is_correct_for_the_fourth_time() throws Throwable {
		Thread.sleep(1000);
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, config.getSTGVMMEALSANDACCOMMODATIONSUBMENUURL());
		
		ConfigReader.captureScreesnhot(driver, "29213val_Scenario1_MEALSANDACCOMMODATIONSUBMENUURLANDPAGE_1");
	}

	@Then("^input valid date range period and click on submit button - for the fourth time$")
	public void input_valid_date_range_period_and_click_on_submit_button_for_the_fourth_time() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath(config.getSTGVMPeriodInputfield())).sendKeys("01/01/2018 - 23/01/2018");
        
        Thread.sleep(1000);
        driver.findElement(By.xpath(config.getSTGVMPeriodApplybuttonlocator())).click();
        
        Thread.sleep(1000);
        driver.findElement(By.id(config.getSTGVMSubmitbuttonreportdisplay())).click();
	}
	
	@Then("^click on Include Persons on the Report for the third time$")
	public void click_on_Include_Persons_on_the_Report_for_the_third_time() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath(config.getSTGVMIncludePersonsontheReportcheckbox())).click();
	}

	@Then("^click on a specific personnel -for the fourth time$")
	public void click_on_a_specific_personnel_for_the_fourth_time() throws Throwable {
	    Thread.sleep(1000);
	    driver.findElement(By.xpath(config.getSTGVMPersonnelInfodropdown())).click();
	}

	@Then("^click on the positive icon to Add Extra charges - for the fourth time$")
	public void click_on_the_positive_icon_to_Add_Extra_charges_for_the_fourth_time() throws Throwable {
	    Thread.sleep(1000);
	    driver.findElement(By.xpath(config.getSTGVMAddExtrachargeicon2())).click();
	    
	    
	  //  Thread.sleep(1000);
		//for (int i = 0; i < 4; i++){
		//driver.findElement(By.id(config.getSTGVMbtnAddExtra())).click();
		//Thread.sleep(2000);
		//  } 
	}

	@Then("^delete fifth line description and price - for the fourth time$")
	public void delete_fifth_line_description_and_price_for_the_fourth_time() throws Throwable {
	    Thread.sleep(1000);
	    driver.findElement(By.xpath(config.getSTGVMAddExtrachargeclosebutton5())).click();
	}

	@Then("^delete fourth line description and price - for the fourth time$")
	public void delete_fourth_line_description_and_price_for_the_fourth_time() throws Throwable {
	    Thread.sleep(1000);
	    driver.findElement(By.xpath(config.getSTGVMAddExtrachargeclosebutton4())).click();
	}

	@Then("^delete third line description and price - for the fourth time$")
	public void delete_third_line_description_and_price_for_the_fourth_time() throws Throwable {
	    Thread.sleep(1000);
	    driver.findElement(By.xpath(config.getSTGVMAddExtrachargeclosebutton3())).click();
	}

	@Then("^delete second line description and price - for the fourth time$")
	public void delete_second_line_description_and_price_for_the_fourth_time() throws Throwable {
	    Thread.sleep(1000);
	    driver.findElement(By.xpath(config.getSTGVMAddExtrachargeclosebutton2())).click();
	}

	@Then("^delete first line description and price - for the fourth time$")
	public void delete_first_line_description_and_price_for_the_fourth_time() throws Throwable {
	    Thread.sleep(1000);
	    driver.findElement(By.xpath(config.getSTGVMAddExtrachargeclosebutton1())).click();
	}

	@Then("^click on Save Changes button - for the fourth time$")
	public void click_on_Save_Changes_button_for_the_fourth_time() throws Throwable {
	   // Thread.sleep(1000);
	   // driver.findElement(By.xpath(config.getSTGVMAddExtrachargeSavechangesbtn())).click();
	}

	@Then("^validate if the confirmation message for successfully saving the Extra charges will display - for the fourth time$")
	public void validate_if_the_confirmation_message_for_successfully_saving_the_Extra_charges_will_display_for_the_fourth_time() throws Throwable {

	}

	@Then("^browser will close - for the fourth time$")
	public void browser_will_close_for_the_fourth_time() throws Throwable {
		Thread.sleep(1000);
		driver.quit();
	}

}	
