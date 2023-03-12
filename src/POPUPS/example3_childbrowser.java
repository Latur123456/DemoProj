package POPUPS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_childbrowser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\New chrome driver file\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// get method
		driver.get("https://skpatro.github.io/demo/links/");
		// click on new tab
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
	   // click on training option
		driver.findElement(By.xpath(""))
	}

}
