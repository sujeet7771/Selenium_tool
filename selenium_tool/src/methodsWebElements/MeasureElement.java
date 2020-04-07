package methodsWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MeasureElement extends BaseTest 
{

	public static void main(String[] args) 
	{
		BaseTest.openAPP("chrome");
		
		WebElement unTB = driver.findElement(By.id("email"));
		int xaxunTB = unTB.getLocation().getX();
		System.out.println("username textBox xaxis:"+xaxunTB);
		int yaunTB = unTB.getLocation().getY();
		System.out.println("username textBox yaxis:"+yaunTB);
		System.out.println("================================");
		WebElement pwTB = driver.findElement(By.id("password"));
		int xapwTB = pwTB.getLocation().getX();
		System.out.println("password textBox xaxis:"+xapwTB);
		int yapwTB = pwTB.getLocation().getY();
		System.out.println("password textBox yaxis:"+yapwTB);
		System.out.println("=============================");
		if(xaxunTB==xapwTB)
		{
			System.out.println("Allignment is proper");
		}
		else
		{
			System.out.println("Allignment is not proper");
		}
	}

}
