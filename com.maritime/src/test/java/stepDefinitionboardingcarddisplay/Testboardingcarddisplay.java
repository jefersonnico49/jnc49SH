package stepDefinitionboardingcarddisplay;

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

public class Testboardingcarddisplay {
	
	WebDriver driver;
	
	ConfigReader config=new ConfigReader();


		@Given("^open Vessel Manager WebApp Login with valid user credentials$")
		public void open_Vessel_Manager_WebApp_Login_with_valid_user_credentials() throws Throwable {

			Thread.sleep(1000);
			System.setProperty("webdriver.chrome.driver",config.getChromePath());
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get(config.getSTGURLVM());	
			
			
			ConfigReader.captureScreesnhot(driver, "BrowserStarted_boardingcarddisplay");
			
			
			Thread.sleep(1000);
			driver.findElement(By.id(config.getSTGVMUNINPUTFIELDID())).sendKeys(config.getSTGVMUNAdmin());
			driver.findElement(By.id(config.getSTGVMPWINPUTFIELDID())).sendKeys(config.getSTGVMPWAdmin());
			driver.findElement(By.id(config.getSTGVMLOGINBTN())).click();
			
			ConfigReader.captureScreesnhot(driver, "Log-in_boardingcarddisplay");
		}
		
		@Then("^go to Personnel menu$")
		public void go_to_Personnel_menu() throws Throwable {
		
			Thread.sleep(1000);

			WebElement menu = driver.findElement(By.id(config.getSTGVMPERSONNELMENU()));
			Actions builder = new Actions(driver);    
			builder.moveToElement(menu).build().perform();
		}
		
		@Then("^click on Boarding Card sub menu$")
		public void click_on_Boarding_Card_sub_menu() throws Throwable {
			Thread.sleep(1000);
			WebElement menuOption = driver.findElement(By.id(config.getSTGVMBOARDINGCARDSUBMENU()));
			menuOption.click();
		}
		
		@Then("^validate the current url for boarding card is correct$")
		public void validate_the_current_url_for_boarding_card_is_correct() throws Throwable {
			Thread.sleep(1000);
			String URL = driver.getCurrentUrl();
			Assert.assertEquals(URL, config.getSTGVMBOARDINGCARDSUBMENUURL());
			
			ConfigReader.captureScreesnhot(driver, "boardingcardURL");
		}
		
		@Then("^validate Boarding Card Text in the upper left part of the web page$")
		public void validate_Boarding_Card_Text_in_the_upper_left_part_of_the_web_page() throws Throwable {
			//Thread.sleep(1000);
			
			//String actual_VMBoardingCardtext= driver.findElement(By.xpath(config.getSTGVMSTGVMBoardingCardtextlocator())).getAttribute("innerHTML");
			
			//String expected_VMBoardingCardtext="Boarding Card";
			
		  //  Assert.assertEquals(expected_VMBoardingCardtext, actual_VMBoardingCardtext);
		    
		 //   Assert.assertTrue(actual_VMBoardingCardtext.contains(config.getSTGVMBoardingCardtext()));
			
			
			//System.out.println("VMBoardingCardtext confirmed");
			
		//	ConfigReader.captureScreesnhot(driver, "VMBoardingCardtext display text");
		}
		
		@Then("^validate Find person by criteria text if displayed$")
		public void validate_Find_person_by_criteria_text_if_displayed() throws Throwable {
           Thread.sleep(1000);
			
			String actual_VMFindpersonbycriteriatext= driver.findElement(By.id(config.getSTGVMFindpersonbycriterialocator())).getAttribute("innerHTML");
			
			String expected_VMFindpersonbycriteriatext="Find person by criteria";
			
		    Assert.assertEquals(expected_VMFindpersonbycriteriatext, actual_VMFindpersonbycriteriatext);
		    
		    Assert.assertTrue(actual_VMFindpersonbycriteriatext.contains(config.getSTGVMFindpersonbycriteriatext()));
			
			
            System.out.println("VMFindpersonbycriteriatext confirmed");
			
            ConfigReader.captureScreesnhot(driver, "VMFindpersonbycriteriatext display text");
	        }
		
		
		@Then("^validate if the Name under Find person by Criteria text is displayed$")
		public void validate_if_the_Name_under_Find_person_by_Criteria_text_is_displayed() throws Throwable {
	           Thread.sleep(1000);
				
				String actual_VMFindPersonNametext= driver.findElement(By.id(config.getSTGVMFindPersonNamelocator())).getAttribute("innerHTML");
				
				String expected_VMFindPersonNametext="Name";
				
			    Assert.assertEquals(expected_VMFindPersonNametext, actual_VMFindPersonNametext);
			    
			    Assert.assertTrue(actual_VMFindPersonNametext.contains(config.getSTGVMFindPersonNametext()));
				
				
	            System.out.println("VMFindPersonNametext confirmed");
				
	            ConfigReader.captureScreesnhot(driver, "VMFindPersonNametext display text");
		        }
		
		
		@Then("^validate if the Card ID under Find person by Criteria text is displayed$")
		public void validate_if_the_Card_ID_under_Find_person_by_Criteria_text_is_displayed() throws Throwable {
	           Thread.sleep(1000);
				
				String actual_VMFindPersonCardIDtext= driver.findElement(By.id(config.getSTGVMFindPersonCardIDlocator())).getAttribute("innerHTML");
				
				String expected_VMFindPersonCardIDtext="Card ID";
				
			    Assert.assertEquals(expected_VMFindPersonCardIDtext, actual_VMFindPersonCardIDtext);
			    
			    Assert.assertTrue(actual_VMFindPersonCardIDtext.contains(config.getSTGSTGVMFindPersonCardIDtext()));
				
				
	            System.out.println("VMFindPersonCardIDtext confirmed");
				
	            ConfigReader.captureScreesnhot(driver, "VMFindPersonCardIDtext display text");
		        }
		
		
		@Then("^validate if the Name under Find person by Criteria text input field is displayed$")
		public void validate_if_the_Name_under_Find_person_by_Criteria_text_input_field_is_displayed() throws Throwable {
	           Thread.sleep(1000);
	           driver.findElement(By.id(config.getSTGVMFindPersonNameInputfieldlocator())).isDisplayed();
		}
		
		@Then("^validate if the Card ID under Find person by Criteria text input field is displayed$")
		public void validate_if_the_Card_ID_under_Find_person_by_Criteria_text_input_field_is_displayed() throws Throwable {
	           Thread.sleep(1000);
	           driver.findElement(By.id(config.getSTGVMFindPersonCardIDInputfieldlocator())).isDisplayed();
		}
		
		@Then("^validate if the Name search button is displayed$")
		public void validate_if_the_Name_search_button_is_displayed() throws Throwable {
	           Thread.sleep(1000);
	           driver.findElement(By.id(config.getSTGVMFindPersonSearchNamelocator())).isDisplayed();
		}
		
		@Then("^validate if the Card ID search button is displayed$")
		public void validate_if_the_Card_ID_search_button_is_displayed() throws Throwable {
	           Thread.sleep(1000);
	           driver.findElement(By.id(config.getSTGVMFindPersonSearchCardIDlocator())).isDisplayed();
		}
		
		@Then("^validate Selected person text if displayed$")
		public void validate_Selected_person_text_if_displayed() throws Throwable {
	           Thread.sleep(1000);
				
				String actual_VMSelectedpersontext= driver.findElement(By.id(config.getSTGVMSelectedpersonlocator())).getAttribute("innerHTML");
				
				String expected_VMSelectedpersontext="Selected person";
				
			    Assert.assertEquals(expected_VMSelectedpersontext, actual_VMSelectedpersontext);
			    
			    Assert.assertTrue(actual_VMSelectedpersontext.contains(config.getSTGVMSelectedpersontext()));
				
				
	            System.out.println("VMSelectedpersontext confirmed");
				
	            ConfigReader.captureScreesnhot(driver, "VMSelectedpersontext display text");
		        }
		
		
		@Then("^validate if the Name text under Selected person by Criteria is displayed$")
		public void validate_if_the_Name_text_under_Selected_person_by_Criteria_is_displayed() throws Throwable {
	           Thread.sleep(1000);
				
				String actual_VMSelectedpersonNametext= driver.findElement(By.id(config.getSTGVMSelectedpersonNamelocator())).getAttribute("innerHTML");
				
				String expected_VMSelectedpersonNametext="Name";
				
			    Assert.assertEquals(expected_VMSelectedpersonNametext, actual_VMSelectedpersonNametext);
			    
			    Assert.assertTrue(actual_VMSelectedpersonNametext.contains(config.getSTGVMSelectedpersonNametext()));
				
				
	            System.out.println("VMSelectedpersonNametext confirmed");
				
	            ConfigReader.captureScreesnhot(driver, "VMSelectedpersonNametext display text");
		        }
		
		
		@Then("^validate if the Company text under Selected person by Criteria is displayed$")
		public void validate_if_the_Company_text_under_Selected_person_by_Criteria_is_displayed() throws Throwable {
	           Thread.sleep(1000);
				
				String actual_VMSelectedpersonCompanytext= driver.findElement(By.id(config.getSTGVMSelectedpersonCompanylocator())).getAttribute("innerHTML");
				
				String expected_VMSelectedpersonCompanytext="Company";
				
			    Assert.assertEquals(expected_VMSelectedpersonCompanytext, actual_VMSelectedpersonCompanytext);
			    
			    Assert.assertTrue(actual_VMSelectedpersonCompanytext.contains(config.getSTGVMSelectedpersonCompanytext()));
				
				
	            System.out.println("VMSelectedpersonCompanytext confirmed");
				
	            ConfigReader.captureScreesnhot(driver, "VMSelectedpersonCompanytext display text");
		        }
		
		
		@Then("^validate if the Position text under Selected person by Criteria is displayed$")
		public void validate_if_the_Position_text_under_Selected_person_by_Criteria_is_displayed() throws Throwable {
	           Thread.sleep(1000);
				
				String actual_VMSelectedpersonPositiontext= driver.findElement(By.id(config.getSTGVMSelectedpersonPositionlocator())).getAttribute("innerHTML");
				
				String expected_VMSelectedpersonPositiontext="Position";
				
			    Assert.assertEquals(expected_VMSelectedpersonPositiontext, actual_VMSelectedpersonPositiontext);
			    
			    Assert.assertTrue(actual_VMSelectedpersonPositiontext.contains(config.getSTGVMSelectedpersonPositiontext()));
				
				
	            System.out.println("VMSelectedpersonPositiontext confirmed");
				
	            ConfigReader.captureScreesnhot(driver, "VMSelectedpersonPositiontext display text");
		        }
		
		
		@Then("^validate if the Category text under Selected person by Criteria is displayed$")
		public void validate_if_the_Category_text_under_Selected_person_by_Criteria_is_displayed() throws Throwable {
	           Thread.sleep(1000);
				
				String actual_VMSelectedpersonCategorytext= driver.findElement(By.id(config.getSTGVMSelectedpersonCategorylocator())).getAttribute("innerHTML");
				
				String expected_VMSelectedpersonCategorytext="Category";
				
			    Assert.assertEquals(expected_VMSelectedpersonCategorytext, actual_VMSelectedpersonCategorytext);
			    
			    Assert.assertTrue(actual_VMSelectedpersonCategorytext.contains(config.getSTGVMSelectedpersonCategorytext()));
				
				
	            System.out.println("VMSelectedpersonCategorytext confirmed");
				
	            ConfigReader.captureScreesnhot(driver, "VMSelectedpersonCategorytext display text");
		        }
		
		
		@Then("^validate if the Card ID text under Selected person by Criteria is displayed$")
		public void validate_if_the_Card_ID_text_under_Selected_person_by_Criteria_is_displayed() throws Throwable {
	           Thread.sleep(1000);
				
				String actual_VMSelectedpersonCardIDtext= driver.findElement(By.id(config.getSTGVMSelectedpersonCardIDlocator())).getAttribute("innerHTML");
				
				String expected_VMSelectedpersonCardIDtext="Card ID";
				
			    Assert.assertEquals(expected_VMSelectedpersonCardIDtext, actual_VMSelectedpersonCardIDtext);
			    
			    Assert.assertTrue(actual_VMSelectedpersonCardIDtext.contains(config.getSTGVMSelectedpersonCardIDtext()));
				
				
	            System.out.println("VMSelectedpersonCardIDtext confirmed");
				
	            ConfigReader.captureScreesnhot(driver, "VMSelectedpersonCardIDtext display text");
		        }
		
		
		@Then("^validate if the PIN text under Selected person by Criteria is displayed$")
		public void validate_if_the_PIN_text_under_Selected_person_by_Criteria_is_displayed() throws Throwable {
	           Thread.sleep(1000);
				
				String actual_VMSelectedpersonPINtext= driver.findElement(By.id(config.getSTGVMSelectedpersonPINlocator())).getAttribute("innerHTML");
				
				String expected_VMSelectedpersonPINtext="PIN";
				
			    Assert.assertEquals(expected_VMSelectedpersonPINtext, actual_VMSelectedpersonPINtext);
			    
			    Assert.assertTrue(actual_VMSelectedpersonPINtext.contains(config.getSTGVMSelectedpersonPINtext()));
				
				
	            System.out.println("VMSelectedpersonPINtext confirmed");
				
	            ConfigReader.captureScreesnhot(driver, "VMSelectedpersonPINtext display text");
		        }
		
		
		@Then("^validate if the Card ID text input field under Selected person by Criteria is displayed$")
		public void validate_if_the_Card_ID_text_input_field_under_Selected_person_by_Criteria_is_displayed() throws Throwable {
	           Thread.sleep(1000);
	           driver.findElement(By.id(config.getSTGVMSelectedpersonCardIDInputFieldlocator())).isDisplayed();
		}
		
		@Then("^validate if the PIN text input field under Selected person by Criteria is displayed$")
		public void validate_if_the_PIN_text_input_field_under_Selected_person_by_Criteria_is_displayed() throws Throwable {

		}
		
		@Then("^validate if the Take Picture text is displayed$")
		public void validate_if_the_Take_Picture_text_is_displayed() throws Throwable {

		}
		
		@Then("^validate if the Print text is displayed$")
		public void validate_if_the_Print_text_is_displayed() throws Throwable {

		}
		
		@Then("^validate if the Save text is displayed$")
		public void validate_if_the_Save_text_is_displayed() throws Throwable {

		}
		
		@Then("^validate if the Empty fields text is displayed$")
		public void validate_if_the_Empty_fields_text_is_displayed() throws Throwable {

		}
		
		@Then("^validate if the Take Picture button is displayed$")
		public void validate_if_the_Take_Picture_button_is_displayed() throws Throwable {
	           Thread.sleep(1000);
	           driver.findElement(By.id(config.getSTGVMTakePictureLocator())).isDisplayed();
		}
		
		@Then("^validate if the Print button is displayed$")
		public void validate_if_the_Print_button_is_displayed() throws Throwable {
	           Thread.sleep(1000);
	           driver.findElement(By.id(config.getSTGVMTakePictureLocator())).isDisplayed();
		}
		
		@Then("^validate if the Save button is displayed$")
		public void validate_if_the_Save_button_is_displayed() throws Throwable {
	           Thread.sleep(1000);
	           driver.findElement(By.id(config.getSTGVMSaveLocator())).isDisplayed();
		}
		
		@Then("^validate if the Empty fields button is displayed$")
		public void validate_if_the_Empty_fields_button_is_displayed() throws Throwable {
	           Thread.sleep(1000);
	           driver.findElement(By.id(config.getSTGVMEmptyFieldsLocator())).isDisplayed();
		}
		
		@Then("^validate if the Preview card text is displayed$")
		public void validate_if_the_Preview_card_text_is_displayed() throws Throwable {
	           Thread.sleep(1000);
				
				String actual_VMPreviewCardText= driver.findElement(By.id(config.getSTGVMPreviewCardLocator())).getAttribute("innerHTML");
				
				String expected_VMPreviewCardText="Preview card";
				
			    Assert.assertEquals(expected_VMPreviewCardText, actual_VMPreviewCardText);
			    
			    Assert.assertTrue(actual_VMPreviewCardText.contains(config.getSTGVMPreviewCardText()));
				
				
	            System.out.println("VMPreviewCardText confirmed");
				
	            ConfigReader.captureScreesnhot(driver, "VMPreviewCardText display text");
		        }
		
		
		@Then("^validate if the Preview card Object is displayed$")
		public void validate_if_the_Preview_card_Object_is_displayed() throws Throwable {
			
	           Thread.sleep(1000);
	           driver.findElement(By.xpath(config.getSTGVMPreviewCardObject())).isDisplayed();
			
		}
		
		@And("^browser will closed$")
		public void browser_will_closed() throws Throwable {
			Thread.sleep(2000);
			driver.quit();
		}
}