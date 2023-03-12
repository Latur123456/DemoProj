package Dataprovider;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
	WebDriver driver;
	@BeforeClass
	public void initbrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chrome  driver path\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  }
	
	@Test(dataProvider="orange")
	public void testLogin(String username,String password)
	{
		System.out.println(username);
		System.out.println(password);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("username");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		WebElement button=driver.findElement(By.xpath("//button[@type='submit']"));
		button.click();
		
	}
	@DataProvider(name="orange")
	public String[][]hrm()throws IOException
	{
		String data[][]=DataProvider1.getData();
		data=DataProvider1.getData();
		 return data;
	}

	private static String[][] getData() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
