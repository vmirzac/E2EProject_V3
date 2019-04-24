package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	
	public WebDriver driver;

	// Wikipedia
	@FindBy(id = "searchInput")
	WebElement searchButtonMP;

	@FindBy(xpath = "//*[@id=\"js-link-box-en\"]/strong")
	WebElement englishBTN_MP;



	
	
	public LandingPage(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement searchButtonMP()
	{
		return searchButtonMP;
	}

	public WebElement englishBTN_MP(){
		return englishBTN_MP;
	}



	
	
	
}
