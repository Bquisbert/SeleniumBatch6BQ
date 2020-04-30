package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
public static String url="https://www.amazon.com/";
	
	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		
		System.out.println("Size of all Links on Amazon:: " + allLinks.size());// print list of WebElement

		int count = 0;
		// looping through the list of all Links.
		for (WebElement link : allLinks) {

			String text = link.getText();// getText() will return the inner text of web-element or visible text on UI
			if (!text.isEmpty()) {
				System.out.println(text);
				count++;
			}

		}
		System.out.println("Total number of link with text is:: " + count);

		driver.quit();
	

	}
			
		
	}


