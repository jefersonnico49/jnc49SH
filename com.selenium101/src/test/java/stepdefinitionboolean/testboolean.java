package stepdefinitionboolean;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import maritimeutility.ConfigReader;

public class testboolean {
	
	WebDriver driver;
	
	ConfigReader config=new ConfigReader();
	



	

	
//	Scenario: Verify if the radio button Drop Down List is present in Settings Config Date and Numbers Tab
	
	@Given("^Access Vessel Manager A$")
	public void access_Vessel_Manager_A() throws Throwable {

		Thread.sleep(1000);
		
		System.setProperty("webdriver.chrome.driver",config.getChromePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(config.getSTGURLVM());
		
		
		ConfigReader.captureScreesnhot(driver, "Boolean1_VMLOGINPAGE");
		
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMUNINPUTFIELDID())).sendKeys(config.getSTGVMUNAdmin());
		driver.findElement(By.id(config.getSTGVMPWINPUTFIELDID())).sendKeys(config.getSTGVMPWAdmin());
		driver.findElement(By.id(config.getSTGVMLOGINBTN())).click();
		
		ConfigReader.captureScreesnhot(driver, "Boolean1_VMHOMEPAGE");
		
		
	}

	@Then("^Go to Settings A$")
	public void go_to_Settings_A() throws Throwable {
		
		
		
		Thread.sleep(1000);
		WebElement menu = driver.findElement(By.id(config.getSTGSettings()));
		Actions builder = new Actions(driver);    
		builder.moveToElement(menu).build().perform();
		
		ConfigReader.captureScreesnhot(driver, "getSTGSettings_ConfigSUBMENU");
			
		Thread.sleep(1000);
		WebElement menuOption = driver.findElement(By.xpath(config.getSTGSettingsConfig()));
		menuOption.click();
	}

	@Then("^Access Config Date and Numbers Tab A$")
	public void access_Config_Date_and_Numbers_Tab_A() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGSettingsConfigDateandTime())).click();
	}

	@And("^Verify if the radio button Drop Down List is present A$")
	public void verify_if_the_radio_button_Drop_Down_List_is_present_A() throws Throwable {
		Thread.sleep(1000);		
		WebElement a = driver.findElement(By.id(config.getSTGDropdownlistradiobutton()));

		//Use the boolean keyword to declare boolean variable
		boolean actualValue = a.isDisplayed();
		
		//Initialize the boolean variable with value true or false, once boolean declaration is done
		if (actualValue)
			
		System.out.println("True Radio button is available");
		else
		System.out.println("False Radio button is not available");
		}
	
	


	@Then("^Close Browser A$")
	public void close_Browser_A() throws Throwable {
		Thread.sleep(1000);
		
		char c=65;
		System.out.print("Third char values is " +c);
		
		driver.close();
		
		

	}
	
//		 Scenario: Verify if the radio button Drop Down List is been tick in Settings Config Date and Numbers Tab

	@Given("^Access Vessel Manager B$")
	public void access_Vessel_Manager_B() throws Throwable {

		Thread.sleep(1000);
		
		System.setProperty("webdriver.chrome.driver",config.getChromePath());
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(config.getSTGURLVM());
		
		ConfigReader.captureScreesnhot(driver, "Boolean1_VMLOGINPAGE");
		
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMUNINPUTFIELDID())).sendKeys(config.getSTGVMUNAdmin());
		driver.findElement(By.id(config.getSTGVMPWINPUTFIELDID())).sendKeys(config.getSTGVMPWAdmin());
		driver.findElement(By.id(config.getSTGVMLOGINBTN())).click();
		
		ConfigReader.captureScreesnhot(driver, "Boolean1_VMHOMEPAGE");
	}

	@Then("^Go to Settings B$")
	public void go_to_Settings_B() throws Throwable {
		Thread.sleep(1000);
		WebElement menu = driver.findElement(By.id(config.getSTGSettings()));
		Actions builder = new Actions(driver);    
		builder.moveToElement(menu).build().perform();
		
		ConfigReader.captureScreesnhot(driver, "getSTGSettings_ConfigSUBMENU");
			
		Thread.sleep(1000);
		WebElement menuOption = driver.findElement(By.xpath(config.getSTGSettingsConfig()));
		menuOption.click();
	}

	@Then("^Access Config Date and Numbers Tab B$")
	public void access_Config_Date_and_Numbers_Tab_B() throws Throwable {
		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGSettingsConfigDateandTime())).click();
	}

	@And("^Verify if the radio button Drop Down List is tick B$")
	public void verify_if_the_radio_button_Drop_Down_List_is_tick_B() throws Throwable {
		Thread.sleep(1000);		
		WebElement b = driver.findElement(By.id(config.getSTGDropdownlistradiobutton()));

		boolean actualValue = b.isSelected();

		if (actualValue)
		System.out.println("True Radio button is selected");
		else
		System.out.println("False Radio button is not selected");
		}
	

	@Then("^Close Browser B$")
	public void close_Browser_B() throws Throwable {
		Thread.sleep(1000);
		driver.close();
	}




}