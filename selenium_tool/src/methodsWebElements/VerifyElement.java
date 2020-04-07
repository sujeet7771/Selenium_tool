package methodsWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VerifyElement extends BaseTest
{

	public static void main(String[] args) throws InterruptedException 
	{
		BaseTest.openAPP("chrome");
		WebElement unTb = driver.findElement(By.id("email"));
		if(unTb.isDisplayed())
		{
			System.out.println("The UserNameTextBox is Displayed");
		}
		else
		{
			System.out.println("The UserNameTextBox is not Displayed");
		}
		System.out.println("=============================================");
		//Element is Enabled or not
		
		if(unTb.isEnabled())
		{
			System.out.println("The UserNameTextBox is Enabled");
		}
		else
		{
			System.out.println("The UserNameTextBox is Disabled");
		}
		Thread.sleep(2000);
		System.out.println("===========================================");
		driver.navigate().to("file:///C:/Users/Sunil/Desktop/dynamicid.html");
		WebElement unTb1 = driver.findElement(By.id("mss8545"));
		unTb1.sendKeys("Bhanu");
		System.out.println(unTb1.isEnabled());
		
		

	}

}
