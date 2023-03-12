package ARRAY_LIST;

import java.util.ArrayList;
import java.util.ListIterator;

public class Example2 {
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
		ListIterator li= ar.listIterator ();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("_______reverse order iteratoe_");
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	   	
	}

}
