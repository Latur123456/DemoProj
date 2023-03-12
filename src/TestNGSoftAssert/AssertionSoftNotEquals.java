package TestNGSoftAssert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionSoftNotEquals {

	@Test
	public void f()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chrome  driver path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		SoftAssert as=new SoftAssert();
		as.assertNotEquals(title,"Google");
		System.out.println("Title is:"+title);
		as.assertAll();
		System.out.println("Last Assert statement");
		
	}
}
