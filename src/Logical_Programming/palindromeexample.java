package Logical_Programming;

import java.util.Scanner;

public class palindromeexample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		int no= sc.nextInt();
		//int no1=121;
		int temp=no;
		int rev=0,rem;
		while(temp!=0)
		{
			rem=temp%10;
			rev=(rev*10)+rem;
			temp=temp/10;
		}
		if(no==rev)
		{
			System.out.println(no+"is palindrome no");
		}
		else
		{
			System.out.println(no+"is notpalindrome no");
					
					
		}
	}

}
