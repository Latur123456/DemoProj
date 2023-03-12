package Logical_Programming;

public class variable {

	int a=7;// non static v
	static int b=8;
	String c="Param";
	 static void Test()
	{
		int d=9;
		System.out.println("local variable:"+d);
		//System.out.println("string c:"+c);
		System.out.println("static  variable:"+b);
		//System.out.println("non static variable"+a);
	
	}
	public static void main(String[] args) {
		//variable v=new variable();
		//v.Test();
		Test();
	
}
}