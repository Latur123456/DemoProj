package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselectmethod {
	public static void main(String[] args) throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("file:///C:/Users/Parmeshwar/Desktop/abc.html");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  //step 1
	  WebElement d1=driver.findElement(By.xpath("//select[@id='1234']"));
	  
		// step 2
	  
	    Select j1=new Select(d1);
	    Thread.sleep(3000);
	    
	    // step 3
	    
	 // j1.selectByIndex(0);
	  j1.deselectByVisibleText("IND");
	 // j1.selectByIndex(1);
	  //j1.selectByIndex(2);
	
	  // List<WebElement>all=j1.getAllSelectedOptions();
	   //for(WebElement p:all)
	   //{
		//   System.out.println("firstp"+p.getText());
	   //}
	
	  //  j1.deselectByIndex(0);
	    //j1.deselectByVisibleText("Pak");
	   // j1.deselectAll();
	}

	
}
