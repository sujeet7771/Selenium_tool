package selectClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleBySelectElementByValue {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args)  {
			ChromeDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/Dell/Desktop/dropdownlist.html");
			WebElement lstbox = driver.findElement(By.id("country"));
		    Select sel = new Select(lstbox);
		    System.out.println(sel.isMultiple());
		    // using select method
		    sel.selectByVisibleText("India");
		    sel.selectByValue("s");
		    sel.selectByIndex(3);
		    // using de_select
		    sel.deselectAll();
		    sel.deselectByIndex(0);
		    sel.selectByValue("c");
		    sel.deselectByVisibleText("UK");
		    List<WebElement> s = sel.getAllSelectedOptions();
		    int count = s.size();
		    System.out.println(count);
		    WebElement fselect = sel.getFirstSelectedOption();
		    System.out.println(fselect.getText());
		    
		    
		    
	

	}

}
