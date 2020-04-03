package runnerMA29214_sprint02_OverviewofMAtable;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Gherkin29214_SPRINT02_OverviewofM&Atable",
		glue={"stepDefinitionMA29214_sprint02_OverviewofMAtable"},
		plugin = {"pretty", "html:Gherkin29214_SPRINT02_OverviewofM&Atable/cucumber-html-report","json:Gherkin29214_SPRINT02_OverviewofM&Atable/cucumber-report.json","junit:Gherkin29214_SPRINT02_OverviewofM&Atable/cucumber.xml"}
		)

public class TestRunnerMA29214_sprint02_OverviewofMAtable {

}
