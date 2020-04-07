package actitime;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
static {
	
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
}
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8080/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		String Title = driver.getTitle();
	//	System.out.println(Title);
		driver.findElement(By.xpath("//div[@class=\"popup_menu_icon warning_icon\"]")).click();
	
		

	}

}
