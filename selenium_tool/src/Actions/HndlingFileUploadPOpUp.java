package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HndlingFileUploadPOpUp {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://localhost:8080/login.do");
		driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
		

	}

}
