package actionssss;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws AWTException 
	{
		
		   WebDriver driver = new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   driver.get("http://localhost:8082/login.do");
		   WebElement linkText = driver.findElement(By.linkText("actiTIME Inc."));
		   
		   Actions act=new Actions(driver);
		   act.contextClick(linkText).perform();
		   
		   Robot rbt=new Robot();
		   rbt.keyPress(KeyEvent.VK_W);

	}

}
