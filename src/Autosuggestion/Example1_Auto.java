package Autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_Auto {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\New chrome driver file\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();	
	driver.get("https://www.google.com/");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("bangalore");
	Thread.sleep(3000);
	
	List<WebElement> auto = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/l"));
	  int autosize = auto.size();
	  System.out.println(autosize);
	  Thread.sleep(3000);
	  auto.get(autosize).click();
	
	}

}
