package Logical_Programming;

public class I_Find_whiteSpaces_count 
{
  public static void main(String[] args) {
	String name="V E L O C I T Y ";
	int count=0;
	for(int i=0;i<=name.length()-1;i++)
	{
		char str=name.charAt(i);
		if(str==' ')
		{
			count++; 
		}
	}
 
	System.out.println("TOTAL Whitespaces parent in"+name+" is :"+count);
	

  }
}
