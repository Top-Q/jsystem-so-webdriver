package org.jsystemtest.webdriver_tests.example.pages.facebook.home;

import org.jsystemtest.webdriver_tests.example.pages.common.AbstractPage;
import org.jsystemtest.webdriver_tests.example.pages.facebook.profile.FacebookProfilePageInterface;
import org.openqa.selenium.WebDriver;

public class FacebookHomePage extends AbstractPage implements FacebookHomePageInterface{

	public FacebookHomePage(WebDriver driver) {
		super(driver);
	}

	public FacebookProfilePageInterface navigateToProfile() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isInModule() {
		// TODO Auto-generated method stub
		return false;
	}

}
