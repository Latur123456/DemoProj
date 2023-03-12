package TestNGd_FailedTestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class A_FailedTestCases {
   @Test
   public void Tc1()
   {
	   Reporter.log("Running Tc1",true);
   }
   @Test
   public void Tc2()
   {
	   Reporter.log("Running Tc2",true);
   }
   @Test
   public void Tc3()
   {
	   Reporter.log("Running Tc3",true);
   }
   @Test
   public void Tc4()
   {    
	   Assert.fail();
	   Reporter.log("Running Tc4",true);
   }
   @Test
   public void Tc5()
   {
	   Reporter.log("Running Tc5",true);
   }
   @Test
   public void Tc6()
   {
	   Reporter.log("Running Tc6",true);
   }
}
