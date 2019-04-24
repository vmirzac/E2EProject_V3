package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(

	    features = "src/test/java/features",
	    format={"json:target/cucumber.json","html:target/site/cucumber-pretty"},
	    glue="stepDefinations"


)

public class TestRunner extends AbstractTestNGCucumberTests  {

}



