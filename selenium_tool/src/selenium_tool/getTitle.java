package selenium_tool;

import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		// simple getTitle method  
		driver.get("http://gmail.com");
		String Title=driver.getTitle();
		// print tilte
		System.out.println(Title);
		

	}

}
