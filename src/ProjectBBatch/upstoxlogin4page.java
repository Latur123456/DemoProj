package ProjectBBatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstoxlogin4page {
	// regular class i.e main method not present
	//declaration of variable globally
 @FindBy(xpath="//span[text()='akshay d.']")private WebElement Usernm;
 
 //step2:utilize within method with access level public using pageFactory class
 
 public  upstoxlogin4page(WebDriver driver)
 {
	 PageFactory.initElements(driver,this);
 }
 
		 
	// step 3:Utilize within method with access level public 
    public void varifyURNM()
    {
    	String actid=Usernm.getText();
    	String extid="Akshay D.";
    	boolean result=actid.equals(extid);
    	System.out.println("Result:"+result);
    	if(result=true)
    	{
    		System.out.println("TC PASS:valid User");
    	}
    	else
    	{
    		System.out.println("TC fail:invalid User");
    	}

}

}

