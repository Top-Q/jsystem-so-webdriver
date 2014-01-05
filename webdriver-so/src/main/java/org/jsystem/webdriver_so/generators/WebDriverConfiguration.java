package org.jsystem.webdriver_so.generators;

public interface WebDriverConfiguration {

	/**
	 * Executable is the full path of the binary executable used to run the web driver.<br />
	 * In <i>Internet Explorer</i> and <i>Chrome</i> use the path of the driver server (IEDriverServer.exe, chromedriver.exe)
	 * @return
	 * the executable path of the driver
	 */
	public String getExecutable();
	public void setExecutable(String executable);
	
	/**
	 * Profile is the name of the profile in Mozilla Firefox & Chrome
	 * @return
	 */
	public String getProfile();
	public void setProfile(String profile);
	
	/**
	 * show the browser in full screen.
	 * @return
	 */
	public boolean isWindowMaximize();
	public void setWindowMaximize(boolean windowMaximize);
	
}
