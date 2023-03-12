package TESTNGBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B_Testng_Test_class {
	public void Openkite()
	{
		System.setProperty("webdriver.chrome.driver","C:\\New chrome driver file\\chromedriver.exe");
 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/");
		
		}
		
	}


