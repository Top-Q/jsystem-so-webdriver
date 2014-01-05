package org.jsystem.webdriver_so.generators;

import java.io.FileNotFoundException;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.android.AndroidDriver;

public interface WebDriverGenerator {
	/**
	 * Generate a {@link WebDriver} using the given configuration
	 * @param config
	 * @return
	 * @throws FileNotFoundException
	 * when either the {@link WebDriverConfiguration#getExecutable()},
	 *  {@link WebDriverConfiguration#getProfile()} or {@link WebDriverConfiguration#getExtension()} does not exist in the file system
	 * @throws Exception 
	 * on some drivers that does not provide specific exception
	 * @throws IllegalArgumentException
	 *  when the extension is not valid, or any other parameter is not valid
	 */
	public WebDriver getWebDriver(WebDriverConfiguration config) throws FileNotFoundException, Exception;
}
