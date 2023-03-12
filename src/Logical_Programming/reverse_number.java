package Logical_Programming;

public class reverse_number {
	public static void main(String[] args) {
		
		//org=1234
		// rev=4321
		
		int orgnum=1234;
		//   0123
		String org=Integer.toString(orgnum);
		String rev="";
		
		//i=1
		for(int i =org.length()-1;i>=0;i--)
			
		{
			rev=rev+org.charAt(i);// rev=4321
		}
			int revnum=Integer.parseInt(rev);
			System.out.println(revnum);
		}
		
		
		
	}


