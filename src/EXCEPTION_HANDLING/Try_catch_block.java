package EXCEPTION_HANDLING;

import com.sun.jdi.InvalidLineNumberException;

import ARRAY_LIST.Demo;

public class Try_catch_block {
	public static void main(String[] args) {
		try 
		{
		int x=Integer.parseInt(args[0]);
		Demo ob =new Demo();
		ob.cube(x);
		}catch(InvalidLineNumberException ne)
		{
		  System.out.println(ne);	
		}

}
}
