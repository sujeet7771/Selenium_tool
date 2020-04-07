package popupss;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingFileUploadPopUp {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost:8080/login.do");
		WebElement linkText = driver.findElement(By.xpath("//a[@target='_blank']"));
		linkText.click();
		String pw = driver.getWindowHandle();
		Set<String> tabs = driver.getWindowHandles();
		int count = tabs.size();
		System.out.println(count);
		for (String tab : tabs) {
			driver.switchTo().window(tab);
			if (pw.equals(tab)) {
				String pTabTitle = driver.getTitle();
				System.out.println("parent tab title"+pTabTitle);
			}
			else {
				String cTabTitle = driver.getTitle();
				System.out.println("child tab title"+cTabTitle);
				 WebElement hcTab = driver.findElement(By.xpath("//a[text()='Help Centre']"));
				Actions act = new Actions(driver);
				act.moveToElement(hcTab).perform();
				int yaxis = driver.findElement(By.xpath("//label[text()='Question']")).getLocation().getY();
				     JavascriptExecutor jse = (JavascriptExecutor)driver;
				     jse.executeScript("window.scrollTo(0,"+yaxis+")");
				    String filepath = "C:\\Users\\Dell\\Desktop\\Sujeet yadav QA resume.docx";
				 	driver.findElement(By.id("fileupload")).sendKeys(filepath);
				     
				
				
				
				
				
			}
				
			}
		}
	    
		

	}


