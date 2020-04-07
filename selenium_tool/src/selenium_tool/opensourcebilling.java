package selenium_tool;

import org.openqa.selenium.chrome.ChromeDriver;

public class opensourcebilling {
	static {
		System.setProperty("webdriver.driver.chrome","./driver.chromedriver.exe");
		
	}

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.demo.opensourcebilling.org");
        



	}

}
