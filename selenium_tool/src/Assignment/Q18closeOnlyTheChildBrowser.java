package Assignment;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q18closeOnlyTheChildBrowser {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.naukari.com");
		Set<String> tabs = driver.getWindowHandles();
		int count = tabs.size();
		System.out.println(count);
		for (String tab : tabs) {
			driver.switchTo().window(tab);
			if (tab.equals(tabs)) {
				
			}
			else {
				
				
				driver.close();
			}
			
		}
	

	}

}
