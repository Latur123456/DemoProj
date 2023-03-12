package TestNGj_Compatibility_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A_Multibrowser_Testing {
  
	@Parameters("browserName")
	@Test
	public void TC(String browserName)
	{
	  WebDriver driver=null;
	  if(browserName.equals("chrome"))
	  {
		  System.setProperty("Webdriver.chrome.driver", "C:\\New chrome driver file\\chromedriver.exe");
	  driver=new ChromeDriver();
	  org.openqa.selenium.point p=new org.openqa.selenium.point(500,700);
	     driver.manage().window().setPosition(p);
	     
	}else if(browserName.equals("firefox"))
	{
	   System.setProperty("webdriver.gecko.driver", "C:\\firefox driver\\geckodriver.exe");	
	   FirefoxDriver driver1 = new FirefoxDriver();
	    driver.get("https://www.google.com/");   
	}  
	
}
}
