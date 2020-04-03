package runnerMA29111_sprint01_AccessMealsandAccommodation;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Gherkin29111_SPRINT01_AccessMealsandAccommodation",
		glue={"stepDefinitionMA29111_sprint01_AccessMealsandAccommodation"},
		plugin = {"pretty", "html:Gherkin29111_SPRINT01_AccessMealsandAccommodation/cucumber-html-report","json:Gherkin29111_SPRINT01_AccessMealsandAccommodation/cucumber-report.json","junit:Gherkin29111_SPRINT01_AccessMealsandAccommodation/cucumber.xml"}
		)

public class TestRunnerMA29111_sprint01_AccessMealsandAccommodation {

}
