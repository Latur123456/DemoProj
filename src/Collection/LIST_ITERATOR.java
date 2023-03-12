package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class LIST_ITERATOR {
	public static void main(String[] args) {
		
		
		ArrayList al1=new ArrayList();
		  al1.add(44);
		  al1.add(44);
		  al1.add(45);
		  al1.add(null);
		  al1.add(null);
		  al1.add(46.5f);
		  al1.add("rty");
		  al1.add('f');
		  System.out.println(al1);
		     Iterator al2=al1.listIterator (al1.size());	  
              while(((ListIterator) al2).hasPrevious())
              {
            	  System.out.println(((ListIterator) al2).previous());
              }
		  
		     
		  
		
		
		
		
		
		
	}

}
