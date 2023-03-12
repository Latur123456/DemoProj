package WEBTABLE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5_getrowdata {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\New chrome driver file\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Parmeshwar/Desktop/Wtable1.html");
		for(int i=1;i<=3;i++)
		{
		String data=driver.findElement(By.xpath("//table[@id='1234']//tr[4]/td["+i+"]")).getText();
		      System.out.println(data);
		}
		 //data of all table
		System.out.println("-------data of table----");
	
		
		for(int i=2;i<=11;i++)
		{
		 for(int j=1;j<=3;j++)
		 {
			 // we need to concat i and j
			 String data1=driver.findElement(By.xpath("//table[@id='1234']//tr["+i+"]/td["+j+"]")).getText();
		      System.out.println(data1);
			 
		 }
		}
		
		
		 
}
}