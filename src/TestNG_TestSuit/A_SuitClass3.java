package TestNG_TestSuit;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A_SuitClass3 {
	@Test(priority=4)
	  public void Tc5()
	  {
		  Reporter.log("Running tc5",true);
	  }
	  @Test(priority=5)
	  public void Tc6()
	  {
		  Reporter.log("Running tc6",true);
	  }

	
	

	}


