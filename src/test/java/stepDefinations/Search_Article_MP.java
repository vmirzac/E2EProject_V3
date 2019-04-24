package stepDefinations;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import org.apache.xpath.SourceTree;
import org.apache.xpath.XPath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pageObjects.*;
import resources.base;
import sun.rmi.runtime.Log;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Search_Article_MP extends base {


    @Given("^Victor Initializes the browser with chrome$")
    public void victorInitializesTheBrowserWithChrome() throws Throwable {

        driver = initializeDriver();
    }

    @And("^Victor navigates to \"([^\"]*)\" website$")
    public void victorNavigatesToWebsite(String arg1) throws Throwable {
        driver.get(arg1);
    }


    @When("^he searches the keyword \"([^\"]*)\" the Search box$")
    public void heSearchesTheKeywordTheSearchBox(String arg1) throws Throwable {
        LandingPage lp = new LandingPage(driver);
        lp.searchButtonMP().sendKeys(arg1);
    }

    @Then("^a single result is shown for \"([^\"]*)\"$")
    public void aSingleResultIsShownFor(String arg2) throws Throwable {
        Assert.assertTrue(driver.findElement(By.partialLinkText(arg2)).isDisplayed());
    }

    @And("^close browsers$")
    public void close_browsers() throws Throwable {
        driver.quit();
    }

    @When("^he clicks the \"([^\"]*)\" button$")
    public void heClicksTheButton(String arg0) throws Throwable {
        LandingPage lp = new LandingPage(driver);
        lp.englishBTN_MP().click();
    }


    @Then("^he is redirected to \"([^\"]*)\"$")
    public void heIsRedirectedTo(String arg0) throws Throwable {
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(arg0, URL);
    }

    @When("^he changes the language from English to Romanian$")
    public void heChangesTheLanguageFromEnglishToRomanian() throws Throwable {
        English_MainPage emp = new English_MainPage(driver);
        emp.getRomanianBTB_EMP().click();

    }

    @Then("^the article is in Romanian$")
    public void theArticleIsInRomanian() throws Throwable {

        String URL = driver.getCurrentUrl();
        org.testng.Assert.assertEquals(URL, "https://ro.wikipedia.org/wiki/Castravete");
    }

    @And("^he clicks the Search Button$")
    public void heClicksTheSearchButton() throws Throwable {
        English_MainPage emp = new English_MainPage(driver);
        emp.getSearchBTN_EMP().click();

    }


    @When("^Victor enters invalid data on the page$")
    public void victorEntersInvalidDataOnThePage(DataTable table) throws Throwable {

        Sign_UpPage sup = new Sign_UpPage(driver);

        List<List<String>> data = table.raw();

        System.out.println(data.get(1).get(1));

        //Enter data

        sup.getUsername_SUP().sendKeys(data.get(1).get(1));
        sup.getPassword_SUP().sendKeys(data.get(2).get(1));
        sup.getRetypePassSUP().sendKeys(data.get(3).get(1));
        sup.getEmailSup().sendKeys(data.get(4).get(1));
        sup.getCaptchaSUP().sendKeys(data.get(5).get(1));
        sup.getCreateAccountBTN_SUP().click();



    }

    @Then("^the user registration should be unsuccessful$")
    public void theUserRegistrationShouldBeUnsuccessful() throws Throwable {
        String errormsg = driver.findElement(By.xpath("//p[contains(text(),'Incorrect or missing CAPTCHA.')]")).getText();
        Assert.assertEquals("Incorrect or missing CAPTCHA.",errormsg );
    }

    @And("^he clicks the Login button$")
    public void heClicksTheLoginButton() throws Throwable {
        English_MainPage emp = new English_MainPage(driver);
        emp.getLoginBTN_EMP().click();

    }


    @When("^he enters username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void heEntersUsernameAsAndPasswordAs(String username, String password) throws Throwable {

        LoginPage lp = new LoginPage(driver);
        lp.getUsernameBox_LP().sendKeys(username);
        lp.getPasswordBox_LP().sendKeys(password);


    }


    @And("^he clicks the Login button on the loging page$")
    public void heClicksTheLoginButtonOnTheLogingPage() throws Throwable {
        LoginPage lp = new LoginPage(driver);
        lp.getLoginBTN_LP().click();
    }

    @Then("^he is logged into his account$")
    public void heIsLoggedIntoHisAccount() throws Throwable {
        LoginPage lp = new LoginPage(driver);
Assert.assertTrue(driver.findElement(By.xpath("//a[@title='Log out']")).isDisplayed());
    }

    @When("^he clicks the Log out button$")
    public void heClicksTheLogOutButton() throws Throwable {
        LoginPage lp = new LoginPage(driver);
        lp.getLogoutBTN_LP().click();
    }

    @Then("^he is logged out from the application$")
    public void heIsLoggedOutFromTheApplication() throws Throwable {
        LoginPage lp = new LoginPage(driver);
        Assert.assertTrue(driver.findElement(By.id("pt-login")).isDisplayed());
    }

    @When("^he clicks the Mobile View button$")
    public void heClicksTheMobileViewButton() throws Throwable {
        English_MainPage emp = new English_MainPage(driver);
        emp.getMobileViewBTN_EMP().click();
    }


    @Then("^he is redirected to \"([^\"]*)\" page$")
    public void heIsRedirectedToPage(String arg0) throws Throwable {
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(arg0, URL);
    }

    @Then("^a \"([^\"]*)\" is displayed$")
    public void aIsDisplayed(String arg0) throws Throwable {

    }

    @Then("^he is not logged in$")
    public void heIsNotLoggedIn() throws Throwable {

        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"pt-login\"]/a")).isDisplayed());
    }

    @And("^he clicks the Preferences button$")
    public void heClicksThePreferencesButton() throws Throwable {
        LoginPage lp = new LoginPage(driver);
        lp.getPreferencesBTN_LP().click();
    }

    @And("^he enters Victor Mirzac as signature in the signature box$")
    public void heEntersVictorMirzacAsSignatureInTheSignatureBox() throws Throwable {
        LoginPage lp = new LoginPage(driver);
        lp.getSignatureBox_LP().sendKeys("Vi");
    }

    @And("^he enters \"([^\"]*)\" as signature in the signature box$")
    public void heEntersAsSignatureInTheSignatureBox(String arg0) throws Throwable {
        LoginPage lp = new LoginPage(driver);
        lp.getSignatureBox_LP().clear();
        lp.getSignatureBox_LP().sendKeys(arg0);
    }

    @And("^he clicks the Save button$")
    public void heClicksTheSaveButton() throws Throwable {
        LoginPage lp = new LoginPage(driver);
        lp.getSaveBTN_LP().click();
    }

    @Then("^his signature is updated to Victor Mirzac$")
    public void hisSignatureIsUpdatedToVictorMirzac() throws Throwable {
       String signature = driver.findElement(By.partialLinkText("Victor Mirzac")).getText();
        Assert.assertEquals("Victor Mirzac", signature);
    }

    @And("^he click the Change password button$")
    public void heClickTheChangePasswordButton() throws Throwable {
        LoginPage lp = new LoginPage(driver);
        lp.getChangePassBTN_LP().click();
    }

    @And("^he fills in the New Password field as \"([^\"]*)\" and Retypes his new password$")
    public void heFillsInTheNewPasswordFieldAsAndRetypesHisNewPassword(String arg0) throws Throwable {
        LoginPage lp = new LoginPage(driver);
        lp.getNewPassBox_LP().sendKeys(arg0);
        lp.getRetypeNewPass_LP().sendKeys(arg0);
    }

    @And("^he click the Change credentials button$")
    public void heClickTheChangeCredentialsButton() throws Throwable {
        LoginPage lp = new LoginPage(driver);
        lp.getChangeCredentialsBTB_LP().click();
    }

    @Then("^he is redirected to the Preferences page$")
    public void heIsRedirectedToThePreferencesPage() throws Throwable {
        String redirURL = driver.getCurrentUrl();
        Assert.assertEquals("https://en.wikipedia.org/wiki/Special:Preferences", redirURL);
    }

    @And("^he fills in the New Password field as \"([^\"]*)\" and Retypes his new password as \"([^\"]*)\"$")
    public void heFillsInTheNewPasswordFieldAsAndRetypesHisNewPasswordAs(String arg0, String arg1) throws Throwable {
       LoginPage lp = new LoginPage(driver);
       lp.getNewPassBox_LP().sendKeys(arg0);
       lp.getRetypeNewPass_LP().sendKeys(arg1);
    }

    @Then("^the password mismatch warning is displayed$")
    public void thePasswordMismatchWarningIsDisplayed() throws Throwable {
       boolean warning = driver.getPageSource().contains("The passwords you entered do not match.");
       Assert.assertTrue(warning);
    }

    @And("^he clicks the Appearance button$")
    public void heClicksTheAppearanceButton() throws Throwable {

        LoginPage lp = new LoginPage(driver);
        lp.getAppearanceBTN_LP().click();


    }

    @And("^he selects the Cologne Blue skin$")
    public void heSelectsTheCologneBlueSkin() throws Throwable {
        LoginPage lp = new LoginPage(driver);
        lp.getCologneBlueRBTN_LP().click();
    }

    @Then("^the Cologne Blue radio button is selected$")
    public void theCologneBlueRadioButtonIsSelected() throws Throwable {

        boolean cologneBlueSkinSelected = driver.findElement(By.id("ooui-php-48")).isSelected();
        Assert.assertTrue(cologneBlueSkinSelected);
    }

    @And("^restore all default settings$")
    public void restoreAllDefaultSettings() throws Throwable {
      LoginPage lp = new LoginPage(driver);
      lp.getRestorePrefs_LP().click();
    }


    @And("^he clicks on the Search button$")
    public void heClicksOnTheSearchButton() throws Throwable {
       LoginPage lp = new LoginPage(driver);
       lp.getSearchBTN_LP().click();
    }

    @And("^he selects the Don’t show the Advanced Search interface$")
    public void heSelectsTheDonTShowTheAdvancedSearchInterface() throws Throwable {
        LoginPage lp = new LoginPage(driver);
        WebElement searchCheckBox = lp.getNoAdvancedSearch_LP();
        Actions actions = new Actions(driver);
        actions.moveToElement(searchCheckBox).click().perform();
    }

    @Then("^the --Don’t show the Advanced Search interface-- is selected$")
    public void theDonTShowTheAdvancedSearchInterfaceIsSelected() throws Throwable {
        LoginPage lp = new LoginPage(driver);
        WebElement searchCheckBox = lp.getNoAdvancedSearch_LP();
        searchCheckBox.isSelected();
    }

    @And("^he clicks the Your notices button$")
    public void heClicksTheYourNoticesButton() throws Throwable {
        LoginPage lp = new LoginPage(driver);
        lp.getNotifisBTN_LP().click();
    }

    @Then("^he can see the Notices window displayed$")
    public void heCanSeeTheNoticesWindowDisplayed() throws Throwable {

        boolean notificationWindowIsDisplayed = driver.findElement(By.xpath("//span[contains(text(),'Notices')]")).isDisplayed();
        Assert.assertTrue(notificationWindowIsDisplayed);

    }

    @When("^he clicks the Random article button once$")
    public void heClicksTheRandomArticleButtonOnce() throws Throwable {
        English_MainPage emp = new English_MainPage(driver);
        emp.getRandomArticle_EMP().click();
    }

    @Then("^he is redirected to a random article$")
    public void heIsRedirectedToARandomArticle() throws Throwable {
        Object currentArticle = driver.getCurrentUrl();
        String emp = "https://en.wikipedia.org/wiki/Main_Page";
        Assert.assertNotSame(emp, currentArticle);
    }


    @When("^he clicks the Wikibooks article button$")
    public void heClicksTheWikibooksArticleButton() throws Throwable {
        English_MainPage emp = new English_MainPage(driver);
        emp.getWikibooksBTN().click();
    }

    @Then("^he is redirected to a Wikibooks' Main Page$")
    public void heIsRedirectedToAWikibooksMainPage() throws Throwable {
        String wikiBooksURL = driver.getCurrentUrl();
        Assert.assertEquals("https://en.wikibooks.org/wiki/Main_Page", wikiBooksURL);
    }

    @And("^he clicks the Watchlist button$")
    public void heClicksTheWatchlistButton() throws Throwable {
        LoginPage lp = new LoginPage(driver);
        lp.getWatchlistBTN().click();
    }

    @And("^he enters \"([^\"]*)\" days in the Days to show in watchlist box$")
    public void heEntersDaysInTheDaysToShowInWatchlistBox(String arg0) throws Throwable {
        LoginPage lp = new LoginPage(driver);

        lp.getDaysToShowInWatchlistBox_LP().clear();
        lp.getDaysToShowInWatchlistBox_LP().sendKeys(arg0);


    }

    @Then("^\"([^\"]*)\" days are displayed in the Days to show in watchlist box$")
    public void daysAreDisplayedInTheDaysToShowInWatchlistBox(String arg0) throws Throwable {

        String URL = driver.getCurrentUrl();
        Assert.assertEquals("https://en.wikipedia.org/wiki/Special:Preferences", URL);

    }

    @And("^he clicks on the Sandbox button$")
    public void heClicksOnTheSandboxButton() throws Throwable {
        LoginPage lp = new LoginPage(driver);
        lp.getSandbox_BTN().click();
    }

    @And("^he clicks the Edit Source button$")
    public void heClicksTheEditSourceButton() throws Throwable {
        LoginPage lp = new LoginPage(driver);
        lp.getEditSource_BTN().click();
    }

    @And("^he pastes the templace code \"([^\"]*)\"$")
    public void hePastesTheTemplaceCode(String arg0) throws Throwable {
        LoginPage lp = new LoginPage(driver);
        lp.getTextBox().clear();
        lp.getTextBox().sendKeys(arg0);
    }

    @And("^he publishes the changes$")
    public void hePublishesTheChanges() throws Throwable {
        LoginPage lp = new LoginPage(driver);
        lp.getPublish_BTN().click();
    }

    @Then("^he is redirected to the Sandbox and a sample article is displayed$")
    public void heIsRedirectedToTheSandboxAndASampleArticleIsDisplayed() throws Throwable {
        String URL = driver.getCurrentUrl();
        Assert.assertEquals("https://en.wikipedia.org/wiki/User:Vmirzac/sandbox", URL);
    }

    @And("^he adds the page to his watchlist star$")
    public void heAddsThePageToHisWatchlistStar() throws Throwable {
        LoginPage lp = new LoginPage(driver);
        lp.getWatchlistStarBTN().click();
    }

    @Then("^the watchlist star is selected$")
    public void theWatchlistStarIsSelected() throws Throwable {
        LoginPage lp = new LoginPage(driver);
        Assert.assertTrue(lp.getWatchlistStarBTN().isEnabled());
    }

    @And("^he clicks the Email this user button$")
    public void heClicksTheEmailThisUserButton() throws Throwable {
        LoginPage lp = new LoginPage(driver);
        lp.getEmailUserBTN().click();
    }

    @And("^he enters the message \"([^\"]*)\" in the message box$")
    public void heEntersTheMessageInTheMessageBox(String arg0) throws Throwable {
        LoginPage lp = new LoginPage(driver);
        lp.getMessageBox().sendKeys(arg0);
    }

    @And("^he clicks the Send button$")
    public void heClicksTheSendButton() throws Throwable {
        LoginPage lp = new LoginPage(driver);
        lp.getSendMessageBTN().click();
    }

    @Then("^the email is sent to the user and Email sent message is displayed$")
    public void theEmailIsSentToTheUserAndEmailSentMessageIsDisplayed() throws Throwable {
        Assert.assertEquals(driver.findElement(By.id("firstHeading")).getText(), "Email sent");
    }


    @When("^he clicks the Restore all default settings in all sections button$")
    public void heClicksTheRestoreAllDefaultSettingsInAllSectionsButton() throws Throwable {

        LoginPage lp = new LoginPage(driver);
        lp.getRestorePrefs_LP().click();
    }

    @And("^he confirms the intent to restore all default settings$")
    public void heConfirmsTheIntentToRestoreAllDefaultSettings() throws Throwable {
        LoginPage lp = new LoginPage(driver);
        lp.getRestoreDefsConfirmationBTN().click();
    }
}
