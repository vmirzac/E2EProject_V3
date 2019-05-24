package PageObjectUtils;

import commonLibs.implementation.Driver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pageObjects.LandingPage;

import static org.testng.Assert.fail;

public class LandingPageUtils extends BaseScenarios {

	Driver cmnDriver;
	LandingPage landingPage;

	@BeforeClass
	public void invokeBrowser() {


		try {
			cmnDriver = new Driver("firefox");
			cmnDriver.setPageLoadTimeout(60);
			cmnDriver.setElementDetectionTimeout(10);

			cmnDriver.navigateToUrl("https://www.wikipedia.org/");

			landingPage = new LandingPage(cmnDriver.getDriver());


		} catch (Exception e) {
			e.printStackTrace();

		}


	}

	@AfterClass

	public void closeBrowser() {
		try {
			cmnDriver.closeAllBrowsers();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



	public void searchArticleLandingPageTest(){

		String searchItem = "Cucumber";

		try {
			landingPage.searchArticleLandingPage(searchItem);
		} catch (Exception e) {
			e.printStackTrace();
			fail("An Exception Occured");
		}

	}


}



