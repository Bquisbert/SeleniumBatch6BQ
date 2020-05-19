package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.syntax.utils.BaseClass;

public class ActionAmazonDemo {

	public static void main(String[] args) {

		WebDriver driver = BaseClass.setUp();

		WebElement account = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));

		Actions action=new Actions(driver);
		
		action.moveToElement(account).perform();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
