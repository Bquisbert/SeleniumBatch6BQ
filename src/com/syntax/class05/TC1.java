package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC1 {

	public static String url="http://facebook.com";

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get(url);
		
		WebElement month=driver.findElement(By.id("month"));
		
		Select selectM=new Select(month);
		
		selectM.selectByIndex(12);
		
		WebElement day=driver.findElement(By.id("day"));
		
		Select selectD=new Select(day);
		selectD.selectByIndex(31);
		
		
		
		
		
		
		
		
		
	}
	
}
