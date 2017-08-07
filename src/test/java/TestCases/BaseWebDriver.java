package TestCases;

import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BaseWebDriver {
	
	protected static WebDriver driver;
	
	@Before
	public void Setup() {
		
		URL resource = getClass().getResource("/chromedriver.exe");
		String path = resource.getPath();
		
		System.setProperty("webdriver.chrome.driver", path);
		
		driver = new ChromeDriver();
		
		driver.get("http://valtech.com");
	}
	
	@After
    public void TearDown() {
       
		driver.close();
        driver.quit();
    }
}
