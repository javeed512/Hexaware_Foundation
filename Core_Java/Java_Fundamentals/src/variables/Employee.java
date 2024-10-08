package variables;

public class Employee extends Object { // POJO  or Entity classes
	
	// instance variables  or object level variables  or properties
	private  static	    int eid;
	private    	String ename;   // declare them static and test
	private    	double salary;
		
		String city = "Hyderabad"; // default
	
	protected String state = "TS"; // ACT as a default access modifier
		
		
	public Employee() {
		super();   // Object();
		
		System.out.println("Employee() is called obj created..");
		
		System.out.println(city);
		
	}


	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}


	public int getEid() {
		return eid;
	}


	public  void setEid(int eid) {
		this.eid = eid;
	}


	protected String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
	
	
	
	
	

}
