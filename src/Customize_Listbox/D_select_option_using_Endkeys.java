package Customize_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D_select_option_using_Endkeys {
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
	// step 3 use action class method to select option
	act.click(month).perform();
	Thread.sleep(3000);
	// move to end
	act.sendKeys(Keys.END).perform();
	for(int i=1;i<=8;i++)
	{
		act.sendKeys(Keys.ARROW_UP).perform();
	}
   
	act.sendKeys(Keys.ENTER).perform();
 
 
 
 }
}
