package POPUPS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_hiddendivision {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome  driver path\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
	    driver.get("https://www.nseindia.com/");
	    driver.manage().window().maximize();
	    // click on customize list
	    driver.findElement(By.xpath("//a[@class='btn']")).click();
	    Thread.sleep(3000);
	    
	    
	    
	    // click on strategy indices
	    driver.findElement(By.xpath("//h5[text()='Strategy Indices']")).click();
	    Thread.sleep(3000);
	
	
	
	
	}

}
