package frame;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
private WebElement unTB;
private WebElement pwTB;
private WebElement login;

public LoginPage( WebDriver driver)
{
	unTB=driver.findElement(By.id("username"));
	pwTB=driver.findElement(By.name("pwd"));
	login=driver.findElement(By.xpath("//div[text()='Login ']"));
	
	}
public void setUserName(String un)
{
	unTB.sendKeys(un);
	}
public void setpwd(String pw)
{
	unTB.sendKeys(pw);
	}
public void getlogin()
{
	login.click();
}

	}




