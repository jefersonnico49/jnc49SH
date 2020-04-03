package runnerboolean;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Gherkin_Boolean",
		glue={"stepdefinitionboolean"},
		plugin = {"pretty", "html:Gherkin_Boolean/cucumber-html-report","json:Gherkin_Boolean/cucumber-report.json","junit:Gherkin_Boolean/cucumber.xml"}
		)

public class testrunnerboolean {

}
