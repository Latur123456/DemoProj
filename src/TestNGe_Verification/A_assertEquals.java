package TestNGe_Verification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A_assertEquals {
	@Test
	public void assertEquals()
	{
		String actResult="velocity";
		String expResult="velocity";
		String FailedResult2="city";
		Assert.assertEquals(actResult,FailedResult2,"failed:both result are different" );
	}

}
