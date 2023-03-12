package POPUPS;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_alllink {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\New chrome driver file\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// get method
		driver.get("https://www.facebook.com/");
	    Thread.sleep(3000);   
	List<WebElement> alllink = driver.findElements(By.xpath("//a"));
	System.out.println("size:"+alllink.size());
	for(WebElement text:alllink)
	{
		System.out.println(text.getText());
	}
	
	}

	
} 
