package PageObjectUtils;

import commonLibs.implementation.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.English_MainPage;

import static org.testng.Assert.fail;
public class English_MainPageUtils {


    Driver cmnDriver;
    English_MainPage eng_mainPage;

    @BeforeClass
    public void invokeBrowser() {


        try {
            cmnDriver = new Driver("firefox");
            cmnDriver.setPageLoadTimeout(60);
            cmnDriver.setElementDetectionTimeout(10);

            cmnDriver.navigateToUrl("https://www.wikipedia.org/");

            eng_mainPage = new English_MainPage(cmnDriver.getDriver());


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

    @org.testng.annotations.Test
    public void verifyTitleOfTheHomePage(){
        String expectedTitle = "Wikipedia, the free encyclopedia";
        String actualTile = null;
        try {
            actualTile = cmnDriver.getTitle();
        } catch (Exception e) {
            e.printStackTrace();
            fail("An Exception Occured");

        }

        Assert.assertEquals(actualTile, expectedTitle);

    }

    @Test
    public void verifyUserLoginWithCorrect(){

        String username = "Moldova1859";
        String password = "Tester555";

        try {
            cmnDriver.navigateToUrl("https://en.wikipedia.org/wiki/Main_Page");
            eng_mainPage.userLogin(username, password);
        } catch (Exception e) {
            e.printStackTrace();
            fail("An Exception Occured");
        }

    }


}


