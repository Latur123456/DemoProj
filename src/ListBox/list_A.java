package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class list_A {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome  driver path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
	     driver.get("https://www.facebook.com/");
	     driver.manage().window().maximize();
	     Thread.sleep(3000);
	     // to click on create new account
	         driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	         Thread.sleep(3000);
	         // step 1
	         WebElement month= driver.findElement(By.xpath("//select[@id='month']"));
	
	     // step 2
	   
	   Select m1=new Select(month);
	   // step3
	   
	   m1.selectByValue("4");
	   Thread.sleep(4000);
	   
	  // m1.selectByIndex(6);
	   
	     m1.selectByVisibleText("Nov");
	   
	  
	}

}
