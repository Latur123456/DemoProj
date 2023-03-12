package TestNGSoftAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class A_softAssert {
  @Test
public void softassert()
{
	SoftAssert soft=new SoftAssert();
	String s1="abc";
	String s2="pqr";
	soft.assertEquals(s1, s2, "Failed:both result are different");
	String s3="velocity";
	String s4="pune";
	soft.assertNotEquals(s1, s2, "Failed:both result are same");
	soft.assertAll();
 
}
}
