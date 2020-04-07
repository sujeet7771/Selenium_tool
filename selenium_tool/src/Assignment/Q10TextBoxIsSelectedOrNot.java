package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q10TextBoxIsSelectedOrNot {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

	
		public static void main(String[] args) throws InterruptedException  {
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("http://localhost:8080/login.do");
			WebElement cBox = driver.findElement(By.id("keepLoggedInCheckBox"));
			Thread.sleep(2000);
			System.out.println(cBox.isSelected());
			

	}

}
