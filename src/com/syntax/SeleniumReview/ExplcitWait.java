package com.syntax.SeleniumReview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplcitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.seleniumeasy.com/test/jquery-download-progress-bar-demo.html");
		driver.manage().window().maximize();
		WebElement startDownloadBtn=driver.findElement(By.cssSelector("button[id='downloadButton']"));
		
		startDownloadBtn.click();
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Complete!']")));
		
		WebElement completeStatus=driver.findElement(By.xpath("//div[text()='Complete!']"));
		String completeText=completeStatus.getText();
		
		System.out.println(completeText);
		
		WebElement closeBtn=driver.findElement(By.xpath("//button[text()='Close']"));
		
		wait.until(ExpectedConditions.elementToBeClickable(closeBtn));
		
		closeBtn.click();
		
		
		
		
		
	}

}
