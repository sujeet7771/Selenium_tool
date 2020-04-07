package popupss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import frame.LoginPage;

public class TestloginpageSujeet {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		            WebDriver driver=new ChromeDriver();
		            driver.manage().window().maximize();
		            driver.get("http://localhost:8080/login.do;jsessionid=6c935hjnipdkn");
		            LoginPage lp = new LoginPage(driver);
		            lp.setUserName("sujeet");
		            driver.navigate().refresh();  
		            lp.setpwd("manager");
		            lp.getlogin();
		            
		            
		            
		            
		

	}

}
