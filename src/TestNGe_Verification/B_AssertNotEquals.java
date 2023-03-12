package TestNGe_Verification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class B_AssertNotEquals {
	@Test
	public void AssertNotEquals()
	{

	String actResult="vaibhavi";
	String expResult="vaibhav";
	
	Assert.assertNotEquals(actResult,expResult,"failed: result are equal" );
}

}
