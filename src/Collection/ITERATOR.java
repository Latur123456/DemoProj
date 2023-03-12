package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ITERATOR {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(11);
		al.add(12);
		al.add(13);
		al.add("abc");
		System.out.println(al);
		  Iterator al1=al.iterator();
		while(al1.hasNext())
		{
			System.out.println(al1.next());
			}
		
	}

}
