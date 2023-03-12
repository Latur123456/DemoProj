package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class list {
	public static void main(String[] args) {
		
	ArrayList a2= new ArrayList();
	a2.add(10);
	a2.add(10);
	a2.add(null);
	a2.add("abc");
	a2.add('d');
	System.out.println("a2");
	HashSet t=new HashSet(a2);
	System.out.println(t);
	//System.out.println(a2.size());
		
	//a2.add(1,90);
	//System.out.println(a2);
	//a2.remove(4);
	//System.out.println(a2);
		
		
		
	}

}
