package methodsWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MeasureElementSize extends BaseTest
{

	public static void main(String[] args)
	{
		BaseTest.openAPP("chrome");
		WebElement unTb = driver.findElement(By.id("email"));
		int hunTB = unTb.getSize().getHeight();
		System.out.println("height of the UsernameTextBox is:"+hunTB);
		int wuTB = unTb.getSize().getWidth();
		System.out.println("width of the UsernameTextBox is:"+wuTB);
		
		System.out.println("=======================================");
		WebElement pwTb = driver.findElement(By.id("password"));
		int hpwTB = pwTb.getSize().getHeight();
		System.out.println("height of the PasswordTextBox is:"+hpwTB);
		int wpwTB = pwTb.getSize().getWidth();
		System.out.println("width of the PassWordTextBox is:"+wpwTB);
		
	}

}
