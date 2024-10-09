package list;

import java.util.Iterator;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {


		List<String> list = new Vector<String>(); // legacy and synchronous
			
		
		
			list.add("mango");
			list.add("apple");
			list.add("orange");
			list.add("mango");
			list.add("kiwi");
			
			System.out.println(list);
			
			System.out.println("Collection using For Each");
			
			for(String fruit:  list) {
				
				System.out.println(fruit);
				
			}
			
			
			System.out.println("Iterator");
			
			Iterator<String> it =    list.iterator();
			
			while(it.hasNext()) {
				
				
					String s = it.next();
				
				System.out.println(s);
				
			}
			
			
		
	}

}
