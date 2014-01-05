package org.jsystem.webdriver_so.generators;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariWebDriverGenerator implements WebDriverGenerator {

	@Override
	public WebDriver getWebDriver(WebDriverConfiguration config) throws FileNotFoundException, Exception {
		return new SafariDriver();
	}

}
