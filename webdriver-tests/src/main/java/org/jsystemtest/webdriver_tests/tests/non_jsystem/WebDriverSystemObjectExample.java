package org.jsystemtest.webdriver_tests.tests.non_jsystem;

import java.util.List;

import org.jsystemtest.webdriver_tests.tests.jsystem.AbstractWebDriverTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * 
 * @author LielRan
 *
 */
public class WebDriverSystemObjectExample extends AbstractWebDriverTest{
	
	private String q ="the the - slow emotion replay";
	
	
	@Test
	public void youTubeTest(){
		
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
	}


	public String getQ() {
		return q;
	}


	public void setQ(String q) {
		this.q = q;
	}


}
