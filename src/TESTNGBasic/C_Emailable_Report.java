package TESTNGBasic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class C_Emailable_Report {
	// scenario1: use of sop
	@Test
	public void TC0()
	{
		System.out.println("running test case 0");
	}
	// scenario2:use of Reporter.log(,true);

	@Test
	public void TC1()
	{
		Reporter.log("Running tc1",true);
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("Running tc2",false);
	}
	
	@Test
	public void TC3()
	{
		Reporter.log("Running tc3");
	}
	
}

