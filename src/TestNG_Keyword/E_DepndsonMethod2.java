package TestNG_Keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class E_DepndsonMethod2 {
  @Test
  public void login1()
  {
	  Reporter.log("running login Tc1",true);
  }
  @Test(timeOut=5000)
  public void login2() throws InterruptedException
  {
	  Thread.sleep(7000);
	  Reporter.log("running login Tc2",true);
  }
  @Test(dependsOnMethods= {"login1","login2"})
  public void logout()
  {
	  Reporter.log("running logout Tc2",true);
  }
  @Test(timeOut=5000)
  public void login3() throws InterruptedException
  {
	  Thread.sleep(1000);
	  Reporter.log("running login Tc3",true);
  }

}


