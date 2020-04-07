package realTimeApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTIMELogin {
	
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8082/login.do");
//		WebElement unTB = driver.findElement(By.xpath("//input[@id='username' or @name='username']"));
//		unTB.sendKeys("admin");
//		
//		WebElement pwTB = driver.findElement(By.xpath("//input[@name='pwd']"));
//		
//		pwTB.sendKeys("manager");
//		
//		WebElement chkBOX = driver.findElement(By.xpath("//input[@type='checkbox']"));
//		chkBOX.click();
//		
//		WebElement lgnBTN = driver.findElement(By.xpath("//div[text()='Login ']"));
//		lgnBTN.click();
//		Thread.sleep(2000);
//		
//		String actualTitle = driver.getTitle();
//		String expectedTitle="actiTIME - Enter Time-Track";
//		if(actualTitle.equals(expectedTitle))
//		{
//			System.out.println("Test case is pass it display the HP==>"+expectedTitle);
//		}
//		else
//		{
//			System.out.println("Test Case is Fail the title is==>"+actualTitle);
//		}
//		WebElement lgOutBTN = driver.findElement(By.xpath("//a[@class='logout']"));
//		lgOutBTN.click();
//		driver.close();
		
//=========================================================================
		
		String text = driver.findElement(By.xpath("//nobr[contains(text(),'actiTIME')]")).getText();
		System.out.println(text);
		
		WebElement logo = driver.findElement(By.xpath("//img[contains(@src,'timer')]"));
		String lg = logo.getTagName();
		
		if(lg.contains("img"))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
