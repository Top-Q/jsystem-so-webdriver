package org.jsystem.webdriver_so.generators;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitWebDriverGenerator implements WebDriverGenerator {

	@Override
	public WebDriver getWebDriver(WebDriverConfiguration config) throws FileNotFoundException {
		return new HtmlUnitDriver();
	}

}
