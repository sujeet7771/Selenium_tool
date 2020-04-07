package selenium_tool;

import org.openqa.selenium.chrome.ChromeDriver;

public class manage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		//@SuppressWarnings("unused")
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();

	}

}
