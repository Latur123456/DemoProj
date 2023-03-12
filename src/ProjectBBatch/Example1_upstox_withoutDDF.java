package ProjectBBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_upstox_withoutDDF {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\New chrome driver file\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	 // go to grow url
	driver.get("https://login-v2.upstox.com/");
	// enter the USERID
	driver.findElement(By.xpath("//input[@name='userId']")).sendKeys("4JBMM6");
	//ENTER THE PASSWORD
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Akshay@1993");
	 // click on sign in
	 driver.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
	 Thread.sleep(2000);
	// Enter the passcode
	 driver.findElement(By.xpath("// input [@name='yob']")).sendKeys("1993");
	 Thread.sleep(4000);
	 // click welcome
	 driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
	 
	 
	 // verify account
	  String actid = driver.findElement(By.xpath("//span[text()='akshay d.']")).getText();
	  String extid="Akshay D.";
	       boolean result = actid.equals(extid);
	  System.out.println("Result:"+result);
	  if(result= true)
	  {
		  System.out.println("TC Pass: valid User");
		  
	  }
	  else
	  {
		  System.out.println("TC Fail:invalid User");
	  }
	 
		
	}
}
