package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDownDemo2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		
		setUp();
		
		WebElement continents=driver.findElement(By.id("continents"));
		
		Select select=new Select(continents);
		
		List<WebElement> options=select.getOptions();
		
		for (WebElement option : options) {
			String text=option.getText();
			System.out.println(text);
			
			if(text.equals("Africa")) {
				option.click();
				Thread.sleep(2000);
				//select.selectByVisibleText("Antarctica"); you can also select byvisabletext
			}
		}

		boolean isMultiple=select.isMultiple();
	System.out.println("The continent drop down is multiple:"+isMultiple);
	tearDown();
	
	}

}
