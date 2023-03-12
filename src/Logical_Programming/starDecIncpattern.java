package Logical_Programming;

public class starDecIncpattern 
{
	public static void main(String[] args) {
		
		//*****  i=1
		//****    i=2
		//***     i=3
		//**     i=4
		//*      i=5
		//**
		//***
		//****
		//*****
		
		int star=5;
		  //  5<=5
		for(int i=1;i<=9;i++)//outer for loop used for no of row
		{
			for(int j=1;j<=star;j++)//inner for loop used for no ofcolumn
			{
				System.out.print("*");//*****
				
			}
			System.out.println();
			if(i<5)// descending star
			{
				star--;
				
			}
			else// for ascending star
			{
				star++;
				
			}
		}
	}

}
