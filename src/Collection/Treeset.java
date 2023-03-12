package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {
	public static void main(String[] args) {
		
		TreeSet ts=new TreeSet();
		ts.add(10);
		ts.add(10);
		
		ts.add(2);
		ts.add(4);
		ts.add(45);
		ts.add(42);
		System.out.println(ts);
		System.out.println(ts.size());
		System.out.println(ts.remove(42));
		System.out.println(ts);
		ts.pollFirst();
		ts.pollLast();
		System.out.println(ts.first());
		System.out.println(ts.last());
		
		System.out.println(ts);
		Iterator t=ts.iterator();
		while(t.hasNext())
		{
			System.out.println(t.next());
			
			
			System.out.println("print the element using foreach loop");
			for(Object R:ts)
			{
				System.out.println(R);
			}
		}
		
		
		
		
	}
	
	

}
