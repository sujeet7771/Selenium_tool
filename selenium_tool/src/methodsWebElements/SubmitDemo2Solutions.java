package methodsWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitDemo2Solutions extends BaseTest
{
	
	public static void main(String[] args) 
	{
		
		BaseTest.openAPP("chrome");
		driver.findElement(By.id("user_login_btn")).submit();
		

	}

}
