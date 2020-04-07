package handlingMultipleElem;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestion {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		WebElement srchBox = driver.findElement(By.name("q"));
		srchBox.sendKeys("Java");
		
		List<WebElement> auts = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		
		int count = auts.size();
		System.out.println(count);
		
		for(WebElement at:auts)
		{
			String s = at.getText();
			System.out.println(s);
		}
		
		auts.get(4).click();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
