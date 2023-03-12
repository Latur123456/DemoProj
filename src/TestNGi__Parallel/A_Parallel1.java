package TestNGi__Parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A_Parallel1 {
	@Test
	public void Openkite() throws InterruptedException  
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chrome  driver path\\chromedriver.exe");
	  
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
	 driver.get("https://kite.zerodha.com/"); 
	 driver.close();
	 System .exit(0);
	
	}
	

}
