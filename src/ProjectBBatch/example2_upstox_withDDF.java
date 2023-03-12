package ProjectBBatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_upstox_withDDF {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\New chrome driver file\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		 // go to grow url
		driver.get("https://login-v2.upstox.com/");

		FileInputStream file=new FileInputStream("C:\\Users\\Parmeshwar\\Desktop\\upstox.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		// enter the USERID
		String UN = sh.getRow(0).getCell(0).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@name='userId']")).sendKeys(UN);
		//ENTER THE PASSWORD
		String PWD = sh.getRow(0).getCell(1).getStringCellValue();
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(PWD);
		 // click on sign in
		 driver.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
		 Thread.sleep(2000);
		// Enter the passcode
		 String PIN = sh.getRow(0).getCell(2).getStringCellValue();
		 driver.findElement(By.xpath("// input [@name='yob']")).sendKeys(PIN);
		 Thread.sleep(4000);
		 // click welcome
		 driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
		 
		 
		 // verify account
		  String actid = driver.findElement(By.xpath("//span[text()='akshay d.']")).getText();
		  String extid="Akshay D.";
		       boolean result = actid.equals(extid);
		  System.out.println("Result:"+result);
		  if(result= true)
		  {
			  System.out.println("TC Pass: valid User");
			  
		  }
		  else
		  {
			  System.out.println("TC Fail:invalid User");
		  }
		 
			
		
		
}
}