package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenshot_1 {
	

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
	
	    driver.get("https://www.facebook.com/");     
	    driver.manage().window().maximize();
	    Thread.sleep(4000);
	    
	
	    driver.findElement(By.xpath("//a[text()='Create New Account']"));
	    Thread.sleep(4000);
	    for(int i=0;i<=3;i++)
	    {
	     File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     System.out.println(src);
	     String str=RandomString.make(3);
	      File dest=new File("C:\\Users\\Parmeshwar\\Desktop\\Demo\\abcde1"+str+".jpg");
	       FileHandler.copy(src, dest);
	
	       
	}
	}
}
