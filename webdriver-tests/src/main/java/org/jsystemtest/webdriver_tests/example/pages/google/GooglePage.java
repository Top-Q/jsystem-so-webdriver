package org.jsystemtest.webdriver_tests.example.pages.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage {
	protected WebDriver driver;
	
	@FindBy(name="q")
	private WebElement searchField;
	
	@FindBy(name="btnG")
	private WebElement searchButton;
	
	//C'tor
	public GooglePage(WebDriver driver) {
		this.driver = driver;
		driver.get("http://www.google.com");
		
	}
	
	public void open(String url) {
		driver.get(url);
	}

	public void close() {
		driver.quit();
	}
	
	public String getTitle() {
		return driver.getTitle();
	}

	public void searchFor(String searchTerm) {
		searchField.sendKeys(searchTerm);
		searchField.submit();
	}

	public void typeSearchTerm(String searchTerm) {
		searchField.sendKeys(searchTerm);
	}
	
	public void clickOnSearch() {
		searchButton.click();
	}
}
