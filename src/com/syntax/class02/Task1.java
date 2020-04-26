package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=8eb8f22e3421f04dae8d294b69834594");
		
		driver.findElement(By.name("firstName")).sendKeys("Sohil");
		
		driver.findElement(By.name("lastName")).sendKeys("Syntax");
		
		driver.findElement(By.name("phone")).sendKeys("97390709111");
		
		driver.findElement(By.id("userName")).sendKeys("SohilIsSmart@yahoo.com");
		
	}

}
