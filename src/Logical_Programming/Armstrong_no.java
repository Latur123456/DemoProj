package Logical_Programming;

public class Armstrong_no
{
  public static void main(String[] args) {
	int num=371;
	int sum=0;
	for(int i=num;i>0;i=i/10)
	{ 
		int rem=i%10;
		sum=sum+(rem*rem*rem);
		}
	if(num==sum)
	{
		System.out.println("given number is  num is an armstrong");
	}
	else
	{
		System.out.println("given number is not  num is an armstrong");
	}
}
}
