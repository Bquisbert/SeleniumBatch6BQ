package com.syntax.class02;

public class TestSelWebDriver {

	public static void main(String[] args) {

		SelWebDriver driver=new SelChromeDriver();
		
		driver.get("https:google.com");
		
		driver.close();
		
		SelWebDriver driver2= new SelFirefoxDriver();
		
		
		
		
	}

}
