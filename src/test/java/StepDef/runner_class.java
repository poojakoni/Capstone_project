package StepDef;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		plugin = {"html:target/html-cucumber", "json:target/cucumber.json"},
	    strict = true,
	    monochrome = true,
	    features = "src/test/java/featurefile",
	    glue = "StepDef",
	     tags = "@test or @sanity"
	)
	
	public class runner_class {
}
