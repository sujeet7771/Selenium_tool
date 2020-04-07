package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vtiger.com/");
		//WebElement rscbt = driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));
	    // Actions act = new Actions(driver);
	     //Thread.sleep(2000);
	    		// act.moveToElement(rscbt).perform();
	    		// WebElement prd = driver.findElement(By.xpath("//a[contains(text(),'Products')]"));
	    		 //act.moveToElement(prd).perform();
		
		
		// below progrom for double click operation
		
		
		/*WebElement ttf = driver.findElement(By.xpath("//a[contains(text(),'                Try for free')]"));
	Actions act = new Actions(driver);
	Thread.sleep(3000);
act.doubleClick(ttf).perform();*/
	    		 
	    // below progrom for context click(right click) operation
		WebElement regnow = driver.findElement(By.xpath("//span[text()='Register Now']"));
		Actions act = new Actions(driver);
		act.contextClick().perform();
	    		 

	}

}
