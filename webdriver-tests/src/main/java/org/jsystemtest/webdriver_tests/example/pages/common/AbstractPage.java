package org.jsystemtest.webdriver_tests.example.pages.common;
import org.openqa.selenium.WebDriver;


public abstract class AbstractPage {
	
	protected WebDriver driver;
	
	public AbstractPage(WebDriver driver){
		this.driver=driver;
	}

	public WebDriver getDriver() {
		return driver;
	}
	
	public  abstract boolean  isInModule();
}
