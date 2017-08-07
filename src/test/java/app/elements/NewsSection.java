package app.elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import app.page.objects.AboutPage;
import app.page.objects.ServicesPage;
import app.page.objects.WorkPage;

public class NewsSection extends Element {
	
	Label Header;
	List<Element> Children;

	public NewsSection(WebDriver driver, By locator) {
		super(driver, locator);
		
		Header = new Label(driver,By.className("news-post__listing-header"));
		
	}
	
	public boolean IsHeaderDisplayed() {
		return Header.IsElementDisplayed();
	}
	
	public boolean HasPosts() {
		
		WebElement element = this._driver.findElement(By.className("news-post__listing"));
		
		List<WebElement> children = element.findElements(By.className("bloglisting-compact"));
		
		return children.size() > 0;
	}
	
	
}
