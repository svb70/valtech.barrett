package app.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import app.elements.ContactSection;
import app.elements.Label;
import app.elements.Link;
import app.elements.TopNavigationBar;

public class ContactPage extends BasePage {

	
	public Label Title;
	
	public ContactSection OfficesSection;
	
	public ContactPage(WebDriver driver) {
		super(driver);
		
		Title = new Label(driver,By.tagName("h1"));
		OfficesSection = new ContactSection(driver, By.className("contactbody"));
	}
	
}
