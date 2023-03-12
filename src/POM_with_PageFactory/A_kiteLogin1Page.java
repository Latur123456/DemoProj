package POM_with_PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A_kiteLogin1Page {
// step1 declaration of variable globally with access level private	
	@FindBy(xpath="//input[@id='userid']") private WebElement UN;
	@FindBy(xpath="//input[@id='password']") private WebElement Pass;
	@FindBy(xpath="//button[text()='login']") private WebElement SbtBtn;
	// step 2 Initialize within a constructor with access level public
	 public A_kiteLogin1Page(WebDriver driver)
	 {
		PageFactory.initElements(driver, this);
	 }
// step 3 usage :utilize within a method access level public
	 public void enterUN()
	 {
		 UN.sendKeys("DV1510");
		 
	 }
	 public void enterPass()
	 {
		 Pass.sendKeys("Pass@123");
	 }
	 public void clickButton()
	 {
		 SbtBtn.click();
	 }

}
