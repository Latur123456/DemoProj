package TestNGe_Verification;

import org.testng.annotations.Test;

import graphql.Assert;

public class D_AssertFalse {
	@Test
	public void AssertFalse()
	{
		boolean actResult = false;
		 Assert.assertFalse(actResult);
	}

}
