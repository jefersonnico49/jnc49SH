package runnerMA29213_sprint01_functionalityvalidation;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Gherkin29213_SPRINT01_registerM&Arates_functionalityvalidation",
		glue={"stepDefinitionMA29213_sprint01_functionalityvalidation"},
		plugin = {"pretty", "html:Gherkin29213_SPRINT01_registerM&Arates_functionalityvalidation/cucumber-html-report","json:Gherkin29213_SPRINT01_registerM&Arates_functionalityvalidation/cucumber-report.json","junit:Gherkin29213_SPRINT01_registerM&Arates_functionalityvalidation/cucumber.xml"}
		)

public class TestrunnerMA29213_functionalityvalidation {

}
