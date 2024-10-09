package sets;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {


		Set<String>  set =  new TreeSet<String>();
		
		
			set.add("B");
			set.add("A");
			set.add("D");
			set.add("C");
			//set.add(null);  // not allowed
			
			
			System.out.println(set);
		

	}

}
