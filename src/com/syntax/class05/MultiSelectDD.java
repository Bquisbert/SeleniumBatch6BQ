package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class MultiSelectDD {

	public static void main(String[] args) throws InterruptedException {

	WebDriver driver=BaseClass.setUp();
		
		WebElement multiSelectDD=driver.findElement(By.id("continentsmultiple"));
		
		Select select=new Select(multiSelectDD);
		
		boolean isMulti=select.isMultiple();
		System.out.println("IS Drop Down Multiple:"+isMulti);
		
		if(isMulti) {
		select.selectByIndex(1);
		select.selectByIndex(3);
		select.selectByVisibleText("Africa");
		Thread.sleep(3000);
		
		//select.deselectByIndex(1);
		select.deselectAll();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
