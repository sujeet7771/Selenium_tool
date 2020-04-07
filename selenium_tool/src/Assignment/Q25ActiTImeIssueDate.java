package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q25ActiTImeIssueDate {
static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Settings')]")).click();
	Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Licenses']")).click();
		

		

	}

}
