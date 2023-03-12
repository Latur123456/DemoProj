package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet
{
   public static void main(String[] args) 
   {
	  HashSet hs=new HashSet();
	  
	   hs.add(10);
	   
	  
	   hs.add(10);
	   hs.add(23.4);
	   hs.add(null);
	   hs.add(null);
	   hs.add("jkl");
	   System.out.println(hs);
	   System.out.println(hs.size());
	  System.out.println(hs.contains("jkl"));// true if information is present
	 
	  System.out.println(hs.remove(23.4));
	  System.out.println(hs);
	  System.out.println("print the information using iterator");
	  
	  Iterator r=hs.iterator();
	  while(r.hasNext())
	  {
		  System.out.println(r.next());
	  }
	  
	  System.out.println("print info foreach loop");
	  
	  for(Object t:hs)
	  {
		  
	  System.out.println(t);
	  
	  
	  }
	  
	  
}
}
