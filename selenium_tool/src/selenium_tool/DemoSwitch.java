package selenium_tool;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSwitch {

	private static final boolean String = false;

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://naukari.com");
		String pwh = driver.getWindowHandle();
		Set<String> whs = driver.getWindowHandles();
		int countwindow = whs.size();
		System.out.println(countwindow);
		for(String w:whs)
		{
			driver.switchTo().window(w);
		           String s = driver.getTitle();	
		       	System.out.println(s);
		       	driver.close();
			
		}

	}

}
