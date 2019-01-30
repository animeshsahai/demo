package Cucumber.Practice;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		//dryRun=true,
		monochrome=true,
		features= "src/test/java/feature",
		glue="stepdefinition"
		)

public class TestRun {
	
	

}
