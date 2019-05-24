package pageObjects;

import commonLibs.implementation.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pagesUtils_toDelete.BasicOperations;

public class LandingPage extends BasicOperations {

	
	public WebDriver driver;
	Driver cmnDriver;

	// Wikipedia
	@FindBy(id = "searchInput")
	WebElement searchInputMP;

	@FindBy(xpath = "//*[@id=\"js-link-box-en\"]/strong")
	WebElement englishBTN_MP;

	@FindBy(xpath = "//*[@id=\"search-form\"]/fieldset/button/i")
	WebElement searchButtonMP;

	@FindBy(xpath = "//*[@id=\"search-form\"]/fieldset/button/i")
	WebElement en;



	
	
	public LandingPage(WebDriver driver) {
		super(driver);

		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

//	public WebElement searchInputMP()
//	{
//		return searchInputMP;
//	}
//
//	public WebElement englishBTN_MP(){
//		return englishBTN_MP;
//	}
//
//	public WebElement getSearchButtonMP(){
//		return searchButtonMP;
//	}


	public void searchArticleLandingPage(String searchItem) throws Exception{

//		elementControl.click(searchInputMP);
		textboxControl.clearText(searchInputMP);
		textboxControl.setText(searchInputMP, searchItem);
		elementControl.click(searchButtonMP);

	}

	public void navigateToLandingPage() throws Exception {
		cmnDriver.navigateToUrl("https://www.wikipedia.org");
	}




}

