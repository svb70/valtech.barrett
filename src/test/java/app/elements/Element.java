package app.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Element {

	WebDriver _driver;
	By _locator;
	
	public Element(WebDriver driver, By locator){
        _driver = driver;
        _locator = locator;
    }
	
	public WebElement FindElement(){
			
		return _driver.findElement(_locator);
	}
	
	public WebElement GetElement(){
        WebDriverWait wait = new WebDriverWait(_driver,10);
        
        WebElement element = FindElement();
        try {
            wait.until((ExpectedCondition<Boolean>) wd -> element.isDisplayed());
            return element;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
	
	public boolean IsElementDisplayed(){
        WebDriverWait wait = new WebDriverWait(_driver,10);
        
        WebElement element = GetElement();
        try {
            wait.until((ExpectedCondition<Boolean>) wd -> element.isDisplayed());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
