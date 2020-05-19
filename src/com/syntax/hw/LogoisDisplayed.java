package com.syntax.hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class LogoisDisplayed extends CommonMethods {
public static void main(String[] args) {
	
	setUp();
	
	WebElement logo=driver.findElement(By.xpath("//img[@src='/humanresources/symfony/web/webres_5acde3dbd3adc6.90334155/themes/default/images/login/syntax.png']"));
	
	boolean isDisplayed=logo.isDisplayed();
	System.out.println(isDisplayed);
	
}
}
