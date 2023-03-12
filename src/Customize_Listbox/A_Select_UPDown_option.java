package Customize_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A_Select_UPDown_option 
{
 public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\New chrome driver file\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	// click on create new account
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(3000);
	// select the monthlistbox
	// step1
	WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
	//step 2 use of action
	Actions act=new Actions(driver);
	// step 3
	act.click(month).perform();
	Thread.sleep(3000);
	//4a
	act.sendKeys(Keys.ARROW_UP).perform();
	Thread.sleep(3000);
	//4c
	act.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(3000);
	
	act.sendKeys(Keys.ENTER).perform();
	Thread.sleep(3000);
	
	
}
}
