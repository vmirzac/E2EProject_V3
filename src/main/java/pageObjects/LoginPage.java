package pageObjects;

import commonLibs.utils.WaitUtils;
import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pagesUtils_toDelete.BasicOperations;

public class LoginPage extends BasicOperations {


	WebDriver driver;
	WaitUtils wait = new WaitUtils();


	@FindBy(xpath = "//input[@id='wpName1']")
	WebElement usernameBox_LP;

	@FindBy(xpath = "//input[@id='wpPassword1']")
	WebElement passwordBox_LP;

	@FindBy(xpath = "//button[@id='wpLoginAttempt']")
	WebElement loginBTN_LP;

	@FindBy(xpath = "//a[contains(text(),'Log in')]")
	WebElement loginBTN_afterLogOut_LP;

	@FindBy(id= "pt-login" )
	WebElement loginBTN_MainPage;

	@FindBy(xpath = "//a[@title='Log out']")
	WebElement logoutBTN_LP;

	@FindBy(xpath = "//p[contains(text(),'Incorrect username or password entered.')]")
	WebElement warning_LP;

	@FindBy(id = "pt-preferences")
	WebElement preferencesBTN_LP;

	@FindBy(id = "ooui-php-25")
	WebElement signatureBox_LP;

	@FindBy(id = "prefcontrol")
	WebElement saveBTN_LP;

	@FindBy(id = "ooui-php-12")
	WebElement  changePassBTN_LP;

	@FindBy(id = "ooui-php-1")
	WebElement  newPassBox_LP;

	@FindBy(id = "ooui-php-2")
	WebElement  retypeNewPass_LP;

	@FindBy(id = "ooui-php-5")
	WebElement  changeCredentialsBTB_LP;

	@FindBy(xpath = "//div[@id='ooui-php-312']//span[@class='oo-ui-labelElement-label'][contains(text(),'Appearance')]")
	WebElement  appearanceBTN_LP;

	@FindBy(xpath = "//input[@id='ooui-php-48']")
	WebElement  cologneBlueRBTN_LP;

	@FindBy(id = "mw-prefs-restoreprefs")
	WebElement  restorePrefs_LP;

	@FindBy(xpath = "//*[@id=\"ooui-php-316\"]/span")
	WebElement  searchBTN_LP;

	@FindBy(xpath = "//input[@id='ooui-php-192']")
	WebElement  noAdvancedSearch_LP;

	@FindBy(id = "pt-notifications-notice")
	WebElement  notifisBTN_LP;

	@FindBy(xpath = "//span[contains(text(),'Notices')]")
	WebElement noticesWin_LP;

	@FindBy(xpath = "//div[@id='ooui-php-315']//span[@class='oo-ui-labelElement-label'][contains(text(),'Watchlist')]")
	WebElement  watchlistBTN;

	@FindBy(xpath = "//input[@id='ooui-php-151']")
	WebElement  daysToShowInWatchlistBox_LP;

	@FindBy(id = "pt-sandbox")
	WebElement  sandbox_BTN;

	@FindBy(linkText = "Edit source")
	WebElement  editSource_BTN;

	@FindBy(id = "wpTextbox1")
	WebElement  textBox;

	@FindBy(id = "wpSave")
	WebElement  publish_BTN;

	@FindBy(id = "ca-watch")
	WebElement  watchlistStarBTN;

	@FindBy(linkText = "Unwatch")
	WebElement  watchlistStarBTN_Uncheck;

	@FindBy(id = "t-emailuser")
	WebElement  emailUserBTN;

	@FindBy(id = "ooui-php-2")
	WebElement  messageBox;

	@FindBy(id = "ooui-php-11")
	WebElement  sendMessageBTN;

	@FindBy(id = "ooui-php-1")
	WebElement  restoreDefsConfirmationBTN;

	@FindBy(partialLinkText = "Victor Mirzac")
	WebElement SignatureUpdate;

	@FindBy(id = "firstHeading")
	WebElement emailSent_message;


	public LoginPage(WebDriver driver) {
		super(driver);

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getUsernameBox_LP() {
		return usernameBox_LP;
	}
	public WebElement getPasswordBox_LP(){
		return passwordBox_LP;
	}
	public WebElement getLoginBTN_LP(){
		return loginBTN_LP;
	}
	public WebElement getLogoutBTN_LP(){
		return logoutBTN_LP;
	}
	public WebElement getWarning_LP(){
		return warning_LP;
	}
	public WebElement getPreferencesBTN_LP(){
		return preferencesBTN_LP;
	}

	public WebElement getSignatureBox_LP(){
		return signatureBox_LP;
	}

	public WebElement getSaveBTN_LP(){
		return saveBTN_LP;
	}

	public WebElement getChangePassBTN_LP(){
		return changePassBTN_LP;
	}

	public WebElement getNewPassBox_LP(){
		return newPassBox_LP;
	}

	public WebElement getRetypeNewPass_LP(){
		return retypeNewPass_LP;
	}

	public WebElement getChangeCredentialsBTB_LP(){
		return changeCredentialsBTB_LP;
	}

	public WebElement getAppearanceBTN_LP(){
		return appearanceBTN_LP;
	}

	public WebElement getCologneBlueRBTN_LP(){
		return cologneBlueRBTN_LP;
	}

	public WebElement getEmailSent_message(){
		return emailSent_message;
	}

	public WebElement getRestorePrefs_LP(){
		return restorePrefs_LP;
	}

	public WebElement getSearchBTN_LP(){
		return searchBTN_LP;
	}

	public WebElement getWatchlistStarBTN_Uncheck(){
		return watchlistStarBTN_Uncheck;
	}

	public WebElement getNoAdvancedSearch_LP(){
		return noAdvancedSearch_LP;
	}

	public WebElement getNotifisBTN_LP(){
		return notifisBTN_LP;
	}

	public WebElement getNoticesWin_LP(){
		return noticesWin_LP;
	}

	public WebElement getWatchlistBTN(){
		return watchlistBTN;
	}

	public WebElement getDaysToShowInWatchlistBox_LP(){
		return daysToShowInWatchlistBox_LP;


}

	public WebElement getSandbox_BTN(){
		return sandbox_BTN;


}
	public WebElement getEditSource_BTN(){
		return editSource_BTN;
}

	public WebElement getTextBox(){
		return textBox;

}

	public WebElement getPublish_BTN(){
		return publish_BTN;

}

	public WebElement getWatchlistStarBTN(){
		return watchlistStarBTN;

	}

	public WebElement getEmailUserBTN(){
		return emailUserBTN;

	}

	public WebElement getMessageBox(){
		return messageBox;

	}

	public WebElement getSendMessageBTN(){
		return sendMessageBTN;

	}

	public WebElement getRestoreDefsConfirmationBTN(){
		return restoreDefsConfirmationBTN;

	}

	public WebElement getLoginBTN_MainPage(){
		return loginBTN_MainPage;

	}

	public WebElement getLoginBTN_afterLogOut_LP(){
		return loginBTN_afterLogOut_LP;

	}



	public WebElement getSignatureUpdate(){
		return SignatureUpdate;

	}



	public void userLogin(String username, String password) throws Exception{

		elementControl.click(loginBTN_MainPage);

		WaitUtils.waitTillElementVisible(driver, usernameBox_LP, 5);

		textboxControl.clearText(usernameBox_LP);
		textboxControl.setText(usernameBox_LP, username);

		WaitUtils.waitTillElementVisible(driver, passwordBox_LP, 5);

		textboxControl.clearText(passwordBox_LP);
		textboxControl.setText(passwordBox_LP, password);

		elementControl.click(loginBTN_LP);

	}
	public void AccountLoggedIn() throws Exception {

		boolean isLogoutBTNDisplayed= elementControl.isElementVisible(logoutBTN_LP);
		Assert.assertTrue(isLogoutBTNDisplayed);
	}

	public void AccountNOTLoggedIn(){
		getLoginBTN_LP().isDisplayed();
	}

	public void updateSignature(String arg0){
		getPreferencesBTN_LP().click();
		getSignatureBox_LP().clear();
		getSignatureBox_LP().sendKeys(arg0);
		getSaveBTN_LP().click();
	}

	public void isSignatureUpdated() throws Exception {
		String signature = elementControl.getText(SignatureUpdate);
		Assert.assertEquals("Victor Mirzac", signature);
	}



	public void changeSkin() throws Exception {
		getPreferencesBTN_LP().click();
		elementControl.isElementVisible(appearanceBTN_LP);
		getAppearanceBTN_LP().click();
		elementControl.isElementVisible(cologneBlueRBTN_LP);
		getCologneBlueRBTN_LP().click();
		elementControl.isElementVisible(saveBTN_LP);
		getSaveBTN_LP().click();

	}
	public void restoreDefaultSettings(){
		getPreferencesBTN_LP().click();
		getRestorePrefs_LP().click();
		getRestoreDefsConfirmationBTN().click();

	}

	public void cologneBlueSkin() throws Exception {
		Thread.sleep(3000);
		elementControl.isElementVisible(cologneBlueRBTN_LP);
		final boolean isCologneBlueDisplayed = getCologneBlueRBTN_LP().isSelected();
		Assert.assertTrue(isCologneBlueDisplayed);
		getRestorePrefs_LP().click();
		getRestoreDefsConfirmationBTN().click();
	}

	public void logout() throws Exception {
		elementControl.isElementVisible(logoutBTN_LP);
		getLogoutBTN_LP().click();
	}

	public void isLoggedOut() throws Exception {
		elementControl.isElementVisible(loginBTN_afterLogOut_LP);
		boolean isLoginBTNDisplayed= elementControl.isElementVisible(loginBTN_afterLogOut_LP);
		Assert.assertTrue(isLoginBTNDisplayed);
//		cmnDriver.closeAllBrowsers();
	}

	public void sendEmail(){
		String message = "Hello";
		getSandbox_BTN().click();
		getEmailUserBTN().click();
		getMessageBox().sendKeys(message);
		getSendMessageBTN().click();
	}

	public void isEmailSent(){
		boolean emailSentMessage = getEmailSent_message().isDisplayed();
		Assert.assertTrue(emailSentMessage);
	}

	public void updateWatchlist(String arg0) throws Exception {
		getPreferencesBTN_LP().click();
		Thread.sleep(3000);
		elementControl.isElementVisible(watchlistBTN);
		getWatchlistBTN().click();
		elementControl.isElementVisible(daysToShowInWatchlistBox_LP);
		getDaysToShowInWatchlistBox_LP().clear();
		elementControl.isElementVisible(daysToShowInWatchlistBox_LP);
		getDaysToShowInWatchlistBox_LP().sendKeys(arg0);
		elementControl.isElementVisible(saveBTN_LP);
		getSaveBTN_LP().click();
		elementControl.isElementVisible(restorePrefs_LP);
		getRestorePrefs_LP().click();
		elementControl.isElementVisible(restoreDefsConfirmationBTN);
		getRestoreDefsConfirmationBTN().click();
	}

	public void addArticleToWatchlist() throws Exception {
		elementControl.isElementVisible(watchlistStarBTN);
		getWatchlistStarBTN().click();
	}

	public void isWatchlistEnabled() throws Exception {
		boolean IsWatchlistBTNEnabled = elementControl.isElementEnabled(watchlistStarBTN);
		Assert.assertTrue(IsWatchlistBTNEnabled);
	}

	public void changePassword(String arg0)throws Exception{
		getPreferencesBTN_LP().click();
		getChangePassBTN_LP().click();
		getNewPassBox_LP().sendKeys(arg0);
		getRetypeNewPass_LP().sendKeys(arg0);
		getChangeCredentialsBTB_LP().click();

	}

	public void changePasswordIncorrectly(String arg0, String arg1)throws Exception{
		getPreferencesBTN_LP().click();
		getChangePassBTN_LP().click();
		getNewPassBox_LP().sendKeys(arg0);
		getRetypeNewPass_LP().sendKeys(arg1);
		getChangeCredentialsBTB_LP().click();

	}

	public void openNotices(){
		getNotifisBTN_LP().click();
	}

	public void isNoticesWindowDisplayed() throws Exception {
		Thread.sleep(3000);
		elementControl.isElementVisible(noticesWin_LP);
		boolean notificationWindowIsDisplayed = getNoticesWin_LP().isDisplayed();
		Assert.assertTrue(notificationWindowIsDisplayed);
	}

	public void createArticle(String arg0){
		getSandbox_BTN().click();
		getEditSource_BTN().click();
		getTextBox().clear();
		getTextBox().sendKeys(arg0);

	}

	public void publishArticle(){
		getPublish_BTN().click();
	}



}