package Logical_Programming;

public class Example_reverse_string {
	String org="ABCD";  //4
	String rev =" ";
	//=1
	for(int i=org.length()-1;i>=0;i--)
		
	{
		rev=rev+org.charAt(i);
	  //Dc+B
	}
	   System.Out.println("org"+org);
	   System.Out.println("rev"+rev);
}
}
