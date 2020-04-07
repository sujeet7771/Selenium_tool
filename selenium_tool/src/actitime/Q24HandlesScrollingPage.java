package actitime;

import java.awt.Frame;
import java.sql.Driver;
import java.util.Set;

import javax.swing.text.AttributeSet.ParagraphAttribute;
import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import selenium_tool.pagesource;

public class Q24HandlesScrollingPage {
	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/login.do");
	    String pw = driver.getWindowHandle();	
	    driver.findElement(By.linkText("View License")).click();
	    Set<String> whs = driver.getWindowHandles();
	    		int count = whs.size();
	    System.out.println(count);
	    for (String w : whs) {
	    	driver.switchTo().window(w);
	    	if (pw.equals(w)) {
				driver.close();
			}
	    	else
	    	{
	    		driver.manage().window().maximize();
	    		WebElement parg = driver.findElement(By.xpath("//h2[text()='7. Termination']"));
	    		int yaxis = parg.getLocation().getY();
	    		System.out.println(yaxis);
	    		JavascriptExecutor jse = (JavascriptExecutor)driver;
	    		jse.executeScript("window.ScrollTo(0,"+yaxis+")");
	    		driver.close();
	    		
	    	}
	    	
			
		}

	}

}
