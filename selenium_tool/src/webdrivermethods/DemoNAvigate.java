package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoNAvigate {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		//Open The Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize The Browser
		driver.manage().window().maximize();
		
		//Enter The URL
		driver.get("http://www.google.com");
		
		//Get The Current Page Title And Print It
		String aGTitle = driver.getTitle();
		System.out.println(aGTitle);
		System.out.println("=======================================");
	
		//Without Using get() Method We Can Enter The URL With The Help Of Navigate
		driver.navigate().to("http://www.flipkart.com");
		String aFTitle = driver.getTitle();
		System.out.println(aFTitle);
		System.out.println("=======================================");
		
		//Its Used to Navigate Back From Current Page to Previous
		driver.navigate().back();
		
		//Its Used to Navigate From Current Page to Step Forward into next
		driver.navigate().forward();
		
		//Close the current Browser
		driver.close();
		
		
		

	}

}
