package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		features = "/Users/sami/git/EclipseWorkSpace/BDD_BootCamp/src/main/java/features/What_Can_I_Afford.feature",
		glue = {"stepDefinitons"},
		plugin = {"pretty","html:test-output/cucumber.html", "json:test-output/cucumber.json", "junit:junit_xml/cucmber.xml"},
		monochrome = true,
		strict = true,
		dryRun = false
		//tags = {}
		
	
		
		)




public class runCuke {

}
