package TestNG_TestSuit;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A_SuitClass1 {
	@Test
	public void Tc1()
	{
		Reporter.log("Running tc1",true);
	}
	@Test(priority=1)
	public void Tc2()
	{
		Reporter.log("Running tc2",true);
	}
	
	

}
