package map;

import java.util.Map;
import java.util.TreeMap;

import sets.Employee;
import sets.MyComparator;

public class TreeMapEmpDemo {

	public static void main(String[] args) {


Map<Employee,String>  map  = new TreeMap<Employee,String>(new MyComparator());
		
		Employee e1 = new Employee(101, "king", 50000);
		Employee e2 = new Employee(103, "adam", 40000);
		Employee e3 = new Employee(102, "smith", 60000);
		Employee e4 =  new Employee(104, "virat", 30000);
		
			
				map.put(e1, "Development");
				map.put(e4, "Testing");
				map.put(e2, "Sales");
				map.put(e3, "HR");
				
				
				System.out.println(map);
		
		
		
	}

}
