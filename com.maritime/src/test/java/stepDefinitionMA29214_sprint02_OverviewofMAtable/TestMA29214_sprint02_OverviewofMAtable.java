package stepDefinitionMA29214_sprint02_OverviewofMAtable;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import maritimeutility.ConfigReader;

public class TestMA29214_sprint02_OverviewofMAtable {
	
	WebDriver driver;
	
	ConfigReader config=new ConfigReader();
	
	// Scenario:  Can select date period: FROM - TO - Valid date range
	
	@Given("^open Vessel Manager login with valid user credentials$")
	public void open_Vessel_Manager_login_with_valid_user_credentials() throws Throwable {
		Thread.sleep(1000);
		System.setProperty("webdriver.chrome.driver",config.getChromePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(config.getSTGURLVM());	
		
		ConfigReader.captureScreesnhot(driver, "29214_SPRINT02_BROWSERSTARTED_VESSELMANAGER");
		
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMUNINPUTFIELDID())).sendKeys(config.getSTGVMUNAdmin());
		driver.findElement(By.id(config.getSTGVMPWINPUTFIELDID())).sendKeys(config.getSTGVMPWAdmin());
		driver.findElement(By.id(config.getSTGVMLOGINBTN())).click();
		
		ConfigReader.captureScreesnhot(driver, "29214_SPRINT02_LOG-IN_VESSELMANAGER");
	}

	@Then("^go to Personnel menu$")
	public void go_to_Personnel_menu() throws Throwable {
		Thread.sleep(1000);

		WebElement menu = driver.findElement(By.id(config.getSTGVMPERSONNELMENU()));
		Actions builder = new Actions(driver);    
		builder.moveToElement(menu).build().perform();
		
		ConfigReader.captureScreesnhot(driver, "29214_SPRINT02_PERSONNELMENU_M&ASUBMENU");
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
		
		ConfigReader.captureScreesnhot(driver, "29214_SPRINT02_MEALSANDACCOMMODATIONSUBMENUURL");
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

	@Then("^browser will close$")
	public void browser_will_close() throws Throwable {
         Thread.sleep(1000);
         driver.quit();
	}
	
	//Scenario:  Can select date period: FROM - TO - Invalid date range

	@Given("^open Vessel Manager login with valid user credentials for the second time$")
	public void open_Vessel_Manager_login_with_valid_user_credentials_for_the_second_time() throws Throwable {
		Thread.sleep(1000);
		System.setProperty("webdriver.chrome.driver",config.getChromePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(config.getSTGURLVM());	
		
		ConfigReader.captureScreesnhot(driver, "29214_SPRINT02_BROWSERSTARTED_VESSELMANAGER");
		
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMUNINPUTFIELDID())).sendKeys(config.getSTGVMUNAdmin());
		driver.findElement(By.id(config.getSTGVMPWINPUTFIELDID())).sendKeys(config.getSTGVMPWAdmin());
		driver.findElement(By.id(config.getSTGVMLOGINBTN())).click();
		
		ConfigReader.captureScreesnhot(driver, "29214_SPRINT02_LOG-IN_VESSELMANAGER");

	}

	@Then("^go to Personnel menu for the second time$")
	public void go_to_Personnel_menu_for_the_second_time() throws Throwable {
		Thread.sleep(1000);

		WebElement menu = driver.findElement(By.id(config.getSTGVMPERSONNELMENU()));
		Actions builder = new Actions(driver);    
		builder.moveToElement(menu).build().perform();
		
		ConfigReader.captureScreesnhot(driver, "29214_SPRINT02_PERSONNELMENU_M&ASUBMENU");
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
		
		ConfigReader.captureScreesnhot(driver, "29214_SPRINT02_MEALSANDACCOMMODATIONSUBMENUURL");
	}

	@Then("^input invalid date range period and click on submit button$")
	public void input_invalid_date_range_period_and_click_on_submit_button() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath(config.getSTGVMPeriodInputfield())).sendKeys("01/01## - 2301@#");
        
        Thread.sleep(1000);
        driver.findElement(By.xpath(config.getSTGVMPeriodApplybuttonlocator())).click();
        
    	ConfigReader.captureScreesnhot(driver, "29214_SPRINT02_DATERANGEPERIOD");
        
        Thread.sleep(1000);
        driver.findElement(By.id(config.getSTGVMSubmitbuttonreportdisplay())).click();
	}

	@Then("^validate if the calendar date picker is highlighted$")
	public void validate_if_the_calendar_date_picker_is_highlighted() throws Throwable {
		Thread.sleep(1000);
		
		String colorstart1 = driver.findElement(By.xpath(config.getSTGVMPeriodInputfield())).getCssValue("color");
		System.out.println(colorstart1);
		String hexstart1 = Color.fromString(colorstart1).asHex();
		System.out.println(hexstart1);
		
    	ConfigReader.captureScreesnhot(driver, "29214_SPRINT02_DATEPICKERVALIDATION");
	}

	@Then("^browser will close for the second time$")
	public void browser_will_close_for_the_second_time() throws Throwable {
        Thread.sleep(1000);
        driver.quit();
	}

	//Scenario: Can select one, multiple 
	
	@Given("^open Vessel Manager login with valid user credentials for the third time$")
	public void open_Vessel_Manager_login_with_valid_user_credentials_for_the_third_time() throws Throwable {
		Thread.sleep(1000);
		System.setProperty("webdriver.chrome.driver",config.getChromePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(config.getSTGURLVM());	
		
		ConfigReader.captureScreesnhot(driver, "29214_SPRINT02_BROWSERSTARTED_VESSELMANAGER");
		
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMUNINPUTFIELDID())).sendKeys(config.getSTGVMUNAdmin());
		driver.findElement(By.id(config.getSTGVMPWINPUTFIELDID())).sendKeys(config.getSTGVMPWAdmin());
		driver.findElement(By.id(config.getSTGVMLOGINBTN())).click();
		
		ConfigReader.captureScreesnhot(driver, "29214_SPRINT02_LOG-IN_VESSELMANAGER");
	}

	@Then("^go to Personnel menu for the third time$")
	public void go_to_Personnel_menu_for_the_third_time() throws Throwable {
		Thread.sleep(1000);

		WebElement menu = driver.findElement(By.id(config.getSTGVMPERSONNELMENU()));
		Actions builder = new Actions(driver);    
		builder.moveToElement(menu).build().perform();
		
		ConfigReader.captureScreesnhot(driver, "29214_SPRINT02_PERSONNELMENU_M&ASUBMENU");
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
		
		ConfigReader.captureScreesnhot(driver, "29214_SPRINT02_MEALSANDACCOMMODATIONSUBMENUURL");
	}

	@Then("^input valid date range period for the third time$")
	public void input_valid_date_range_period_for_the_third_time() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.xpath(config.getSTGVMPeriodInputfield())).sendKeys("01/01/2018 - 23/01/2018");
        
        Thread.sleep(1000);
        driver.findElement(By.xpath(config.getSTGVMPeriodApplybuttonlocator())).click();
        
    	ConfigReader.captureScreesnhot(driver, "29214_SPRINT02_DATERANGEPERIOD");
        
        Thread.sleep(1000);
        driver.findElement(By.id(config.getSTGVMSubmitbuttonreportdisplay())).click();
	}

	@Then("^select a company$")
	public void select_a_company() throws Throwable {
		
		Thread.sleep(1000);
		 driver.findElement(By.xpath(config.getSTGVMCompanyinputfield())).sendKeys("Symbit");
		 driver.findElement(By.xpath(config.getSTGVMCompanyinputfield())).sendKeys(Keys.RETURN);
		 
	    	ConfigReader.captureScreesnhot(driver, "29214_SPRINT02_SYMBIT");

	}
	@Then("^select multiple company available$")
	public void select_multiple_company_available() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath(config.getSTGVMCompanyinputfield())).sendKeys("AB12 Company");
		driver.findElement(By.xpath(config.getSTGVMCompanyinputfield())).sendKeys(Keys.RETURN);
		 
		Thread.sleep(1000);
	    driver.findElement(By.xpath(config.getSTGVMCompanyinputfield())).sendKeys("Shipadmin Company");
	    driver.findElement(By.xpath(config.getSTGVMCompanyinputfield())).sendKeys(Keys.RETURN);
	    
		Thread.sleep(1000);
	    driver.findElement(By.xpath(config.getSTGVMCompanyinputfield())).sendKeys("Bayad Corp");
	    driver.findElement(By.xpath(config.getSTGVMCompanyinputfield())).sendKeys(Keys.RETURN);
	    
		Thread.sleep(1000);
	    driver.findElement(By.xpath(config.getSTGVMCompanyinputfield())).sendKeys("Wayne Enterprises");
	    driver.findElement(By.xpath(config.getSTGVMCompanyinputfield())).sendKeys(Keys.RETURN);
	    
    	ConfigReader.captureScreesnhot(driver, "29214_SPRINT02_SELECTALLCOMPANY");
	}

	@Then("^click on submit button$")
	public void click_on_submit_button() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMSubmitbuttonreportdisplay())).click();
	}

	@Then("^browser will close for the third time$")
	public void browser_will_close_for_the_third_time() throws Throwable {
        Thread.sleep(1000);
        driver.quit();
	}
	
	//Scenario: Can select All companies 

	@Given("^open Vessel Manager login with valid user credentials for the fourth time$")
	public void open_Vessel_Manager_login_with_valid_user_credentials_for_the_fourth_time() throws Throwable {
		Thread.sleep(1000);
		System.setProperty("webdriver.chrome.driver",config.getChromePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(config.getSTGURLVM());	
		
		ConfigReader.captureScreesnhot(driver, "29214_SPRINT02_BROWSERSTARTED_VESSELMANAGER");
		
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMUNINPUTFIELDID())).sendKeys(config.getSTGVMUNAdmin());
		driver.findElement(By.id(config.getSTGVMPWINPUTFIELDID())).sendKeys(config.getSTGVMPWAdmin());
		driver.findElement(By.id(config.getSTGVMLOGINBTN())).click();
		
		ConfigReader.captureScreesnhot(driver, "29214_SPRINT02_LOG-IN_VESSELMANAGER");
	}

	@Then("^go to Personnel menu for the fourth time$")
	public void go_to_Personnel_menu_for_the_fourth_time() throws Throwable {
		Thread.sleep(1000);

		WebElement menu = driver.findElement(By.id(config.getSTGVMPERSONNELMENU()));
		Actions builder = new Actions(driver);    
		builder.moveToElement(menu).build().perform();
		
		ConfigReader.captureScreesnhot(driver, "29214_SPRINT02_PERSONNELMENU_M&ASUBMENU");
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
		
		ConfigReader.captureScreesnhot(driver, "29213_SPRINT01_MEALSANDACCOMMODATIONSUBMENUURL");
	}

	@Then("^input valid date range period for the fourth time$")
	public void input_valid_date_range_period_for_the_fourth_time() throws Throwable {
	      Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodInputfield())).sendKeys("01/01/2018 - 23/01/2018");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.xpath(config.getSTGVMPeriodApplybuttonlocator())).click();
	        
	    	ConfigReader.captureScreesnhot(driver, "29214_SPRINT02_DATERANGEPERIOD");
	        
	        Thread.sleep(1000);
	        driver.findElement(By.id(config.getSTGVMSubmitbuttonreportdisplay())).click();
	}

	@Then("^under company do not select any$")
	public void under_company_do_not_select_any() throws Throwable {
		


	}
	
	@Then("^click on submit button for the fourth time$")
	public void click_on_submit_button_for_the_fourth_time() throws Throwable {
        Thread.sleep(1000);
        driver.findElement(By.id(config.getSTGVMSubmitbuttonreportdisplay())).click();
        
    	ConfigReader.captureScreesnhot(driver, "29214_SPRINT02_DONOTSELECTANY");
	}
	
	@Then("^browser will close for the fourth time$")
	public void browser_will_close_for_the_fourth_time() throws Throwable {
		Thread.sleep(1000);
		driver.quit();
	}
	
	//Scenario: Home redirection to Home page

	@Given("^open Vessel Manager login with valid user credentials for the fifth time$")
	public void open_Vessel_Manager_login_with_valid_user_credentials_for_the_fifth_time() throws Throwable {
		Thread.sleep(1000);
		System.setProperty("webdriver.chrome.driver",config.getChromePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(config.getSTGURLVM());	
		
		ConfigReader.captureScreesnhot(driver, "29214_SPRINT02_BROWSERSTARTED_VESSELMANAGER");
		
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMUNINPUTFIELDID())).sendKeys(config.getSTGVMUNAdmin());
		driver.findElement(By.id(config.getSTGVMPWINPUTFIELDID())).sendKeys(config.getSTGVMPWAdmin());
		driver.findElement(By.id(config.getSTGVMLOGINBTN())).click();
		
		ConfigReader.captureScreesnhot(driver, "29214_SPRINT02_LOG-IN_VESSELMANAGER");
	}

	@Then("^go to Personnel menu for the fifth time$")
	public void go_to_Personnel_menu_for_the_fifth_time() throws Throwable {
		Thread.sleep(1000);

		WebElement menu = driver.findElement(By.id(config.getSTGVMPERSONNELMENU()));
		Actions builder = new Actions(driver);    
		builder.moveToElement(menu).build().perform();
		
		ConfigReader.captureScreesnhot(driver, "29214_SPRINT02_PERSONNELMENU_M&ASUBMENU");
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
		
		ConfigReader.captureScreesnhot(driver, "29214_SPRINT02_MEALSANDACCOMMODATIONSUBMENUURL");
	}

	@Then("^click Home$")
	public void click_Home() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.xpath(config.getSTGVMHOMEredirect())).click();
	}

	@Then("^validate if redirect to Home page validate the url if correct$")
	public void validate_if_redirect_to_Home_page_validate_the_url_if_correct() throws Throwable {
		Thread.sleep(1000);
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "http://stg03.shipadmin.com/VM/index.aspx");
		
		ConfigReader.captureScreesnhot(driver, "29214_SPRINT02_HOMEPAGEREDIRECTION");
	}

	@Then("^browser will close for the fifth time$")
	public void browser_will_close_for_the_fifth_time() throws Throwable {
			Thread.sleep(1000);
			driver.quit();
	}



}
