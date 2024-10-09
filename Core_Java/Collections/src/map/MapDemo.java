package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {


		
		Map<Integer,String>  map = new   HashMap<Integer,String>();
		
		
			map.put(102,"King");
			map.put(44, "tom");
			map.put(103, "smith");
			map.put(11, "javeed");
			map.put(105, "raju");
			map.put(44, "jerry");
			map.put(33, "javeed");
			
			System.out.println(map);
		
			
			//System.out.println(map.get(33));
			
			
				Set<Integer>  set  =  	map.keySet();  // set of keys
								
						//Collection<String> list =	map.values();
					
				Iterator<Integer>  it =		set.iterator();
				
				while (it.hasNext()) {
					Integer key   = it.next();
					
					System.out.println(key  +"  "+ map.get(key));
					
				}
			
		
		

	}

}
