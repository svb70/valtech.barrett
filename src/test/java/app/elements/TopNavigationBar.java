package app.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import app.page.objects.AboutPage;
import app.page.objects.ContactPage;
import app.page.objects.ServicesPage;
import app.page.objects.WorkPage;

public class TopNavigationBar extends Element {
	
	Link About;
	Link Services;
	Link Work;
	Link MenuToggle; 
	Link ContactToggle;

	public TopNavigationBar(WebDriver driver, By locator) {
		super(driver, locator);
		
		MenuToggle = new Link(driver,By.id("menu-toggle-button"));
		ContactToggle = new Link(driver,By.id("contacticon"));
		About = new Link(driver,By.linkText("ABOUT"));
		Services = new Link(driver,By.linkText("SERVICES"));
		Work = new Link(driver,By.linkText("WORK"));
	}
	
	public AboutPage About() {
		MenuToggle.Click();
		About.Click();
		
		return new AboutPage(this._driver);
	}
	
	public ServicesPage Services() {
		MenuToggle.Click();
		Services.Click();
		
		return new ServicesPage(this._driver);
	}
	
	public WorkPage Work() {
		MenuToggle.Click();
		Work.Click();
		
		return new WorkPage(this._driver);
	}
	
	public ContactPage Contact() {
		ContactToggle.Click();
				
		return new ContactPage(this._driver);
	}
}
