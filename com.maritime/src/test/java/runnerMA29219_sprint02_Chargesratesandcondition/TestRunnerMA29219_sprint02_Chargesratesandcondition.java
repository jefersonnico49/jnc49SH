package runnerMA29219_sprint02_Chargesratesandcondition;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Gherkin29219_SPRINT02_M&Achargesratesandcondition",
		glue={"stepDefinitionMA29219_sprint02_Chargesratesandcondition"},
		plugin = {"pretty", "html:Gherkin29219_SPRINT02_M&Achargesratesandcondition/cucumber-html-report","json:Gherkin29219_SPRINT02_M&Achargesratesandcondition/cucumber-report.json","junit:Gherkin29219_SPRINT02_M&Achargesratesandcondition/cucumber.xml"}
		)

public class TestRunnerMA29219_sprint02_Chargesratesandcondition {

}
