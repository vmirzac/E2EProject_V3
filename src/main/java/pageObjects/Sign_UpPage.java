package pageObjects;

import PageObjectUtils.BasicOperations;
import cucumber.api.DataTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class Sign_UpPage extends BasicOperations {
    public WebDriver driver;

    @FindBy(xpath = "//*[@id=\"wpName2\"]")
    WebElement username_SUP;

    @FindBy(xpath = "//*[@id=\"wpPassword2\"]")
    WebElement password_SUP;

    @FindBy(xpath = "//*[@id=\"wpRetype\"]")
    WebElement retypePassSUP;

    @FindBy(xpath = "//*[@id=\"wpEmail\"]")
    WebElement emailSup;

    @FindBy(xpath = "//*[@id=\"mw-input-captchaWord\"]")
    WebElement captchaSUP;

    @FindBy(xpath = "//*[@id=\"wpCreateaccount\"]")
    WebElement createAccountBTN_SUP;

    @FindBy(xpath = "//p[contains(text(),'Incorrect or missing CAPTCHA.')]")
    WebElement errorMessage_SUP;




    public Sign_UpPage(WebDriver driver) {
        super(driver);

        this.driver = driver;
        PageFactory.initElements(driver, this);



    }

    public WebElement getUsername_SUP(){
        return username_SUP;
    }
    public WebElement getPassword_SUP(){
        return password_SUP;

    }
    public WebElement getRetypePassSUP(){
        return retypePassSUP;
    }

    public WebElement getErrorMessage_SUP(){
        return errorMessage_SUP;
    }



    public WebElement getEmailSup(){
        return emailSup;
    }
    public WebElement getCaptchaSUP(){
        return captchaSUP;
}

    public WebElement getCreateAccountBTN_SUP(){
        return createAccountBTN_SUP;
    }



    public void enterInvalidCredentials(DataTable table){

        List<List<String>> data = table.raw();

        System.out.println(data.get(1).get(1));

        getUsername_SUP().sendKeys(data.get(1).get(1));
        getPassword_SUP().sendKeys(data.get(2).get(1));
        getRetypePassSUP().sendKeys(data.get(3).get(1));
        getEmailSup().sendKeys(data.get(4).get(1));
        getCaptchaSUP().sendKeys(data.get(5).get(1));
        getCreateAccountBTN_SUP().click();
    }

    public void errorMessageDisplayed(){
        boolean isErrorDisplayed_SUP = getErrorMessage_SUP().isDisplayed();
        Assert.assertTrue(isErrorDisplayed_SUP);

    }


}

