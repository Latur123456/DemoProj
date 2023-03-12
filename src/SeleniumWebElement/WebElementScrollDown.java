package SeleniumWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementScrollDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome  driver path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	   driver.get("https://vctcpune.com/selenium/practice.html#");
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("window.scrollBy(0,300)");
	   Thread.sleep(400);
	  WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
	  Select sel=new Select(dropdown);
	  if(sel.isMultiple())
	  {
		sel.selectByIndex(2);
		sel.selectByIndex(3);
	  }
	  else
	  {
		  System.out.println("drop down is asingle select value");
		  sel.selectByIndex(1);
	  }
	}

}
