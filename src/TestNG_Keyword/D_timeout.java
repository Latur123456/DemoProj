package TestNG_Keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class D_timeout {
	@Test(timeOut=5000)
	public void Tc1() throws InterruptedException
	{
		Thread.sleep(7000);
		Reporter.log("Running Tc1",true);
	}

}
