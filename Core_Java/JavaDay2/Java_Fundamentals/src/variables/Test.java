package variables;

public class Test {

	public static void main(String[] args) {

		Employee e = new Employee();
		System.out.println(e);
		
		/*
		 * e1.eid = 101; e1.ename = "king";
		 */
		
		Employee e1 = new Employee(101, "king", 50000);
		
		System.out.println(e1.getEid()  +"  "+ e1.getEname() +"  "+ e1.getSalary());
	

		
		
		
		
		Employee e2 = new Employee(102,"javeed",40000);
		System.out.println(e2);

		System.out.println(e2.getEid()  +"  "+e2.getEname()+" "+e2.getSalary());
		

		
		//Employee e3 = new Employee(0,"shivam",0.0);
		
		Employee e3 = new Employee();
		
				e3.setEname("shivam");
		
		
	}

}