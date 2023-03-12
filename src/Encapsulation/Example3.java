package Encapsulation;

public class Example3 {
	
private	String name;
private	String idnum;
 private int age;
 
 // use private data member in constructor
 
 public Example3(String newnm,String newidnum,int newage)
 {
	name=newnm;
	idnum=newidnum;
	age=newage;
	
 }
 //use private data member
 public void display()
 
 {
    System.out.println("name:"+name);
    System.out.println("idnum:"+idnum);
    System.out.println("age:"+age);
    
 }
 
 
 
 
 

}
