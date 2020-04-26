package com.syntax.class02;

public class SelFirefoxDriver implements SelWebDriver {

	public SelFirefoxDriver() {
		System.err.println("Opening Firefox Driver...");
	}
	@Override
	public void get(String url) {
System.out.println("luanching Firefox Driver");		
	}

	@Override
	public void getCurentUrl() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getTitle() {
		// TODO Auto-generated method stub
		
	}

}
