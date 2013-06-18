package org.jsystemtest.webdriver_tests.tests.non_jsystem;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * @author LielRan
 *
 */
public class WebDriverExample {

	
	private static WebDriver driver;
	private static String q ="the the - slow emotion replay";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		setup();
		
		driver.navigate().to("http://www.youtube.com/");
		
		WebElement searchQuery = driver.findElement(By.name("search_query"));
		
		searchQuery.sendKeys(q);
		
		searchQuery.submit();
		
		WebElement resultsDiv = driver.findElement(By.id("search-results"));
		
		List<WebElement> resultsList = resultsDiv.findElements(By.className("result-item"));
		
		System.out.println("found "+resultsList.size()+ " results in the front page." );
		
		if(resultsList.size()>0){
			
			System.out.println("click on the first one");
			
			resultsList.get(0).click();
		}
		
		close();
		
	}

	private static void setup() {
		
//		switch(browserType){
//		case ie:
//			break;
//		case ff:
//			break;
//		case chrome:
//			break;
//		
//		}
		
		driver= new FirefoxDriver();
		
	}
	
	private static void close() {
		driver.quit();
		
	}

}
