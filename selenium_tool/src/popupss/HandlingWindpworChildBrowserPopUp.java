package popupss;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingWindpworChildBrowserPopUp {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.naukari.com");
		Set<String> whs = driver.getWindowHandles();
		int count = whs.size();
		System.out.println(count);
		for (String w : whs) {
			driver.switchTo().window(w);
			driver.close();
		}
	    
		

	}

}
