package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que2actiTimeClearDataFromTextBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/login.do");
		WebElement unTB = driver.findElement(By.id("username"));
		unTB.sendKeys("admin");
		Thread.sleep(2000);
		unTB.clear();
		
		WebElement pwTB = driver.findElement(By.name("pwd"));
		pwTB.sendKeys("manager");
		Thread.sleep(2000);
		pwTB.clear();

	}

}
