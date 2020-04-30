package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioDemo {

	public static String url="https://demoqa.com/automation-practice-form/";
	
	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		
	WebElement maleRadiob=driver.findElement(By.xpath("//input[@id='sex-0']"));
		
	System.out.println(maleRadiob.isDisplayed());//true
	System.out.println(maleRadiob.isEnabled());//true
	System.out.println(maleRadiob.isSelected());//false
	System.out.println("***");
	
	//first way to click on a radio button
	maleRadiob.click();//now here in this step we are selecting it
		System.out.println("Male radio button is now selected :"+maleRadiob.isSelected());
		
		//second way to click on radio buttons
		List<WebElement>proList=driver.findElements(By.xpath("//input[@name='profession']"));
		
		int listSize=proList.size();
		
		System.out.println("Size of checkboxes are:"+listSize);
		
		String valueToBe="Manual Tester";
		
		for (WebElement profession : proList) {
			if(profession.isEnabled()) {
			String value=	profession.getAttribute("value");//get value of attribute
			System.out.println(value);
			if(value.equals(valueToBe)) {
				profession.click();
				break;
			}
			}
		}
		
		
	}

}
