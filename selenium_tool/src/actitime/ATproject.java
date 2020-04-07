package actitime;

import java.awt.TextField;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import okhttp3.internal.http2.Settings;
import selenium_tool.getTitle;

public class ATproject {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8080/login.do");
		driver.manage().window().maximize();
		driver.findElementByClassName("TextField").sendKeys("admin");
		driver.findElementByName("pwd").sendKeys("manager");
		driver.findElementByClassName("initial").click();
		String atitl = driver.getTitle();
		String etitl="actiTIME - Enter Time-Track";
		if (atitl.equals(etitl)) {
		
			System.out.println("The current title is  "+etitl);
		}
		else
		{
			System.out.println("The current title is  "+atitl);
			
		}
	 driver.findElementByXPath("(//img[contains(@class,'sizer')])[5]").click();
	 driver.findElementByXPath("(//a[contains(@class,'item')])[4]").click();
	 String aLISpg= driver.getTitle();
	 String eLISpg = "actiTIME - Licenses";
	 if (aLISpg.equals(eLISpg)) {
		 
		 System.out.println("The is the actiTime Licenses page  "+eLISpg);
	}
	 else {
		 System.out.println("The is the actiTime Licenses page  "+aLISpg);
		 
	 }
	 String predi = driver.findElementByXPath("//nobr[text()='Product Edition:']/../../td[2]").getText();
	System.out.println("product edition is "+predi); 
		
	   
	    
	   
	    
		
		

	}

}

