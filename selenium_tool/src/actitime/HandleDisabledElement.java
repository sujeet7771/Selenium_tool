package actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledElement {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Dell/Desktop/suj.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("t1")).sendKeys("sujeet");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('t2').value='sujeet'");
		

	}

}
