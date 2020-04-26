package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Commands with Page
 * getCurrentUrl;
 * getTitle;
 * 
 */
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
	   
		String fbUrl="https://www.facebook.com";
		driver.get(fbUrl);

		String url = driver.getCurrentUrl();
		System.out.println("Current URL is: " + url);

		String title = driver.getTitle();
		System.out.println("Title of the page is: "+title);
		
		driver.close();
		
		
		
	}

}
