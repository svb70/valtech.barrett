package app.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Label extends Element {

	public Label(WebDriver driver, By locator) {
		super(driver, locator);
		
	}
	
	public String Read()
    {		
		return GetElement().getText();
    }

}
