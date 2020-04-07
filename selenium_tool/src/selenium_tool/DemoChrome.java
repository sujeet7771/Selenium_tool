package selenium_tool;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoChrome {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key,value);
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://seleniumhq.org");
		driver.close();
	}
}
