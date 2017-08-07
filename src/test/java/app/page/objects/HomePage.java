package app.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import app.elements.Label;
import app.elements.Link;
import app.elements.NewsSection;
import app.elements.TopNavigationBar;

public class HomePage extends BasePage {

	public TopNavigationBar navigateTo;
	public Label Title;
	public Link About;
	public NewsSection LatestNews;
	
	public HomePage(WebDriver driver) {
		super(driver);
		
		navigateTo = new TopNavigationBar(driver,By.className("navigation__menu"));
		LatestNews = new NewsSection(driver, By.className("bloglisting news-post__listing"));
	}
	
}


