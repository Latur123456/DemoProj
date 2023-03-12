package Iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_dynamichandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\New chrome driver file\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	   // get method
	    driver.get("https://www.flipkart.com/");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    //click on close button
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z")).click();
		
	    
	    //search the mobile
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Apple13");
	// click on search
	driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
	String rating=driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[6]")).getText();
	System.out.println(rating);
	}

}
