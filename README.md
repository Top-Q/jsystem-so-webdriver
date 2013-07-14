jsystem-so-webdriver
====================

Maven Jsystem driver that help you init Webdriver for external xml file (SUT file). 
the main feature are: 

<ul>
  <li>plug and play</li>
  <li>init the browsers in a simple way (no need to download additional files e.g. IeDriverServer.exe that required in case of IE).</li>
  <li>Save the browser state between tests</li>
  <li>close the browsers after the execution </li>
  <li>built-in support in <a href='https://code.google.com/p/selenium/wiki/PageObjects'>Page Object pattern</a></li>
  <li>automatic logging (on each action) without changing your code</li>
  <li>automatic screenshot(on each action)without changing your code  </li>
  <li>this module include "webdriver-tests" project, with usage examples ,see <a href='https://github.com/Top-Q/jsystem-so-webdriver/tree/master/webdriver-tests'>webdriver-tests</a></li>
</ul>


====================
###Usage


To use via Maven:

```xml
<repositories>
  <repository>
		<id>topq</id>
		<url>http://maven.top-q.co.il/content/groups/public</url>
	</repository>
</repositories>

<dependency>
	<groupId>org.jsystemtest.systemobjects</groupId>
	<artifactId>webdriver-so</artifactId>
	<version>1.0.10</version>
</dependency>
```


System Under Test(A.K.A SUT file)example(for chrome):

```xml
<?xml version="1.0" encoding="UTF-8"?>
<sut validators="">
  <webDriverSystemObject>
		<class>org.jsystem.webdriver_so.WebDriverSystemObject</class>
		<webDriver>CHROME_DRIVER</webDriver>
		<domain>http://www.top-q.co.il/</domain>
		<seleniumTimeOut>30000</seleniumTimeOut>
		<chromeFlags>--disable-translate,--enable-password-generation</chromeFlags>
	</webDriverSystemObject>
</sut>
```

Test Code Example (init the browser by the SUT file)

```java
 package org.jsystemtest.webdriver_tests.tests.jsystem;

import java.util.List;

import junit.framework.SystemTestCase4;

import org.jsystem.webdriver_so.WebDriverSystemObject;
import org.jsystem.webdriver_so.eventlistener.WebDriverScreenshotEventHandler;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

public  class webDriverTest  extends SystemTestCase4 {

  protected WebDriver driver;
	protected WebDriverSystemObject seleniumSystemObject;
	
	@Before
	public void setUp() throws Exception {
		
		seleniumSystemObject = (WebDriverSystemObject) system.getSystemObject("webDriverSystemObject");
		driver=seleniumSystemObject.getDriver();
	}
	
	@Test
	public void googleCheese() throws Exception{
		
		// And now use this to visit Google
		// Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");
        driver.get("http://www.google.com");
        
        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));
       
        // Enter something to search for
        element.sendKeys("Cheese!");

        // Now submit the form. WebDriver will find the form for us from the element
        element.submit();
        
        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("cheese!");
            }
        });

        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());
      		
	}
}

```




