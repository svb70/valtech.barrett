package app.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Link extends Element {

	public Link(WebDriver driver, By locator){
		super(driver, locator);
	}

	public void Click()
    {		
		
		WebElement element = GetElement();
        	
		element.click();
    }
}
