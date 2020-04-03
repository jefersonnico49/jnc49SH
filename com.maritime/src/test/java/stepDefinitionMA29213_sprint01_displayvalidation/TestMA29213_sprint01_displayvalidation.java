package stepDefinitionMA29213_sprint01_displayvalidation;

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

public class TestMA29213_sprint01_displayvalidation {
	
	WebDriver driver;
	
	ConfigReader config=new ConfigReader();
	
	//Scenario: Validation of Meals and Accommodation charge settings display for Vessel Manager 

	@Given("^open Vessel Manager login with valid user credentials$")
	public void open_Vessel_Manager_login_with_valid_user_credentials() throws Throwable {
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

	@Then("^validate if the Settings icon is present$")
	public void validate_if_the_Settings_icon_is_present() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath(config.getSTGVMSettingIconlocator())).isDisplayed();
        
        Thread.sleep(1000);
        driver.findElement(By.xpath(config.getSTGVMSettingIconlocator())).click();
        
    	ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_SETTINGSICON");
	}

	@Then("^validate if access Setup Meals and Charges is present$")
	public void validate_if_access_Setup_Meals_and_Charges_is_present() throws Throwable {
		Thread.sleep(1000);
		
		String actual_VMSetupofmealsandchargestext= driver.findElement(By.xpath(config.getSTGVMSetupofmealsandchargesIDlocator())).getAttribute("innerHTML");
		
		String expected_VMSetupofmealsandchargestext="Setup Meals and Charges";
		
	    Assert.assertEquals(expected_VMSetupofmealsandchargestext, actual_VMSetupofmealsandchargestext);
	    
	    Assert.assertTrue(actual_VMSetupofmealsandchargestext.contains(config.getSTGVMSetupofmealsandchargestext()));
				
        System.out.println("VMSetupofmealsandchargestext confirmed");
     
	}

	@Then("^access Setup Meals and Charges page$")
	public void access_Setup_Meals_and_Charges_page() throws Throwable {

		Thread.sleep(1000);
        driver.findElement(By.xpath(config.getSTGVMSetupofmealsandchargesIDlocator())).click();
        
        ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_SETUPMEALS&ACCOMMODATIONMODAL_DISPLAY");
	}
	
	@Then("^validate if access Setup Meals and Charges text is present$")
	public void validate_if_access_Setup_Meals_and_Charges_text_is_present() throws Throwable {
		Thread.sleep(1000);
		
		String actual_VMSetupofmealsandchargestext2= driver.findElement(By.xpath(config.getSTGVMSetupofmealsandchargesIDlocator2())).getAttribute("innerHTML");
		
		String expected_VMSetupofmealsandchargestext2="Setup Meals and Charges";
		
	    Assert.assertEquals(expected_VMSetupofmealsandchargestext2, actual_VMSetupofmealsandchargestext2);
	    
	    Assert.assertTrue(actual_VMSetupofmealsandchargestext2.contains(config.getSTGVMSetupofmealsandchargestext2()));
		
		
        System.out.println("VMSetupofmealsandchargestext2 confirmed");
		

	}

	@Then("^validate if Number of Meals per day text is present$")
	public void validate_if_Number_of_Meals_per_day_text_is_present() throws Throwable {
		Thread.sleep(1000);
		
		String actual_VMNumberofMealsperdaytext= driver.findElement(By.xpath(config.getSTGVMNumberofMealsperdayIDlocator())).getAttribute("innerHTML");
		
		String expected_VMNumberofMealsperdaytext="Number of meals per day: ";
		
	    Assert.assertEquals(expected_VMNumberofMealsperdaytext, actual_VMNumberofMealsperdaytext);
	    
	    Assert.assertTrue(actual_VMNumberofMealsperdaytext.contains(config.getSTGVMNumberofMealsperdaytext()));
		
		
        System.out.println("VMNumberofMealsperdaytext confirmed");
		

	}

	@Then("^validate if Number of Meals per day drop down is present$")
	public void validate_if_Number_of_Meals_per_day_drop_down_is_present() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.id(config.getSTGVMNumberofMealsperdaydropdownlocator())).isDisplayed();
	}

	@Then("^validate if the currency text is present$")
	public void validate_if_the_currency_text_is_present() throws Throwable {
		Thread.sleep(1000);
		
		String actual_VMCurrencytext= driver.findElement(By.xpath(config.getSTGVMCurrencyLocator())).getAttribute("innerHTML");
		
		String expected_VMCurrencytext="Currency: ";
		
	    Assert.assertEquals(expected_VMCurrencytext, actual_VMCurrencytext);
	    
	    Assert.assertTrue(actual_VMCurrencytext.contains(config.getSTGVMCurrencytext()));
		
		
        System.out.println("VMCurrencytext confirmed");
	}

	@Then("^validate if the currency drop down is present$")
	public void validate_if_the_currency_drop_down_is_present() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.id(config.getSTGVMCurrencydropdownlocator())).isDisplayed();
	}

	@Then("^validate if the Start text is present$")
	public void validate_if_the_Start_text_is_present() throws Throwable {
		Thread.sleep(1000);
		
		String actual_VMStarttext = driver.findElement(By.xpath(config.getSTGVMStartLocator())).getAttribute("innerHTML");
		
		String expected_VMStarttext ="Start";
		
	    Assert.assertEquals(expected_VMStarttext , actual_VMStarttext );
	    
	    Assert.assertTrue(actual_VMStarttext .contains(config.getSTGVMStarttext()));
		
		
        System.out.println("VMStarttext confirmed");
	}

	@Then("^validate if the End text is present$")
	public void validate_if_the_End_text_is_present() throws Throwable {
		Thread.sleep(1000);
		
		String actual_VMEndtext = driver.findElement(By.xpath(config.getSTGVMEndLocator())).getAttribute("innerHTML");
		
		String expected_VMEndtext ="End";
		
	    Assert.assertEquals(expected_VMEndtext , actual_VMEndtext );
	    
	    Assert.assertTrue(actual_VMEndtext .contains(config.getSTGVMEndtext()));
		
		
        System.out.println("VMEndtext confirmed");
	}

	@Then("^validate if the Staying On board text is present$")
	public void validate_if_the_Staying_On_board_text_is_present() throws Throwable {
		Thread.sleep(1000);
		
		String actual_VMStayingOnboardtext = driver.findElement(By.xpath(config.getSTGVMStayingOnboardLocator())).getAttribute("innerHTML");
		
		String expected_VMStayingOnboardtext ="Staying Onboard";
		
	    Assert.assertEquals(expected_VMStayingOnboardtext , actual_VMStayingOnboardtext );
	    
	    Assert.assertTrue(actual_VMStayingOnboardtext .contains(config.getSTGVMStayingOnboardtext()));
		
		
        System.out.println("VMStayingOnboardtext confirmed");
	}

	@Then("^validate if the if served as extra meal text is present$")
	public void validate_if_the_if_served_as_extra_meal_text_is_present() throws Throwable {
		Thread.sleep(1000);
		
		String actual_VMifservedasextramealtext = driver.findElement(By.xpath(config.getSTGVMifservedasextramealLocator())).getAttribute("innerHTML");
		
		String expected_VMifservedasextramealtext ="If served as extra meal";
		
	    Assert.assertEquals(expected_VMifservedasextramealtext , actual_VMifservedasextramealtext );
	    
	    Assert.assertTrue(actual_VMifservedasextramealtext .contains(config.getSTGVMifservedasextramealtext()));
		
		
        System.out.println("VMifservedasextramealtext confirmed");
	}

	@Then("^validate if the How to charge: text is present$")
	public void validate_if_the_How_to_charge_text_is_present() throws Throwable {
		Thread.sleep(1000);
		
		String actual_VMHowtochargetext = driver.findElement(By.xpath(config.getSTGVMHowtochargeLocator())).getAttribute("innerHTML");
		
		String expected_VMHowtochargetext ="How to charge: ";
		
	    Assert.assertEquals(expected_VMHowtochargetext , actual_VMHowtochargetext );
	    
	    Assert.assertTrue(actual_VMHowtochargetext .contains(config.getSTGVMHowtochargetext()));
		
		
        System.out.println("VMHowtochargetext confirmed");
	}

	@Then("^validate if the One Charge including bed and meals text is present$")
	public void validate_if_the_One_Charge_including_bed_and_meals_text_is_present() throws Throwable {
		Thread.sleep(1000);
		
		 driver.findElement(By.xpath(config.getSTGVMOnechargeincludingbedandmealsLocator())).isDisplayed();
		
		//String expected_VMOnechargeincludingbedandmealstext ="One Charge including bed and meals";
		
	   // Assert.assertEquals(expected_VMOnechargeincludingbedandmealstext , actual_VMOnechargeincludingbedandmealstext );
	    
	    //Assert.assertTrue(actual_VMOnechargeincludingbedandmealstext .contains(config.getSTGVMOnechargeincludingbedandmealstext()));
		
		
       // System.out.println("VMOnechargeincludingbedandmealstext confirmed");
	}

	@Then("^validate if the Bed and meals charged separately text is present$")
	public void validate_if_the_Bed_and_meals_charged_separately_text_is_present() throws Throwable {
		Thread.sleep(1000);
		
		String actual_VMBedandmealschargedseparatelytext = driver.findElement(By.xpath(config.getSTGVMBedandmealschargedseparatelyLocator())).getAttribute("innerHTML");
		
		String expected_VMBedandmealschargedseparatelytext ="Bed and meals charged separately";
		
	    Assert.assertEquals(expected_VMBedandmealschargedseparatelytext , actual_VMBedandmealschargedseparatelytext );
	    
	    Assert.assertTrue(actual_VMBedandmealschargedseparatelytext .contains(config.getSTGVMBedandmealschargedseparatelytext()));
		
		
        System.out.println("VMBedandmealschargedseparatelytext confirmed");
	}

	@Then("^validate if the Bed and each meal charged separately text is present$")
	public void validate_if_the_Bed_and_each_meal_charged_separately_text_is_present() throws Throwable {
		Thread.sleep(1000);
		
		String actual_VMBedandeachmealchargedseparatelytext = driver.findElement(By.xpath(config.getSTGVMBedandeachmealchargedseparatelyLocator())).getAttribute("innerHTML");
		
		String expected_VMBedandeachmealchargedseparatelytext ="Bed and each meal charged separately";
		
	    Assert.assertEquals(expected_VMBedandeachmealchargedseparatelytext , actual_VMBedandeachmealchargedseparatelytext );
	    
	    Assert.assertTrue(actual_VMBedandeachmealchargedseparatelytext .contains(config.getSTGVMBedandeachmealchargedseparatelytext()));
		
		
        System.out.println("VMBedandeachmealchargedseparatelytext confirmed");
	}

	@Then("^validate if the on day of arrival text is present$")
	public void validate_if_the_on_day_of_arrival_text_is_present() throws Throwable {
		Thread.sleep(1000);
		
		String actual_VMOndayofarrivaltext = driver.findElement(By.xpath(config.getSTGVMOndayofarrivalLocator())).getAttribute("innerHTML");
		
		String expected_VMOndayofarrivaltext ="Meals on day of arrival: ";
		
	    Assert.assertEquals(expected_VMOndayofarrivaltext , actual_VMOndayofarrivaltext );
	    
	    Assert.assertTrue(actual_VMOndayofarrivaltext .contains(config.getSTGVMOndayofarrivaltext()));
		
		
        System.out.println("VMOndayofarrivaltext confirmed");
	}

	@Then("^validate if the Full charge  of arrival time text is present - on day of arrival$")
	public void validate_if_the_Full_charge_of_arrival_time_text_is_present_on_day_of_arrival() throws Throwable {
		Thread.sleep(1000);
		
		String actual_VMFullchargeindependentofarrivaltimetext = driver.findElement(By.xpath(config.getSTGVMFullchargeindependentofarrivaltimeLocator())).getAttribute("innerHTML");
		
		String expected_VMFullchargeindependentofarrivaltimetext ="Full charge independent of arrival time";
		
	    Assert.assertEquals(expected_VMFullchargeindependentofarrivaltimetext , actual_VMFullchargeindependentofarrivaltimetext );
	    
	    Assert.assertTrue(actual_VMFullchargeindependentofarrivaltimetext .contains(config.getSTGVMFullchargeindependentofarrivaltimetext()));
		
		
        System.out.println("VMFullchargeindependentofarrivaltimetext confirmed");
	}

	@Then("^validate if the charge in percentage \\(actual hours/(\\d+)\\) text is present - on day of arrival$")
	public void validate_if_the_charge_in_percentage_actual_hours_text_is_present_on_day_of_arrival(int arg1) throws Throwable {
		Thread.sleep(1000);
		
		String actual_VMChargeinpercentagetext = driver.findElement(By.xpath(config.getSTGVMChargeinpercentageLocator())).getAttribute("innerHTML");
		
		String expected_VMChargeinpercentagetext ="Charge in percentage ( actual hours/ 24 )";
		
	    Assert.assertEquals(expected_VMChargeinpercentagetext , actual_VMChargeinpercentagetext );
	    
	    Assert.assertTrue(actual_VMChargeinpercentagetext .contains(config.getSTGVMChargeinpercentagetext()));
		
		
        System.out.println("VMChargeinpercentagetext confirmed");
	}

	@Then("^validate if the No Charge text is present - on day of arrival$")
	public void validate_if_the_No_Charge_text_is_present_on_day_of_arrival() throws Throwable {
		Thread.sleep(1000);
		
		String actual_VMNoChargetext = driver.findElement(By.xpath(config.getSTGVMNoChargeLocator())).getAttribute("innerHTML");
		
		String expected_VMNoChargetext ="No Charge";
		
	    Assert.assertEquals(expected_VMNoChargetext , actual_VMNoChargetext );
	    
	    Assert.assertTrue(actual_VMNoChargetext .contains(config.getSTGVMNoChargetext()));
		

        System.out.println("VMNoChargetext confirmed");
	}

	@Then("^validate if the Charged if arriving before: text is present - on day of arrival$")
	public void validate_if_the_Charged_if_arriving_before_text_is_present_on_day_of_arrival() throws Throwable {
		Thread.sleep(1000);
		
		String actual_VMChargedifarrivingbeforetext = driver.findElement(By.xpath(config.getSTGVMChargedifarrivingbeforeLocator())).getAttribute("innerHTML");
		
		String expected_VMChargedifarrivingbeforetext ="Charged if arriving before:";
		
	    Assert.assertEquals(expected_VMChargedifarrivingbeforetext , actual_VMChargedifarrivingbeforetext );
	    
	    Assert.assertTrue(actual_VMChargedifarrivingbeforetext .contains(config.getSTGVMChargedifarrivingbeforetext()));
		
		
        System.out.println("VMChargedifarrivingbeforetext confirmed");
	}

	@Then("^validate if the object for time selection for Changed if arriving before is present - on day of arrival$")
	public void validate_if_the_object_for_time_selection_for_Changed_if_arriving_before_is_present_on_day_of_arrival() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.id(config.getSTGVMChargedifarrivingbeforeTimeLocator())).isDisplayed();
	}

	@Then("^validate if the Meals on arrival departure day: text is present$")
	public void validate_if_the_Meals_on_arrival_departure_day_text_is_present() throws Throwable {
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(config.getSTGVMMealsonarrivaldeparturedayLocator())).isDisplayed();
		
		//String expected_VMMealsonarrivaldeparturedaytext ="Meals on arrival / departure day:";
		
	   // Assert.assertEquals(expected_VMMealsonarrivaldeparturedaytext , actual_VMMealsonarrivaldeparturedaytext );
	    
	    //Assert.assertTrue(actual_VMMealsonarrivaldeparturedaytext .contains(config.getSTGVMMealsonarrivaldeparturedaytext()));
		
		
       // System.out.println("VMMealsonarrivaldeparturedaytext confirmed");
	}

	@Then("^validate if the Only meals served when the person was on board will be charged text is present$")
	public void validate_if_the_Only_meals_served_when_the_person_was_on_board_will_be_charged_text_is_present() throws Throwable {
		Thread.sleep(1000);
		
		String actual_VMOnlymealsservedwhenthepersonwasonboardwillbechargedtext = driver.findElement(By.xpath(config.getSTGVMOnlymealsservedwhenthepersonwasonboardwillbechargedLocator())).getAttribute("innerHTML");
		
		String expected_VMOnlymealsservedwhenthepersonwasonboardwillbechargedtext ="Only meals served when the person was on board will be charged";
		
	    Assert.assertEquals(expected_VMOnlymealsservedwhenthepersonwasonboardwillbechargedtext , actual_VMOnlymealsservedwhenthepersonwasonboardwillbechargedtext );
	    
	    Assert.assertTrue(actual_VMOnlymealsservedwhenthepersonwasonboardwillbechargedtext .contains(config.getSTGVMOnlymealsservedwhenthepersonwasonboardwillbechargedtext()));
		
		
        System.out.println("VMOnlymealsservedwhenthepersonwasonboardwillbechargedtext confirmed");
	}

	@Then("^validate if the \\*may also be adjusted manually in software text is present$")
	public void validate_if_the_may_also_be_adjusted_manually_in_software_text_is_present() throws Throwable {
		//Thread.sleep(1000);
		
		//String actual_VMmayalsobeadjustedmanuallyinsoftwaretext = driver.findElement(By.xpath(config.getSTGVMmayalsobeadjustedmanuallyinsoftwarelocator())).getAttribute("innerHTML");
		
		//String expected_VMmayalsobeadjustedmanuallyinsoftwaretext ="may also be adjusted manually in software";
		
	   // Assert.assertEquals(expected_VMmayalsobeadjustedmanuallyinsoftwaretext , actual_VMmayalsobeadjustedmanuallyinsoftwaretext );
	    
	   // Assert.assertTrue(actual_VMmayalsobeadjustedmanuallyinsoftwaretext .contains(config.getSTGVMmayalsobeadjustedmanuallyinsoftwaretext()));
		
		
       // System.out.println("VMmayalsobeadjustedmanuallyinsoftwaretext confirmed");
	}

	@Then("^validate if the On day of departure text is present$")
	public void validate_if_the_On_day_of_departure_text_is_present() throws Throwable {
		Thread.sleep(1000);
		
		String actual_VMSTGVMOndayofdeparturetext = driver.findElement(By.xpath(config.getSTGVMOndayofdepartureLocator())).getAttribute("innerHTML");
		
		String expected_VMSTGVMOndayofdeparturetext ="Meals on departure day:";
		
	    Assert.assertEquals(expected_VMSTGVMOndayofdeparturetext , actual_VMSTGVMOndayofdeparturetext);
	    
	    Assert.assertTrue(actual_VMSTGVMOndayofdeparturetext .contains(config.getSTGVMSTGVMOndayofdeparturetext()));
		
		
        System.out.println("VMSTGVMOndayofdeparturetext confirmed");
	}

	@Then("^validate if the Full charge  of arrival time text is present - On day of departure$")
	public void validate_if_the_Full_charge_of_arrival_time_text_is_present_On_day_of_departure() throws Throwable {
		Thread.sleep(1000);
		
		String actual_VMFullchargeindependentofarrivaltimetext2 = driver.findElement(By.xpath(config.getSTGVMFullchargeindependentofarrivaltimeLocator2())).getAttribute("innerHTML");
		
		String expected_VMFullchargeindependentofarrivaltimetext2 ="Full charge independent of departure time";
		
	    Assert.assertEquals(expected_VMFullchargeindependentofarrivaltimetext2 , actual_VMFullchargeindependentofarrivaltimetext2 );
	    
	    Assert.assertTrue(actual_VMFullchargeindependentofarrivaltimetext2 .contains(config.getSTGVMFullchargeindependentofarrivaltimetext2()));
		
		
        System.out.println("VMFullchargeindependentofarrivaltimetext confirmed");
	}

	@Then("^validate if the charge in percentage \\(actual hours/(\\d+)\\) text is present - On day of departure$")
	public void validate_if_the_charge_in_percentage_actual_hours_text_is_present_On_day_of_departure(int arg1) throws Throwable {
		Thread.sleep(1000);
		
		String actual_VMChargeinpercentagetext2 = driver.findElement(By.xpath(config.getSTGVMChargeinpercentageLocator2())).getAttribute("innerHTML");
		
		String expected_VMChargeinpercentagetext2 ="Charge percentage (actual hours / 24 )";
		
	    Assert.assertEquals(expected_VMChargeinpercentagetext2 , actual_VMChargeinpercentagetext2 );
	    
	    Assert.assertTrue(actual_VMChargeinpercentagetext2 .contains(config.getSTGVMChargeinpercentagetext2()));
		
		
        System.out.println("VMChargeinpercentagetext confirmed");
	}

	@Then("^validate if the No Charge text is present - On day of departure$")
	public void validate_if_the_No_Charge_text_is_present_On_day_of_departure() throws Throwable {
		Thread.sleep(1000);
		
		String actual_VMNoChargetext2 = driver.findElement(By.xpath(config.getSTGVMNoChargeLocator2())).getAttribute("innerHTML");
		
		String expected_VMNoChargetext2 ="No Charge";
		
	    Assert.assertEquals(expected_VMNoChargetext2 , actual_VMNoChargetext2 );
	    
	    Assert.assertTrue(actual_VMNoChargetext2 .contains(config.getSTGVMNoChargetext2()));
		
		
        System.out.println("VMNoChargetext confirmed");
	}

	@Then("^validate if the Charged if arriving before: text is present - On day of departure$")
	public void validate_if_the_Charged_if_arriving_before_text_is_present_On_day_of_departure() throws Throwable {
		Thread.sleep(1000);
		
		String actual_VMChargedifarrivingbeforetext2 = driver.findElement(By.xpath(config.getSTGVMChargedifarrivingbeforeLocator2())).getAttribute("innerHTML");
		
		String expected_VMChargedifarrivingbeforetext2 ="Charged if departing after:";
		
	    Assert.assertEquals(expected_VMChargedifarrivingbeforetext2 , actual_VMChargedifarrivingbeforetext2 );
	    
	    Assert.assertTrue(actual_VMChargedifarrivingbeforetext2 .contains(config.getSTGVMChargedifarrivingbeforetext2()));
		
		
        System.out.println("VMChargedifarrivingbeforetext confirmed");
	}

	@Then("^validate if the object for time selection for Changed if arriving before is present - On day of departure$")
	public void validate_if_the_object_for_time_selection_for_Changed_if_arriving_before_is_present_On_day_of_departure() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.id(config.getSTGVMChargedifarrivingbeforeTimeLocator2())).isDisplayed();
	}

	@Then("^validate if the Save button is available$")
	public void validate_if_the_Save_button_is_available() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.id(config.getSTGVMSaveMASettingsLocator())).isDisplayed();
	}

	@Then("^validate if the Save button text is correct$")
	public void validate_if_the_Save_button_text_is_correct() throws Throwable {
		Thread.sleep(1000);
		
		 driver.findElement(By.id(config.getSTGVMSaveMASettingsLocator())).isDisplayed();
		
		//String expected_VMSaveMASettingstext =" Save Changes ";
		
	   // Assert.assertEquals(expected_VMSaveMASettingstext , actual_VMSaveMASettingstext );
	    
	  // Assert.assertTrue(actual_VMSaveMASettingstext .contains(config.getSTGVMSaveMASettingstext()));
		
		
     //  System.out.println("VMSaveMASettingstext confirmed");
	}

	@Then("^validate if the Cancel button is available$")
	public void validate_if_the_Cancel_button_is_available() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.id(config.getSTGVMCancelMASettingsLocator())).isDisplayed();
	}

	@Then("^validate if the Cancel button text is correct$")
	public void validate_if_the_Cancel_button_text_is_correct() throws Throwable {
		Thread.sleep(1000);
		
		String actual_VMSaveMASettingstext = driver.findElement(By.id(config.getSTGVMCancelMASettingsLocator())).getAttribute("innerHTML");
		
		String expected_VMSaveMASettingstext ="Close";
		
	    Assert.assertEquals(expected_VMSaveMASettingstext, actual_VMSaveMASettingstext );
	    
	    Assert.assertTrue(actual_VMSaveMASettingstext .contains(config.STGVMCancelMASettingstext()));
		
		
        System.out.println("VMCancelMASettingstext confirmed");
	}

	@Then("^validate if the close icon is available$")
	public void validate_if_the_close_icon_is_available() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath(config.getSTGVMCloseiconMASettingsLocator())).isDisplayed();
        

	}

	@And("^browser will close$")
	public void browser_will_close() throws Throwable {
			Thread.sleep(1000);
			driver.quit();
	}


}
