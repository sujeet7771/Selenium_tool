package selenium_tool;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.remote.server.handler.ClickElement;

public class logingmail {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		//@SuppressWarnings("unused")
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("sonu_12@gmail.com"));
		driver.findElement(By.id("pass")).sendKeys("sujeet1992");
		driver.findElement(By.id("u_0_b")).click();
		
		
		
		
	
	     
	
	
	

	
	}
}
