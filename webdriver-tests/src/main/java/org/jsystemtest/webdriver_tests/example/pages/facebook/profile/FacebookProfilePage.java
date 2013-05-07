package org.jsystemtest.webdriver_tests.example.pages.facebook.profile;

import org.jsystemtest.webdriver_tests.example.pages.common.AbstractPage;
import org.jsystemtest.webdriver_tests.example.pages.facebook.login.FacebookLoginPageInterface;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookProfilePage extends AbstractPage implements FacebookProfilePageInterface{

	
	@FindBy(id="userNavigationLabel")
	private WebElement navigationLabel;
	
	
	public FacebookProfilePage(WebDriver driver) {
		super(driver);
		
	
	}

	public boolean isInModule() {
		// TODO Auto-generated method stub
		return true;
	}

	public FacebookLoginPageInterface logout() {
		
		FacebookLoginPageInterface loginPage =null;
		navigationLabel.click();
		//click on logout
		return loginPage;
	}

}
