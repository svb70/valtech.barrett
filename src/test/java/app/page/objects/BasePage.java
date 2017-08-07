package app.page.objects;

import org.openqa.selenium.WebDriver;

public class BasePage {

	public static WebDriver _driver;
	
	public BasePage(WebDriver driver) {
	
		this._driver = driver;
		
	}
}
