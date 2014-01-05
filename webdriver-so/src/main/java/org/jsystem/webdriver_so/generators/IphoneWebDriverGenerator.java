package org.jsystem.webdriver_so.generators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.iphone.IPhoneDriver;

@SuppressWarnings("deprecation")
public class IphoneWebDriverGenerator implements WebDriverGenerator {

	@Override
	public WebDriver getWebDriver(WebDriverConfiguration config) throws Exception {

		return new IPhoneDriver();
	}

}
