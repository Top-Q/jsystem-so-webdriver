package org.jsystem.webdriver_so.generators;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FirefoxWebDriverGenerator implements WebDriverGenerator {

	@Override
	public WebDriver getWebDriver(WebDriverConfiguration config) throws FileNotFoundException {
		System.setProperty("webdriver.firefox.bin", config.getExecutable());
		File pathToFirefoxBinary = new File(config.getExecutable());
		FirefoxBinary ffBinary = new FirefoxBinary(pathToFirefoxBinary);

		return new FirefoxDriver(ffBinary, getFirefoxConfigurationProfile(config));
	}

	/**
	 * Generate a {@link FirefoxProfile} profile using the configuration given
	 * 
	 * @param config
	 * @return
	 * @throws FileNotFoundException
	 *             when either the profile or extension does not exist in the
	 *             file system
	 * @throws IllegalArgumentException
	 *             when the extension is not valid
	 */
	protected FirefoxProfile getFirefoxConfigurationProfile(WebDriverConfiguration config) throws FileNotFoundException {
		File extention = null;
		FirefoxProfile profile = null;

		if (config.getProfile() != null) {
			File profileLib = new File(config.getProfile());
			if (profileLib != null && !profileLib.exists() || profileLib == null) {
				throw new FileNotFoundException("Failed to find firefox profile. is the path: does "
						+ config.getProfile() + " contain the profile?");
			}
			profile = new FirefoxProfile(profileLib);
		}

		if (config.getExtension() != null) {
			if (null == profile) {
				profile = new FirefoxProfile();
			}
			extention = new File(config.getExtension());
			if (!extention.exists()) {
				throw new FileNotFoundException("Failed to find firefox Extension. is the path: does "
						+ config.getExtension() + " contains the .xpi extantion?");
			}
			try {

				profile.addExtension(extention);
			} catch (IOException e) {
				throw new IllegalArgumentException("Failed to start firefox with the extension " + extention
						+ ". is the path: does " + extention + " contain a firefox Extension?", e);
			}
		}
		if (config.isIgnoreCertificateErrors()) {
			if (null == profile) {
				profile = new FirefoxProfile();
			}
			profile.setAcceptUntrustedCertificates(config.isIgnoreCertificateErrors());
		}

		if (profile != null) {
			Boolean enableNativeEvent = config.isEnableNativeEvent();
			if (enableNativeEvent != null) {
				profile.setEnableNativeEvents(true);
			}
		}

		return profile;
	}

}
