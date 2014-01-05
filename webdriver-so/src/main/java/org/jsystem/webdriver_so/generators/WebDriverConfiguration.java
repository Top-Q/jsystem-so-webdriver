package org.jsystem.webdriver_so.generators;

public interface WebDriverConfiguration {

	/**
	 * Executable is the full path of the binary executable used to run the web
	 * driver.<br />
	 * In <i>Internet Explorer</i> and <i>Chrome</i> use the path of the driver
	 * server (IEDriverServer.exe, chromedriver.exe)
	 * 
	 * @return the executable path of the driver
	 */
	public String getExecutable();

	public void setExecutable(String executable);

	/**
	 * Profile is the name of the profile in <i>Mozilla Firefox</i> &
	 * <i>Chrome</i>
	 * 
	 * @return
	 */
	public String getProfile();

	public void setProfile(String profile);

	
	
	public String getExtension();
	/**
	 * A browser can run extension (e.g. <i>.xpi</i> file in <i>Mozilla
	 * Firefox</i>)
	 * 
	 * @param extension
	 */
	public void setExtension(String extension);


	public String getRemoteAddress();
	public void setRemoteAddress(String remoteAddress);
	
	public String getExtraFlags();

	public void setExtraFlags(String extraFlags);

	/**
	 * show the browser in full screen.
	 * 
	 * @return
	 */
	public boolean isWindowMaximize();

	public void setWindowMaximize(boolean windowMaximize);

	public void setIgnoreCertificateErrors(boolean ignoreCertificateErrors);

	public boolean isIgnoreCertificateErrors();

	public void setEnableNativeEvents(Boolean enableNativeEvent);

	public Boolean isEnableNativeEvent();

	

}
