package org.jsystem.webdriver_so.generators;

import jsystem.framework.system.SystemObjectImpl;

public class WebDriverConfigurationImpl extends SystemObjectImpl implements WebDriverConfiguration {

	protected String executable, profile, extension;
	protected String extraFlags;
	protected boolean windowMaximize, ignoreCertificateErrors;
	protected Boolean enableNativeEvents;

	@Override
	public String getExecutable() {
		return executable;
	}

	@Override
	public void setExecutable(String executable) {
		this.executable = executable;
	}

	@Override
	public String getProfile() {
		return profile;
	}

	@Override
	public void setProfile(String profile) {
		this.profile = profile;
	}

	@Override
	public String getExtension() {
		return extension;
	}

	@Override
	public void setExtension(String extension) {
		this.extension = extension;
	}

	
	@Override
	public String getExtraFlags() {
		return this.extraFlags;
	}

	@Override
	public void setExtraFlags(String extraFlags) {
		this.extraFlags = extraFlags;
	}
	
	@Override
	public boolean isWindowMaximize() {
		return windowMaximize;
	}

	/**
	 * @return the ignoreCertificateErrors
	 */
	public boolean isIgnoreCertificateErrors() {
		return ignoreCertificateErrors;
	}

	/**
	 * @param ignoreCertificateErrors the ignoreCertificateErrors to set
	 */
	public void setIgnoreCertificateErrors(boolean ignoreCertificateErrors) {
		this.ignoreCertificateErrors = ignoreCertificateErrors;
	}
	
	@Override
	public Boolean isEnableNativeEvent() {
		return this.enableNativeEvents;
	}
	/**
	 * @param enableNativeEvent the enableNativeEvent to set
	 */
	public void setEnableNativeEvents(Boolean enableNativeEvents) {
		this.enableNativeEvents = enableNativeEvents;
	}

	@Override
	public void setWindowMaximize(boolean windowMaximize) {
		this.windowMaximize = windowMaximize;
	}




}
