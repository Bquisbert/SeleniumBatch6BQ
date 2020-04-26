package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.get("https://www.google.com/");
		
		driver.getCurrentUrl();
		
		
		String url;
		url=driver.getCurrentUrl();
		
		System.out.println(url);
		
		
		System.out.println(driver.getTitle());
		
		
	}

}
