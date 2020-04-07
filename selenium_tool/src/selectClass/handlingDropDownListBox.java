package selectClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handlingDropDownListBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Dell/Desktop/dropdownlist.html");
		WebElement lstbox = driver.findElement(By.id("Subject"));
	    Select sel = new Select(lstbox);
	    System.out.println(sel.isMultiple());
	    sel.selectByIndex(0);
	    sel.selectByIndex(1);
	    sel.selectByValue("k");
	    
	    
	   
	    
	    
	    
		
		

	}

}
