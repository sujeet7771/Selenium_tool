package selenium_tool;

import org.openqa.selenium.chrome.ChromeDriver;

public class get {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		// simple get method to open a brouwer
		driver.get("http://gmail.com");
	}

}
