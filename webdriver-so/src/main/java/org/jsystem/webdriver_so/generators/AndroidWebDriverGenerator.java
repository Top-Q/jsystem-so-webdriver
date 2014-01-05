package org.jsystem.webdriver_so.generators;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.android.AndroidDriver;

public class AndroidWebDriverGenerator implements WebDriverGenerator {

	@Override
	public WebDriver getWebDriver(WebDriverConfiguration config) throws FileNotFoundException, Exception {
		return new AndroidDriver(new URL(config.getRemoteAddress()));
	}

}
