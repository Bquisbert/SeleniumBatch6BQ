package com.syntax.class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.syntax.utils.BaseClass;

public class FrameRecap {

	public static void main(String[] args) {

		WebDriver driver=BaseClass.setUp();
		
		boolean isDisplayed=driver.findElement(By.xpath("//a[@href='./index.html']")).isDisplayed();
		
		System.out.println("Is home link displayed:"+isDisplayed);
		
		driver.switchTo().frame("FrameOne");
		
		
		
		
		
		
		
		
		
	}

}
