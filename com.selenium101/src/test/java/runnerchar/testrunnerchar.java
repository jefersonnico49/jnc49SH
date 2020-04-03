package runnerchar;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Gherkin_char",
		glue={"stepdefinitionchar"},
		plugin = {"pretty", "html:Gherkin_char/cucumber-html-report","json:Gherkin_char/cucumber-report.json","junit:Gherkin_char/cucumber.xml"}
		)

public class testrunnerchar {

}
