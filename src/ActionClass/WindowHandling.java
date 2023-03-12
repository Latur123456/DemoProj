package ActionClass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chrome  driver path\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html#");
		 Thread.sleep(4000);
	   String parent=driver.getWindowHandle();
	   System.out.println("parent id:"+parent);
	   Thread.sleep(4000);
	   JavascriptExecutor je=(JavascriptExecutor)driver;
	   je.executeScript("window.scrollBy(0,700)") ;
	   Thread.sleep(4000);
	  driver.findElement(By.id("//a[@id='opentab']")).click();
	  Thread.sleep(4000);
	 Set<String> all_tab = driver.getWindowHandles();
	   for(String id:all_tab)
	   {
		   System.out.println(id);
		   if(!parent.equalsIgnoreCase(id))
		   {
			   driver.switchTo().window(id);
			   driver.getTitle();// getting title of second window
            System.out.println("title of current page is:+title");
           Thread.sleep(4000);
           driver.close();//close the second tab
           
           
		   }
	   }
	  driver.switchTo().window(parent);
	  Thread.sleep(4000);
	  String url=driver.getCurrentUrl();
	  System.out.println("current url is:"+url);
	  Thread.sleep(4000);
	  driver.close();
	}

}
