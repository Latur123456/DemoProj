package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\New chrome driver file\\chromedriver.exe");
	
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
          Thread.sleep(3000);
	    // driver.switchTo().frame("iframeResult");
	     driver.switchTo().frame("iframeResult");
	    // driver.switchTo().frame("//button[@type='button']");
	    // driver.switchTo().frame(0);
	    // ((WebElement) driver.switchTo().frame(driver.findElement(By.xpath("//button[contains(text(), 'Click me to display D')]")))).click();
	     driver.findElement(By.xpath("//button[contains(text(), 'Click me to display D')]")).click();
	     Thread.sleep(3000);
	    // driver.switchTo().parentFrame();
	     //driver.switchTo().defaultContent();
	     
	 // driver.findElement(By.xpath("//a[@id='tryhome']")).click();
	       
	}

}
