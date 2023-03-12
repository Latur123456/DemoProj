package POM_with_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A_kiteLogin3HOmePage {
	// step1 declare variable globally with access level private
	@FindBy(xpath="//span[@class='user-id']") private WebElement UserID;
public A_kiteLogin3HOmePage(WebDriver driver) {
		
	}
	// initialize constructor with access level public
	public void A_kiteLogin3HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	// utilize method with access level public
	public void verifyID()
	{
		String actid=UserID.getText();
		String expId="DV1510";
		if (actid.equalsIgnoreCase(expId));
		{
			System.out.println("pass");
		}
		
		{
			System.out.println("fail");
			
		}
		
	}
}
