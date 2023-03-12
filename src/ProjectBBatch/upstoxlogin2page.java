package ProjectBBatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstoxlogin2page {
	// regular class ie main method not present
		// declaration of variable globally
@FindBy(xpath="// input [@name='yob']")	private WebElement PIN;//private WebElement=driver.findElement(By.xpath(""));	

public  upstoxlogin2page (WebDriver driver)
{
	PageFactory.initElements(driver,this);
	}
 //step3: utilize within method with access level public
   public void enterPIN()
   {
	   PIN.sendKeys("1993");
	   
   }


}
