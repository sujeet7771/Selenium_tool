package handlingMultipleElem;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;

public class findMulElements {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("qspider");
		List<WebElement> srchBX = driver.findElements(By.xpath("//span[contains(text(),'qspider')]"));
		int count = srchBX.size();
		System.out.println(count);
		for (WebElement srch : srchBX) {
			String s = srch.getText();
			System.out.println(s);

		}
		srchBX.get(3).click();
		
		

	}

}
