package com.syntax.class02;

public class SelChromeDriver implements SelWebDriver {

	public SelChromeDriver() {
		System.err.println("Opening Chrome driver..."); //err is red because it means error which we used here to get red color
	}
	
	
	@Override
	public void get(String url) {
		System.out.println("Luanching the URL::" + url);
	}

	@Override
	public void getCurentUrl() {
		System.out.println("Retriving current URL");
	}

	@Override
	public void close() {
		System.out.println("Closing current window");
	}

	@Override
	public void getTitle() {

	}

}
