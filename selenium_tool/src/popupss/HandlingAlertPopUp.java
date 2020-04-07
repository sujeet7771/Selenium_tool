package popupss;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlertPopUp {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/login.do");
	    driver.findElement(By.id("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    driver.findElement(By.xpath("//div[text()='Login ']")).click();
	    WebDriverWait wait = new WebDriverWait(driver,20);
	     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Settings')]")));
	    driver.findElement(By.xpath("//div[contains(text(),'Settings')]")).click();
	    driver.findElement(By.xpath("//a[text()='Logo & Color Scheme']")).click();
	    driver.findElement(By.id("uploadNewLogoOption")).click();
	    driver.findElement(By.id("FormModifiedDivButton")).click();
	    Alert s = driver.switchTo().alert();
	    s.accept();
	    // for getting data from the popup
	    String alerttext = s.getText();
	    System.out.println(alerttext);
	    		
	    
	}

}
