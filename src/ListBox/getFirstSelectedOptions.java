package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getFirstSelectedOptions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
	    driver.get("file:///C:/Users/Parmeshwar/Desktop/abc.html");
	     Thread.sleep(3000);
	     
	     // step 1 select webelement which need to be handled then store it rv
	    WebElement  country=driver.findElement(By.xpath("//select[@id='1234']"));
	
	    // step 2
	    Select cc=new Select(country);
	    Thread.sleep(3000);
	    // step 3
	    cc.selectByIndex(1);
	    cc.selectByVisibleText("IND");
	    //method  :1
	
	      WebElement selectOption=cc.getFirstSelectedOption();
	      String text=selectOption.getText();
	      System.out.println(text);
	
	
	}

}
