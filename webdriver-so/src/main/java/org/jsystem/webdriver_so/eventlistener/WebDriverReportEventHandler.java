package org.jsystem.webdriver_so.eventlistener;

import java.io.IOException;

import jsystem.framework.report.ListenerstManager;
import jsystem.framework.report.Reporter;
import jsystem.framework.report.Reporter.EnumReportLevel;
import jsystem.utils.StringUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

/**
 * This class if for Event Handler by the Dispatcher of the
 * WebDriverEventListener Class. the
 * 
 * 
 * copy to SUT: com.jsystem.webdriver.eventlistener.WebDriverReportEventHandler
 * 
 * @author Liel Ran ,Create Date - 22.12.11
 * 
 */
public class WebDriverReportEventHandler implements WebDriverEventListener {

	private final Reporter reporter;
	private final String prefix = "[";
	private final String suffix = "]";

	public WebDriverReportEventHandler() {
		reporter = ListenerstManager.getInstance();
		reporter.report("Init the WebDriverReportEventHandler");
	}

	public void afterChangeValueOf(WebElement arg0, WebDriver arg1) {
		reporter.report("After Change Value");
	}

	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		reporter.report("After Click");
	}

	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		report("After FindBy", "FindBy= " + arg0);
	}

	public void afterNavigateBack(WebDriver arg0) {
		report("After Navigate", "Navigate back to= " + arg0.getCurrentUrl());
	}

	public void afterNavigateForward(WebDriver arg0) {
		report("After Navigate", "Navigate forward to= " + arg0.getCurrentUrl());
	}

	public void afterNavigateTo(String arg0, WebDriver arg1) {
		report("After Navigation", "Page loaded= " + arg0);
	}

	public void afterScript(String arg0, WebDriver arg1) {
		reporter.report("after Script");
	}

	/**
	 * Called before {@link WebElement#clear WebElement.clear()} and
	 * {@link WebElement#sendKeys(CharSequence...)}
	 */
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1) {
		report("Before Change Value Of");
	}

	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		report("Before Click On");
	}

	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		report("Before FindBy", "FindBy= " + arg0);
	}

	public void beforeNavigateBack(WebDriver arg0) {
		report("Before Navigate Back", "Navigate back from= " + arg0.getCurrentUrl());
	}

	public void beforeNavigateForward(WebDriver arg0) {
		report("Before Navigate Forward", "Navigate forward from= " + arg0.getCurrentUrl());
	}

	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		report("Before Navigation", "Navigate from= " + arg1.getCurrentUrl() + ", Navigate to= " + arg0);
	}

	public void beforeScript(String arg0, WebDriver arg1) {
		reporter.report("Before script execution");
	}

	public void onException(Throwable arg0, WebDriver arg1) {
		synchronized (arg0) {
			if (arg0 instanceof NoSuchElementException) {
				reporter.report("element was not found");
			}
			else {
				try {
					reporter.startLevel("Exception", EnumReportLevel.MainFrame);
					report("Exception", arg0.getMessage());
					reporter.report(StringUtils.getStackTrace(arg0));
					reporter.stopLevel();
				} catch (IOException e) {
					report("Exception", arg0.getMessage());
				}
			}
		}
	}

	private void report(String title) {
		reporter.report(prefix + title + suffix);
	}

	private void report(String title, String text) {
		reporter.report(prefix + title + suffix + ": " + text);
	}

}
