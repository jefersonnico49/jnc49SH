package runnerMA29323_sprint03_IncludePersonsinReport;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Gherkin29323_SPRINT03_M&AIncludePersonsinReport",
		glue={"stepDefinitionMA29323_sprint03_MAIncludePersonsinReport"},
		plugin = {"pretty", "html:Gherkin29323_SPRINT03_M&AIncludePersonsinReport/cucumber-html-report","json:Gherkin29323_SPRINT03_M&AIncludePersonsinReport/cucumber-report.json","junit:Gherkin29323_SPRINT03_M&AIncludePersonsinReport/cucumber.xml"}
		)

public class TestrunnerMA29323_IncludePersonsinReport {

}
