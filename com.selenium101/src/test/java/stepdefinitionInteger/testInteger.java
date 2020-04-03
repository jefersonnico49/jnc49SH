package stepdefinitionInteger;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import maritimeutility.ConfigReader;

public class testInteger {

	WebDriver driver;

	ConfigReader config = new ConfigReader();

//		Scenario: Verify the width and height of the Meals and Accommodation Icon logo

	@Given("^Access Vessel Manager A$")
	public void access_Vessel_Manager_A() throws Throwable {

		Thread.sleep(1000);

		System.setProperty("webdriver.chrome.driver", config.getChromePath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(config.getSTGURLVM());

		ConfigReader.captureScreesnhot(driver, "IntegerA_VMLOGINPAGE");

		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMUNINPUTFIELDID())).sendKeys(config.getSTGVMUNAdmin());
		driver.findElement(By.id(config.getSTGVMPWINPUTFIELDID())).sendKeys(config.getSTGVMPWAdmin());
		driver.findElement(By.id(config.getSTGVMLOGINBTN())).click();

		ConfigReader.captureScreesnhot(driver, "IntegerA_VMHOMEPAGE");

	}

	@Then("^Go to Personnel Meals and Accommodation A$")
	public void go_to_Personnel_Meals_and_Accommodation_A() throws Throwable {

		Thread.sleep(1000);
		WebElement menu = driver.findElement(By.id(config.getSTGVMPERSONNELMENU()));
		Actions builder = new Actions(driver);
		builder.moveToElement(menu).build().perform();

		ConfigReader.captureScreesnhot(driver, "VMPERSONNELMENU");

		Thread.sleep(1000);
		WebElement menuOption = driver.findElement(By.xpath(config.getSTGVMMASUBMENUxpath()));
		menuOption.click();

	}

	@Then("^Verify the width and height of the Meals and Accommodation Icon logo A$")
	public void verify_the_width_and_height_of_the_Meals_and_Accommodation_Icon_logo_A() throws Throwable {

		WebElement MALogo = driver.findElement(By.xpath(config.getSTGMealsLogo()));
		int LogoWidth = MALogo.getSize().getWidth();
		System.out.println("Logo width for Meals and Accommodation Is " + LogoWidth + " pixels");
		int LogoHeight = MALogo.getSize().getHeight();
		System.out.println("Image height for Meals and Accommodation Is " + LogoHeight + " pixels");
	}

	@Then("^Close Browser A$")
	public void close_Browser_A() throws Throwable {

		Thread.sleep(1000);
		driver.close();
	}

	// Scenario: Verify if the shipadmin hyperlink text is clickable and will
	// redirect the user to shipadmin website

	@Given("^Access Vessel Manager B$")
	public void access_Vessel_Manager_B() throws Throwable {

		Thread.sleep(1000);

		System.setProperty("webdriver.chrome.driver", config.getChromePath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(config.getSTGURLVM());

		ConfigReader.captureScreesnhot(driver, "IntegerB_VMLOGINPAGE");

		Thread.sleep(1000);
		driver.findElement(By.id(config.getSTGVMUNINPUTFIELDID())).sendKeys(config.getSTGVMUNAdmin());
		driver.findElement(By.id(config.getSTGVMPWINPUTFIELDID())).sendKeys(config.getSTGVMPWAdmin());
		driver.findElement(By.id(config.getSTGVMLOGINBTN())).click();

		ConfigReader.captureScreesnhot(driver, "IntegerB_VMHOMEPAGE");

	}

	@Then("^Go to Help About Vessel Manager B$")
	public void go_to_Help_About_Vessel_Manager_B() throws Throwable {

		Thread.sleep(1000);
		WebElement menu = driver.findElement(By.id(config.getSTGHelpmenu()));
		Actions builder = new Actions(driver);
		builder.moveToElement(menu).build().perform();

		ConfigReader.captureScreesnhot(driver, "VMPERSONNELMENU");

		Thread.sleep(1000);
		WebElement menuOption = driver.findElement(By.xpath(config.getSTGAboutshipadmiMenu()));
		menuOption.click();
	}

	@Then("^click on the shipadmin url hyperlink B$")
	public void click_on_the_shipadmin_url_hyperlink_B() throws Throwable {

		Thread.sleep(1000);
		driver.findElement(By.linkText("www.shipadmin.com/vm.html")).click();
		Set<String> tab_handles = driver.getWindowHandles();
		int number_of_tabs = tab_handles.size();
		int new_tab_index = number_of_tabs - 1;
		driver.switchTo().window(tab_handles.toArray()[new_tab_index].toString());
	}

	@Then("^verify if the user will redirect to shipadmin page B$")
	public void verify_if_the_user_will_redirect_to_shipadmin_page_B() throws Throwable {

		Thread.sleep(1000);
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://shipadmin.com//vm.html");

		for (int i = driver.getWindowHandles().size() - 1; i > 0; i--) {
			String winHandle = driver.getWindowHandles().toArray()[i].toString();
			driver.switchTo().window(winHandle);
		}
	}


	@Then("^Close Browser B$")
	public void close_Browser_B() throws Throwable {

		Thread.sleep(1000);
		driver.quit();

	}

}
