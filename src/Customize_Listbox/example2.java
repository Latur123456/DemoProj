package Customize_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example2 {
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
		//step4
		for(int i=1;i<=5;i++)
		{
			act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(3000);
			}
		act.sendKeys(Keys.ENTER).perform();
		for(int i=1;i<=2;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(3000);
			
		}
		act.sendKeys(Keys.ENTER).perform();
}
}
