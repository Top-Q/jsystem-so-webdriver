package org.jsystem.webdriver_so.generators;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.android.AndroidDriver;

public class AndroidWebDriverGenerator implements WebDriverGenerator {

	@Override
	public WebDriver getWebDriver(WebDriverConfiguration config) throws FileNotFoundException {
		return new AndroidDriver();
	}

}
