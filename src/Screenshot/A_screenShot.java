package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class A_screenShot 
{
  public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\chrome  driver path\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.flipkart.com/");
	WebElement UN= driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
	  Thread.sleep(1000);
	   WebElement UN1=driver.findElement(By.xpath("//input[@type='password']"));
	  UN.sendKeys("8412860160");
	  Thread.sleep(3000);
	 
	 UN1.sendKeys("Latur@123");
	 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
	 
	 Thread.sleep(3000);
	  
	  String Rs1=RandomString.make(5);
	 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 
	 File dest=new File("\"C:\\Users\\PARMESHWAR\\Desktop\\screenshot\"flip"+Rs1+".jpg");
	 FileHandler.copy(src, dest);
}
}
