package TestNg_disableTestCaseExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class B_DisableTCE_with_include_exclude {
	@Test
	public void TC1()
	{
		Reporter.log("running tc1",true);
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("running tc2",true);
	}
	@Test
	public void TC3()
	{
		Reporter.log("running tc3",true);
	}
	@Test
	public void TC4()
	{
		Reporter.log("running tc4",true);
	}
	
}
