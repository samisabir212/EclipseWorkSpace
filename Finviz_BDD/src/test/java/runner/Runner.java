package runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/sami/git/EclipseWorkSpace/Finviz_BDD/src/main/java/Login.feature",
		glue={"stepDefinitions"}, 
		plugin= {"pretty","html:test-output/cucumber.html", "json:json_output/cucumber.json", 
				"junit:junit_xml/cucumber.xml"},
		monochrome= true,
		strict= true,
		dryRun=true
		//tags = {}
		
				)




public class Runner {

}
