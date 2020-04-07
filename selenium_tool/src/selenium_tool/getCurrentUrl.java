package selenium_tool;

import org.openqa.selenium.chrome.ChromeDriver;

public class getCurrentUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		// simple getTitle method  
		driver.get("http://gmail.com");
		driver.getTitle();
		String Curl=driver.getCurrentUrl();
		// print current url
		System.out.println(Curl);

	}

}
