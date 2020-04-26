package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Start {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
		driver.manage().window().maximize();
		Thread.sleep(3000);//pauses the java program for 3 seconds
		
		
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.quit();
		
	}

}
