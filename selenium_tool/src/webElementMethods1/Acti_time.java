package webElementMethods1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acti_time {
	private static WebElement pwTb1;

	static {
   System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}
		
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8080/login.do");
		driver.manage().window().maximize();
		//driver.findElementByName("username").sendKeys("admin");
		//driver.findElementByName("pwd").sendKeys("manager");
		 //acti_time login-in
		
		//driver.findElementByClassName("initial").click();
		System.out.println("=====================================");
		// to find the X and Y axes of User name and password field
		
		WebElement unTB = driver.findElementByName("username");
		int xaxunTB = unTB.getLocation().getX();
		System.out.println("username textBox xaxis:"+xaxunTB);
		int yaunTB = unTB.getLocation().getY();
		System.out.println("username textBox yaxis:"+yaunTB);
		System.out.println("================================");
		WebElement pwTB = driver.findElementByName("pwd");
		int xapwTB = pwTB.getLocation().getX();
		System.out.println("password textBox xaxis:"+xapwTB);
		int yapwTB = pwTB.getLocation().getY();
		System.out.println("password textBox yaxis:"+yapwTB);
		System.out.println("=============================");
		
		// getting size and height
		
		WebElement un = driver.findElementByName("username");
		int hofUN = un.getSize().getHeight();
		System.out.println("height of the UsernameTextBox is:"+hofUN);
		int wofun = un.getSize().getWidth();
		System.out.println("width of the UsernameTextBox is:"+wofun);
		
		System.out.println("=======================================");
		WebElement pwTb = driver.findElementByName("pwd");
		int hpwTB = pwTb.getSize().getHeight();
		System.out.println("height of the PasswordTextBox is:"+hpwTB);
		int wpwTB = pwTb.getSize().getWidth();
		System.out.println("width of the PassWordTextBox is:"+wpwTB);
		System.out.println("===========================================");
		
				
		
		
		 
		
		

		
		

		

	
		
	
		

	}

}
