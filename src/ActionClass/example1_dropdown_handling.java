package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example1_dropdown_handling {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\New chrome driver file\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(3000);
	// identify the dropdown element
	WebElement acctandlist = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
	Thread.sleep(3000);
	
	// create object action class with WebDriver object as input  
	
	Actions act= new Actions(driver);
	
	//3 call actions class method
	act.moveToElement(acctandlist).perform();
	
	//click  on babylistoption
	driver.findElement(By.xpath("//span[text()='Baby Wishlist']")).click();
	Thread.sleep(3000);
	driver.navigate().back();

	}

}
