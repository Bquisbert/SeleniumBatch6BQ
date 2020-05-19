package com.syntax.class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.syntax.utils.BaseClass;

public class PracticeSiteFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=BaseClass.setUp();
		
		
		
		driver.switchTo().frame("FrameOne");
		
		boolean logo=driver.findElement(By.id("hide")).isDisplayed();
		System.out.println("Logo inside frame is displayed:"+logo);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("FrameTwo");
		
		boolean isEnabled=driver.findElement(By.className("enroll-btn")).isEnabled();
		System.out.println("Are we able to click on enroll button inside frame two:"+isEnabled);
		
		
		BaseClass.tearDown();
		
	}

}
