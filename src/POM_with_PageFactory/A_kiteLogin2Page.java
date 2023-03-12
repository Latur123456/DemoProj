package POM_with_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A_kiteLogin2Page {
	// declare the variable globally with access level private
	@FindBy(xpath="//input[@id='pin']") private WebElement pin;
  @FindBy(xpath="button[text()='Continue']") private WebElement ctnBtn;
  
  // step2 Initialize within constructor with access level public
   
  public A_kiteLogin2Page(WebDriver driver)
  {
	  PageFactory.initElements(driver, this);
	  
  }
  public void enterpin()
  {
	  pin.sendKeys("999999");
  }
  public void clickButton2()
  {
	  ctnBtn.click();
  }
}
