package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que7ToFindHeightandWeightOfTextBox {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/login.do");
		WebElement unTB = driver.findElement(By.id("username"));	
		int hunTB = unTB.getSize().getHeight();
		System.out.println("height of the UsernameTextBox is:"+hunTB);
		int wuTB = unTB.getSize().getWidth();
		System.out.println("weight of the UsernameTextBox is:"+wuTB);

		
		
		
		

	}

}
