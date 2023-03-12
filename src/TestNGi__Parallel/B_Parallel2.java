package TestNGi__Parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class B_Parallel2 {
	
	@Test
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chrome  driver path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
				
	}
}
