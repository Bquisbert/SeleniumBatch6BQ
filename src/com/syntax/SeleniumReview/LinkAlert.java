package com.syntax.SeleniumReview;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.seleniumframework.com/Practiceform/");

		WebElement alertBtn = driver.findElement(By.id("alert"));

		alertBtn.click();
		Thread.sleep(3000);
		
		Alert alert=driver.switchTo().alert();
		
		alert.accept();
		
	WebElement timingAlertBtn=driver.findElement(By.xpath("//button[text()='Timing Alert']"));
	timingAlertBtn.click();
	WebDriverWait wait=new WebDriverWait(driver,20);
	
	wait.until(ExpectedConditions.alertIsPresent());
	Thread.sleep(2000);
	alert.accept();
	

	}

}
