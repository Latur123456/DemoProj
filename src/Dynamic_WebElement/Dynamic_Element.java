package Dynamic_WebElement;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Element {
 public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "C:\\chrome  driver path\\chromedriver.exe ");
	  WebDriver driver=new ChromeDriver();
	  Thread.sleep(3000);
	   driver.get("https://www.flipkart.com/");
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   // close login button
	   driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	   
	   // search product
	   driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("Apple13pro");
	  // Thread.sleep(3000);
	   // click on search/submit button of product search
	  driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	  // Thread.sleep(3000);
	   
	   // select rating
	  String rate = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/div/div")).getText();
       System.out.println(rate);
       //select review
       String rev=driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[2]/span[2]/span/span[3]")).getText();
       System.out.println(rev);
 
 }     
}
