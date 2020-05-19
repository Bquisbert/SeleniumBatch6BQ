package com.syntax.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.CommonMethods;

public class FaceBookTest extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		setUp();

		WebElement monthDD = driver.findElement(By.id("month"));

		Select obj = new Select(monthDD);

		obj.selectByVisibleText("Aug");

		Thread.sleep(2000);
		
		
		
		
		WebElement dayDD=driver.findElement(By.id("day"));
		selectDdValue(dayDD,3);
		
		
		WebElement yearDD=driver.findElement(By.id("year"));
		selectDdValue(yearDD, "2000");
		
		//tearDown();

	}

}
