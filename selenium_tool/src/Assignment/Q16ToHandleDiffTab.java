package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

//import java.sql.Driver;
//import java.util.Set;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Q16ToHandleDiffTab {
	static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	

	public static void main(String[] args) {
               ChromeDriver driver = new ChromeDriver();
               driver.manage().window().maximize();
               driver.get("https://www.myntra.com/");
               String ptab = driver.getWindowHandle();
               driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("kutra",Keys.ENTER);
              // driver.findElement(By.xpath("//img[contains(@src,'Kurtas-6161556086869769-1')]")).click();
               Set<String> tabs = driver.getWindowHandles();
               int count = tabs.size();
               System.out.println(count);
             // for(String t:tabs)
             // {
            	  //driver.switchTo().window(t);
            	//  String s = driver.getTitle();
            	  System.out.println(s);
            	  //driver.findElementByXPath("//img[contains(@src,'Libas-Women-Kurtas-6161556086869769-1')]").click();
            	//  driver.findElementByXPath("//img[contains(@src,'Libas-Women-Kurtas-6161556086869769-1')]").click();
            	  //String A = driver.findElementByXPath("//h4[text()='SELECT SIZE ']/../../div[2]/div[1]/div[1]").getText();
            	  //System.out.println(A);
				
			
			}
               
               
               
               
                		   
                


	}

}
