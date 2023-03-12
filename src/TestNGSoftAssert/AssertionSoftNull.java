package TestNGSoftAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionSoftNull {
	@Test
	public void f()
	{
	  SoftAssert as=new SoftAssert();
	  as.assertNull(null);
	  as.assertAll();
	}

}
