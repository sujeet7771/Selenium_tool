package methodsWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GetTextFromWebLink extends BaseTest
{

	public static void main(String[] args)
	{
		
		BaseTest.openAPP("chrome");
		WebElement wlink = driver.findElement(By.xpath("(//a[@target='_blank'])[2]"));
		String text = wlink.getText();
		System.out.println("WebLink Text is---->"+text);
	}

}
