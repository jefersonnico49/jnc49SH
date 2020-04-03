package runnerMA29213_sprint01_displayvalidation;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Gherkin29213_SPRINT01_registerM&Arates_displayvalidation",
		glue={"stepDefinitionMA29213_sprint01_displayvalidation"},
		plugin = {"pretty", "html:Gherkin29213_SPRINT01_registerM&Arates_displayvalidation/cucumber-html-report","json:Gherkin29213_SPRINT01_registerM&Arates_displayvalidation/cucumber-report.json","junit:Gherkin29213_SPRINT01_registerM&Arates_displayvalidation/cucumber.xml"}
		)

public class TestrunnerMA29213_displayvalidation {

}
