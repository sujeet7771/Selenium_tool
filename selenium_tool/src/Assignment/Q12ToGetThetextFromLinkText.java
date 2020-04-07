package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q12ToGetThetextFromLinkText {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/login.do");
		WebElement unTB = driver.findElement(By.id("username"));
		unTB.sendKeys("admin");
		
		WebElement pwTB = driver.findElement(By.name("pwd"));
		pwTB.sendKeys("manager");
	    driver.findElement(By.xpath("//div[text()='Login ']")).click();
	    WebElement TimeTrack = driver.findElement(By.xpath("//div[text()='TIME-TRACK']"));
	    String s = TimeTrack.getText();
	    System.out.println(s);
	    

	}

}
