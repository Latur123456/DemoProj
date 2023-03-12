package Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	Thread.sleep(3000);
	 driver.get("https://www.flipkart.com/");
	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("search");
	  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234567890");
	  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
	
	
	}

}
