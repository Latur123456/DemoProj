package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class collection1 {
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		    al.add(11);
		    al.add(13);
		    al.add(12);
		    al.add("abc");
		    al.add(11);
		    al.add(null);
		    al.add(null);
		    System.out.println(al);
		    Collections.sort(al);
		    System.out.println(al);
		
		
		
		
	}

}
