package com.syntax.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {
	
	public static Properties prop;
	
	/**
	 * this method will read properties file
	 * @param filePath
	 */
	
	public static void readProperties(String filePath) {
		try {
			FileInputStream fis=new FileInputStream(filePath);
			 prop=new Properties();
			prop.load(fis);
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * this method will return value of specified key
	 * @param key
	 * @return
	 */
	
	public static String getProperty(String key) {
		
		return prop.getProperty(key);
	}
	
	
	
	
	
	
	
}
