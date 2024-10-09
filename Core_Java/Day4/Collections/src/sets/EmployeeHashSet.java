package sets;

import java.util.HashSet;
import java.util.Set;

public class EmployeeHashSet {

	public static void main(String[] args) {


		Set<Employee>  set  = new HashSet<Employee>();
		
		
			set.add(new Employee(101, "king", 50000));
			set.add(new Employee(103, "adam", 40000));
			set.add(new Employee(102, "smith", 60000));
			set.add(new Employee(104, "virat", 30000));
			set.add(new Employee(101, "king khan", 70000));
		
		
			System.out.println(set);
			
			

	}

}

