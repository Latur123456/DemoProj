package TestNG_Keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class C_enabled {
	@Test
	public void Tc1()
	{
		Reporter.log("Running tc1",true);
	}
	@Test(enabled=false)
	public void Tc2()
	{
		Reporter.log("Running tc2",true);
	}
	@Test
	public void Tc3()
	{
		Reporter.log("Running tc3",true);
	}

}
