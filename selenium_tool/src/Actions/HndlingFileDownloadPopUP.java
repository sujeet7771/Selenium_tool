package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HndlingFileDownloadPopUP {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
		}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.seleniumhq.org");
		WebElement dwd = driver.findElement(By.xpath("//a[text()='Downloads']"));
		dwd.click();
		int yaxis = driver.findElement(By.xpath("//h2[text()='Selenium Client & WebDriver Language Bindings']")).getLocation().getY();
	     JavascriptExecutor jse = (JavascriptExecutor)driver;
	   jse.executeScript("window.scrollBy(0, "+yaxis+")");  
	   driver.findElement(By.xpath("//td[text()='Java']/../td[4]/a[1]")).click();
	   
	     
		
		
	

	}

}
