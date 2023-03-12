package POPUPS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_hiddendivision {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\New chrome driver file\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration. ofSeconds(20));
// get method
driver.get("https://www.flipkart.com/");
// click on close button

driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
  // click login
driver.findElement(By.xpath("//a[@class='_1_3w1N']")).click();
// Enter the UN
driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("33333");
}
}
