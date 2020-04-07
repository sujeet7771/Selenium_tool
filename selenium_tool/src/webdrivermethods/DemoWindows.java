package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWindows {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args)
	{
		//Open The Browser
		WebDriver driver=new ChromeDriver();
		
		//Maximize the Browser
		driver.manage().window().maximize();
		
		//Get The Current Window Reference And Print It
		String whRef = driver.getWindowHandle();
		System.out.println(whRef);
		
		//Close the Current Browser
		driver.close();
	}

}
