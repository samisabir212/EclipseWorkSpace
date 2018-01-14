package myRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/sami/git/EclipseWorkSpace/FreeCRM_Cucumber/src/main/java/features/taggedHooks.feature",
		glue={"stepDefinitions"}, //glue means where is your step definitions (which is the 
		//step definition package name)
		plugin= {"pretty","html:test-output/cucumber.html", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //"plugin" is the replacement for "format" for "pretty" output
		monochrome= true,
		strict= true,
		dryRun=false,
		tags = {"@P1"}
		
				)


public class RunCuke {
	

	 

}
