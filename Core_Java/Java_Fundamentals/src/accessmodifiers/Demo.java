package accessmodifiers;

import variables.Employee;

public class Demo extends Employee{
	
	private int id;

	public static void main(String[] args) {


		Demo d = new Demo();
		
		d.m1();
		 System.out.println(d.id);
		 
		 Employee e1 = new Employee();
		 
		 
	}
	
	
	private void m1() {
		
		System.out.println("m1() is called..");
		
	}

}
