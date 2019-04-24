package PageObjectUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_UpPageUtils {
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


    public Sign_UpPageUtils(WebDriver driver) {

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

    public WebElement getEmailSup(){
        return emailSup;
    }
    public WebElement getCaptchaSUP(){
        return captchaSUP;
}

    public WebElement getCreateAccountBTN_SUP(){
        return createAccountBTN_SUP;
    }



}

