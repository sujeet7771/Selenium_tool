package actionssss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
	   WebDriver driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   driver.get("https://www.vtiger.com/");
	   
	   WebElement rsrcTab = driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));
	  
	   Actions act=new Actions(driver);
	   
	   act.moveToElement(rsrcTab).perform();
	   
	   driver.findElement(By.xpath("//h6[contains(text(),'Contact')]")).click();
	   int yaxis = driver.findElement(By.xpath("//p[text()='Other Communication']")).getLocation().getY();
	   JavascriptExecutor jse = (JavascriptExecutor)driver;
	   jse.executeScript("window.scrollTo(0,"+yaxis+")");
	   
	  String hrNO = driver.findElement(By.xpath("//p[text()='Human Resources']/ancestor::div[@class='row'][1]/div[2]/span/p")).getText();
	System.out.println(hrNO);
	}

}
