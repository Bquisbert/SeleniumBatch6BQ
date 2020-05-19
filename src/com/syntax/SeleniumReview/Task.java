package com.syntax.SeleniumReview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Task {
	
	static String url="https://www.amazon.com";
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		
		
		WebElement searchDropDown=driver.findElement(By.id("searchDropdownBox"));
		
	    Select selectDD=new Select(searchDropDown);
	    
        List<WebElement> ddOptions=selectDD.getOptions();
	    
	    for (WebElement options : ddOptions) {
		String optionText=options.getText();
		System.out.println(optionText);
		
		}
	    
	    selectDD.selectByVisibleText("Books");
	    
	    
	   WebElement searchTextBox= driver.findElement(By.id("twotabsearchtextbox"));
		
	  searchTextBox.sendKeys("Harry Potter");
	   
		WebElement searchBtn=driver.findElement(By.className("nav-input"));
		
		searchBtn.click();
		
	List<WebElement> bookSeriesCheckBoxes=driver.findElements(By.className("a-spacing-micro"));
		for (WebElement  bookSeriesCheckBox: bookSeriesCheckBoxes) {
			String checkBoxText=bookSeriesCheckBox.getText();
			if(checkBoxText.equals("Unofficial Cookbook")&& !bookSeriesCheckBox.isSelected()) {
				Thread.sleep(2000);
				bookSeriesCheckBox.click();
				break;
			}
		}
	
	
	
	
	}

}
