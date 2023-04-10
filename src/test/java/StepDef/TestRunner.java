package StepDef;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		monochrome =true, //unneccery things won't come
		plugin = {"pretty","html:target/html-cucumber","json:target/cucumber-report/cucumber.json"},// for report in html format . traget : index :open with browser
		features = "src/test/java/features", // feature file path
		glue = "StepDef", // package path
		tags = {"@sanity"}
	    )
	
	public class TestRunner {
}
