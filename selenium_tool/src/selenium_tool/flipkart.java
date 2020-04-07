package selenium_tool;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
	static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(3000);
        driver.findElementByName("q").sendKeys("iPhone X",Keys.ENTER);
        Thread.sleep(3000);
        // String rslt = driver.findElement(By.xpath("//div[text()='Apple iPhone X (Silver, 64 GB)']/../../div[2]/div[1]")).getText();
        //String rslt = driver.findElementByXPath("\r\n" + 
          //   		"//div[text()='Apple iPhone X (Space Gray, 256 GB)']/../../div[2]//div[@class=\"_1vC4OE _2rQ-NK\"]").getText();       
        //System.out.println(rslt);
        //String t = driver.findElementByXPath("//div[text()='Apple iPhone X (Space Gray, 64 GB)']/../../div[2]/div[1]//div[@class='_1vC4OE _2rQ-NK']").getText();
       //String t = driver.findElementByXPath("//div[text()='Apple iPhone X (Space Gray, 256 GB)']/../../div[2]/div/div[1]/div[1]").getText();
        //System.out.println(t);
       //String s = driver.findElementByXPath("//div[text()='Apple iPhone 7 (Gold, 32 GB)']/../../div[2]/div[1]//div[@class=\"_1vC4OE _2rQ-NK\"]").getText();
      // System.out.println(s);
       // driver.close();
        String iph = driver.findElementByXPath("//div[text()='Apple iPhone 7 (Black, 32 GB)']/../../div[2]/div[4]/div[2]").getText();
        System.out.println(iph);
	}

}
