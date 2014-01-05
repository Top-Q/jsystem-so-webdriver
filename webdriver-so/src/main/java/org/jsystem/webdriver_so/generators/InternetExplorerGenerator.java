package org.jsystem.webdriver_so.generators;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class InternetExplorerGenerator implements WebDriverGenerator {

	@Override
	public WebDriver getWebDriver(WebDriverConfiguration config) throws FileNotFoundException {
		WebDriver webDriver = null;
		try {
			System.setProperty("webdriver.ie.driver", config.getExecutable());
			DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
			ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			if (config.isIgnoreCertificateErrors()) {
				ieCapabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			}
			webDriver = new InternetExplorerDriver(ieCapabilities);
		} catch (Exception e) {
			webDriver = new InternetExplorerDriver();
		}
		return webDriver;
	}

}
