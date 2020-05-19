package com.syntax.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class TC1 extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	setUp();
	
	driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		
		WebElement userName=driver.findElement(By.id("ctl00_MainContent_username"));
		
		userName.sendKeys("Tester");
		
		WebElement password=driver.findElement(By.id("ctl00_MainContent_password"));
		
		password.sendKeys("test");
		
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']")).click();
		
		List<WebElement> table=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']"));
		
		for (WebElement td : table) {
			String name=td.getText();
			if(name.contains("Susan McLaren")) {
			System.out.println("Susan McLaren in the System:: ");
			}
		}
	
		
		
		
		
	}

}
