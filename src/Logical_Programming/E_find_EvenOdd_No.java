package Logical_Programming;

import java.util.Scanner;

public class E_find_EvenOdd_No {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=scan.nextInt();
		if(num % 2==0)
		{
			System.out.println("Entered no is even");
		}
		else
		{
			System.out.println("Entered no is odd");
		}
	}

}
