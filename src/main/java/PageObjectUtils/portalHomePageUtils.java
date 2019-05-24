package PageObjectUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//rahulonlinetutor@gmail.com
public class portalHomePageUtils {

	
	public WebDriver driver;
	
	By searchBox=By.name("query");
	
	
	
	
	
	public portalHomePageUtils(WebDriver driver) {

		this.driver=driver;
		
	}




	
	public WebElement getSearchBox()
	{
		return driver.findElement(searchBox);
	}
	
	
	
}
