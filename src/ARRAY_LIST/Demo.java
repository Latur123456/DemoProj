package ARRAY_LIST;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		    al.add(22);
		    al.add(33);
		    al.add(44);
		    System.out.println(al);
		    ArrayList al1=(ArrayList)al.clone();  // downcasting
		    
		     System.out.println(al1);
		    Object o[]=al1.toArray();	
	     for(int i=0;i<o.length;i++)
	     {
	    	System.out.println(o[i]);
	     }
	
	}

	public void cube(int x) {
		// TODO Auto-generated method stub
		
	}
	
  
}

