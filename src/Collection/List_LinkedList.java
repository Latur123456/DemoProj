package Collection;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;



public class List_LinkedList {
	public static void main(String[] args) {
		LinkedList l1=new LinkedList();
		
		l1.add("tokyo");
		l1.add("berlin");
		l1.add("berlin");
		l1.add("berlin");
		l1.add(10);
		
		l1.add(null);
		
		l1.add(null);
		System.out.println(l1);
		System.out.println("print LinkedList using iterator");
		Iterator itr= l1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("print data using foreach loop");
		for(Object D:l1)
		{
			System.out.println(D);
		}
		System.out.println("print LinkedList using Listiterator");
		ListIterator litr=l1.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		
		
	}

}}
