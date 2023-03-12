package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example3_double_click {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\New chrome driver file\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(3000);
		// identify the dropdown element
		WebElement dclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Thread.sleep(3000);
		
		// create object action class with WebDriver object as input  
		
		Actions act= new Actions(driver);
		//step3
		//method1
		
		//act.doubleClick(dclick ).perform();
		// method2
		//act.moveToElement(dclick ).doubleClick().build().perform();
		//method3
		
		//act.contextClick().perform();
       // act.moveToElement(dclick ).contextClick().build().perform();
	  act.moveToElement(dclick).perform();
		act.doubleClick().perform();
	
	}
}
