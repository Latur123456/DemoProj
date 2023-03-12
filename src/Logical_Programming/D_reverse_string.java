package Logical_Programming;

public class D_reverse_string {
	public static void main(String[] args) {
		
		String org="ABCD";
		String rev="";
		for(int i=org.length()-1;i>=0;i--)
		{
			rev=rev + org.charAt(i);
		}
		System.out.println("Original String="+org);
	   System.out.println("Reverse string="+rev);
	
	}

}
