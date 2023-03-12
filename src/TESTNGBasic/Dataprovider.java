package TESTNGBasic;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	
	@Test(dataProvider="getdata")
	public void login (String usnm,String passwd)
	{
		System.out.println("this is login page");
		System.out.println(usnm);
		System.out.println(usnm);
		}
	@DataProvider()
	public Object[][] getdata()
	{
		Object[][] data=new Object[3][2];
				data[0][0]="1stusername";
	
	          data[0][0]="1stusername";
	          data[0][1]="1stusername";
	          data[1][0]="2ndusername";
	          data[1][1]="2ndusername";
	          data[2][0]="3rdusername";
	          data[1][1]="3rdusername";
	
	      return data;
	}
    
}
