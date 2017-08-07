package TestCases;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import app.page.objects.AboutPage;
import app.page.objects.HomePage;
import app.page.objects.ServicesPage;
import app.page.objects.WorkPage;

public class TestCase_Navigation extends BaseWebDriver {
	
	private HomePage homePage;
	
	@Before
	public void LocalSetup() {
	
		homePage = new HomePage(driver);
	}
	
	
	@Test
	public void WhenOnAboutPage_TitleDisplayedCorrectly() {
		
		AboutPage aboutPage = homePage.navigateTo.About();		
	
		String title = aboutPage.Title.Read();
		
		assertEquals("About",title); 
	}
	
	@Test
	public void WhenOnServicesPage_TitleDisplayedCorrectly() {
		
		ServicesPage servicesPage = homePage.navigateTo.Services();		
	
		String title = servicesPage.Title.Read();
		
		assertEquals("Services",title); 
	}
	
	@Test
	public void WhenOnWorkPage_TitleDisplayedCorrectly() {
		
		WorkPage workPage = homePage.navigateTo.Work();		
	
		String title = workPage.Title.Read();
		
		assertEquals("Work",title); 
	}
}
