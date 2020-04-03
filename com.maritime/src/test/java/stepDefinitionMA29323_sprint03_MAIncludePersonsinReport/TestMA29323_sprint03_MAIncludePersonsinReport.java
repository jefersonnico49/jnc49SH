package stepDefinitionMA29323_sprint03_MAIncludePersonsinReport;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import maritimeutility.ConfigReader;

public class TestMA29323_sprint03_MAIncludePersonsinReport {
	
	WebDriver driver;
	
	ConfigReader config=new ConfigReader();
	
	
	//Scenario:  Validate if the Company Names are available for Company Report
	
	@Given("^open Vessel Manager login with valid user credentials$")
	public void open_Vessel_Manager_login_with_valid_user_credentials() throws Throwable {

		Thread.sleep(1000);
		System.setProperty("webdriver.chrome.driver",config.getChromePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(config.getSTGURLVM());	
		
		ConfigReader.captureScreesnhot(driver, "BrowserStarted_M&Adisplay_29214");
		
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMUNINPUTFIELDID())).sendKeys(config.getSTGVMUNAdmin());
		driver.findElement(By.id(config.getSTGVMPWINPUTFIELDID())).sendKeys(config.getSTGVMPWAdmin());
		driver.findElement(By.id(config.getSTGVMLOGINBTN())).click();
		
		ConfigReader.captureScreesnhot(driver, "Log-in_VesselManager_29323");
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
		
		ConfigReader.captureScreesnhot(driver, "29323_MEALSANDACCOMMODATIONSUBMENUURLANDPAGE");
	}

	@Then("^input valid date range period$")
	public void input_valid_date_range_period() throws Throwable {
	       Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodInputfield())).sendKeys("01/08/2016 - 31/08/2016");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodApplybuttonlocator())).click();

	}

	@Then("^under company select Symbit and click on submit button$")
	public void under_company_select_Symbit_and_click_on_submit_button() throws Throwable {
		Thread.sleep(1000);
		 driver.findElement(By.xpath(config.getSTGVMCompanyinputfield())).sendKeys("Symbit");
		 driver.findElement(By.xpath(config.getSTGVMCompanyinputfield())).sendKeys(Keys.RETURN);
		 
	        Thread.sleep(1000);
	        driver.findElement(By.id(config.getSTGVMSubmitbuttonreportdisplay())).click();
	}

	@Then("^validate if Symbit display under Company$")
	public void validate_if_Symbit_display_under_Company() throws Throwable {
		Thread.sleep(1000);
		
		String actual_Symbittext= driver.findElement(By.xpath(config.getSTGVMAB12Company())).getAttribute("innerHTML");
		
		String expected_Symbittext="Symbit";
		
	    Assert.assertEquals(expected_Symbittext, actual_Symbittext);
	    
	    Assert.assertTrue(actual_Symbittext.contains(config.getSTGVMSymbittext()));
		
		
		System.out.println("Symbittext confirmed");
		
		ConfigReader.captureScreesnhot(driver, "Symbittext_display_29323");
		
	}

	@And("^browser will close$")
	public void browser_will_close() throws Throwable {
		Thread.sleep(1000);
		driver.quit();
	}

	@Given("^open Vessel Manager login with valid user credentials for the second time$")
	public void open_Vessel_Manager_login_with_valid_user_credentials_for_the_second_time() throws Throwable {
		Thread.sleep(1000);
		System.setProperty("webdriver.chrome.driver",config.getChromePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(config.getSTGURLVM());	
		
		ConfigReader.captureScreesnhot(driver, "BrowserStarted_M&Adisplay_29214");
		
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMUNINPUTFIELDID())).sendKeys(config.getSTGVMUNAdmin());
		driver.findElement(By.id(config.getSTGVMPWINPUTFIELDID())).sendKeys(config.getSTGVMPWAdmin());
		driver.findElement(By.id(config.getSTGVMLOGINBTN())).click();
		
		ConfigReader.captureScreesnhot(driver, "Log-in_VesselManager_29323");
	}

	@Then("^go to Personnel menu for the second time$")
	public void go_to_Personnel_menu_for_the_second_time() throws Throwable {
		Thread.sleep(1000);

		WebElement menu = driver.findElement(By.id(config.getSTGVMPERSONNELMENU()));
		Actions builder = new Actions(driver);    
		builder.moveToElement(menu).build().perform();
	}

	@Then("^access Meals and Accommodation sub menu for the second time$")
	public void access_Meals_and_Accommodation_sub_menu_for_the_second_time() throws Throwable {
		Thread.sleep(1000);
		WebElement menuOption = driver.findElement(By.id("hyp_MA"));
		menuOption.click();
	}

	@Then("^validate if the current url is correct for the second time$")
	public void validate_if_the_current_url_is_correct_for_the_second_time() throws Throwable {
		Thread.sleep(1000);
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, config.getSTGVMMEALSANDACCOMMODATIONSUBMENUURL());
		
		ConfigReader.captureScreesnhot(driver, "29323_MEALSANDACCOMMODATIONSUBMENUURLANDPAGE");
	}

	@Then("^input valid date range period for the second time$")
	public void input_valid_date_range_period_for_the_second_time() throws Throwable {
	       Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodInputfield())).sendKeys("01/08/2016 - 31/08/2016");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodApplybuttonlocator())).click();
	        

	}

	@Then("^under company select AB(\\d+) Company and click on submit button for the second time$")
	public void under_company_select_AB_Company_and_click_on_submit_button_for_the_second_time(int arg1) throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath(config.getSTGVMCompanyinputfield())).sendKeys("AB12 Company");
		driver.findElement(By.xpath(config.getSTGVMCompanyinputfield())).sendKeys(Keys.RETURN);
		
        Thread.sleep(1000);
        driver.findElement(By.id(config.getSTGVMSubmitbuttonreportdisplay())).click();
	}

	@Then("^validate if AB(\\d+) Company display under Company for the second time$")
	public void validate_if_AB_Company_display_under_Company_for_the_second_time(int arg1) throws Throwable {
		Thread.sleep(1000);
		
		String actual_AB12Companytext= driver.findElement(By.xpath(config.getSTGVMAB12Company())).getAttribute("innerHTML");
		
		String expected_AB12Companytext="AB12 Company";
		
	    Assert.assertEquals(expected_AB12Companytext, actual_AB12Companytext);
	    
	    Assert.assertTrue(actual_AB12Companytext.contains(config.getSTGVMAB12Companytext()));
		
		
		System.out.println("AB12Companytext confirmed");
		
		ConfigReader.captureScreesnhot(driver, "AB12Companytext_display_29323");
	}

	@Then("^browser will close for the second time$")
	public void browser_will_close_for_the_second_time() throws Throwable {
		Thread.sleep(1000);
		driver.quit();
	}

	@Given("^open Vessel Manager login with valid user credentials for the third time$")
	public void open_Vessel_Manager_login_with_valid_user_credentials_for_the_third_time() throws Throwable {
		Thread.sleep(1000);
		System.setProperty("webdriver.chrome.driver",config.getChromePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(config.getSTGURLVM());	
		
		ConfigReader.captureScreesnhot(driver, "BrowserStarted_M&Adisplay_29214");
		
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMUNINPUTFIELDID())).sendKeys(config.getSTGVMUNAdmin());
		driver.findElement(By.id(config.getSTGVMPWINPUTFIELDID())).sendKeys(config.getSTGVMPWAdmin());
		driver.findElement(By.id(config.getSTGVMLOGINBTN())).click();
		
		ConfigReader.captureScreesnhot(driver, "Log-in_VesselManager_29323");
	}

	@And("^go to Personnel menu for the third time$")
	public void go_to_Personnel_menu_for_the_third_time() throws Throwable {
		Thread.sleep(1000);

		WebElement menu = driver.findElement(By.id(config.getSTGVMPERSONNELMENU()));
		Actions builder = new Actions(driver);    
		builder.moveToElement(menu).build().perform();
	}

	@Then("^access Meals and Accommodation sub menu for the third time$")
	public void access_Meals_and_Accommodation_sub_menu_for_the_third_time() throws Throwable {
		Thread.sleep(1000);
		WebElement menuOption = driver.findElement(By.id("hyp_MA"));
		menuOption.click();
	}

	@Then("^validate if the current url is correct for the third time$")
	public void validate_if_the_current_url_is_correct_for_the_third_time() throws Throwable {
		Thread.sleep(1000);
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, config.getSTGVMMEALSANDACCOMMODATIONSUBMENUURL());
		
		ConfigReader.captureScreesnhot(driver, "29323_MEALSANDACCOMMODATIONSUBMENUURLANDPAGE");
	}

	@Then("^input valid date range period for the third time$")
	public void input_valid_date_range_period_for_the_third_time() throws Throwable {
	       Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodInputfield())).sendKeys("01/08/2016 - 31/08/2016");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodApplybuttonlocator())).click();
	        
	}

	@Then("^under company select Shipadmin Company and click on submit button for the third time$")
	public void under_company_select_Shipadmin_Company_and_click_on_submit_button_for_the_third_time() throws Throwable {
		Thread.sleep(1000);
		 driver.findElement(By.xpath(config.getSTGVMCompanyinputfield())).sendKeys("Shipadmin Company");
		 driver.findElement(By.xpath(config.getSTGVMCompanyinputfield())).sendKeys(Keys.RETURN);
		 
	        Thread.sleep(1000);
	        driver.findElement(By.id(config.getSTGVMSubmitbuttonreportdisplay())).click();
	}

	@Then("^validate if Shipadmin Company display under Company for the third time$")
	public void validate_if_Shipadmin_Company_display_under_Company_for_the_third_time() throws Throwable {
		Thread.sleep(1000);
		
		String actual_ShipadminCompanytext= driver.findElement(By.xpath(config.getSTGVMShipadminCompany())).getAttribute("innerHTML");
		
		String expected_ShipadminCompanytext="Shipadmin Company";
		
	    Assert.assertEquals(expected_ShipadminCompanytext, actual_ShipadminCompanytext);
	    
	    Assert.assertTrue(actual_ShipadminCompanytext.contains(config.getSTGVMShipadminCompanytext()));
		
		
		System.out.println("ShipadminCompanytext confirmed");
		
		ConfigReader.captureScreesnhot(driver, "ShipadminCompanytext_display_29323");
	}

	@And("^browser will close for the third time$")
	public void browser_will_close_for_the_third_time() throws Throwable {
		Thread.sleep(1000);
		driver.quit();
	}

	@Given("^open Vessel Manager login with valid user credentials for the fourth time$")
	public void open_Vessel_Manager_login_with_valid_user_credentials_for_the_fourth_time() throws Throwable {
		Thread.sleep(1000);
		System.setProperty("webdriver.chrome.driver",config.getChromePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(config.getSTGURLVM());	
		
		ConfigReader.captureScreesnhot(driver, "BrowserStarted_M&Adisplay_29214");
		
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMUNINPUTFIELDID())).sendKeys(config.getSTGVMUNAdmin());
		driver.findElement(By.id(config.getSTGVMPWINPUTFIELDID())).sendKeys(config.getSTGVMPWAdmin());
		driver.findElement(By.id(config.getSTGVMLOGINBTN())).click();
		
		ConfigReader.captureScreesnhot(driver, "Log-in_VesselManager_29323");
	}

	@Then("^go to Personnel menu for the fourth time$")
	public void go_to_Personnel_menu_for_the_fourth_time() throws Throwable {
		Thread.sleep(1000);

		WebElement menu = driver.findElement(By.id(config.getSTGVMPERSONNELMENU()));
		Actions builder = new Actions(driver);    
		builder.moveToElement(menu).build().perform();
	}

	@Then("^access Meals and Accommodation sub menu for the fourth time$")
	public void access_Meals_and_Accommodation_sub_menu_for_the_fourth_time() throws Throwable {
		Thread.sleep(1000);
		WebElement menuOption = driver.findElement(By.id("hyp_MA"));
		menuOption.click();
	}

	@Then("^validate if the current url is correct for the fourth time$")
	public void validate_if_the_current_url_is_correct_for_the_fourth_time() throws Throwable {
		Thread.sleep(1000);
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, config.getSTGVMMEALSANDACCOMMODATIONSUBMENUURL());
		
		ConfigReader.captureScreesnhot(driver, "29323_MEALSANDACCOMMODATIONSUBMENUURLANDPAGE");
	}

	@Then("^input valid date range period and click on submit button$")
	public void input_valid_date_range_period_and_click_on_submit_button() throws Throwable {
	       Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodInputfield())).sendKeys("01/08/2016 - 31/08/2016");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodApplybuttonlocator())).click();
	        
	        Thread.sleep(1000);
	        driver.findElement(By.id(config.getSTGVMSubmitbuttonreportdisplay())).click();
	}

	@Then("^validate if Symbit display under Company for the fourth time$")
	public void validate_if_Symbit_display_under_Company_for_the_fourth_time() throws Throwable {
		Thread.sleep(1000);
		
		String actual_Symbittext= driver.findElement(By.xpath(config.getSTGVMSymbitCompany2())).getAttribute("innerHTML");
		
		String expected_Symbittext="Symbit";
		
	    Assert.assertEquals(expected_Symbittext, actual_Symbittext);
	    
	    Assert.assertTrue(actual_Symbittext.contains(config.getSTGVMSymbittext()));
		
		
		System.out.println("Symbittext confirmed");
		
		ConfigReader.captureScreesnhot(driver, "Symbittext_display_29323");
	}

	@Then("^validate if AB(\\d+) Company display under Company for the fourth time$")
	public void validate_if_AB_Company_display_under_Company_for_the_fourth_time(int arg1) throws Throwable {
		Thread.sleep(1000);
		
		String actual_AB12Companytext= driver.findElement(By.xpath(config.getSTGVMAB12Company2())).getAttribute("innerHTML");
		
		String expected_AB12Companytext="AB12 Company";
		
	    Assert.assertEquals(expected_AB12Companytext, actual_AB12Companytext);
	    
	    Assert.assertTrue(actual_AB12Companytext.contains(config.getSTGVMAB12Companytext()));
		
		
		System.out.println("AB12Companytext confirmed");
		
		ConfigReader.captureScreesnhot(driver, "AB12Companytext_display_29323");
	}

	@Then("^validate if Shipadmin Company display under Company for the fourth time$")
	public void validate_if_Shipadmin_Company_display_under_Company_for_the_fourth_time() throws Throwable {
		Thread.sleep(1000);
		
		String actual_ShipadminCompanytext= driver.findElement(By.xpath(config.getSTGVMShipadminCompany2())).getAttribute("innerHTML");
		
		String expected_ShipadminCompanytext="Shipadmin Company";
		
	    Assert.assertEquals(expected_ShipadminCompanytext, actual_ShipadminCompanytext);
	    
	    Assert.assertTrue(actual_ShipadminCompanytext.contains(config.getSTGVMShipadminCompanytext()));
		
		
		System.out.println("ShipadminCompanytext confirmed");
		
		ConfigReader.captureScreesnhot(driver, "ShipadminCompanytext_display_29323");
	}

	@And("^browser will close for the fourth time$")
	public void browser_will_close_for_the_fourth_time() throws Throwable {
		Thread.sleep(1000);
		driver.quit();
	}
	
	//Scenario:  Validate if the report per Company Header is available

	@Given("^open Vessel Manager login with valid user credentials for the fifth time$")
	public void open_Vessel_Manager_login_with_valid_user_credentials_for_the_fifth_time() throws Throwable {

		Thread.sleep(1000);
		System.setProperty("webdriver.chrome.driver",config.getChromePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(config.getSTGURLVM());	
		
		ConfigReader.captureScreesnhot(driver, "BrowserStarted_M&Adisplay_29214");
		
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMUNINPUTFIELDID())).sendKeys(config.getSTGVMUNAdmin());
		driver.findElement(By.id(config.getSTGVMPWINPUTFIELDID())).sendKeys(config.getSTGVMPWAdmin());
		driver.findElement(By.id(config.getSTGVMLOGINBTN())).click();
		
		ConfigReader.captureScreesnhot(driver, "Log-in_VesselManager_29323");
	}

	@Then("^go to Personnel menu for the for the fifth time$")
	public void go_to_Personnel_menu_for_the_for_the_fifth_time() throws Throwable {
		Thread.sleep(1000);

		WebElement menu = driver.findElement(By.id(config.getSTGVMPERSONNELMENU()));
		Actions builder = new Actions(driver);    
		builder.moveToElement(menu).build().perform();
	}

	@Then("^access Meals and Accommodation sub menu for the fifth time$")
	public void access_Meals_and_Accommodation_sub_menu_for_the_fifth_time() throws Throwable {
		Thread.sleep(1000);
		WebElement menuOption = driver.findElement(By.id("hyp_MA"));
		menuOption.click();
	}

	@Then("^validate if the current url is correct for the fifth time$")
	public void validate_if_the_current_url_is_correct_for_the_fifth_time() throws Throwable {
		Thread.sleep(1000);
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, config.getSTGVMMEALSANDACCOMMODATIONSUBMENUURL());
		
		ConfigReader.captureScreesnhot(driver, "29323_MEALSANDACCOMMODATIONSUBMENUURLANDPAGE");
	}

	@Then("^input valid date range period and click on submit button for the fifth time$")
	public void input_valid_date_range_period_and_click_on_submit_button_for_the_fifth_time() throws Throwable {
	       Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodInputfield())).sendKeys("01/08/2016 - 31/08/2016");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodApplybuttonlocator())).click();
	        
	        Thread.sleep(1000);
	        driver.findElement(By.id(config.getSTGVMSubmitbuttonreportdisplay())).click();
	}

	@Then("^validate if the Company Header is available$")
	public void validate_if_the_Company_Header_is_available() throws Throwable {
		Thread.sleep(1000);
		
		String actual_CompanyHeadertextC= driver.findElement(By.xpath(config.getSTGVMCompanyHeaderC())).getAttribute("innerHTML");
		
		String expected_CompanyHeadertextC="Company";
		
	    Assert.assertEquals(expected_CompanyHeadertextC, actual_CompanyHeadertextC);
	    
	    Assert.assertTrue(actual_CompanyHeadertextC.contains(config.getSTGVMCompanyHeadertextC()));
		
		
		System.out.println("CompanyHeadertextC confirmed");
		
		ConfigReader.captureScreesnhot(driver, "CompanyHeadertextC_display_29323");
	}

	@Then("^validate if the Meals Header is available$")
	public void validate_if_the_Meals_Header_is_available() throws Throwable {
		Thread.sleep(1000);
		
		String actual_MealsHeadertextC= driver.findElement(By.id(config.getSTGVMMealsHeaderC())).getAttribute("innerHTML");
		
		String expected_MealsHeadertextC="Meals";
		
	    Assert.assertEquals(expected_MealsHeadertextC, actual_MealsHeadertextC);
	    
	    Assert.assertTrue(actual_MealsHeadertextC.contains(config.getSTGVMMealsHeadertextC()));
		
		
		System.out.println("MealsHeadertextC confirmed");
		
		ConfigReader.captureScreesnhot(driver, "MealsHeadertextC_display_29323");
	}

	@Then("^validate if the Charge Header is available$")
	public void validate_if_the_Charge_Header_is_available() throws Throwable {
		//Thread.sleep(1000);
		
		//String actual_MealsChargetextC= driver.findElement(By.xpath(config.getSTGVMChargeHeaderC())).getAttribute("innerHTML");
		
		//String expected_MealsChargetextC="Charge";
		
	    //Assert.assertEquals(expected_MealsChargetextC, actual_MealsChargetextC);
	    
	   // Assert.assertTrue(actual_MealsChargetextC.contains(config.getSTGVMMealsChargetextC()));
		
		
		//System.out.println("MealsChargetextC confirmed");
		
		//ConfigReader.captureScreesnhot(driver, "MealsChargetextC_display_29323");
	}

	@Then("^validate if the Extra Charges Header is available$")
	public void validate_if_the_Extra_Charges_Header_is_available() throws Throwable {
		Thread.sleep(1000);
		
		String actual_MealsExtraChargestextC= driver.findElement(By.xpath(config.getSTGVMExtraChargesC())).getAttribute("innerHTML");
		
		String expected_MealsExtraChargestextC="Extra Charges";
		
	    Assert.assertEquals(expected_MealsExtraChargestextC, actual_MealsExtraChargestextC);
	    
	    Assert.assertTrue(actual_MealsExtraChargestextC.contains(config.getSTGVMMealsExtraChargestextC()));
		
		
		System.out.println("MealsExtraChargestextC confirmed");
		
		ConfigReader.captureScreesnhot(driver, "MealsExtraChargestextC_display_29323");
	}

	@Then("^validate if the Total Header is available$")
	public void validate_if_the_Total_Header_is_available() throws Throwable {
		Thread.sleep(1000);
		
		String actual_MealsTotaltextC= driver.findElement(By.xpath(config.getSTGVMTotalC())).getAttribute("innerHTML");
		
		String expected_MealsTotaltextC="Total";
		
	    Assert.assertEquals(expected_MealsTotaltextC, actual_MealsTotaltextC);
	    
	    Assert.assertTrue(actual_MealsTotaltextC.contains(config.getSTGVMMealsTotaltextC()));
		
		
		System.out.println("MealsTotaltextC confirmed");
		
		ConfigReader.captureScreesnhot(driver, "MealsTotaltextC_display_29323");
	}

	@And("^browser will close for the fourth time for the fifth time$")
	public void browser_will_close_for_the_fourth_time_for_the_fifth_time() throws Throwable {
			Thread.sleep(1000);
			driver.quit();
	}
	
	//Scenario:  Validate if the Include Persons on the Report are available

	@Given("^open Vessel Manager login with valid user credentials for the sixth time$")
	public void open_Vessel_Manager_login_with_valid_user_credentials_for_the_sixth_time() throws Throwable {
		Thread.sleep(1000);
		System.setProperty("webdriver.chrome.driver",config.getChromePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(config.getSTGURLVM());	
		
		ConfigReader.captureScreesnhot(driver, "BrowserStarted_M&Adisplay_29214");
		
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMUNINPUTFIELDID())).sendKeys(config.getSTGVMUNAdmin());
		driver.findElement(By.id(config.getSTGVMPWINPUTFIELDID())).sendKeys(config.getSTGVMPWAdmin());
		driver.findElement(By.id(config.getSTGVMLOGINBTN())).click();
		
		ConfigReader.captureScreesnhot(driver, "Log-in_VesselManager_29323");
	}

	@Then("^go to Personnel menu for the for the sixth time$")
	public void go_to_Personnel_menu_for_the_for_the_sixth_time() throws Throwable {
		Thread.sleep(1000);

		WebElement menu = driver.findElement(By.id(config.getSTGVMPERSONNELMENU()));
		Actions builder = new Actions(driver);    
		builder.moveToElement(menu).build().perform();
	}

	@Then("^access Meals and Accommodation sub menu for the sixth time$")
	public void access_Meals_and_Accommodation_sub_menu_for_the_sixth_time() throws Throwable {
		Thread.sleep(1000);
		WebElement menuOption = driver.findElement(By.id("hyp_MA"));
		menuOption.click();
	}

	@Then("^validate if the current url is correct for the sixth time$")
	public void validate_if_the_current_url_is_correct_for_the_sixth_time() throws Throwable {
		Thread.sleep(1000);
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, config.getSTGVMMEALSANDACCOMMODATIONSUBMENUURL());
		
		ConfigReader.captureScreesnhot(driver, "29323_MEALSANDACCOMMODATIONSUBMENUURLANDPAGE");
	}

	@Then("^input valid date range period and click on submit button for the sixth time$")
	public void input_valid_date_range_period_and_click_on_submit_button_for_the_sixth_time() throws Throwable {
	       Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodInputfield())).sendKeys("01/08/2016 - 31/08/2016");
	        
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

	@Then("^validate if the Name Header is available$")
	public void validate_if_the_Name_Header_is_available() throws Throwable {
		Thread.sleep(1000);
		
		String actual_VMNametextP= driver.findElement(By.id(config.getSTGVMNameP())).getAttribute("innerHTML");
		
		String expected_VMNametextP="Name";
		
	    Assert.assertEquals(expected_VMNametextP, actual_VMNametextP);
	    
	    Assert.assertTrue(actual_VMNametextP.contains(config.getSTGVMNametextP()));
		
		
		System.out.println("VMNametextP confirmed");
		
		ConfigReader.captureScreesnhot(driver, "VMNametextP_display_29323");
	}

	@Then("^validate if the Position Header is available$")
	public void validate_if_the_Position_Header_is_available() throws Throwable {
		Thread.sleep(1000);
		
		String actual_PositiontextP= driver.findElement(By.id(config.getSTGVMPositionP())).getAttribute("innerHTML");
		
		String expected_PositiontextP="Position ";
		
	    Assert.assertEquals(expected_PositiontextP, actual_PositiontextP);
	    
	    Assert.assertTrue(actual_PositiontextP.contains(config.getSTGVMPositiontextP()));
		
		
		System.out.println("PositiontextPP confirmed");
		
		ConfigReader.captureScreesnhot(driver, "PositiontextP_display_29323");
	}
	
	@Then("^validate if the Company Header is available for the sixth time$")
	public void validate_if_the_Company_Header_is_available_for_the_sixth_time() throws Throwable {
		Thread.sleep(1000);
		
		String actual_CompanyHeadertextC= driver.findElement(By.xpath(config.getSTGVMCompanyHeaderC())).getAttribute("innerHTML");
		
		String expected_CompanyHeadertextC="Company";
		
	    Assert.assertEquals(expected_CompanyHeadertextC, actual_CompanyHeadertextC);
	    
	    Assert.assertTrue(actual_CompanyHeadertextC.contains(config.getSTGVMCompanyHeadertextC()));
		
		
		System.out.println("CompanyHeadertextC confirmed");
		
		ConfigReader.captureScreesnhot(driver, "CompanyHeadertextC_display_29323");
	}

	@Then("^validate if the Days Header is available$")
	public void validate_if_the_Days_Header_is_available() throws Throwable {
		Thread.sleep(1000);
		
		String actual_DaystextP= driver.findElement(By.id(config.getSTGVMDaysP())).getAttribute("innerHTML");
		
		String expected_DaystextP="Days";
		
	    Assert.assertEquals(expected_DaystextP, actual_DaystextP);
	    
	    Assert.assertTrue(actual_DaystextP.contains(config.getSTGVMDaystextP()));
		
		
		System.out.println("DaystextP confirmed");
		
		ConfigReader.captureScreesnhot(driver, "DaystextP_display_29323");
	}

	@Then("^validate if the Meals Header is available for the sixth time$")
	public void validate_if_the_Meals_Header_is_available_for_the_sixth_time() throws Throwable {
		Thread.sleep(1000);
		
		String actual_MealsHeadertextC= driver.findElement(By.id(config.getSTGVMMealsHeaderC())).getAttribute("innerHTML");
		
		String expected_MealsHeadertextC="Meals";
		
	    Assert.assertEquals(expected_MealsHeadertextC, actual_MealsHeadertextC);
	    
	    Assert.assertTrue(actual_MealsHeadertextC.contains(config.getSTGVMMealsHeadertextC()));
		
		
		System.out.println("MealsHeadertextC confirmed");
		
		ConfigReader.captureScreesnhot(driver, "MealsHeadertextC_display_29323");
	}

	@Then("^validate if the Charge Header is available for the sixth time$")
	public void validate_if_the_Charge_Header_is_available_for_the_sixth_time() throws Throwable {
		//Thread.sleep(1000);
		
		//String actual_MealsChargetextC= driver.findElement(By.xpath(config.getSTGVMChargeHeaderC())).getAttribute("innerHTML");
		
		//String expected_MealsChargetextC="Charge";
		
	    //Assert.assertEquals(expected_MealsChargetextC, actual_MealsChargetextC);
	    
	   // Assert.assertTrue(actual_MealsChargetextC.contains(config.getSTGVMMealsChargetextC()));
		
		
		//System.out.println("MealsChargetextC confirmed");
		
		//ConfigReader.captureScreesnhot(driver, "MealsChargetextC_display_29323");
	}

	@Then("^validate if the Extra Charges Header is available for the sixth time$")
	public void validate_if_the_Extra_Charges_Header_is_available_for_the_sixth_time() throws Throwable {
		Thread.sleep(1000);
		
		String actual_MealsExtraChargestextC= driver.findElement(By.xpath(config.getSTGVMExtraChargesC())).getAttribute("innerHTML");
		
		String expected_MealsExtraChargestextC="Extra Charges";
		
	    Assert.assertEquals(expected_MealsExtraChargestextC, actual_MealsExtraChargestextC);
	    
	    Assert.assertTrue(actual_MealsExtraChargestextC.contains(config.getSTGVMMealsExtraChargestextC()));
		
		
		System.out.println("MealsExtraChargestextC confirmed");
		
		ConfigReader.captureScreesnhot(driver, "MealsExtraChargestextC_display_29323");
	}

	@Then("^validate if the Total Header is available for the sixth time$")
	public void validate_if_the_Total_Header_is_available_for_the_sixth_time() throws Throwable {
		Thread.sleep(1000);
		
		String actual_MealsTotaltextC= driver.findElement(By.xpath(config.getSTGVMTotalC())).getAttribute("innerHTML");
		
		String expected_MealsTotaltextC="Total";
		
	    Assert.assertEquals(expected_MealsTotaltextC, actual_MealsTotaltextC);
	    
	    Assert.assertTrue(actual_MealsTotaltextC.contains(config.getSTGVMMealsTotaltextC()));
		
		
		System.out.println("MealsTotaltextC confirmed");
		
		ConfigReader.captureScreesnhot(driver, "MealsTotaltextC_display_29323");
	}

	@And("^browser will close for the fourth time for the sixth time$")
	public void browser_will_close_for_the_fourth_time_for_the_sixth_time() throws Throwable {
		Thread.sleep(1000);
		driver.quit();
	}

	
	//Scenario: Validate if the Personnel Nicole, Heaven and Lian German is present with meals and Accommodation	
	
	
	@Given("^open Vessel Manager login with valid user credentials for the seventh time$")
	public void open_Vessel_Manager_login_with_valid_user_credentials_for_the_seventh_time() throws Throwable {
		Thread.sleep(1000);
		System.setProperty("webdriver.chrome.driver",config.getChromePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(config.getSTGURLVM());	
		
		ConfigReader.captureScreesnhot(driver, "BrowserStarted_M&Adisplay_29214");
		
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMUNINPUTFIELDID())).sendKeys(config.getSTGVMUNAdmin());
		driver.findElement(By.id(config.getSTGVMPWINPUTFIELDID())).sendKeys(config.getSTGVMPWAdmin());
		driver.findElement(By.id(config.getSTGVMLOGINBTN())).click();
		
		ConfigReader.captureScreesnhot(driver, "Log-in_VesselManager_29323");
	}

	@Then("^go to Personnel menu for the seventh time$")
	public void go_to_Personnel_menu_for_the_seventh_time() throws Throwable {
		Thread.sleep(1000);

		WebElement menu = driver.findElement(By.id(config.getSTGVMPERSONNELMENU()));
		Actions builder = new Actions(driver);    
		builder.moveToElement(menu).build().perform();
	}

	@Then("^access Meals and Accommodation sub menu for the seventh time$")
	public void access_Meals_and_Accommodation_sub_menu_for_the_seventh_time() throws Throwable {
		Thread.sleep(1000);
		WebElement menuOption = driver.findElement(By.id("hyp_MA"));
		menuOption.click();
	}

	@Then("^validate if the current url is correct for the seventh time$")
	public void validate_if_the_current_url_is_correct_for_the_seventh_time() throws Throwable {
		Thread.sleep(1000);
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, config.getSTGVMMEALSANDACCOMMODATIONSUBMENUURL());
		
		ConfigReader.captureScreesnhot(driver, "29323_MEALSANDACCOMMODATIONSUBMENUURLANDPAGE");
	}

	@Then("^input valid date range period and click on submit button for the seventh time$")
	public void input_valid_date_range_period_and_click_on_submit_button_for_the_seventh_time() throws Throwable {
	       Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodInputfield())).sendKeys("01/08/2016 - 31/08/2016");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodApplybuttonlocator())).click();
	        
	        Thread.sleep(1000);
	        driver.findElement(By.id(config.getSTGVMSubmitbuttonreportdisplay())).click();
	}

	@Then("^click on Include Persons on the Report for the seventh time$")
	public void click_on_Include_Persons_on_the_Report_for_the_seventh_time() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath(config.getSTGVMIncludePersonsontheReportcheckbox())).click();
	}

	@Then("^click on Display only persons with meals and accommodation for the seventh time$")
	public void click_on_Display_only_persons_with_meals_and_accommodation_for_the_seventh_time() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath(config.getSTGVMDisplayonlypersonswithmealsandaccommodation())).click();
	}

	@Then("^validate if German, Nicole is present$")
	public void validate_if_German_Nicole_is_present() throws Throwable {
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(config.getSTGVMNicoleGName())).isDisplayed();
		
		//String actual_NicoleGNametext= driver.findElement(By.xpath(config.getSTGVMNicoleGName())).getAttribute("innerHTML");
		
		//String expected_NicoleGNametext="      German, Nicole";
		
	   // Assert.assertEquals(expected_NicoleGNametext, actual_NicoleGNametext);
	    
	   // Assert.assertTrue(actual_NicoleGNametext.contains(config.getSTGVMNicoleGNametext()));
		
		
		//System.out.println("NicoleGNametext confirmed");
		
		ConfigReader.captureScreesnhot(driver, "NicoleGNametext_display_29323");
	}

	@Then("^validate if German, Nicole meals and accommodation icon is present$")
	public void validate_if_German_Nicole_meals_and_accommodation_icon_is_present() throws Throwable {
		driver.findElement(By.xpath(config.getSTGVMNicoleGMealsIcon())).isDisplayed();
	}

	@Then("^validate if German, Nicole position is correct$")
	public void validate_if_German_Nicole_position_is_correct() throws Throwable {
		Thread.sleep(1000);
		
		String actual_NicoleGPositiontext= driver.findElement(By.xpath(config.getSTGVMNicoleGPosition())).getAttribute("innerHTML");
		
		String expected_NicoleGPositiontext="Chief Mate";
		
	    Assert.assertEquals(expected_NicoleGPositiontext, actual_NicoleGPositiontext);
	    
	    Assert.assertTrue(actual_NicoleGPositiontext.contains(config.getSTGVMNicoleGPositiontext()));
		
		
		System.out.println("NicoleGPositiontext confirmed");
		
		ConfigReader.captureScreesnhot(driver, "NicoleGPositiontext_display_29323");
	}

	@Then("^validate if German, Nicole Company is correct$")
	public void validate_if_German_Nicole_Company_is_correct() throws Throwable {
		Thread.sleep(1000);
		
		String actual_NicoleGCompanytext= driver.findElement(By.xpath(config.getSTGVMNicoleGCompany())).getAttribute("innerHTML");
		
		String expected_NicoleGCompanytext="AB12 Company";
		
	    Assert.assertEquals(expected_NicoleGCompanytext, actual_NicoleGCompanytext);
	    
	    Assert.assertTrue(actual_NicoleGCompanytext.contains(config.getSTGVMNicoleGCompanytext()));
		
		
		System.out.println("NicoleGCompanytext confirmed");
		
		ConfigReader.captureScreesnhot(driver, "NicoleGCompanytext_display_29323");
	}

	@Then("^validate if German, Nicole Days onboard is correct$")
	public void validate_if_German_Nicole_Days_onboard_is_correct() throws Throwable {
		Thread.sleep(1000);
		
		String actual_NicoleGDaystext= driver.findElement(By.xpath(config.getSTGVMNicoleGDays())).getAttribute("innerHTML");
		
		String expected_NicoleGDaystext=" 31 ";
		
	    Assert.assertEquals(expected_NicoleGDaystext, actual_NicoleGDaystext);
	    
	    Assert.assertTrue(actual_NicoleGDaystext.contains(config.getSTGVMNicoleGDaystext()));
		
		
		System.out.println("NicoleGDaystext confirmed");
		
		ConfigReader.captureScreesnhot(driver, "NicoleGDaystext_display_29323");
	}

	@Then("^validate if German, Heaven is present$")
	public void validate_if_German_Heaven_is_present() throws Throwable {
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(config.getSTGVMHeavenGName())).isDisplayed();
		
		//String actual_HeavenGNametext= driver.findElement(By.xpath(config.getSTGVMHeavenGName())).getAttribute("innerHTML");
		
		//String expected_HeavenGNametext="      German, Heaven ";
		
	   // Assert.assertEquals(expected_HeavenGNametext, actual_HeavenGNametext);
	    
	   // Assert.assertTrue(actual_HeavenGNametext.contains(config.getSTGVMHeavenGNametext()));
		
		
		System.out.println("HeavenGNametext confirmed");
		
		ConfigReader.captureScreesnhot(driver, "HeavenGNametext_display_29323");
	}

	@Then("^validate if German, Heaven meals and accommodation icon is present$")
	public void validate_if_German_Heaven_meals_and_accommodation_icon_is_present() throws Throwable {
		driver.findElement(By.xpath(config.getSTGVMHeavenGMealsIcon())).isDisplayed();
	}

	@Then("^validate if German, Heaven position is correct$")
	public void validate_if_German_Heaven_position_is_correct() throws Throwable {
		Thread.sleep(1000);
		
		String actual_HeavenGPositiontext= driver.findElement(By.xpath(config.getSTGVMHeavenGPosition())).getAttribute("innerHTML");
		
		String expected_HeavenGPositiontext="2nd Mate";
		
	    Assert.assertEquals(expected_HeavenGPositiontext, actual_HeavenGPositiontext);
	    
	    Assert.assertTrue(actual_HeavenGPositiontext.contains(config.getSTGVMHeavenGPositiontext()));
		
		
		System.out.println("HeavenGPositiontext confirmed");
		
		ConfigReader.captureScreesnhot(driver, "HeavenGPositiontext_display_29323");
	}

	@Then("^validate if German, Heaven Company is correct$")
	public void validate_if_German_Heaven_Company_is_correct() throws Throwable {
		Thread.sleep(1000);
		
		String actual_HeavenGCompanytext= driver.findElement(By.xpath(config.getSTGVMHeavenGCompany())).getAttribute("innerHTML");
		
		String expected_HeavenGCompanytext="Shipadmin Company";
		
	    Assert.assertEquals(expected_HeavenGCompanytext, actual_HeavenGCompanytext);
	    
	    Assert.assertTrue(actual_HeavenGCompanytext.contains(config.getSTGVMHeavenGCompanytext()));
		
		
		System.out.println("HeavenGCompanytext confirmed");
		
		ConfigReader.captureScreesnhot(driver, "HeavenGCompanytext_display_29323");
	}

	@Then("^validate if German, Heaven Days onboard is correct$")
	public void validate_if_German_Heaven_Days_onboard_is_correct() throws Throwable {
		Thread.sleep(1000);
		
		String actual_HeavenGDaystext= driver.findElement(By.xpath(config.getSTGVMHeavenGDays())).getAttribute("innerHTML");
		
		String expected_HeavenGDaystext=" 31 ";
		
	    Assert.assertEquals(expected_HeavenGDaystext, actual_HeavenGDaystext);
	    
	    Assert.assertTrue(actual_HeavenGDaystext.contains(config.getSTGVMHeavenGDaystext()));
		
		
		System.out.println("HeavenGDaystext confirmed");
		
		ConfigReader.captureScreesnhot(driver, "HeavenGDaystext_display_29323");
	}

	@Then("^validate if German, Lian is present$")
	public void validate_if_German_Lian_is_present() throws Throwable {
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(config.getSTGVMLianGName())).isDisplayed();
		
		//String actual_LianGNametext= driver.findElement(By.xpath(config.getSTGVMLianGName())).getAttribute("innerHTML");
		
		//String expected_LianGNametext="      German, Lian";
		
	    //Assert.assertEquals(expected_LianGNametext, actual_LianGNametext);
	    
	    //Assert.assertTrue(actual_LianGNametext.contains(config.getSTGVMLianGNametext()));
		
		
		System.out.println("LianGNametext confirmed");
		
		ConfigReader.captureScreesnhot(driver, "LianGNametext_display_29323");
	}

	@Then("^validate if German, Lian meals and accommodation icon is present$")
	public void validate_if_German_Lian_meals_and_accommodation_icon_is_present() throws Throwable {
		driver.findElement(By.xpath(config.getSTGVMLianGMealsIcon())).isDisplayed();
	}

	@Then("^validate if German, Lian position is correct$")
	public void validate_if_German_Lian_position_is_correct() throws Throwable {
		Thread.sleep(1000);
		
		String actual_LianGPositiontext= driver.findElement(By.xpath(config.getSTGVMLianGPosition())).getAttribute("innerHTML");
		
		String expected_LianGPositiontext="3rd Mate";
		
	    Assert.assertEquals(expected_LianGPositiontext, actual_LianGPositiontext);
	    
	    Assert.assertTrue(actual_LianGPositiontext.contains(config.getSTGVMLianGPositiontext()));
		
		
		System.out.println("LianGPositiontext confirmed");
		
		ConfigReader.captureScreesnhot(driver, "LianGPositiontext_display_29323");
	}

	@Then("^validate if German, Lian Company is correct$")
	public void validate_if_German_Lian_Company_is_correct() throws Throwable {
		Thread.sleep(1000);
		
		String actual_LianGCompanytext= driver.findElement(By.xpath(config.getSTGVMLianGCompany())).getAttribute("innerHTML");
		
		String expected_LianGCompanytext="Symbit";
		
	    Assert.assertEquals(expected_LianGCompanytext, actual_LianGCompanytext);
	    
	    Assert.assertTrue(actual_LianGCompanytext.contains(config.getSTGVMLianGCompanytext()));
		
		
		System.out.println("LianGCompanytext confirmed");
		
		ConfigReader.captureScreesnhot(driver, "LianGCompanytext_display_29323");
	}

	@Then("^validate if German, Lian Days onboard is correct$")
	public void validate_if_German_Lian_Days_onboard_is_correct() throws Throwable {
		Thread.sleep(1000);
		
		String actual_LianGDaystext= driver.findElement(By.xpath(config.getSTGVMLianGDays())).getAttribute("innerHTML");
		
		String expected_LianGDaystext=" 31 ";
		
	    Assert.assertEquals(expected_LianGDaystext, actual_LianGDaystext);
	    
	    Assert.assertTrue(actual_LianGDaystext.contains(config.getSTGVMLianGDaystext()));
		
		
		System.out.println("LianGDaystext confirmed");
		
		ConfigReader.captureScreesnhot(driver, "LianGDaystext_display_29323");
	}

	@And("^Browser will close for the seventh time$")
	public void browser_will_close_for_the_seventh_time() throws Throwable {
		Thread.sleep(1000);
		driver.quit();
	}

}

