package org.jsystem.webdriver_so.generators;

import java.io.FileNotFoundException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class OperaWebDriverGenerator implements WebDriverGenerator {

	@Override
	public WebDriver getWebDriver(WebDriverConfiguration config) throws FileNotFoundException, Exception {
		DesiredCapabilities operaCapabilities = DesiredCapabilities.opera();
		operaCapabilities.setCapability("opera.binary", config.getExecutable());
		operaCapabilities.setCapability("opera.profile", config.getProfile());
		if (config.getRemoteAddress()==null){
			return new RemoteWebDriver(new URL("http://localhost:9515"), operaCapabilities);
		}
		return new RemoteWebDriver(new URL(config.getRemoteAddress()), operaCapabilities);
	}

}
