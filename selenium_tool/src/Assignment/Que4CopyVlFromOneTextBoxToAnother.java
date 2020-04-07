package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que4CopyVlFromOneTextBoxToAnother {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/login.do");
		WebElement unTB = driver.findElement(By.id("username"));
		unTB.sendKeys("admin");
		unTB.sendKeys(Keys.CONTROL+"ac");
		unTB.clear();
		WebElement pwTB = driver.findElement(By.name("pwd"));
		Thread.sleep(3000);
			
		pwTB.sendKeys(Keys.CONTROL+"v");
		
		

	}

}
