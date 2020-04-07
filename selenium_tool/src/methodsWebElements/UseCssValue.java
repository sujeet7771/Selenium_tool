package methodsWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UseCssValue extends BaseTest
{

	public static void main(String[] args)
	{
		
		BaseTest.openAPP("chrome");
		WebElement unTb = driver.findElement(By.id("email"));
		String size = unTb.getCssValue("font-size");
		System.out.println(size);
		String c = unTb.getCssValue("color");
		System.out.println(c);
		String font = unTb.getCssValue("font-family");
		System.out.println(font);
		
	}

}
