package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "Features", glue = { "stepDefinations" }, monochrome = true, plugin = { "pretty",
		"json:target/cucumber.json" })

public class TestRunner extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider()
	public Object[][] scenarios(){
		return super.scenarios();
	}

}
