package PageObjectUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class English_MainPageUtils {


    public WebDriver driver;

    @FindBy(xpath = "//a[@title='Castravete – Romanian']")
    WebElement romanianBTB_EMP;

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




    public English_MainPageUtils(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public WebElement getRomanianBTB_EMP() {
        return romanianBTB_EMP;
    }
    public WebElement getSearchBTN_EMP(){
        return searchBTN_EMP;
    }
    public WebElement getLoginBTN_EMP(){
        return loginBTN_EMP;
    }
    public WebElement getMobileViewBTN_EMP(){
        return mobileViewBTN_EMP;
    }

    public WebElement getRandomArticle_EMP(){
        return randomArticle_EMP;
    }

    public WebElement getWikibooksBTN(){
        return wikibooksBTN;
    }
}