package actionssss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		WebElement products = driver.findElement(By.xpath("(//a[@id=\"navbarDocumentation\"])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(products).perform();
		driver.findElement(By.xpath("//h6[contains(text(),    'Marketing')]")).click();
		int yaxis = driver.findElement(By.xpath("//label[contains(text(),'I agree to receive email')]")).getLocation().getY();
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("window.scrollTo(0,"+yaxis+")");
		
		
		

	}

}
