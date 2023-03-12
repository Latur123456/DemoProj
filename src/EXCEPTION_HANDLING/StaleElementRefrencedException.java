package EXCEPTION_HANDLING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefrencedException {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\chrome  driver path\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sarwadeps100@gmail.com");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Latur@123");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//button[@name='login']")).click();
      driver.findElement(By.xpath("https://www.amazon.com/")).click();
       driver.navigate().back();
       Thread.sleep(3000);
      // try
       //{
    	 //  link.click();
       //}
       //catch()
	}

}
