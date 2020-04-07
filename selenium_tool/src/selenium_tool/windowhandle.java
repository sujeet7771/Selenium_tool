package selenium_tool;

import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		// simple getTitle method  
		driver.get("http://gmail.com");
		driver.getTitle();
		String wh = driver.getWindowHandle();
				System.out.println(wh);
		//String Curl=driver.getCurrentUrl();
		// print current url
		//System.out.println(Curl);
		String pgsrc=driver.getPageSource();
		// print Current page Source
		//System.out.println(pgsrc);


	}

}
