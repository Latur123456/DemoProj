package Linked_list;

import java.util.ArrayList;
import java.util.EventObject;
import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class List {
	public static void main(String[] args) {
		
	ArrayList s1=new ArrayList(10);
		
	LinkedList d=new LinkedList();

	d.add(10);
	System.out.println(d);
	d.add(20);
	d.add(44);
	d.add("abc");
	d.add(10);
	d.add(null);
	d.add(null);
	System.out.println(d);
	for(int i=0;i<=d.size()-1;i++)
	{
		System.out.println(d.get(i));
		
	}
	System.out.println("print data using foreach loop");
	
		for(Object R:d)
		{
			System.out.println(R);
		}
		System.out.println("print using iterator");
		
		}
	
	
		
		
	 
	
	
	
	
	}

}
