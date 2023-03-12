package WEBTABLE;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getrowsize{
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\chrome  driver path\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/PARMESHWAR/Desktop/WEB.html");
	  Dimension Rowsize = driver.findElement(By.xpath("//table[@id='1234']")).getSize();
	 System.out.println(Rowsize);
	}
}

