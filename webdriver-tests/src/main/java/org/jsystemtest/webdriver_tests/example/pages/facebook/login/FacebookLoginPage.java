package org.jsystemtest.webdriver_tests.example.pages.facebook.login;

import org.jsystemtest.webdriver_tests.example.pages.common.AbstractPage;
import org.jsystemtest.webdriver_tests.example.pages.facebook.home.FacebookHomePage;
import org.jsystemtest.webdriver_tests.example.pages.facebook.home.FacebookHomePageInterface;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage extends AbstractPage implements FacebookLoginPageInterface {

	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(id="loginbutton")
	private WebElement loginbutton;
	

	
	public FacebookLoginPage(WebDriver driver) {
		super(driver);
		driver.navigate().to("http://www.facebook.com");
		PageFactory.initElements(driver,this);		
		
	}

	public FacebookHomePageInterface login(String userEmail, String userPassword) {
		
		email.sendKeys(userEmail);
		
		password.sendKeys(userPassword);
		
		loginbutton.click();
		
		
		return new FacebookHomePage(driver);
		
	}

	@Override
	public boolean isInModule() {
		return driver.getCurrentUrl().contains("facebook.com");
	}

}
