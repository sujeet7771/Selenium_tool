package methodsWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RetriveDataFromTextBox extends BaseTest
{

	public static void main(String[] args)
	{
		
		BaseTest.openAPP("chrome");
		WebElement unTb = driver.findElement(By.id("email"));
		String s = unTb.getAttribute("value");
		System.out.println(s);
		unTb.clear();
		unTb.sendKeys("BPrakash");
		String s1 = unTb.getAttribute("value");
		System.out.println(s1);
		String s3 = unTb.getAttribute("id");
		System.out.println(s3);
		
		
	}

}
