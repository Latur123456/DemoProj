package TestNGe_Verification;

import org.testng.Assert;
import org.testng.annotations.Test;

public class F_AssertNull {
 @Test
 public void AssertNull()
 {
	 String actNull = "Automation";
	 Assert.assertNull(actNull);
 }
 
}
