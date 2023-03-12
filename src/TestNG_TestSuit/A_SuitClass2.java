package TestNG_TestSuit;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A_SuitClass2 {
  @Test(priority=2)
  public void Tc3()
  {
	  Reporter.log("Running tc3",true);
  }
  @Test(priority=3)
  public void Tc4()
  {
	  Reporter.log("Running tc4",true);
  }
	  
  }
 