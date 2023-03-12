package TestNg_disableTestCaseExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A_DisableTCE_enableFalse {
 @Test
 public void TC1()
 {
	Reporter.log("Running TC1",true); 
 }
 @Test
 public void TC2()
 {
	Reporter.log("Running TC2",true); 
 }
 @Test(enabled=false)
 public void TC3()
 {
	Reporter.log("Running TC3",true); 
 }
 
 
}
