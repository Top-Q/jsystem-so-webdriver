package org.jsystemtest.webdriver_tests.tests;

import java.util.List;

import junit.framework.SystemTestCase4;

import org.jsystem.webdriver_so.WebDriverSystemObject;
import org.jsystem.webdriver_so.eventlistener.WebDriverScreenshotEventHandler;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public abstract class AbstractWebDriverTest  extends SystemTestCase4 {

	protected WebDriver driver;
	protected WebDriverSystemObject seleniumSystemObject;
	
	@Before
	public void setUp() throws Exception {
		
		seleniumSystemObject = (WebDriverSystemObject) system.getSystemObject("webDriverSystemObject");
		driver=seleniumSystemObject.getDriver();
	}
	
	protected void takeScreenshot(String title){
		List<WebDriverEventListener> allRegisteredWebDriverEventListeners = seleniumSystemObject.getAllRegisteredWebDriverEventListeners();
		for (WebDriverEventListener webDriverEventListener : allRegisteredWebDriverEventListeners) {
			if (webDriverEventListener instanceof WebDriverScreenshotEventHandler ){
				WebDriverScreenshotEventHandler screenshot =(WebDriverScreenshotEventHandler)webDriverEventListener; // safe cast
				screenshot.takeScreenshot(driver, title);
				break;
			}
		}
	}
}
