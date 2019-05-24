package pageObjects;

import PageObjectUtils.BasicOperations;
import commonLibs.utils.WaitUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class English_MainPage extends BasicOperations {


    public WebDriver driver;

    @FindBy(xpath = "//a[@title='Castravete – Romanian']")
    WebElement romanianBTB_EMP;

    @FindBy(xpath = "//input[@id='searchInput']")
    WebElement searchInput_EMP;

    @FindBy(xpath = "//input[@id='searchButton']")
    WebElement searchBTN_EMP;

    @FindBy(id = "pt-login")
    WebElement loginBTN_EMP;

    @FindBy(xpath = "//a[@class='noprint stopMobileRedirectToggle']")
    WebElement mobileViewBTN_EMP;

    @FindBy(id = "n-randompage")
    WebElement randomArticle_EMP;

    @FindBy(xpath = "//a[@class='external text'][contains(text(),'Wikibooks')]")
    WebElement wikibooksBTN;

    @FindBy(id = "wpName1")
    WebElement username_Login;

    @FindBy(id = "wpPassword1")
    WebElement password_Login;

    @FindBy(id = "wpLoginAttempt")
    WebElement loginBTN_login;


    public English_MainPage(WebDriver driver) {
        super(driver);

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public WebElement getRomanianBTB_EMP() {
        return romanianBTB_EMP;
    }

    public WebElement getSearchBTN_EMP() {
        return searchBTN_EMP;
    }

    public WebElement getLoginBTN_EMP() {
        return loginBTN_EMP;
    }

    public WebElement getMobileViewBTN_EMP() {
        return mobileViewBTN_EMP;
    }

    public WebElement getRandomArticle_EMP() {
        return randomArticle_EMP;
    }

    public WebElement getWikibooksBTN() {
        return wikibooksBTN;
    }

    public WebElement getUsername_Login() {
        return username_Login;
    }

    public WebElement getPassword_Login() {
        return password_Login;
    }

    public WebElement getLoginBTN_login() {
        return loginBTN_login;
    }
    public WebElement getSearchInput_EMP() {
        return searchInput_EMP;
    }


    public void userLogin(String username, String password) throws Exception {


        elementControl.click(loginBTN_EMP);

        WaitUtils.waitTillElementVisible(driver, username_Login, 5);
        textboxControl.clearText(username_Login);

        textboxControl.setText(username_Login, username);

        WaitUtils.waitTillElementVisible(driver, password_Login, 5);
        textboxControl.setText(password_Login, password);

        elementControl.click(loginBTN_login);

    }


    public void navigateToEMP(String websiteName) {
        websiteName = "https://en.wikipedia.org/wiki/Main_Page";
        driver.navigate().to(websiteName);

    }

    public void navigateToWikibooks() {
        getWikibooksBTN().click();
    }

    public void changeLanguageEN_RO() {
        getRomanianBTB_EMP().click();
    }

    public void swithToMobileView() {
        getMobileViewBTN_EMP().click();
    }

    public void selectRandomArticle(){
        getRandomArticle_EMP().click();
    }

    public void searchArticleEMP(String searchItem) throws Exception{

//		elementControl.click(searchInputMP);
//        textboxControl.clearText(searchInput_EMP);
        textboxControl.setText(searchInput_EMP, searchItem);
        elementControl.click(searchBTN_EMP);

    }


}