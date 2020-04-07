package Actions;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUploadPop {
	static {
       System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");		
	}

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://localhost:8080/login.do");
	driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
	String pw = driver.getWindowHandle();
	Set<String> tabs = driver.getWindowHandles();
	int count = tabs.size();
	System.out.println(count);
	for (String tab : tabs) 
	{
		driver.switchTo().window(tab);
		if (pw.equals(tab)) {
			String pTabTitle = driver.getTitle();
			System.out.println(pTabTitle);
			
		}
		else
		
		{
	WebElement hcbt = driver.findElement(By.xpath("//a[text()='Help Center']"));
	Actions act = new Actions(driver);
	Thread.sleep(2000);
	act.moveToElement(hcbt);
	driver.findElement(By.xpath("//a[text()='Contact Support']")).click();
	Thread.sleep(2000);
	int yaxis = driver.findElement(By.xpath("//label[text()='Question']")).getLocation().getY();
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	Thread.sleep(2000);
	jse.executeScript("window.scrollTo(0,"+yaxis+")");
		}
		

	}
	}
}
