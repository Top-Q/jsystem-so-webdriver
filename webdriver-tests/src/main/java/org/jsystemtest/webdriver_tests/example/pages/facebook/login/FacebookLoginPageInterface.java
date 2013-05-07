package org.jsystemtest.webdriver_tests.example.pages.facebook.login;

import org.jsystemtest.webdriver_tests.example.pages.facebook.home.FacebookHomePageInterface;

public interface FacebookLoginPageInterface {
	
	public FacebookHomePageInterface login(String userEmail,String userPassword);

}
