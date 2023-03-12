package Customize_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example4_rightclick {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\New chrome driver file\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/books");
		Thread.sleep(3000);
		  
		// right click
		Actions act=new Actions(driver);
		
		  WebElement booklist = driver.findElement(By.linkText("Books"));
      
		   act.moveToElement(booklist).build().perform();
		   
		   
		
		  
	
	
	}

}

