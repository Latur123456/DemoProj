package Logical_Programming;

public class F_palindrome_String
{
               public static void main(String[] args) 
               {
				
            	String org="Eye";
            	String rev="";
            	for(int i=org.length()-1;i>=3;i++)
            	{
            		rev=rev+org.charAt(i);
            	}
            	System.out.println("original string:"+org);
            	System.out.println("Reverse string:"+rev);
               
            	
            	if(org.equals(rev))

            	{
            	   System.out.println("given string is apallindrome");	
            	}
            	else
            	{
            		System.out.println("given string is not a pallindrome");
            	}
            	   
            	   
            	   
            	   
			} 
}
