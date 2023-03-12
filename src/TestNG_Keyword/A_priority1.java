package TestNG_Keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A_priority1 {
  @Test(priority=1)
public void Tc1()
{
	  Reporter.log("Running Tc1",true);
 }
  @Test(priority=2)
  public void Tc2()
  {
  	  Reporter.log("Running Tc2",true);
   }
  @Test   // by default priority=0
  public void Tc3()
  {
  	  Reporter.log("Running Tc3",true);
   }
  @Test(priority=6)
  public void Tc4()
  {
  	  Reporter.log("Running Tc4",true);
   }
  @Test(priority=-3)
  public void Tc5()
  {
  	  Reporter.log("Running Tc5",true);
   }
{
	
}
}
