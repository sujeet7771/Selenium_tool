package methodsWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
/**
 * Check the CheckBox
 * @author Sunil
 *
 */
public class VerifyElement2 extends BaseTest
{

	public static void main(String[] args) throws InterruptedException 
	{
		BaseTest.openAPP("chrome");
		WebElement ks = driver.findElement(By.xpath("//label[text()='Keep me signed in']"));
		ks.click();
		WebElement chkBOx = driver.findElement(By.xpath("//input[@type='checkbox']"));
		if(chkBOx.isSelected())
		{
			System.out.println("The CheckBox is Selected");
		}
		else
		{
			System.out.println("The CheckBox is not Selected");
		}
	}

}
