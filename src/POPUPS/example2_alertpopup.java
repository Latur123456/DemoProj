package POPUPS;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_alertpopup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome  driver path\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration. ofSeconds(20));
	// get method
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	// enter the cust id
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("6666");
	// click on submit button
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	Alert alt=driver.switchTo().alert();
	// handle Alert  --- shift focus from main page to alert window
 String text=	driver.switchTo().alert().getText();
 System.out.println(text);
 //click on ok button
 driver.switchTo().alert().accept();
 String text1 =driver.switchTo().alert().getText();
 System.out.println(text1);
 // click on cancel button
 driver.switchTo().alert().dismiss();
 
 
	}
	

}
