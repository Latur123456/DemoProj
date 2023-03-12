package TestNG_Keyword;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class E_dependsOnmethods {
 @Test
 public void login()
 {
	 Assert.fail();
	 Reporter.log("running login tc...",true);
 }
 @Test(dependsOnMethods= {"login"})
 public void logout()
 {
	 Reporter.log("running login tc...",true);
 }
}
