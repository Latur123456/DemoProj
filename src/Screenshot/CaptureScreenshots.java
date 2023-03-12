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

public class CaptureScreenshots {
	public static void main(String[] args) throws IOException {
		
  System.setProperty("webdriver.chrome.driver", "C:\\chrome  driver path\\chromedriver.exe");		
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
	//File src=ele.getScreenshotAs(OutputType.FILE);
	File src1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File trg=new File("C:\\Users\\PARMESHWAR\\Desktop\\screenshot\\fb.png");
	FileHandler.copy(src1, trg);
	
	
	}
}
