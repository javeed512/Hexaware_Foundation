package sets;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEmployee {

	public static void main(String[] args) {


		Set<Employee>  set  = new TreeSet<Employee>(new MyComparator());
		
		Employee e1 = new Employee(101, "king", 50000);
		Employee e2 = new Employee(103, "adam", 40000);
		Employee e3 = new Employee(102, "smith", 60000);
		Employee e4 =  new Employee(104, "virat", 30000);
		
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		
		
		System.out.println(set);
		
		
		for (Employee employee : set) {
			
			System.out.println(employee);
			
		}
		
		
		
		

	}

}
