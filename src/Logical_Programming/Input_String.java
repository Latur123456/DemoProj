package Logical_Programming;

import java.util.Scanner;

public class Input_String {
	public static void main(String[] args) {
		//add two int number
		Scanner s=new Scanner(System.in);// object creation of scanner
		System.out.println("enter the first number");
		 int s1 =s.nextInt();
		 System.out.println("enter the second number");
		         int s2 = s.nextInt();
		 System.out.println("addition="+(s1+s2));
		 // string input
		 System.out.println("Enter the any string");
		   String str=s.next();
		System.out.println(str);
	}

}
