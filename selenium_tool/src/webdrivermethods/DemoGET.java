package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoGET {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
	//Open The Browser	
	 WebDriver driver = new ChromeDriver();
	 
	 //Maximize The Browser
	 driver.manage().window().maximize();
	 
	 //Enter The URL
	 driver.get("http://www.facebook.com");
	 
	 System.out.println("=================================");
	 //Get The Title From The Current Browser And Print It
	 String aTitle = driver.getTitle();
	 System.out.println(aTitle);
	 
	 System.out.println("=================================");
	 //Get The Current URL From The Browser And Print It
	 String aCurl = driver.getCurrentUrl();
	 System.out.println(aCurl);	
	 
	 System.out.println("=================================");
	 //Get The Current Page Source Code And Print It
	 String cpsrc = driver.getPageSource();
	 System.out.println(cpsrc);
	 
	 //Close The Current Browser
	 driver.close();
	 
	}

}
