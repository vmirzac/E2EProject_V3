package PageObjectUtils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import commonLibs.implementation.Driver;
import commonLibs.implementation.TakeScreenshot;
import commonLibs.utils.DateUtils;
import commonLibs.utils.ReadConfigFileUtils;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import pageObjects.English_MainPage;

import java.util.Properties;

public class BaseScenarios {

	public Driver cmnDriver;
	public English_MainPage english_mainPage;
	public WebDriver driver;

	public Properties configProperty;

	public ExtentHtmlReporter reportHtml;
	public ExtentTest logger;
	public ExtentReports report;

	public String currentProjectDirectory;

	private String configFileName;
	private TakeScreenshot camera;

	public static String testExecutionStartTime;

	@BeforeSuite
	public void initialization() {
		try {

			currentProjectDirectory = System.getProperty("user.dir");
			testExecutionStartTime = DateUtils.getDate();

			configFileName = currentProjectDirectory + "/config/config.properties";
			configProperty = ReadConfigFileUtils.readProperties(configFileName);

			String reportFileName = currentProjectDirectory + "/reports/"
					+ configProperty.getProperty("reportFileName");

			reportHtml = new ExtentHtmlReporter(reportFileName + testExecutionStartTime + ".html");

			report = new ExtentReports();
			report.attachReporter(reportHtml);


		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@BeforeClass
	public void invokeBrowser() {

		logger = report.createTest("Setup :: Invoke Browser");
		try {
			String browserType = configProperty.getProperty("browserType");
			logger.info("Browser Invoked :: " + browserType);

			cmnDriver = new Driver(browserType);

			int elementDetectionTimeout = Integer.parseInt(configProperty.getProperty("elementDetectionTimeout"));
			cmnDriver.setElementDetectionTimeout(elementDetectionTimeout);
			logger.info("Element detection timeout :: " + elementDetectionTimeout);

			int pageLoadTimeout = Integer.parseInt(configProperty.getProperty("pageLoadTimeout"));
			cmnDriver.setPageLoadTimeout(pageLoadTimeout);
			logger.info("Pageload = timeout :: " + pageLoadTimeout);

			logger.info("Url navigated :: " + configProperty.getProperty("baseUrl"));
			cmnDriver.navigateToFirstUrl(configProperty.getProperty("baseUrl"));
			driver = cmnDriver.getDriver();


		} catch (Exception e) {
			logger.error("Exception occured :: " + e.getMessage());
			Assert.fail("Because an Exception occured..");
		}

	}

	@AfterMethod(alwaysRun = true)
	public void afterAMethod(ITestResult result) throws Exception {

		if (result.getStatus() == ITestResult.FAILURE) {
			logger.fail("Test case Failed :: " + result.getName());
			
			String fileName = currentProjectDirectory + "\\screenshots\\" + result.getName() + testExecutionStartTime
					+ ".png";

			String resultPath = camera.captureAndSaveScreenshot(fileName);
			

			System.out.println(resultPath);
			logger.addScreenCaptureFromPath(resultPath);
		}

		else if (result.getStatus() == ITestResult.SKIP) {

			logger.skip("Test case Skipped :: " + result.getName());
		} else {
			logger.pass("Test case passed :: " + result.getName());
		}

	}

	@AfterClass(enabled = true, alwaysRun = true)
	public void closeBrowser() {
		try {

			logger.info("Closing all the browsers...");
			cmnDriver.closeAllBrowsers();
		} catch (Exception e) {
			Assert.fail();
			e.printStackTrace();
		}
	}

	@AfterSuite(alwaysRun = true)
	public void cleanup() {
		report.flush();
	}

}
