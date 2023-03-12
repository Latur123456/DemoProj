package WEBTABLE;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_getrowsize {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome  driver path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/PARMESHWAR/Desktop/WEB.html");
		 int Rsize=driver.findElements(By.xpath("//table[@id='1234']")).size();
	      System.out.println(Rsize);
	
	//java.util.List<WebElement> ListRsize1 = driver.findElements(By.xpath("//table[@id='1234']"));
	  //  int size=ListRsize1.size();
	    //System.out.println(size);
	}
	

}
