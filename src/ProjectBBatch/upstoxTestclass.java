package ProjectBBatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upstoxTestclass {
	// main method is present
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\New chrome driver file\\chromedriver.exe");	
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		// go to upstox URL
		driver.get("https://login-v2.upstox.com/");
		upstoxlogin1page obj1=new upstoxlogin1page(driver);
		obj1.enterUN();
		obj1.enterPWD();
		obj1.clickbtn();
		Thread.sleep(3000);
		upstoxlogin2page obj2=new upstoxlogin2page(driver);
		obj2.enterPIN();
		
		Thread.sleep(3000);
		
		upstoxlogin3page obj3=new upstoxlogin3page(driver);
		
		obj3.clickwelbtn();
		Thread.sleep(3000);
		upstoxlogin4page obj4=new upstoxlogin4page(driver);
		obj4.varifyURNM();
	}

}
