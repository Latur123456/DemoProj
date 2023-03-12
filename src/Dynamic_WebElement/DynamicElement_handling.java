package Dynamic_WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicElement_handling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome  driver path\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.flipkart.com/");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	  driver.findElement(By.xpath("//input[@type='text']")).sendKeys("IPhone11");
	  
	}

}
