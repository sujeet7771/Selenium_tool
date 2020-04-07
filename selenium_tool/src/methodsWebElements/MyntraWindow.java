package methodsWebElements;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraWindow {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.myntra.com");
		String ptab = driver.getWindowHandle();
		driver.findElement(By.className("desktop-searchBar")).sendKeys("kurtas",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//source[contains(@srcset,'6161556086869769-1')]/parent::picture")).click();
		Set<String> tabs = driver.getWindowHandles();
		int count = tabs.size();
		System.out.println(count);
		for(String tab:tabs)
		{
			driver.switchTo().window(tab);
			if(ptab.equals(tab))
			{
				String s = driver.getTitle();
				System.out.println("Parent Tab Title"+s);
				driver.close();
			}
			else
			{
				driver.findElement(By.xpath("//p[text()='XS']/ancestor::div[@class='size-buttons-buttonContainer']")).click();
				driver.close();
			}
		}
	}

}
