package runner;


@CucumberOptions(features={"src/features"},glue={"steps"},monochrome=true,tags={"@sanity, @prod"})
public class RunCuke extends AbstractTestNGCucumberTests {

	
	
}


