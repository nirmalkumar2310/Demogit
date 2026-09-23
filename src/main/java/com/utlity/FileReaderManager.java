package com.utlity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileReaderManager {
	private static Properties property;

	private static void setUpProperty() throws FileNotFoundException {

		File file = new File(
				"C:\\Users\\nirma\\eclipse-workspace\\MavenBlaze\\src\\main\\resources\\TestData.properties");
		try {
			FileInputStream fis = new FileInputStream(file);
			property = new Properties();
			property.load(fis);
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}

	}

	public static String getDataProperty(String key) throws FileNotFoundException {
		setUpProperty();
		String value = property.getProperty(key);
		return value;
	}
	
	public static void main(String[] args) throws FileNotFoundException   {
		System.out.println(getDataProperty("username"));
	}
}
