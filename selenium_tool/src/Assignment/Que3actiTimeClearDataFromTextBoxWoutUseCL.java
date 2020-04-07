package Assignment;

import java.util.ResourceBundle.Control;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que3actiTimeClearDataFromTextBoxWoutUseCL {
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
			Thread.sleep(3000);
			unTB.sendKeys(Keys.CONTROL+"a");
			unTB.sendKeys(Keys.DELETE);
			
			
		
			
		

	}

}
