package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


	public WebDriver driver;

	@FindBy(xpath = "//input[@id='wpName1']")
	WebElement usernameBox_LP;

	@FindBy(xpath = "//input[@id='wpPassword1']")
	WebElement passwordBox_LP;

	@FindBy(xpath = "//button[@id='wpLoginAttempt']")
	WebElement loginBTN_LP;

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

	@FindBy(id = "ooui-3")
	WebElement  appearanceBTN_LP;

	@FindBy(id = "ooui-php-48")
	WebElement  cologneBlueRBTN_LP;

	@FindBy(id = "mw-prefs-restoreprefs")
	WebElement  restorePrefs_LP;

	@FindBy(id = "ooui-11")
	WebElement  searchBTN_LP;

	@FindBy(id = "ooui-php-192")
	WebElement  noAdvancedSearch_LP;

	@FindBy(id = "pt-notifications-notice")
	WebElement  notifisBTN_LP;

	@FindBy(xpath = "//span[contains(text(),'Notices')]")
	WebElement noticesWin_LP;

	@FindBy(id = "ooui-9")
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

	@FindBy(id = "t-emailuser")
	WebElement  emailUserBTN;

	@FindBy(id = "ooui-php-2")
	WebElement  messageBox;

	@FindBy(id = "ooui-php-11")
	WebElement  sendMessageBTN;

	@FindBy(id = "ooui-php-1")
	WebElement  restoreDefsConfirmationBTN;







	public LoginPage(WebDriver driver) {

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

	public WebElement getRestorePrefs_LP(){
		return restorePrefs_LP;
	}

	public WebElement getSearchBTN_LP(){
		return searchBTN_LP;
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



}