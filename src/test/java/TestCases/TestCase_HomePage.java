package TestCases;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import Categories.HomePageCategory;

import app.page.objects.HomePage;


@Category(HomePageCategory.class)
public class TestCase_HomePage extends BaseWebDriver {
	
	private HomePage homePage;
	
	@Before
	public void LocalSetup() {
	
		homePage = new HomePage(driver);
	}
	
	@Test
	public void WhenOnHomePage_LatestNewsDisplayedCorrectly() {
		
		assertTrue(homePage.LatestNews.IsHeaderDisplayed()); 
		
		assertTrue(homePage.LatestNews.HasPosts());
	}
	
	
}
