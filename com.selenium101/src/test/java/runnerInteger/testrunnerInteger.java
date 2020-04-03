package runnerInteger;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Gherkin_Integer",
		glue={"stepdefinitionInteger"},
		plugin = {"pretty", "html:Gherkin_Integer/cucumber-html-report","json:Gherkin_Integer/cucumber-report.json","junit:Gherkin_Integer/cucumber.xml"}
		)

public class testrunnerInteger {

}
