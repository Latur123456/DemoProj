package TestNGe_Verification;

import org.testng.annotations.Test;

import graphql.Assert;

public class C_AssertTrue {
	@Test
	public void AssertTrue()
	{
		boolean actResult = true;
		 Assert.assertFalse(actResult);
	}

}
