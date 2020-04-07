package selenium_tool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPATH {

	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			//@SuppressWarnings("unused")
			ChromeDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/Dell/Desktop/sy.html");
			driver.manage().window().maximize();
			  WebElement USNAME1 = driver.findElement(By.xpath("//div[1]/input[1]"));
			    USNAME1.clear();
			    USNAME1.sendKeys("Bhanu");
			
			    WebElement pwd1 = driver.findElement(By.xpath("//div[1]/input[2]"));
			    pwd1.clear();
			    pwd1.sendKeys("QSP");
			   
			    WebElement USERNAME2 = driver.findElement(By.xpath("//div[2]/input[1]"));
			    USERNAME2.clear();
			    USERNAME2.sendKeys("prakash");
			    
			    WebElement USNAME2 = driver.findElement(By.xpath("//div[2]/input[2]"));
			    USNAME2.clear();
			    USNAME2.sendKeys("JSP");
			   
	}

		
}
