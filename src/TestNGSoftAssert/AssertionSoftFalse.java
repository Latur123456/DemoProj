package TestNGSoftAssert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionSoftFalse {

	@Test
	public void f()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chrome  driver path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		boolean b = title.equalsIgnoreCase("Googlee");
		SoftAssert as=new SoftAssert();
		as.assertFalse(b);
		as.assertAll();
		System.out.println("Last Assert statement");
		
}}
