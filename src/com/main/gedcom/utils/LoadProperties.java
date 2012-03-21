package com.main.gedcom.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoadProperties {

	private static LoadProperties loadProperties;
	private Properties appProp = new Properties();

	private LoadProperties() {
	}

	public static LoadProperties getInstance() {
		if (loadProperties == null) {
			return new LoadProperties();
		} else {
			return loadProperties;
		}
	}

	public Properties loadProps() {
		InputStream in = this.getClass().getResourceAsStream(
				"/com/main/gedcom/resources/applicationResource.properties");
		try {
			appProp.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return appProp;
	}

}
