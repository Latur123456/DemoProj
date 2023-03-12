package Logical_Programming;

public class G_ArmStrong_Number 
{
   public static void main(String[] args) {
	
	   int orgNum=371;
	   int sum=0;
	   for(int i=orgNum;i>0;i=i/10)
	   {
		   int rem=i%10;
		   sum=sum+(rem*rem*rem);
	   }
	   if(orgNum==sum)
	   {
		   System.out.println("given Number"+orgNum+" is Armstrong Number");
		   
	   }
	   else
	   {
		   System.out.println("given Number"+orgNum+" is not  Armstrong Number");
		   
	   }
}
}
