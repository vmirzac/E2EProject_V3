package PageObjectUtils;

import commonLibs.implementation.ElementHandling;
import commonLibs.implementation.MouseOperations;
import commonLibs.implementation.TextboxControls;
import org.openqa.selenium.WebDriver;

public class BasicOperations {
	public ElementHandling elementControl;
	public TextboxControls textboxControl;
	public MouseOperations mouseControl;
	public WebDriver driver;

	public BasicOperations(WebDriver driver) {
		elementControl = new ElementHandling();
		textboxControl = new TextboxControls();
		mouseControl = new MouseOperations(driver);
	}
}
