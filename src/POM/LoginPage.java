package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebElement username;
	private WebElement password;
	private WebElement button1;
	

public  LoginPage(WebDriver driver)
{
	username=driver.findElement(By.xpath("//input[@name='username']"));
	password=driver.findElement(By.xpath("//input[@name='password']"));
		button1	=driver.findElement(By.xpath("//button[@type='submit']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
}
   public void Login()  
   {
	   username.sendKeys("Admin");
	   
       password.sendKeys("admin123");
       
       button1.click();
       
   }
}
