package TESTNGBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parameter2 {
	WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void BrowserTest(String s)
	{
		if(s.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\New chrome driver file\\chromedriver.exe");
			   driver=new ChromeDriver();
			 driver.get("https://myaccount.google.com/"); 
			driver.manage().window().maximize();
		}
			
	}
	@Test
	public void f1()
	{
	String title=driver.getTitle();
	System.out.println("test is running of:"+title+"page");
	}
	
	

}
