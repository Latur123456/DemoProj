package TestNG_Keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class B_Invocation_count {
	@Test(invocationCount=3)
	public void tc1()
	{
		Reporter.log("Running tc1",true);
		
	}

}
