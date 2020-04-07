package actionssss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleClickActions {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		
		  WebDriver driver = new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   driver.get("https://drive.google.com/drive/my-drive");
		   driver.findElement(By.id("identifierId")).sendKeys("seleniumqsp18");
		   driver.findElement(By.xpath("//span[text()='Next']")).click();
		   WebDriverWait wait=new WebDriverWait(driver,20);
		   driver.findElement(By.name("password")).sendKeys("sunil618");
		   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Next']")));
		   driver.findElement(By.xpath("//span[text()='Next']")).click();
		   WebElement filename = driver.findElement(By.xpath("(//div[@class='bSmy5'])[8]"));
		   Actions act=new Actions(driver);
		   act.doubleClick(filename).perform();
		  
		   
		

	}

}
