package ARRAY_LIST;

import java.util.ArrayList;


public class Demo1 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		 al.add(12);
		 al.add(13);
		 al.add(12);
		 al.add(null);
		 al.add(null);
		 al.add(12.f);
		 al.add('h');
		 System.out.println(al);
		   ArrayList al1=(ArrayList)al.clone();//downcasting
	
	System.out.println(al1);
	       Object[]o= al1.toArray();
	       for(int i=0;i<o.length;i++)
	       {
	    	   System.out.println(o[i]);
	       }
	
	
	
	}
	
	
	
	
	

}
