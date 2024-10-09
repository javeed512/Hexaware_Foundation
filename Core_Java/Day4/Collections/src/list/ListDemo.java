package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

			
		List<Object>  list =	new  ArrayList<Object>();
		
			list.add(new Object());
			
			list.add(new String("hii"));
			
			list.add(new Integer(20));
			
			list.add(new Double(4.55));
			
			list.add(new ListDemo());
			
			System.out.println(list);
			
			
			
			
				List<Number> list2 		=   new  LinkedList<Number>();
			
					list2.add(10);  // new Integer(10)
					list2.add(4.55);  // new Double(4.55)
					list2.add(50L);   // new Long(50L);
					list2.add(10);
					list2.add(null);
			
			 System.out.println(list2);
			

	}

}
