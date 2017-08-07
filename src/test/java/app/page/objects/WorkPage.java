package app.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import app.elements.Label;
import app.elements.Link;
import app.elements.TopNavigationBar;

public class WorkPage extends BasePage {

	
	public Label Title;
	
	
	public WorkPage(WebDriver driver) {
		super(driver);
		
		Title = new Label(driver,By.tagName("h1"));
		
	}
	
}
