package TESTNGBasic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prppertyfilereading {
	public static Properties prop;
	
	public static void readProperty() throws IOException 
	{
		String path=("G:\\ECLIPSE BACKUP 10-12-22\\2ND JULY MORNING B\\Pomddfproperty.properties");
	
   prop=new Properties();
   FileInputStream fis=new FileInputStream(path);
   prop.load(fis);
   String AdminEmail=prop.getProperty("email");
   String AdminPass=prop.getProperty("pass");
   System.out.println("value of Email key:"+AdminEmail);
   System.out.println("value of pass key:"+AdminPass);
	}
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chrome  driver path\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys(prop.getProperty("email"));
	   Thread.sleep(4000);
	   driver.findElement(By.xpath("//input[@type='password']")).sendKeys(prop.getProperty("pass"));
	   Thread.sleep(4000);
	   driver.findElement(By.xpath("//button[@type='submit']")).click();
	   Thread.sleep(4000);
	   driver.close();
	}
	
   
}
