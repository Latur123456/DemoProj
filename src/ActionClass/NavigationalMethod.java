package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalMethod {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("Webdriver.chrome.driver", "C:\\chrome  driver path\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@class='gLFyf']"));
	
	Thread.sleep(3000);
	driver.navigate().to("https://www.facebook.com");
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	}

}
