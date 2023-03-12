package ARRAY_LIST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Example1 {
	public static void main(String[] args) {
		
		
		ArrayList ar=new ArrayList ();
	
		ar.add(10);
		ar.add(null);
		ar.add(20);
		ar.add(40);
		ar.add("abc");
		ar.add('a');
		ar.add(10);
		ar.add("v");
		ar.add(10);
		ar.add(null);
		
		System.out.println(ar);
		
//		Iterator i= ar.iterator();
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//			
//		}
//		
//		
//		  ar.remove(0);
//		  System.out.println(ar);
//		  System.out.println("________-------for each loop");
//		  for(Object d:ar)
//		  {
//			  System.out.println(d);
//		  }
   
	 ListIterator li=ar.listIterator();
	  while(li.hasPrevious())
	  {
		  System.out.println(li.next());
	  }
	
	}
	

}
