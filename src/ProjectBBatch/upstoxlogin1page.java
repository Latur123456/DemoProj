package ProjectBBatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class upstoxlogin1page {
	
	// regular class ie main method not present
	// declaration of variable globally
	@FindBy(xpath="//input[@name='userId']")private WebElement UN;//WebElement UN=driver.findElement(By.xpath(""));
    @FindBy(xpath="//input[@name='password']")private WebElement PWD;//WebElement PWD=driver.findElement(By.xpath(""));
  @FindBy(xpath="//div[text()='Sign into Upstox']")private WebElement sinbtn;//WebElement sinbtn=driver.findElement(By.xpath(""));
//step2: Initialize within constructor with access level public using pagefactory class
  
  public  upstoxlogin1page(WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
  }
   
  //step3: utilize within method with access level public
  
  public void enterUN()
  {
	  UN.sendKeys("4JBMM6");
  }
  public void enterPWD()
  {
	  PWD.sendKeys("Akshay@1993");
  }
    public void clickbtn()
    {
    	sinbtn.click();
    }
  
}
