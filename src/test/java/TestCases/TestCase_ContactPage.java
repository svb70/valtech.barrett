package TestCases;

import static org.junit.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import app.page.objects.ContactPage;
import app.page.objects.HomePage;

public class TestCase_ContactPage extends BaseWebDriver {
	
	private static final Logger log = LogManager.getLogger(TestCase_ContactPage.class);
	
	private HomePage homePage;
	
	@Before
	public void LocalSetup() {
	
		homePage = new HomePage(driver);
	}
	
	
	@Test
	public void WhenOnHomePage_LatestNewsDisplayedCorrectly() {
		
		ContactPage contactPage = homePage.navigateTo.Contact();
		
		int countryCount = contactPage.OfficesSection.CountryCount();
		int officeCount = contactPage.OfficesSection.OfficeCount();
		
		log.info("There are " + officeCount + " offices, in " + countryCount + " countries.");
		
		assertTrue(officeCount == 36);
	}
	
	
	
}
