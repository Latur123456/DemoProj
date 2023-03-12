package TESTNGBasic;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class D_Annotations {
	@BeforeClass
	public void openbrowser()
	{
	  Reporter.log("open browser",true);
	  }
	@BeforeMethod
	public void LoginToApp()
	{
		 Reporter.log("Login App",true);
	  }
     @Test
     public void T2VerifyUserID()
     {
    	 Reporter.log("verify user id 2", true);
     }

     @Test
     public void T1VerifyUserID()
     {
    	 Reporter.log("verify user id 1",true);
     }
  @AfterMethod
   public void logout()
   {
	  Reporter.log("click on logout",true);
	  
   }
   @AfterTest
   public void closeBrowser()
   {
	   Reporter.log("close Browser",true);
   }

}
	
