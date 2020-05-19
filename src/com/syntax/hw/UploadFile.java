package com.syntax.hw;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class UploadFile extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		WebElement uploadFileBtn = driver
				.findElement(By.xpath("//input[@name='MAX_FILE_SIZE']/following-sibling::input[1]"));

		uploadFileBtn.sendKeys("C:\\Users\\brian\\OneDrive\\Pictures\\Camera Roll\\WIN_20200201_19_52_58_Pro.jpg");

//		Actions action=new Actions(driver);
//		
//		action.click(uploadFileBtn).perform();
//		

		WebElement uploadBtn = driver.findElement(By.xpath("//img[@alt='Upload']"));

	
		
		
	}

}
