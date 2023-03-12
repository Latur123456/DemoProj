package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 {
	@FindBy(id="textUsername")
	private WebElement username;

	@FindBy(id="textpassword")
	private WebElement password;
	
	@FindBy(id="btnLogin")
	private WebElement button1;
	public LoginPage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		 // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public void Login()
	{
		  
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		button1.click();
	}
	
}
