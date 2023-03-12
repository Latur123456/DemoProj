package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest2 {
	public WebDriver driver;
	@BeforeClass
	public void initBrowser()
	{
	  System.setProperty("webdriver.chrome.driver", "C:\\chrome  driver path\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	  @Test
	  public void login()
	  {
		  LoginPage2 lp=new LoginPage2(driver);
		  lp.Login();
	  }
	  @AfterClass
	  public void afterclass()
	  {
		  driver.close();
	  
	}

}
