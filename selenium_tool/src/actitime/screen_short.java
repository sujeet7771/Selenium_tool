package actitime;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class screen_short {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/Chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/login.do");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.id("loginButton")).click();
        //driver.findElement(By.xpath("(//div[@class=\"img\"])[4]")).click();
        TakesScreenshot ts = (TakesScreenshot)driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
                      File des = new File("./photo/actitimeuser.jpg");
                     FileUtils.copyFile(src, des);
                   
        


	

	}

}



