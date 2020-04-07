package methodsWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class DemoGet extends BaseTest
{

	public static void main(String[] args) 
	{
		BaseTest.openAPP("chrome");
//		WebElement unTB = driver.findElement(By.id("email"));
//		unTB.clear();
		
		//Without using clear() method
		
//		WebElement unTB = driver.findElement(By.id("email"));
//		unTB.sendKeys(Keys.CONTROL+"a",Keys.DELETE);
		
		//copy paste the content from one textBox to another
		
//		WebElement unTb = driver.findElement(By.id("email"));
//		unTb.sendKeys(Keys.CONTROL+"ac");
//		WebElement pwTB = driver.findElement(By.id("password"));
//		pwTB.clear();
//		pwTB.sendKeys(Keys.CONTROL+"v");
		
//		WebElement unTb = driver.findElement(By.id("email"));
//		unTb.clear();
//		unTb.sendKeys("Bhanu");
//		unTb.sendKeys(Keys.CONTROL+"ac");
//		WebElement pwTB = driver.findElement(By.id("password"));
//		pwTB.clear();
//		pwTB.sendKeys(Keys.CONTROL+"v");
		
		//Copy paste the data from one textBox to another textbox without using
		//Shortcut keys
		
		WebElement unTb = driver.findElement(By.id("email"));
		unTb.clear();
		unTb.sendKeys("Bhanu");
		String s = unTb.getAttribute("value");
		WebElement pwTB = driver.findElement(By.id("password"));
		pwTB.clear();
		pwTB.sendKeys(s);
	}

}
