package runnerboardingcarddisplay;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="TESTCASE_boardingcarddisplay",
		glue={"stepDefinitionboardingcarddisplay"},
		plugin = {"pretty", "html:TESTCASE_boardingcarddisplay/cucumber-html-report","json:TESTCASE_boardingcarddisplay/cucumber-report.json","junit:TESTCASE_boardingcarddisplay/cucumber.xml"}
		)

public class Testrunnerboardingcarddisplay {

}

