package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get {
	public static void main(String[] args) {
		
	   driver.get("https://www.facebook.com/login/");
	   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("amol");  
	   }

}
