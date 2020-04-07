package Synchronisation;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		                WebDr driver = new ChromeDriver();
		                driver.manage().window().maximize();
		        		driver.get("http://localhost:8080/login.do");
		        	
		                driver.findElement(By.id("username")).sendKeys("admin");
		                driver.findElement(By.name("pwd")).sendKeys("manager");
		                String loginPageTitle = driver.getTitle();
		                System.out.println(loginPageTitle);
		                
		                
		                

	}

}
