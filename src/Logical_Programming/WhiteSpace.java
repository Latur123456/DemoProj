package Logical_Programming;

public class WhiteSpace {
	public static void main(String[] args) {
		
		String name="V E L O C I T Y";
		//0123456
		int count=0;
		for(int i=0;i<=name.length()-1;i++)//i=2
		{
	
		   char str= name.charAt(i);//str=''
		if(str==' ')//''==''
			
		{
			count++;   //count=count+1=2
		}
		}
		System.out.println("Whitespace in string="+name+"is"+count);

}}
