package popupss;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HodlingHiddenDivisionPopUp {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");
		driver.findElement(By.xpath("//input[@class='_2zrpkA_adBPDZ]")).sendKeys("selenium");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		
		

	}

}
