package methodsWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TagNameOfLog extends BaseTest
{

	public static void main(String[] args)
	{
		
		BaseTest.openAPP("chrome");
		WebElement logo = driver.findElement(By.className("logo"));
		String s = logo.getTagName();
		System.out.println(s);
	}

}
