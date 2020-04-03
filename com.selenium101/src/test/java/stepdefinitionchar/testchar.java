package stepdefinitionchar;

import org.junit.runner.RunWith;

//test//

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Gherkin_char",
		glue={"stepdefinitionboolean"},
		plugin = {"pretty", "html:Gherkin_char/cucumber-html-report","json:Gherkin_char/cucumber-report.json","junit:Gherkin_char/cucumber.xml"}
		)

public class testchar {
	
	@Given("^Increment Characters from C$")
	public void increment_Characters_from_C() throws Throwable {

		char character;
		
		character = 'C';
		System.out.println(character);
		
		character++;
		System.out.println(character);
		
		character++;
		System.out.println(character);		
		
	}

	@Then("^Decrement character form  G$")
	public void decrement_character_form_G() throws Throwable {
		
		char character;
		
		character = 'G';
		System.out.println(character);
		
		character--;
		System.out.println(character);
		
		character--;
		System.out.println(character);

	}

	@Given("^Input Decimal value and display equivalent characters$")
	public void input_Decimal_value_and_display_equivalent_characters() throws Throwable {

		char character;
		int i;
		
		for (i = 1; i <= 127; i++) {
			
			character = (char) i;
			
			System.out.println("Code; " + i + " Corresponds to: " + character);
		}
	}






}
