package actitime;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAmazonOnePlusMobile {
	static {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
 
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.com");
		driver.findElementById("twotabsearchtextbox").sendKeys("i phone x",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElementByXPath("C").click();
		Thread.sleep(3000);
		//driver.findElementByXPath("").click();
		

	}

}
