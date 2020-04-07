package selenium_tool;

import java.sql.Driver;

import org.openqa.selenium.chrome.ChromeDriver;

public class closewindow {

	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	
		driver.get("http://naukari.com");
		driver.getTitle();
		driver.getCurrentUrl();
		driver.close();
	}

}
