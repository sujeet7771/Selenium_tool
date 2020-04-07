package selenium_tool;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		//@SuppressWarnings("unused")
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//[@id="email"]"));

	}

}
