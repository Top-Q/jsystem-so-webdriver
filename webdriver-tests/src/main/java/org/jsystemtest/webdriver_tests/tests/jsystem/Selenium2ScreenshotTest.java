package org.jsystemtest.webdriver_tests.tests.jsystem;

import jsystem.framework.TestProperties;

import org.jsystemtest.webdriver_tests.example.pages.google.GooglePage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium2ScreenshotTest extends AbstractWebDriverTest {
	
	public GooglePage page;
	
	@Before
	public void setUp() throws Exception {
		super.setUp();
		
		//static init of the page with all the elements outside the class
		page = PageFactory.initElements(driver, GooglePage.class);
	}
	
	@Test
	@TestProperties()
	public void googleCheese() throws Exception{
		
		
        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());
        
        
        takeScreenshot("Before Submit");
        
        //use the page from the page factory
        //type for the search term and submit
		page.searchFor("Cheese!");
		
		takeScreenshot("After Submit");
		
        
        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("cheese!");
            }
        });

        // Should see: "cheese! - Google Search"
        System.out.println("Page title is: " + driver.getTitle());
      
		
	}

}
