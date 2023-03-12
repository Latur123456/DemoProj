package ProjectBBatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstoxlogin3page 
{
	// declaration of variable globally
	@FindBy(xpath="//div[text()='No, I’m good']")private WebElement welbtn;
  
	  // step2:utilize within method with access level public using pageFactory class
	
	public  upstoxlogin3page(WebDriver driver)
	{
       PageFactory.initElements(welbtn,this);		
	}
	// Utilize within method with access level public
	public void clickwelbtn()
	{
		welbtn.click();
	}
}
