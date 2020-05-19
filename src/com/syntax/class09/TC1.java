package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class TC1 extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		setUp();
		driver.get("https://www.aa.com/homePage.do");
		
		WebElement leaveTable=driver.findElement(By.id("aa-leavingOn"));
		
		leaveTable.click();
		
		////div[@class=‘ui-datepicker-title’]
		
		
		
		
		
		
		
	}

}
