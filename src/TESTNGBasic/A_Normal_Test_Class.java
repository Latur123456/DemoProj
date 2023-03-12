package TESTNGBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A_Normal_Test_Class {
	@org.junit.Test
	public void TC1()
	{

		System.setProperty("webdriver.chrome.driver","C:\\New chrome driver file\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://login-v2.upstox.com/");
	
	}

}
