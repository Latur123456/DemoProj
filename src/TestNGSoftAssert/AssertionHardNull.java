package TestNGSoftAssert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionHardNull {
	@Test
	public void f()
	{
		Assert.assertNull(null);
		System.out.println("Assertion Hard Null Program");
	}

}
