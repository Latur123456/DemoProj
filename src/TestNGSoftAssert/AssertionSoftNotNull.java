package TestNGSoftAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionSoftNotNull {
	@Test
	public void f()
	{
		  SoftAssert as=new SoftAssert();
	  as.assertNotNull(10);
	  as.assertAll();
	  System.out.println("Last Assert statement");
	}

}
