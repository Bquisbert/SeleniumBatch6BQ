package com.syntax.SeleniumReview;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindow {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.seleniumframework.com/Practiceform/");
	
	WebElement newBrowserBtn=driver.findElement(By.xpath("//button[text()='New Browser Tab']"));
	
	newBrowserBtn.click();
	String parentWindow=driver.getWindowHandle();
	
	
	driver.close();
	
	Thread.sleep(2000);
	Set<String>allWindows=driver.getWindowHandles();
	
	Iterator <String> it=allWindows.iterator();
	
	while(it.hasNext()) {
		String childWindow=it.next();
		if(!parentWindow.equals(childWindow)) {
			driver.switchTo().window(childWindow);
		}
		
		
		
	}

	WebElement header =driver.findElement(By.xpath("//strong[contains(text(),'Agile Testing')]"));
	
	String headerText=header.getText();
	System.out.println(headerText);
	
	
	
	
	
}

}
