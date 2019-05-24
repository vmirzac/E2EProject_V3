package stepDefinitions;


import PageObjectUtils.LandingPageUtils;
import commonLibs.implementation.Driver;
import commonLibs.utils.ReadConfigFileUtils;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.English_MainPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.Sign_UpPage;
import resources.base;

import java.util.Properties;


public class Wikipedia_StepDefs extends base {


    public Properties prop;

    public Wikipedia_StepDefs(){
        try {
            prop = ReadConfigFileUtils.readProperties("C:\\Users\\vmirzac\\Desktop\\E2E_Automation\\E2EProjectCucumber - V3\\src\\main\\java\\resources\\config.properties");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    LandingPageUtils landingPageUtils;
    String searchItem = "Cucumber";
    Driver cmnDriver;
    LandingPage landingPage;
    public String cucumber;
    WebDriver driver;
    English_MainPage englishMainPage;
    LoginPage loginPage;
    Sign_UpPage signupPage;





    @Before
    public void invokeBrowser() {

        try {

            cmnDriver = new Driver("chrome");
            cmnDriver.setPageLoadTimeout(60);
            cmnDriver.setElementDetectionTimeout(10);
            landingPage = new LandingPage(cmnDriver.getDriver());
            englishMainPage = new English_MainPage(cmnDriver.getDriver());
            loginPage = new LoginPage(cmnDriver.getDriver());
            signupPage=new Sign_UpPage(cmnDriver.getDriver());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @And("^Victor Searches Article on MP$")
    public void victorSearchesArticleOnMP() throws Exception {

        cmnDriver.navigateToUrl(prop.getProperty("url_LP"));
        landingPage.searchArticleLandingPage(searchItem);
    }

    @Then("^The article is displayed on the Main Page$")
    public void theArticleOnTheIsDisplayedOnTheMainPage() throws Exception {

        String actualArticleURL = cmnDriver.getCurrentUrl();
        String expectedArticleURL = prop.getProperty("url_EN");
        Assert.assertEquals(expectedArticleURL, actualArticleURL);
        cmnDriver.closeAllBrowsers();
    }


    @Given("^he navigates to Wikipedia's English Language Main Page$")
    public void navigatesToWikipediaSEnglishLanguageMainPage() throws Exception {

        englishMainPage.navigateToEMP(prop.getProperty("url_EMP"));
    }

    @When("^he selects Wikibooks' website$")
    public void heSelectsWikibooksWebsite() throws Exception {

        englishMainPage.navigateToWikibooks();
    }
    @Then("^he is redirected to Wikibook's Main Page$")
    public void heIsRedirectedToWikibookSMainPage() throws Exception {

        String actualURL = cmnDriver.getCurrentUrl();
        String expectedURL=prop.getProperty("url_Wikibooks");
        Assert.assertEquals(expectedURL, actualURL);
        cmnDriver.closeAllBrowsers();
    }

    @When("^he changes the language from English to Romanian$")
    public void heChangesTheLanguageFromEnglishToRomanian() throws Throwable {

        englishMainPage.changeLanguageEN_RO();
    }

    @Then("^the article is in Romanian$")
    public void theArticleIsInRomanian() throws Throwable {

        String actualURL = cmnDriver.getCurrentUrl();
        String expectedURL=prop.getProperty("url_RO");
        Assert.assertEquals(expectedURL, actualURL);
        cmnDriver.closeAllBrowsers();
    }

    @When("^he switches the Mobile View version$")
    public void heClicksTheMobileViewButton() throws Throwable {

        englishMainPage.swithToMobileView();
    }

    @Then("^he is redirected to \"([^\"]*)\" page$")
    public void heIsRedirectedToPage(String arg0) throws Throwable {

        String actualURL = cmnDriver.getCurrentUrl();
        String expectedURL=prop.getProperty("url_Mobile");
        Assert.assertEquals(expectedURL, actualURL);
        cmnDriver.closeAllBrowsers();
    }

    @When("^he select the Random article button$")
    public void heSelectTheRandomArticleButton() {

        englishMainPage.selectRandomArticle();
    }

    @Then("^he is redirected to a random article$")
    public void heIsRedirectedToARandomArticle() throws Throwable {

        String actualURL = cmnDriver.getCurrentUrl();
        String previousURL = prop.getProperty("url_EMP");
        Assert.assertNotSame(actualURL, previousURL);
        cmnDriver.closeAllBrowsers();
    }

    @And("^Victor navigates to \"([^\"]*)\" website$")
    public void victorNavigatesToWebsite(String arg1) throws Throwable {

        cmnDriver.navigateToUrl(arg1);
    }

    @Then("^he is redirected to \"([^\"]*)\"$")
    public void heIsRedirectedTo(String arg0) throws Throwable {

        String actualURL = cmnDriver.getCurrentUrl();
        Assert.assertEquals(arg0, actualURL);
        cmnDriver.closeAllBrowsers();
    }

    @And("^he logs into his account with username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void heLogsIntoHisAccountWithUsernameAsAndPasswordAs(String arg0, String arg1) throws Throwable {

        cmnDriver.navigateToUrl(prop.getProperty("url_EMP"));
        loginPage.userLogin(arg0, arg1);
    }

    @Then("^he is logged into his account$")
    public void heIsLoggedIntoHisAccount() throws Throwable {

        loginPage.AccountLoggedIn();
        cmnDriver.closeAllBrowsers();
    }

    @Then("^he is not logged in$")
    public void heIsNotLoggedIn() throws Throwable {

        loginPage.AccountNOTLoggedIn();
        cmnDriver.closeAllBrowsers();
    }

    @And("^he clicks the Preferences button$")
    public void heClicksThePreferencesButton() throws Throwable {

        loginPage.getPreferencesBTN_LP();
    }

    @And("^he updates his signature with \"([^\"]*)\"$")
    public void heUpdatesHisSignatureWith(String arg0) throws Throwable {

      loginPage.updateSignature(arg0);
    }

    @Then("^his signature is updated to Victor Mirzac$")
    public void hisSignatureIsUpdatedToVictorMirzac() throws Throwable {

        loginPage.isSignatureUpdated();
        cmnDriver.closeAllBrowsers();
    }

    @And("^he changes the skin$")
    public void heChangesTheSkin() throws Exception {

        loginPage.changeSkin();
    }

    @Then("^the new skin is selected$")
    public void theNewSkinIsSelected() {

        boolean cologneBlueSkinSelected = driver.findElement(By.xpath("//input[@id='ooui-php-48']")).isSelected();
        Assert.assertTrue(cologneBlueSkinSelected);
        loginPage.restoreDefaultSettings();
    }

    @Then("^the Cologne Blue skin is selected$")
    public void theCologneBlueSkinIsSelected() throws Exception {

        loginPage.cologneBlueSkin();
        cmnDriver.closeAllBrowsers();
    }

    @When("^he logs out from his account$")
    public void heLogsOutFromHisAccount() throws Exception {

        loginPage.logout();
    }

    @Then("^he is logged out from the application$")
    public void heIsLoggedOutFromTheApplication() throws Throwable {

        loginPage.isLoggedOut();
        cmnDriver.closeAllBrowsers();
    }

    @And("^he restores the Default Settings$")
    public void heRestoresTheDefaultSettings() {

        loginPage.restoreDefaultSettings();
    }

    @Then("^the account is set to default settings$")
    public void TheAccountIsSetToDefaultSettings() throws Exception {

        String redirURL = cmnDriver.getCurrentUrl();
        Assert.assertEquals(prop.get("url_Preferences"), redirURL);
        cmnDriver.closeAllBrowsers();
    }

    @Given("^he navigates to Wikipedia's User Create Account Page$")
    public void heNavigatesToWikipediaSUserCreateAccountPage() throws Exception {

        cmnDriver.navigateToUrl(prop.getProperty("url_createAccount"));
    }

    @When("^enters the following invalid data on the page$")
    public void entersTheFollowingInvalidDataOnThePage(DataTable table) {

        signupPage.enterInvalidCredentials(table);

    }

    @Then("^the user registration should be unsuccessful$")
    public void theUserRegistrationShouldBeUnsuccessful() throws Throwable {

        signupPage.errorMessageDisplayed();
        cmnDriver.closeAllBrowsers();
    }

    @And("^he sends an email$")
    public void heSendsAnEmail() {

        loginPage.sendEmail();
    }

    @Then("^the email is sent to the user and Email sent message is displayed$")
    public void theEmailIsSentToTheUserAndEmailSentMessageIsDisplayed() throws Throwable {

        loginPage.isEmailSent();
        cmnDriver.closeAllBrowsers();
    }

    @And("^he enters \"([^\"]*)\" days in the Days to show in watchlist box$")
        public void heEntersDaysInTheDaysToShowInWatchlistBox(String arg0) throws Throwable {

            loginPage.updateWatchlist(arg0);
        }

    @And("^he updates the watchlist with \"([^\"]*)\" days$")
    public void heUpdatesTheWatchlistWithDays(String arg0) throws Throwable {

        loginPage.updateWatchlist(arg0);
    }

    @Then("^\"([^\"]*)\" days are displayed in the Days to show in watchlist box$")
    public void daysAreDisplayedInTheDaysToShowInWatchlistBox(String arg0) throws Throwable {

        String URL = cmnDriver.getCurrentUrl();
        Assert.assertEquals(prop.get("url_Preferences"), URL);
        cmnDriver.closeAllBrowsers();

    }

    @And("^Victor Searches Article on EMP$")
    public void victorSearchesArticleOnEMP() throws Exception {

        cmnDriver.navigateToUrl(prop.getProperty("url_EMP"));
        englishMainPage.searchArticleEMP(searchItem);
    }

    @And("^he adds the page to his watchlist$")
    public void heAddsThePageToHisWatchlist() throws Throwable {

        loginPage.addArticleToWatchlist();
    }

    @Then("^the watchlist star is selected$")
    public void theWatchlistStarIsSelected() throws Exception {

        loginPage.isWatchlistEnabled();
        cmnDriver.closeAllBrowsers();
    }

    @And("^he changes his password to \"([^\"]*)\"$")
    public void heChangesHisPasswordTo(String arg0) throws Throwable {

        loginPage.changePassword(arg0);
    }

    @Then("^his password is changed to the new one$")
    public void hisPasswordIsChangedToTheNewOneAndHeIsRedirectedToThePreferencesPage() throws Exception {

        String currentURL = cmnDriver.getCurrentUrl();
        Assert.assertEquals(prop.getProperty("url_Preferences"), currentURL);
    }

    @And("^he enters the new password as \"([^\"]*)\" and incorrectly retypes the password as \"([^\"]*)\"$")
    public void heEntersTheNewPasswordAsAndIncorrectlyRetypesThePasswordAs(String arg0, String arg1) throws Throwable {

        loginPage.changePasswordIncorrectly(arg0, arg1);
    }

    @Then("^the password mismatch warning is displayed$")
    public void thePasswordMismatchWarningIsDisplayed() throws Throwable {

        boolean warning = cmnDriver.getPageSource().contains(prop.getProperty("warning_msg"));
        Assert.assertTrue(warning);
        cmnDriver.closeAllBrowsers();
    }

    @And("^he opens Your notices$")
    public void heOpensYourNotices() {
        loginPage.openNotices();
    }

    @Then("^he can see the Notices window displayed$")
    public void heCanSeeTheNoticesWindowDisplayed() throws Exception {

        loginPage.isNoticesWindowDisplayed();
        cmnDriver.closeAllBrowsers();
    }

    @And("^he creates an article with template code \"([^\"]*)\"$")
    public void heCreatesAnArticleWithTemplateCode(String arg0) throws Throwable {

        loginPage.createArticle(arg0);
    }

    @And("^he publishes the article$")
    public void hePublishesTheArticle() {
        loginPage.publishArticle();
    }

    @Then("^he is redirected to the Sandbox and a sample article is displayed$")
    public void heIsRedirectedToTheSandboxAndASampleArticleIsDisplayed() throws Throwable {

        String URL = cmnDriver.getCurrentUrl();
        Assert.assertEquals(prop.getProperty("url_Sandbox"), URL);
        cmnDriver.closeAllBrowsers();
    }
}


