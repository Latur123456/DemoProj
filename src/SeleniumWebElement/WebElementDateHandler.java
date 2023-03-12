package SeleniumWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementDateHandler {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome  driver path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	   driver.manage().window().minimize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://jqueryui.com/resource/demos/datepicker/other-months");
	   driver.findElement(By.id("datepicker")).click();
	   while(true)
	   {
		   String s=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		   System.out.println("current Title is:"+s);
		   if(!s.equalsIgnoreCase("December2017"))
		   {
			   driver.findElement(By.xpath("//a[@title='Prev']")).click();
			   
		   }
		   else
		   {
			    break;
		   }
	   }
	}

}
