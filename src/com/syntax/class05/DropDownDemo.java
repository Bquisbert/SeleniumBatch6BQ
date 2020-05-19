package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDownDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		setUp();
		
		WebElement weekDD=driver.findElement(By.id("select-demo"));
		
		Select select=new Select(weekDD);
		/*
		 * Selenium provides three different ways to select a vaue from a DD
		 * 1.byIndex();
		 * 2.byVisibleText
		 * 3.byValue
		 */
		
		List<WebElement>options=select.getOptions();
		System.out.println("Numbers of options in drop down:"+options.size());
		
		select.selectByIndex(3);
		
		for(int i=0;i<options.size();i++) {
			select.selectByIndex(i);
			
			Thread.sleep(1000);
		}
		
		select.selectByVisibleText("Friday");
		
		Thread.sleep(3000);
		tearDown();
		
	}

}
