package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = {"StepDefnitions"},
				 plugin = {"html:target/cucumber-html-report", 
						 "json:target/cucumber.json", 
						 "pretty:target/cucumber-pretty.txt", 
						 "usage:target/cucumber-usage.json", 
						 "junit:target/cucumber-result.xml"})
public class runner extends AbstractTestNGCucumberTests{

}
