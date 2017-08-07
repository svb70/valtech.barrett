package steps;

import static org.junit.Assert.assertTrue;

import java.net.URL;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import TestCases.BaseWebDriver;
import app.page.objects.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class homePageSteps {
	
	HomePage homePage;
	WebDriver driver;
	
	@Before
	public void Setup() {
		URL resource = getClass().getResource("/chromedriver.exe");
		String path = resource.getPath();
		
		System.setProperty("webdriver.chrome.driver", path);
		
		driver = new ChromeDriver();
		
		driver.get("http://valtech.com");
		
		homePage = new HomePage(driver);
	}
	
	@After
    public void TearDown() {
       
		driver.close();
        driver.quit();
    }

	@Given("^I navigate to the home page$")
	public void i_navigate_to_the_home_page() throws Throwable {}

	@Then("^the page title is \"([^\"]*)\"$")
	public void the_page_title_is(String arg1) throws Throwable {
	  
	    System.out.println("checking page title");
	}
	
		
	@Then("^the latest news header is displayed$")
	public void the_latest_news_header_is_displayed() throws Throwable {
		assertTrue(homePage.LatestNews.IsHeaderDisplayed());
	}

	@Then("^blogpost items exist$")
	public void blogpost_items_exist() throws Throwable {
		assertTrue(homePage.LatestNews.HasPosts());
	}
}
