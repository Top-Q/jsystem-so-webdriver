package org.jsystem.webdriver_so.generators;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.android.AndroidDriver;

public interface WebDriverGenerator {
	
	public WebDriver getWebDriver(WebDriverConfiguration config);
}
