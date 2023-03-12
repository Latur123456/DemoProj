package ARRAY_LIST;

import java.util.Stack;

public class STACK {

	
	public static void main(String[] args) {
		
		Stack s=new Stack();
		s.push(22);
		s.push(33);
		s.push(44);
		
		while(s.size()>0)
		{
			System.out.println(s.pop());
		}
		
		
		
	}
}
