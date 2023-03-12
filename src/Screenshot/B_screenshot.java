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

public class B_screenshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome  driver path\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/login");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	//File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//File trg=new File("C:\\Users\\Parmeshwar\\Desktop\\screenshot3\\.png");
	//FileHandler.copy(src, trg);
	// screen shot as specific portion
	WebElement section = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
	
	   File src1=section.getScreenshotAs(OutputType.FILE);
	      File trg=new File("C:\\Users\\PARMESHWAR\\Desktop\\demo\\abc.jpg");
	      FileHandler.copy(src1, trg);
	
	}

}
