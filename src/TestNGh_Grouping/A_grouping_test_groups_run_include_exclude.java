package TestNGh_Grouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A_grouping_test_groups_run_include_exclude {
	@Test(groups="login")
	public void TC1()
	{
		Reporter.log("running TC1",true);
	}
	@Test(groups="payment")
	public void TC2()
	{
		Reporter.log("running TC2",true);
	}
	@Test (groups="login")
	public void TC3()
	{
		Reporter.log("running TC3",true);
	}
	@Test
	public void TC4()
	{
		Reporter.log("running TC4",true);
	}
	@Test(groups="select plan")
	public void TC5()
	{
		Reporter.log("running TC5",true);
	}
	 @Test(groups="payment")
	public void TC6()
	{
		Reporter.log("Running TC6",true);
	}

}



