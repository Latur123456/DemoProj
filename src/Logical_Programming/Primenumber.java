package Logical_Programming;

public class Primenumber 
{
   public static void main(String[] args) {

	// prime number=no divisible 1 and itself
	   // e.g:  2,3,5,7,11,13,17,23,29
	   int num=4;
	   int count=0;
	   for(int i=2;i<=num;i++)// i=2,3,4
	   {
		   if(num %i==0)
		   {
			   count++;
		   }
		   if(count==1)
		   {
			   System.out.println("no is not prime");
		   }
	   
		   System.out.println("no is  prime");
	   }
	   
	   
	   
	   
}
}
