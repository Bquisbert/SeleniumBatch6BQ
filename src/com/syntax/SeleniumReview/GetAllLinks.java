package com.syntax.SeleniumReview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class GetAllLinks extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		setUp();
		
	List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		
		int numOfLinks=allLinks.size();
		
		System.out.println(numOfLinks);
		
		for(WebElement link:allLinks) {
		     String textOfLink=	link.getText();
		   String links=  link.getAttribute("href");
		     System.out.println(textOfLink+"  "+links);
		}
		
		
		
		
	}

}
