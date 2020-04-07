package selenium_tool;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		// simple getTitle method  
		driver.get("http://naukari.com");
		driver.manage().window().maximize();
	String pwh = driver.getWindowHandle();
	
System.out.println("===============");
     Set<String> whs = driver.getWindowHandles();
     System.out.println(whs);
          int countwindow = whs.size();
          System.out.println(countwindow);
          for(String h:whs)
          {
        	  driver.switchTo().window(h);
        	  String s = driver.getTitle();
        	  System.out.println(s);
        	 driver.close();
        	  
          }
	  


	}

}
