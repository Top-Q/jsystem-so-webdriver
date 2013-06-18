package org.jsystemtest.webdriver_tests.tests.jsystem;

import junit.framework.SystemTestCase4;

import org.jsystem.webdriver_so.WebDriverSystemObject;
import org.jsystemtest.webdriver_tests.example.pages.facebook.home.FacebookHomePageInterface;
import org.jsystemtest.webdriver_tests.example.pages.facebook.login.FacebookLoginPage;
import org.jsystemtest.webdriver_tests.example.pages.facebook.login.FacebookLoginPageInterface;
import org.jsystemtest.webdriver_tests.example.pages.facebook.profile.FacebookProfilePageInterface;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class FacebookPageObjectExample extends SystemTestCase4 {

	private WebDriver driver;
	protected WebDriverSystemObject seleniumSystemObject;
	
	@Before
	public void setUp() throws Exception {
		
		seleniumSystemObject = (WebDriverSystemObject) system.getSystemObject("webDriverSystemObject");
		driver=seleniumSystemObject.getDriver();
	}
	
	@Test
	public void facebookTest(){
		
		//1.Navigate to facebook
		FacebookLoginPageInterface loginPage = new FacebookLoginPage(driver);
		

		//2.login
		FacebookHomePageInterface homePage = loginPage.login("****SomeUserName*****", "***SomePassword*****");
		

		//3.navigate to facebook profile
		FacebookProfilePageInterface navigateToProfile = homePage.navigateToProfile();

		//4.logout
	}
	
	
	
	
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//
//
//		//1.Navigate to facebook
//		FacebookLoginPageInterface loginPage = new FacebookLoginPage(new FirefoxDriver());
//		
//
//		//2.login
//		FacebookHomePageInterface homePage = loginPage.login("sheilakuehn0190@hotmail.com", "agora1234");
//		
//
//		//3.navigate to facebook profile
//		FacebookProfilePageInterface navigateToProfile = homePage.navigateToProfile();
//
//		//4.logout
//
//	}

}
