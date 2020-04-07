package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/login.do");
		WebElement unTB = driver.findElement(By.id("username"));
		unTB.sendKeys("admin");
		WebElement pwTB = driver.findElement(By.name("pwd"));
		pwTB.sendKeys("manager");
		
		driver.findElement(By.xpath("//div[text()='Login ' ]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Settings')]")).click();
		driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
	
		driver.findElement(By.id("uploadNewLogoOption")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("FormModifiedDivButton")).click();
		driver.switchTo().alert().accept();
		
		
			
			
			
		}

	

}
