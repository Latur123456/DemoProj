package TestNGSoftAssert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionHardTrue {
	@Test
	public void f()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chrome  driver path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		Boolean b=title.equalsIgnoreCase("google");
		Assert.assertTrue(b);
		System.out.println("Title of web page is:"+title);
	}

}
