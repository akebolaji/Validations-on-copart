package cucumberOptions;


import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;










//@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/main/java/features",
				glue= "stepDefinitions"
		)
public class TestRunner extends AbstractTestNGCucumberTests {

}
