package TestNGe_Verification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class G_AssertNotNull {
  @Test
  public void assertNotnull()
  {
	   String name = "Manual QA";
	   Assert.assertNotNull(name);
	  
  }
}
