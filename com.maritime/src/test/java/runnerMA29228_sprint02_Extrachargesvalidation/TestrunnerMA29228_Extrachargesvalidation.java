package runnerMA29228_sprint02_Extrachargesvalidation;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Gherkin29228_SPRINT02_addExtraChargestoperson_functionalityvalidation",
		glue={"stepDefinitionMA29228_sprint02_Extrachargesvalidation"},
		plugin = {"pretty", "html:Gherkin29228_SPRINT02_addExtraChargestoperson_functionalityvalidation/cucumber-html-report","json:Gherkin29228_SPRINT02_addExtraChargestoperson_functionalityvalidation/cucumber-report.json","junit:Gherkin29228_SPRINT02_addExtraChargestoperson_functionalityvalidation/cucumber.xml"}
		)

//test1// 

public class TestrunnerMA29228_Extrachargesvalidation {

}
