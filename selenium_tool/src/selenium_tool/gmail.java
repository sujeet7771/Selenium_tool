package selenium_tool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class gmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("yadav.sujeet563@gmail.com");
	    WebElement nxBT = driver.findElement(By.xpath("//span[text()='Next']"));
	    nxBT.click();
	   // WebElement l = driver.findElementByLinkText("//a[@jsname='ngKiOe']");
	    //l.click();
	    
	    WebElement LRnMore = driver.findElement(By.linkText("Learn more"));
	    LRnMore.click();
	    
	   // driver.findElement(By.xpath("//input[@type='password']")).sendKeys("8319173752");

	}

}
