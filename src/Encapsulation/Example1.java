package Encapsulation;

public class Example1
{
		// declare data member as private
		private String name;
	    private int age;
	    private String idnum;
	    
	    // setter method
	    public void setnm(String newname)
	    {
	    	name=newname;
	    }
	    public void setid(String newid)
	    {
	    	   idnum=newid;
	    	   
	    }
	      public void setage(int newage)
	      {
	    	  age=newage;
	    	  }
	      // getter method
	      public int getage()
	      {
	    	  return age;
	      }
	      public String getnm()
	      {
	    	  return name;
	    	  
	      }
	       public String getid()
     	{
		return idnum;
	    }
	
}
