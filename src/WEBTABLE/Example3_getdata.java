package WEBTABLE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_getdata {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\New chrome driver file\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Parmeshwar/Desktop/Wtable1.html");
		
		 
		//String data= driver.findElement(By.xpath("//table[@id='1234']")).getText();
	      //System.out.println(data);
	      
	      // get the header
	      
	      String data1= driver.findElement(By.xpath("//table[@id='1234']//tr[3]")).getText();
	      System.out.println(data1);
	      
	}
	
}
