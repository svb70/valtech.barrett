package app.elements;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import app.page.objects.AboutPage;
import app.page.objects.ServicesPage;
import app.page.objects.WorkPage;

public class ContactSection extends Element {
	
	
	List<Element> Children;

	public ContactSection(WebDriver driver, By locator) {
		super(driver, locator);
		
			
	}
	
	public int CountryCount() {
		
		WebElement element = this._driver.findElement(this._locator);
		
		List<WebElement> children = element.findElements(By.className("contactcountry"));
		
		return children.size();
	}
	
	public int OfficeCount() {
		
		int count = 0;
		
		WebElement element = this._driver.findElement(this._locator);
		
		List<WebElement> children = element.findElements(By.className("contactcities"));
		
		for(int i = 0;i < children.size();i++) {
			
			List<WebElement> items = children.get(i).findElements(By.tagName("li"));
			
			count = count + items.size();
		}
		
		return count;
	}
	
	
	
	
}
