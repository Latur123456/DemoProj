package Logical_Programming;

public class factorial_number {
	public static void main(String[] args) {
		int num=5;
		int fact=1;
		//6!=6*5*4*3*2*1
		//i=0
		for(int i=num;i>=1;i--)//i=6,5,4,3,2,1
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	

}
