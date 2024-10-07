package variables;

public class LocalVarDemo {

	public static void main(String[] args) {


		int x =0;
		
		System.out.println(x);
		
		String name = null ;
		
		
		System.out.println(name);
		
		
		 LocalVarDemo   d =   new   LocalVarDemo();
		
		   d.m1();
		
		
		  LocalVarDemo.m2();  // static  call using class name
		  
		  d.m2();  // using object ref
		

	}
	
	
	public static  void m2() { // using class name or object reference
		
		System.out.println("this is m2() static method");
		
	}
	
	public void m1() { // concrete method  or non-static
		
		
		double salary = 9000;
		
		System.out.println("salary from m1() "+salary);
		
		m2();
	}	

	
	
}
