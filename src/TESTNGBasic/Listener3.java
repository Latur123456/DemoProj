package TESTNGBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners
public class Listener3 {
	public static WebDriver driver;
	@BeforeTest
	public void initBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chrome  driver path\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test(priority=1)
	public void login() throws InterruptedException
	{
		// enter username
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		 Thread.sleep(5000);
	    // enter password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin1234");
		 Thread.sleep(5000);
	  // click on login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	   Thread.sleep(5000);
	   Assert.assertTrue(false);
	   
	}
	//@Test(priority=2)
	//public void homepage() throws InterruptedException
	//{
	//System.out.println("this is second test case which is for homepage");
	//Thread.sleep(4000);
	//Assert.assertTrue(false);
}


