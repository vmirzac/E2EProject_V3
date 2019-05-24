package cucumberOptions;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(



        features = "src/test/java/features",
        format={"json:target/cucumber.json","html:target/site/cucumber-pretty"},
        glue={"stepDefinitions"},
        plugin = {"com.vimalselvam.cucumber.ExtentCucumberFormatter:output/report.html"}


)



public class TestRunnerReports {
    @AfterClass
    public static void teardown() {
//        Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
//        Reporter.setSystemInfo("user", System.getProperty("user.name"));
//        Reporter.setSystemInfo("os", "Mac OSX");
//        Reporter.setTestRunnerOutput("Sample test runner output message");
    }
}